package org.bank;

import java.util.ArrayList;
import java.util.List;

import org.apache.axis.types.Schema;
import org.zttc.service.IMyService;
import org.zttc.service.MyServiceImplServiceLocator;

public class ClientTest2 {
	static int totalCount = 300;

	public static void main(String[] args) {
		String namespaceURI = "http://service.zttc.org/";
		String endpointAddress = "http://localhost:8989/test";
		try {
			IMyService ss = new MyServiceImplServiceLocator().getMyServiceImplPort();
			ss.add(1, 2);
			List<Long> totals = new ArrayList<Long>();
			for (int i = 0; i < totalCount; i++) {
				long start = System.currentTimeMillis();
				ss.add(1, 2);
				totals.add(System.currentTimeMillis() - start);
				//System.out.println(totals.get(totals.size() - 1));
			}
			long total = 0;
			for (Long ti : totals) {
				total += ti;
			}
			System.out.println("average" + total / totalCount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void printMessageElement(Object schema) {
		Schema schema2=((Schema) schema);
		System.out.println(schema2.get_any()[0]);
	}
}
