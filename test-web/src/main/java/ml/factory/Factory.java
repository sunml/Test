package ml.factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ml.model.Product;

@Configuration
public class Factory {

	@Bean(name = { "car" })
	public Product getProduct() {
		Product product = Product.getInstance2().new Car();
		product.setId(1);
		product.setType("car");
		return product;
	}

	@Bean(name = { "bike" })
	public static Product getProduct2() {
		Product product = Product.getInstance().new Bike();
		product.setId(2);
		product.setType("bike");
		return product;
	}

}
