package org.test.java;

import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.message.MessageElement;
import org.apache.axis.soap.SOAPConstants;
import org.apache.axis.types.Schema;
import org.bank.Encrypter;
import org.bank.MyHTTPSTool;

public class WebserviceTest2 {
	public WebserviceTest2() {
	}

	private static String namespaceURI = "http://tempuri.org/";
	private static String endpointAddress = "https://180.153.251.72:31751/WebServices4SLSM.asmx";
	private static String Sign = Encrypter.getMD5("lcftest20150506").toLowerCase();
	private static Service service;
	private static URL url;
	static {
		try {
			service = new Service();
			url = new URL(endpointAddress);
			MyHTTPSTool.trustAllHttpsCertificates();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		String jsonString =ExGetProductInfo4PartnerWeb();
		System.out.println(jsonString);
	}

	/**
	 * 1.2.8 查询融资产品信息
	 */
	public static String ExGetProductInfo4PartnerWeb() {
		try {
			Call call = (Call) service.createCall();
			call.setEncodingStyle("UTF-8");
			call.setTargetEndpointAddress(url);
			call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
			call.setOperationName(new QName(namespaceURI, "ExGetProductInfo4PartnerWeb"));
			call.addParameter(new QName(namespaceURI, "PartnerID"), org.apache.axis.encoding.XMLType.XSD_INT, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "Nid"), org.apache.axis.encoding.XMLType.XSD_INT, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "Sign"), org.apache.axis.encoding.XMLType.XSD_INT, javax.xml.rpc.ParameterMode.IN);
			call.setReturnType(org.apache.axis.encoding.XMLType.XSD_SCHEMA);
			Schema schema = (Schema) call.invoke(new Object[] { 13, "1", Sign });
			return buildJSON(schema.get_any());
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	/**
	 * 组装JSON
	 * 
	 * @param resArray
	 * @return
	 */
	private static String buildJSON(MessageElement[] resArray) {
		StringBuilder sb = new StringBuilder("{");
		List<MessageElement> msgElmtBody = resArray[1].getChildren();
		msgElmtBody = msgElmtBody.get(0).getChildren();
		for (MessageElement element : msgElmtBody) {
			List<MessageElement> productAttrList = element.getChildren();
			for (MessageElement attr : productAttrList) {
				String attrName = attr.getTagName();
				String attrValue = attr.getValue();
				sb.append(attrName);
				sb.append(":'");
				sb.append(attrValue);
				sb.append("',");
			}
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append("}");
		return sb.toString();
	}

	/**
	 * 1.2.1 按手机号查询是否映射了DTS环境
	 */
	public static void ExQueryDTSInfo() {
		try {
			// ResultEx res = client.exQueryDTSInfo(1, "13", sign,
			// "18516600786");
			// System.out.println(res.getReturnMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 1.2.4 查询表数据
	 */
	public static void ExtQueryDBData() {
		try {
			// ExQueryDBDataResponseExQueryDBDataResult res =
			// client.exQueryDBData(1, "1", sign, "user", "", "", "");
			// printMessageElement(res.get_any());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 1.2.7 查询杠杆比率
	 */
	public static void ExGetProductFuturesPolicyInfo() {
		try {
			// ExGetProductFuturesPolicyInfoResponseExGetProductFuturesPolicyInfoResult
			// res = client.exGetProductFuturesPolicyInfo(1, "1", sign, 1);
			// printMessageElement(res.get_any());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 打印消息
	 * 
	 * @param resArray
	 */
	public static void printMessageElement(MessageElement[] resArray) {
		List<MessageElement> msgElmtBody = resArray[1].getChildren();
		msgElmtBody = msgElmtBody.get(0).getChildren();
		for (MessageElement element : msgElmtBody) {
			List<MessageElement> productAttrList = element.getChildren();
			for (MessageElement attr : productAttrList) {
				String attrName = attr.getTagName();
				String attrValue = attr.getValue();
				System.out.println(attrName + "\t\t:\t\t" + attrValue);
			}
			System.out.println("----------------------------------------------------------------------------");
		}
	}

}
