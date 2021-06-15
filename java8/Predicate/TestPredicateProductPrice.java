package Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestPredicateProductPrice {

	public static void main(String[] args) {

		Product pro1 = new Product("testName1", 2000, "electronics", "A");
		Product pro2 = new Product("testName2", 3000, "electronics", "A");
		Product pro3 = new Product("testName3", 500, "Mechanical", "A");
		Product pro4 = new Product("testName4", 10, "electronics", "A");
		Product pro5 = new Product("testName5", 50, "electricals", "A");

		ArrayList<Product> arr = new ArrayList<Product>();
		arr.add(pro1);
		arr.add(pro2);
		arr.add(pro3);
		arr.add(pro4);
		arr.add(pro5);

		Predicate<Product> pricePredicate = i -> {
			return i.price > 1000;
		};

		Predicate<Product> pricePredicate100 = i -> {
			return i.price > 100;
		};

		Predicate<Product> categoryPredicate = i -> {
			return i.category.equals("electronics");
		};

		System.out.println("------------------------");

		testPredicatePrice(pricePredicate, arr);

		System.out.println("------------------------");

		testPredicateCategory(categoryPredicate, arr);

		System.out.println("------------------------");

		testPredicateCategoryElecnicAndPrice100(categoryPredicate, pricePredicate100, arr);

		System.out.println("------------------------");

		testPredicatePrice(pricePredicate100.and(categoryPredicate), arr);
		
		System.out.println("------------------------");
		
		testPredicatePrice(pricePredicate100.or(categoryPredicate), arr);

	}

	public static void testPredicatePrice(Predicate<Product> prePro, ArrayList<Product> pro) {
		for (Product product : pro) {
			if (prePro.test(product)) {
				System.out.println(product.getName() + ": price is " + product.getPrice() +" : the category is :"+product.getCategory());
			}

		}
	}

	public static void testPredicateCategory(Predicate<Product> prePro, ArrayList<Product> pro) {
		for (Product product : pro) {
			if (prePro.test(product)) {
				System.out.println(product.getName() + ": Category is " + product.getCategory());
			}

		}
	}

	public static void testPredicateCategoryElecnicAndPrice100(Predicate<Product> prePro, Predicate<Product> prePro2,
			ArrayList<Product> pro) {
		ArrayList<Product> procArr = new ArrayList<Product>();
		for (Product product : pro) {
			if (prePro.test(product)) {
				procArr.add(product);
			}

		}

		for (Product product : procArr) {
			if (prePro2.test(product)) {
				System.out.println(product.getName() + ": Category is " + product.getCategory());
			}
		}
	}

}
