package Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class TestSupplier {

	public static void main(String[] args) {
		Supplier<Product> sup = () -> {
			return new Product("testPro" + System.currentTimeMillis(), 20909090);
		};

		System.out.println(sup.get());

		Supplier<String> randomSup = () -> {
			Random rnd = new Random();
			int number = rnd.nextInt(999999);
			// this will convert any number sequence into 6 character.
			return String.format("%06d", number);
		};

		System.out.println(randomSup.get());

	}

}
