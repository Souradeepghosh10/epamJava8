package StreamApiTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamApi {

	public static void main(String[] args) {
		ArrayList<Product> proList = new ArrayList<Product>();
		proList.add(new Product("hp laptop", 150000, "electronics", "a"));
		proList.add(new Product("Dell laptop", 750000, "electronics", "a"));
		proList.add(new Product("Apple laptop", 150000, "electronics", "a"));
		proList.add(new Product("lenovo laptop", 90098, "electronics", "a"));
		proList.add(new Product("Mobile samsung", 900, "electronics", "m"));
		proList.add(new Product("switch board", 100, "electricals", "m"));

		List<Product> productCollect = proList.stream().filter((Product) -> Product.price > 1000)
				.collect(Collectors.toList());

		List<Product> productCollect1 = proList.stream().filter((Product) -> Product.category.equals("electronics"))
				.collect(Collectors.toList());

		List<String> productCollect2 = proList.stream().filter((Product) -> Product.price > 1000)
				.filter((Product) -> Product.category.equals("electronics")).map((Product)->Product.name.toUpperCase()).collect(Collectors.toList());
		
		
		long productCollect3 = proList.stream().filter((Product) -> Product.category.equals("electronics"))
				.count();

		System.out.println(productCollect);

		System.out.println(productCollect1);
		
		System.out.println(productCollect2);
		
		System.out.println(productCollect3);

	}

}
