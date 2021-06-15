package BiFunction;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

public class TestProductBiFunction {

	public static void main(String[] args) {
		BiFunction<String, Integer, Product> biFunction = (a, b) -> {
			return new Product(a, b);
		};

		BiFunction<HashMap<Product, Integer>, Integer, Integer> biFunctionCart = (a, b) -> {
			b = 0;
			Set<Product> keySet = a.keySet();
			for (Product proName : keySet) {
				int quantity = a.get(proName).intValue();
				int price = proName.getPrice();
				b = b + price * quantity;
			}
			return b;
		};

		Product hpLaptop = biFunction.apply("HP Elite Book", 70000);
		Product delLaptop = biFunction.apply("Del laptop", 79000);
		Product appleLaptop = biFunction.apply("mac book", 179000);

		HashMap<Product, Integer> cart = new HashMap<Product, Integer>();
		cart.put(hpLaptop, 5);
		cart.put(delLaptop, 9);
		cart.put(appleLaptop, 2);

		Integer cartValue = biFunctionCart.apply(cart, 0);
		System.out.println(cartValue);

		System.out.println(hpLaptop.toString());
	}

}
