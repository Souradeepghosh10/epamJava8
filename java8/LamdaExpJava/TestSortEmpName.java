package LamdaExpJava;

import java.util.ArrayList;
import java.util.Collections;

public class TestSortEmpName {

	public static void main(String[] args) {
		ArrayList<Emp> arrListEmp = new ArrayList<Emp>();
		arrListEmp.add(new Emp("Ramesh"));
		arrListEmp.add(new Emp("Hari"));
		arrListEmp.add(new Emp("Mohan"));
		arrListEmp.add(new Emp("Ravi"));
		arrListEmp.add(new Emp("Ganesh"));
		System.out.println("before sorting of the numbers :" + arrListEmp);
		arrListEmp.sort((Emp e1, Emp e2)->e1.getEmpName().compareTo(e2.getEmpName())); 
		System.out.println("after sorting of the numbers :" + arrListEmp);
		arrListEmp.forEach((s)->System.out.println(s));   
		
		
		Collections.sort(arrListEmp, (Emp e1, Emp e2)->e1.getEmpName().compareTo(e2.getEmpName()));
		
		System.out.println(arrListEmp);
		
	}

}
