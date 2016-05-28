package org.test.java;

import java.math.BigDecimal;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;
import org.apache.axis.message.MessageElement;
import org.apache.axis.soap.SOAPConstants;
import org.apache.axis.types.Schema;
import org.bank.MyHTTPSTool;
import org.json.JSONObject;
import org.junit.Test;

public class WebserviceTradeTest2 {

	public WebserviceTradeTest2() {

	}

	private static String namespaceURI = "http://tempuri.org/";
	private static String endpointAddress = "https://dtsyzg.gw.com.cn:31120/WebServices4SLSM.asmx";
	// private static String Sign =
	// Encrypter.getMD5("lcftest20150508").toLowerCase();
	private static Service service;
	private static URL url;

	private static WebserviceTradeTest2 ws;

	static {
		try {
			ws = new WebserviceTradeTest2();
			service = new Service();
			url = new URL(endpointAddress);
			MyHTTPSTool.trustAllHttpsCertificates();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Test() {
		int num = 2147483647;
		System.out.println(Math.min(num, num + 1));
	}

	/**
	 * 查询行情 success
	 * 
	 * @return
	 */
	@Test
	public void GetPricePushed() {
		try {
			Call call = (Call) service.createCall();
			call.setEncodingStyle("UTF-8");
			call.setTargetEndpointAddress(url);
			// call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
			call.setOperationName(new QName(namespaceURI, "GetPricePushed"));
			call.addParameter(new QName(namespaceURI, "DTSUserID"), XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "issueCode"), XMLType.XSD_STRING, ParameterMode.IN);
			call.setReturnType(XMLType.XSD_SCHEMA);
			Schema schema = (Schema) call.invoke(new Object[] { "319", "600036" });
			// JaxbUtil.converyToJavaBean(schema.get_any(), Message.class);
			MessageElement[] ele = schema.get_any();
			for (int i = 0; i < ele.length; i++)
				System.out.println(ele[i]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 查询持仓 success-null
	 * 
	 * @return
	 */

	public void QueryPosition() {
		try {
			Call call = (Call) service.createCall();
			call.setEncodingStyle("UTF-8");
			call.setTargetEndpointAddress(url);
			// call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
			call.setOperationName(new QName(namespaceURI, "QueryPosition"));
			call.addParameter(new QName(namespaceURI, "DTSUserID"), XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "accountCode"), XMLType.XSD_STRING, ParameterMode.IN);
			call.setReturnType(XMLType.XSD_SCHEMA);
			Schema schema = (Schema) call.invoke(new Object[] { "319", "00201-064" });
			System.out.println(schema);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 查询成交订单 success
	 * 
	 * @return
	 */

	public void QueryExecution() {
		try {
			Call call = (Call) service.createCall();
			call.setEncodingStyle("UTF-8");
			call.setTargetEndpointAddress(url);
			// call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
			call.setOperationName(new QName(namespaceURI, "QueryExecution"));
			call.addParameter(new QName(namespaceURI, "DTSUserID"), XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "accountCode"), XMLType.XSD_STRING, ParameterMode.IN);
			call.setReturnType(XMLType.XSD_SCHEMA);
			Schema schema = (Schema) call.invoke(new Object[] { "319", "00201-064" });
			MessageElement[] ele = schema.get_any();
			System.out.println(ele[0]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 查询历史成交订单 success-null
	 * 
	 * @return
	 */

	public void QueryHistoryExecution() {
		try {
			Call call = (Call) service.createCall();
			call.setEncodingStyle("UTF-8");
			call.setTargetEndpointAddress(url);
			// call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
			call.setOperationName(new QName(namespaceURI, "QueryHistoryExecution"));
			call.addParameter(new QName(namespaceURI, "DTSUserID"), XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "accountCode"), XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "startDate"), XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "endDate"), XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "condList"), XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "count"), XMLType.XSD_INT, ParameterMode.IN);
			call.setReturnType(XMLType.XSD_SCHEMA);
			Schema schema = (Schema) call.invoke(new Object[] { "319", "00201-064", "2015-05-07", "2015-05-08", "", 500 });
			System.out.println(JSONObject.wrap(schema.get_any()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 查询当日订单 success
	 * 
	 * @return
	 */

	public void QueryOrder() {
		try {
			Call call = (Call) service.createCall();
			call.setEncodingStyle("UTF-8");
			call.setTargetEndpointAddress(url);
			// call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
			call.setOperationName(new QName(namespaceURI, "QueryOrder"));
			call.addParameter(new QName(namespaceURI, "DTSUserID"), XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "accountCode"), XMLType.XSD_STRING, ParameterMode.IN);
			call.setReturnType(XMLType.XSD_SCHEMA);
			Schema schema = (Schema) call.invoke(new Object[] { "319", "00201-064" });
			MessageElement[] ele = schema.get_any();
			System.out.println(ele[0]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 查询历史订单 success -null
	 * 
	 * @return
	 */

	public void QueryHistoryOrder() {
		try {
			Call call = (Call) service.createCall();
			call.setEncodingStyle("UTF-8");
			call.setTargetEndpointAddress(url);
			// call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
			call.setOperationName(new QName(namespaceURI, "QueryHistoryOrder"));
			call.addParameter(new QName(namespaceURI, "DTSUserID"), XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "accountCode"), XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "startDate"), XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "endDate"), XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "condList"), XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "count"), XMLType.XSD_INT, ParameterMode.IN);
			call.setReturnType(XMLType.XSD_SCHEMA);
			Schema schema = (Schema) call.invoke(new Object[] { "319", "00201-064", "2015-05-07", "2015-05-08", "", 500 });
			System.out.println(schema);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 下单 success
	 * 
	 * @return
	 */
	public void SendOrder() {
		try {
			Call call = (Call) service.createCall();
			call.setEncodingStyle("UTF-8");
			call.setTargetEndpointAddress(url);
			call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
			call.setOperationName(new QName(namespaceURI, "SendOrder"));
			call.addParameter(new QName(namespaceURI, "DTSUserID"), XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "BAMapID"), XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "requestID"), XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "BuySell"), XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "IssueCode"), XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "OpenClose"), XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "Price"), XMLType.XSD_DECIMAL, ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "Quantity"), XMLType.XSD_INT, ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "OrderType"), XMLType.XSD_STRING, ParameterMode.IN);
			call.setReturnType(XMLType.XSD_SCHEMA);
			Schema schema = (Schema) call.invoke(new Object[] { "319", "00201-064", "528a2f1cfcd5acc9de6e32fe43b0aa32", "B", "600036", "0", BigDecimal.valueOf(6), 100, "1" });
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 撤单 <ns1:Success xmlns:ns1="http://tempuri.org/">true</ns1:Success>
	 * 
	 * @return
	 */

	public void CancelOrder() {
		try {
			Call call = (Call) service.createCall();
			call.setEncodingStyle("UTF-8");
			call.setTargetEndpointAddress(url);
			// call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
			call.setOperationName(new QName(namespaceURI, "CancelOrder"));
			call.addParameter(new QName(namespaceURI, "DTSUserID"), XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "orgRequestID"), XMLType.XSD_STRING, ParameterMode.IN);
			call.setReturnType(XMLType.XSD_SCHEMA);
			Schema schema = (Schema) call.invoke(new Object[] { "319", "afbf3e314ede157c50cd" });// 271901244eef8deeecf1
			MessageElement[] ele = schema.get_any();
			System.out.println(ele[0]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 组装JSON
	 * 
	 * @param resArray
	 * @return
	 */
	private String buildJSON(MessageElement[] resArray) {
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
	 * 打印消息
	 * 
	 * @param resArray
	 */
	public void printMessageElement(MessageElement[] resArray) {
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
