package org.bank;

import java.io.IOException;
import java.util.Hashtable;

import javax.net.ssl.SSLSession;

import org.apache.axis.AxisProperties;
import org.apache.axis.components.net.JSSESocketFactory;

public class MyHTTPSTool extends JSSESocketFactory {
	public static javax.net.ssl.SSLContext sslContext = null;
	public static javax.net.ssl.HostnameVerifier hostnameVerifier = null;

	static {
		try {
			/**
			 * 域名验证器
			 */
			MyHTTPSTool.hostnameVerifier = new javax.net.ssl.HostnameVerifier() {
				public boolean verify(String urlHostName, SSLSession session) {
					// ip address of the service URL(like.23.28.244.244)
					// return urlHostName.equals("23.28.244.244");
					System.out.println("Warning: URL Host: " + urlHostName + " vs. " + session.getPeerHost());
					return true;
				}
			};

			// Create a trust manager that does not validate certificate chains
			javax.net.ssl.TrustManager[] trustAllCerts = new javax.net.ssl.TrustManager[] { new javax.net.ssl.X509TrustManager() {
				public java.security.cert.X509Certificate[] getAcceptedIssuers() {
					return null;
				}

				public boolean isServerTrusted(java.security.cert.X509Certificate[] certs) {
					return true;
				}

				public boolean isClientTrusted(java.security.cert.X509Certificate[] certs) {
					return true;
				}

				public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) throws java.security.cert.CertificateException {
					return;
				}

				public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) throws java.security.cert.CertificateException {
					return;
				}
			} };

			// Install the all-trusting trust manager
			MyHTTPSTool.sslContext = javax.net.ssl.SSLContext.getInstance("SSL");
			MyHTTPSTool.sslContext.init(null, trustAllCerts, null);
			// MyHTTPSTool.sslContext.init(null, trustAllCerts, new
			// java.security.SecureRandom());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public MyHTTPSTool(Hashtable attributes) {
		super(attributes);
	}

	@Override
	protected void initFactory() throws IOException {
		super.initFactory();
		this.sslFactory = MyHTTPSTool.sslContext.getSocketFactory();
	}

	/**
	 * 
	 * @throws Exception
	 */
	public static void trustAllHttpsCertificates() throws Exception {
		javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(MyHTTPSTool.hostnameVerifier); // 设置默认的域名验证器
		javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(MyHTTPSTool.sslContext.getSocketFactory()); // 设置默认的Socket工厂
		// 指定Axis类库要调用的SocketFactory。用来自定义进行HTTPS验证
		AxisProperties.setProperty("axis.socketSecureFactory", MyHTTPSTool.class.getName());
	}
}
