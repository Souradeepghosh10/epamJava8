package LamdaExpJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		
		TreeMap<Integer,Integer> treeMap=new TreeMap<Integer, Integer>((I1, I2) -> {
			if (I1 < I2) {
				return +1;
			} else if (I1 > I2) {
				return -1;
			} else {
				return 0;
			}
		});
		
		
		
	
		
		treeMap.put(1,4);
		treeMap.put(2,5);
		treeMap.put(3,7);
		treeMap.put(4,2);
		treeMap.put(5,1);
		
		System.out.println(treeMap);
	}

}
