package org.test.jaxb;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.junit.Test;

public class XMLTOJava {

	public void createXML() {
		List<String> list = new ArrayList<String>();
		list.add("list1");
		list.add("list2");
		Map<String, String> hash = new HashMap<String, String>();
		hash.put("key1", "value1");
		hash.put("key2", "value2");
		Message ms = new Message();
		ms.setId(1);
		ms.setEnable(true);
		ms.setSex('男');
		ms.setDiscount(0.9f);
		ms.setList(list);
		ms.setHash(hash);
		ms.setName("test");
		ms.setStartDate(new Date());
		String xml = JaxbUtil.convertToXml(ms, "GBK");
		System.out.println(xml);
	}

	@Test
	public void transitionJava() {
		try {
			InputStream io = this.getClass().getClassLoader().getResourceAsStream("org/test/jaxb/message.xml");
			File file = new File("org/test/jaxb/message.xml");
			SAXReader reader = new SAXReader();
			Document doc = reader.read(io);
			String xml = doc.asXML();
			Object javaBean = JaxbUtil.converyToJavaBean(xml, Message.class);
			Message message = (Message) javaBean;
			System.out.println(message.getName());
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
}
