package org.bank;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.types.Schema;

public class ClientTest1 {
	private static int totalCount = 2;
	private static int totalNum = 10;

	public static void main(String[] args) {
		String namespaceURI = "http://service.zttc.org/";
		String endpointAddress = "http://localhost:8989/test";
		Call call = null;
		try {
			long serviceTotal = 0;
			long callTotal = 0;
			URL url = new URL(endpointAddress);
			for (int i = 0; i < totalNum; i++) {
				long startTime = System.currentTimeMillis();
				Service service = new Service();
				long serviceInitTime = System.currentTimeMillis();
				long serviceTime = serviceInitTime - startTime;
				System.out.println("serviceTime:" + serviceTime);
				serviceTotal += serviceTime;
				call = (Call) service.createCall();
				call.setEncodingStyle("UTF-8");
				call.setTargetEndpointAddress(url);
				// call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
				call.setOperationName(new QName(namespaceURI, "add"));
				call.addParameter(new QName("", "first"), org.apache.axis.encoding.XMLType.XSD_INT, javax.xml.rpc.ParameterMode.IN);
				call.addParameter(new QName("", "second"), org.apache.axis.encoding.XMLType.XSD_INT, javax.xml.rpc.ParameterMode.IN);
				call.setReturnType(org.apache.axis.encoding.XMLType.XSD_SCHEMA);
				long callSettingTime = System.currentTimeMillis();
				long callTime = callSettingTime - serviceInitTime;
				System.out.println("callTime:" + callTime);
				callTotal += callTime;
			}
			System.out.println("serviceInitAverage:" + serviceTotal / totalNum + "\ncallSettingAverage:" + callTotal / totalNum);
			Object schema = call.invoke(new Object[] { 13, 12 });
			List<Long> totals = new ArrayList<Long>();
			for (int i = 0; i < totalCount; i++) {
				long start = System.currentTimeMillis();
				schema = call.invoke(new Object[] { 13, 12 });
				totals.add(System.currentTimeMillis() - start);
				// System.out.println(totals.get(totals.size() - 1));
			}
			long total = 0;
			for (Long ti : totals)
				total += ti;
			System.out.println("invokeAverage:" + total / totalCount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void printMessageElement(Object schema) {
		Schema schema2 = ((Schema) schema);
		System.out.println(schema2.get_any()[0]);
	}
}
