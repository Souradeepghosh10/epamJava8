package LamdaExpJava;

import java.util.ArrayList;
import java.util.Collections;

public class TestSortRevCollections {

	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(2);
		arrList.add(1);
		arrList.add(9);
		arrList.add(4);
		arrList.add(7);

		System.out.println("before sorting of the numbers :" + arrList);

		Collections.sort(arrList, (I1, I2) -> {
			if (I1 < I2) {
				return +1;
			} else if (I1 > I2) {
				return -1;
			} else {
				return 0;
			}
		});
		System.out.println("after sorting of the numbers :" + arrList);
		
	}

}
