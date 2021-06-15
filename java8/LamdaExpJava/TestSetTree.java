package LamdaExpJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TestSetTree {

	public static void main(String[] args) {
		TreeSet<Integer> treeset = new TreeSet<Integer>((I1, I2) -> {
			if (I1 < I2) {
				return +1;
			} else if (I1 > I2) {
				return -1;
			} else {
				return 0;
			}
		});
		
		treeset.add(4);
		treeset.add(5);
		treeset.add(7);
		treeset.add(2);
		treeset.add(1);
		
		System.out.println(treeset);
	}

}
