package collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * List和LinkedList的获取数据/操作数据对比
 * 
 * @author moline
 *
 */
public class TestList {
	public static final int N = 50000;

	public static List<Object> values;

	static {
		Integer[] vals = new Integer[N];
		Random r = new Random();
		for (int i = 0, currval = 0; i < N; i++) {
			vals[i] = new Integer(currval);
			currval += r.nextInt(100) + 1;
		}
		values = Arrays.asList(vals);
	}

	private static long testSearch(List lst) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < N; i++) {
			int index = Collections.binarySearch(lst, values.get(i));
			if (index != i) System.out.println("***错误***");
		}
		return System.currentTimeMillis() - start;
	}

	private static long testInsert(List list) {
		int N = 50000;
		long start = System.currentTimeMillis();
		Object o = new Object();
		for (int i = 0; i < N; i++)
			list.add(0, o);
		return System.currentTimeMillis() - start;
	}

	public static void main(String args[]) {
		ArrayList arrayList = new ArrayList(values);
		LinkedList linkedList = new LinkedList(values);
		for (int i = 0; i < 3; i++) {
			System.out.println("----------------------------------------" + i + "----------------------------------------");
			System.out.println("搜索数据ArrayList消耗时间：" + testSearch(arrayList));
			System.out.println("搜索数据LinkedList消耗时间：" + testSearch(linkedList));
			System.out.println("插入数据ArrayList耗时：" + testInsert(new ArrayList()));
			System.out.println("插入数据LinkedList耗时：" + testInsert(new LinkedList()));
		}
	}

}
