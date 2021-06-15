package premitiveFuncInterface;

import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;

public class TestIntConsumer {

	public static void main(String[] args) {
		IntSupplier supplier = () -> {
			Random r = new Random();
			int low = 0;
			int high = 5000;
		    int result = r.nextInt(high-low) + low;
		    return result;
		};
		
		System.out.println(supplier.getAsInt());
	}

}
