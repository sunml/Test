package com.bank;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Verify {
	private static String requestUrl = "queryMethod=com.bank.UserQuery.ExGetProductInfo4PartnerWeb&arguments={id: 1}&sign=asdflsadjflkjsafdljlaskjfdl&ua=peizi_web";
	private static Properties config;

	private static Map<String, Security> cacheMap = new HashMap<String, Security>();
	private static Map<String, String> parameterMap = new HashMap<String, String>();

	static {
		try {
			config = new Properties();
			InputStream in = Verify.class.getClassLoader().getResourceAsStream("com/bank/config.properties");
			config.load(in);
			String key = config.getProperty("zhijiaoyi.key");
			String[] ips = config.getProperty("zhijiaoyi.ips").split(",");
			Security security = new Security(key);
			for (String ip : ips)
				security.add(ip);
			cacheMap.put("user", security);

			String[] paras = requestUrl.split("&");
			for (int i = 0; i < paras.length; i++) {
				String[] parameter = paras[i].split("=");
				parameterMap.put(parameter[0], parameter[1]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Security security = cacheMap.get("user");
		String key = security.getKey();
		System.out.println("key:" + key);
		String queryMethod = parameterMap.get("queryMethod");
		// String[] queryMethodSp =queryMethod.split("\\.");
		int queryString = queryMethod.lastIndexOf(".");
		String className = queryMethod.substring(0, queryString);
		String methodName = queryMethod.substring(queryString + 1);
		try {
			// Thread.currentThread().getClass();
			Class class1 = Thread.currentThread().getClass().forName(className);
			Object object = class1.newInstance();
			String json = (String) class1.getDeclaredMethod(methodName, HashMap.class).invoke(object, parameterMap);
			System.out.println(json);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
