package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {
		List<Laptops> list = new ArrayList<Laptops>();
		list.add(new Laptops("dell", 32, 56000));
		list.add(new Laptops("hp", 12, 56800));
		list.add(new Laptops("apple", 16, 159000));
		list.add(new Laptops("lenovo", 8, 76000));

		Collections.sort(list);

		for (Laptops laptops : list) {
			System.out.println(laptops);
		}
		
		System.out.println("-----------------------------------");
		
		List<Laptops2> list2 = new ArrayList<Laptops2>();
		list2.add(new Laptops2("dell", 32, 56000));
		list2.add(new Laptops2("hp", 12, 56800));
		list2.add(new Laptops2("apple", 16, 159000));
		list2.add(new Laptops2("lenovo", 8, 76000));

		
		
		Comparator<Laptops2> com = new Comparator<Laptops2>() {

			@Override
			public int compare(Laptops2 o1, Laptops2 o2) {
				if (o1.price > o2.price) {
					return 1;
				} else {
					return -1;
				}
			}

		};
		

		Collections.sort(list2, com);

		for (Laptops2 laptops : list2) {
			System.out.println(laptops);
		}
	}

}
