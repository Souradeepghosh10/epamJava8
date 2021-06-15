package premitiveFuncInterface;

import java.util.function.IntConsumer;

public class TestIntSupplier {

	public static void main(String[] args) {
		IntConsumer consumer = (number) -> {
			System.out.println(number * number);
		};
		
		consumer.accept(4);
	}

}
