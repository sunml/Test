package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class RandomTest {

	public static void main(String[] args) {
		Random random = new Random(System.currentTimeMillis());
		List<Integer> randoms = new ArrayList<Integer>();
		for (int i = 0; i < 100000; i++) {
			int num = random.nextInt(6);
			randoms.add(num);
		}
		Map<Integer, Integer> sum = new HashMap<Integer, Integer>();
		for (Integer integer : randoms) {
			if (sum.containsKey(integer)) {
				Integer tem = sum.get(integer);
				sum.put(integer, tem + 1);
			} else {
				sum.put(integer, 1);
			}
		}
		Set<Integer> keys = sum.keySet();
		for (Integer integer : keys) {
			System.out.println(integer + ":" + sum.get(integer));
		}
	}

}
