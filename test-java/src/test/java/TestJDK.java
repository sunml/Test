import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TestJDK {

	public static void main(String[] args) {
		String str = "1024";
		int num = new Integer(str);
		num = Integer.parseInt(str);
		List<String> list = new ArrayList<String>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put(null, "dfe");
		list = new LinkedList<String>();
		char c1 = '0';
		char c2 = '2';
		HashSet<String> set = new HashSet<>();
		set.add("1");
		System.out.println((byte) c1 < c2);
		System.out.println(sum(4));
		str = new String("1024");
		System.out.println(str.hashCode());
		System.out.println(str.intern());
		System.out.println(Math.pow(2, 8));
		System.out.println(1023 >> 8);
		System.out.println(1023 / 256);
		System.out.println(1023 - 768);
		System.out.println(3 * 256);
		HashMap dfe =new HashMap<>();
	}

	/**
	 * 3+33+333
	 * 
	 * @param a
	 * @return
	 */
	private static int sum(int a) {
		int result = 0;
		for (int i = 0; i < a; i++) {
			int n = 0;
			String temp = a + "";
			for (int j = 0; j < i; j++) {
				n += a * Math.pow(10, j);
				temp += a;
			}
			// result += n;
			result += Integer.valueOf(temp);
		}
		return result;
	}

	private static int parseInt(String str) {
		return Integer.parseInt(str);
	}
}
