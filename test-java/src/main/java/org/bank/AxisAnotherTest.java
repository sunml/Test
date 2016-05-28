package org.bank;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.soap.SOAPConstants;

public class AxisAnotherTest {
	static int totalCount = 20;
	
	
	public static void main(String[] args) {
		String namespaceURI = "http://tempuri.org/";
		String endpointAddress = "https://180.153.251.72:31751/WebServices4SLSM.asmx";
		String Sign = Encrypter.getMD5("lcftest20150506").toLowerCase();
		try {
			URL url = new URL(endpointAddress);
			Service service = new Service();
			Call call = (Call) service.createCall();
			call.setEncodingStyle("UTF-8");
			call.setTargetEndpointAddress(url);
			call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
			call.setOperationName(new QName(namespaceURI, "ExGetProductInfo4PartnerWeb"));
			call.addParameter(new QName(namespaceURI, "PartnerID"), org.apache.axis.encoding.XMLType.XSD_INT, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "Nid"), org.apache.axis.encoding.XMLType.XSD_INT, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "Sign"), org.apache.axis.encoding.XMLType.XSD_INT, javax.xml.rpc.ParameterMode.IN);
			call.setReturnType(org.apache.axis.encoding.XMLType.XSD_SCHEMA);
			
			getMessage(call, namespaceURI, Sign);
			List<Long> totals = new ArrayList<Long>();
			for (int i = 0; i < totalCount; i++) {
				long start = System.currentTimeMillis();
				getMessage(call, namespaceURI, Sign);
				totals.add(System.currentTimeMillis() - start);
				System.out.println(totals.get(totals.size()-1));
			}
			long total = 0;
			for (Long ti : totals) {
				total += ti;
				//System.out.println(ti);
			}
			System.out.println("average"+total / totalCount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void getMessage(Call call, String namespaceURI, String Sign) {
		try {
			// call.setTimeout(6000);
			Object schema =   call.invoke(new Object[] { 13, "1", Sign });
			/*MessageElement[] resArray = schema.get_any();
			List<MessageElement> msgElmtBody = resArray[1].getChildren();
			if (msgElmtBody != null) {
				msgElmtBody = msgElmtBody.get(0).getChildren();
				for (MessageElement element : msgElmtBody) {
					List<MessageElement> productAttrList = element.getChildren();
					for (MessageElement attr : productAttrList) {
						String attrName = attr.getTagName();
						String attrValue = attr.getValue();
						//System.out.println(attrName + "\t\t:\t\t" +  attrValue);
					}
					//System.out.println("----------------------------------------------------------------------------");
				}
			}*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
