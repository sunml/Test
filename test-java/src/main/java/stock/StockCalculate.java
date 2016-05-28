package stock;

import java.math.BigDecimal;

public class StockCalculate {

	public static void main(String[] args) {
	}

	private static void profit(){
		String stockPrice = "38.75";
		String stockNum = "139500";
	}
	private static void sum() {
		String stockPrice = "38.75";
		String stockNum = "139500";
		System.out.println(new BigDecimal(stockNum).multiply(new BigDecimal(stockPrice)).multiply(new BigDecimal("100")).divide(new BigDecimal("10000")) + "万");
		System.out.println(new BigDecimal(stockNum).multiply(new BigDecimal(stockPrice)).multiply(new BigDecimal("100")).divide(new BigDecimal("100000000")) + "亿");
	}
}
