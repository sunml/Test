package org.security;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.cert.CertificateException;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

/*
 *  * 
 */
public class HttpClientSendPost {
	private static DefaultHttpClient client;

	/**
	 * 访问https的网站
	 * 
	 * @param httpclient
	 */
	private static void enableSSL(DefaultHttpClient httpclient) {
		// 调用ssl
		try {
			SSLContext sslcontext = SSLContext.getInstance("TLS");
			sslcontext.init(null, new TrustManager[] { truseAllManager }, null);
			SSLSocketFactory sf = new SSLSocketFactory(sslcontext);
			sf.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
			Scheme https = new Scheme("https", sf, 443);
			httpclient.getConnectionManager().getSchemeRegistry().register(https);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 重写验证方法，取消检测ssl
	 */
	private static TrustManager truseAllManager = new X509TrustManager() {

		public void checkClientTrusted(java.security.cert.X509Certificate[] arg0, String arg1) throws CertificateException {

		}

		public void checkServerTrusted(java.security.cert.X509Certificate[] arg0, String arg1) throws CertificateException {

		}

		public java.security.cert.X509Certificate[] getAcceptedIssuers() {
			return null;
		}

	};

	/**
	 * HTTP Client Object,used HttpClient Class before(version 3.x),but now the
	 * HttpClient is an interface
	 */

	public static String sendXMLDataByGet(String url, String xml) {
		// 创建HttpClient实例
		if (client == null) {
			// Create HttpClient Object
			client = new DefaultHttpClient();
			enableSSL(client);
		}
		StringBuilder urlString = new StringBuilder();
		urlString.append(url);
		urlString.append("?");
		System.out.println("getUTF8XMLString(xml):" + getUTF8XMLString(xml));
		try {
			urlString.append(URLEncoder.encode(getUTF8XMLString(xml), "UTF-8"));
		} catch (UnsupportedEncodingException e2) {
			e2.printStackTrace();
		}
		String urlReq = urlString.toString();
		// 创建Get方法实例
		HttpGet httpsgets = new HttpGet(urlReq);

		String strRep = "";
		try {
			HttpResponse response = client.execute(httpsgets);
			HttpEntity entity = response.getEntity();

			if (entity != null) {
				strRep = EntityUtils.toString(response.getEntity());
				// Do not need the rest
				httpsgets.abort();
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return strRep;
	}

	public static String sendXMLDataByPost(String url, String xmlData) throws ClientProtocolException, IOException {
		if (client == null) {
			// Create HttpClient Object
			client = new DefaultHttpClient();
			enableSSL(client);
		}
		client.getParams().setParameter("http.protocol.content-charset", HTTP.UTF_8);
		client.getParams().setParameter(HTTP.CONTENT_ENCODING, HTTP.UTF_8);
		client.getParams().setParameter(HTTP.CHARSET_PARAM, HTTP.UTF_8);
		client.getParams().setParameter(HTTP.DEFAULT_PROTOCOL_CHARSET, HTTP.UTF_8);

		// System.out.println(HTTP.UTF_8);
		// Send data by post method in HTTP protocol,use HttpPost instead of
		// PostMethod which was occurred in former version
		// System.out.println(url);
		HttpPost post = new HttpPost(url);
		post.getParams().setParameter("http.protocol.content-charset", HTTP.UTF_8);
		post.getParams().setParameter(HTTP.CONTENT_ENCODING, HTTP.UTF_8);
		post.getParams().setParameter(HTTP.CHARSET_PARAM, HTTP.UTF_8);
		post.getParams().setParameter(HTTP.DEFAULT_PROTOCOL_CHARSET, HTTP.UTF_8);

		// Construct a string entity
		StringEntity entity = new StringEntity(getUTF8XMLString(xmlData), "UTF-8");
		entity.setContentType("text/xml;charset=UTF-8");
		entity.setContentEncoding("UTF-8");
		// Set XML entity
		post.setEntity(entity);
		// Set content type of request header
		post.setHeader("Content-Type", "text/xml;charset=UTF-8");
		// Execute request and get the response
		HttpResponse response = client.execute(post);
		HttpEntity entityRep = response.getEntity();
		String strrep = "";
		if (entityRep != null) {
			strrep = EntityUtils.toString(response.getEntity());
			// Do not need the rest
			post.abort();
		}
		// Response Header - StatusLine - status code
		// statusCode = response.getStatusLine().getStatusCode();
		return strrep;
	}

	public static String getUTF8XMLString(String xml) {
		// A StringBuffer Object
		StringBuffer sb = new StringBuffer();
		sb.append(xml);
		String xmString = "";
		try {
			xmString = new String(sb.toString().getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		// return to String Formed
		return xmString.toString();
	}
}