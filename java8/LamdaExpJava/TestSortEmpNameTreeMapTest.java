package LamdaExpJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestSortEmpNameTreeMapTest {

	public static void main(String[] args) {
		TreeMap<Integer,String> treeMapEmp = new TreeMap<Integer,String>();
		treeMapEmp.put(2,"Hari");
		treeMapEmp.put(3,"Mohan");
		treeMapEmp.put(5,"Ravi");
		treeMapEmp.put(4,"Abhi");
		
		InterfMapEmp imp=(TreeMap<Integer, String> arg)->{
			 // Create a list from elements of HashMap
	        List<Map.Entry<Integer, String> > list
	            = new LinkedList<Map.Entry<Integer, String> >(
	                arg.entrySet());
	 
	        // Sort the list using lambda expression
	        Collections.sort(
	            list,
	            (i1,
	             i2) -> i1.getValue().compareTo(i2.getValue()));
	 
	        // put data from sorted list to hashmap
	        HashMap<Integer, String> temp
	            = new HashMap<Integer, String>();
	        for (Map.Entry<Integer, String> aa : list) {
	            temp.put(aa.getKey(), aa.getValue());
	        }
	        return list;
		};
		
		List<Entry<Integer, String>> validateTreeMapSort = imp.validateTreeMapSort(treeMapEmp);


		System.out.println(validateTreeMapSort);
	}

}
