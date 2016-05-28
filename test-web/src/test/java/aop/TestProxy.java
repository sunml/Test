package aop;

import ml.invocation.DaoInvocation;
import ml.invocation.DaoPrxoy;
import ml.model.Product;
import ml.services.ProductService;
import ml.services.impl.BikeServiceImpl;
import ml.services.impl.CarServiceImpl;

public class TestProxy {

	public static void main(String[] args) {
		testCglibProxy();
		testJdkProxy();
	}

	private static void testCglibProxy() {
		DaoPrxoy proxy = new DaoPrxoy();
		ProductService service = (ProductService) proxy.getInstance(new CarServiceImpl());
		Product object = service.getProduct();
		System.out.println(object);
	}

	private static void testJdkProxy() {
		DaoInvocation dao = new DaoInvocation();
		ProductService service = (ProductService) dao.bind(new BikeServiceImpl());
		System.out.println(service.getProduct());
	}

}
