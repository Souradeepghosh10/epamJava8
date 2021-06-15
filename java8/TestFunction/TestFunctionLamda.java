package TestFunction;

import java.util.ArrayList;
import java.util.function.Function;

public class TestFunctionLamda {

	public static void main(String[] args) {
		// Write a function to calculate the cost of all products in a given list of
		// products.

		ArrayList<Product> proArrList = new ArrayList<Product>();
		proArrList.add(new Product("Hp laptop", 599990, "Electronics", "A"));
		proArrList.add(new Product("Dell laptop", 409990, "Electronics", "A"));
		proArrList.add(new Product("Lenovo laptop", 596790, "Electronics", "A"));
		proArrList.add(new Product("Apple laptop", 1599990, "Electronics", "A"));
		proArrList.add(new Product("Fan", 900, "Electrical", "A"));

		Function<ArrayList<Product>, Integer> funPro = (pro) -> {
			int sum = 0;
			for (Product product : pro) {
				sum = sum + product.getPrice();
			}
			return sum;
		};

		Integer totalPrice = funPro.apply(proArrList);
		System.out.println(totalPrice);

		// Write a function to calculate the cost of all products whose prices is >
		// 1000/- in the given list of products.

		Function<ArrayList<Product>, Integer> fun1000 = (pro) -> {
			int sum = 0;
			for (Product product : pro) {
				if (product.getPrice() > 1000) {
					sum = sum + product.getPrice();
				}
			}
			return sum;
		};

		Integer totalPrice1000 = fun1000.apply(proArrList);
		System.out.println(totalPrice1000);

		// Write a function to calculate the cost of all electronic products in the
		// given list of products.

		Function<ArrayList<Product>, Integer> funEle = (pro) -> {
			int sum = 0;
			for (Product product : pro) {
				if (product.getCategory().equals("Electronics")) {
					sum = sum + product.getPrice();
				}
			}
			return sum;
		};
		Integer funElec = funEle.apply(proArrList);
		System.out.println(funElec);

		// Write a function to get all the products whose price is is > 1000/- and
		// belongs to electronic category.
		
		Function<ArrayList<Product>, ArrayList<Product>> fun_1000 = (pro) -> {
			ArrayList<Product> arr=new ArrayList<Product>();
			for (Product product : pro) {
				if (product.getPrice() > 1000) {
					arr.add(product);
				}
			}
			return arr;
		};
		
		Function<ArrayList<Product>, ArrayList<Product>> fun_Elec = (pro) -> {
			ArrayList<Product> arr=new ArrayList<Product>();
			for (Product product : pro) {
				if (product.getCategory().equals("Electronics")) {
					arr.add(product);
				}
			}
			return arr;
		};
		
		ArrayList<Product> apply = fun_1000.apply(proArrList);
		ArrayList<Product> finalArr = fun_Elec.apply(apply);
		System.out.println(finalArr);
		
		

	}

}
