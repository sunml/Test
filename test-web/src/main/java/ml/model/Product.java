package ml.model;

public class Product {

	private static Product product;

	public static synchronized Product getInstance() {
		if (product == null) {
			product = new Product();
		}
		return product;
	}

	public static Product getInstance2() {
		if (product == null) {
			synchronized (Product.class) {
				if (product == null) {
					product = new Product();
				}
			}
		}
		return product;
	}

	private long id;

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10000; i++) {
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					Product product = Product.getInstance2();
					product.setId(10);
				}
			});
			thread.start();
		}
	}

	class SynTread implements Runnable {
		@Override
		public void run() {
			Product.getInstance2();
		}

	}

	public class Car extends Product {

	}

	public class Bike extends Product {

	}
}
