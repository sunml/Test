package ml.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestLambda {

	public static void main(String[] args) {
		TestLambda testLambda = new TestLambda();
		testLambda.test1();
		testLambda.test2();
	}

	void test1() {
		new Thread(() -> System.out.println("Hello Lambda !")).start();
	}

	void test2() {
		String[] usernames = new String[] { "na", "an" };
		Comparator<String> sortByName = (String s1, String s2) -> (s1.compareTo(s2));
		Arrays.sort(usernames, sortByName);
		List<Product> list = new ArrayList<>();
		list.add(new Product("na"));
		list.add(new Product("an"));
		TestCompare testCompare = new TestCompare();
		Collections.sort(list, testCompare);

		for (Product product : list) {
			System.out.println(product.getProductName());
		}
		for (String username : usernames) {
			System.out.println(username);
		}
	}

	class TestCompare implements Comparator<Product> {
		@Override
		public int compare(Product o1, Product o2) {
			int result = o1.getProductName().compareTo(o2.getProductName());
			return result;
		}
	}

	class Product {
		public Product(String productName) {
			this.productName = productName;
		}

		private String productName;

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}
	}
}
