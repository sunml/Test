package collection;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestMap {

	public static final int N = 50000;

	private static long testSearch(Map<Integer, Object> map) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < N; i++) {
			map.get(i);
		}
		return System.currentTimeMillis() - start;
	}

	private static long testInsert(Map<Integer, Object> map) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < N; i++) {
			map.put(i, i);
		}
		return System.currentTimeMillis() - start;
	}

	public static void main(String args[]) {
		HashMap<Integer, Object> hashMap = new HashMap<Integer, Object>();
		LinkedHashMap<Integer, Object> linkedHashMap = new LinkedHashMap<Integer, Object>();
		for (int i = 0; i < 2; i++) {
			System.out.println("----------------------------------------" + i + "----------------------------------------");
			System.out.println("插入数据hashMap耗时：" + testInsert(hashMap));
			System.out.println("插入数据linkedHashMap耗时：" + testInsert(linkedHashMap));
			System.out.println("搜索数据hashMap消耗时间：" + testSearch(hashMap));
			System.out.println("搜索数据linkedHashMap消耗时间：" + testSearch(linkedHashMap));
		}

	}

}
