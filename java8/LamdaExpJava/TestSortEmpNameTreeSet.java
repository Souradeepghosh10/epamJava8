package LamdaExpJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TestSortEmpNameTreeSet {

	public static void main(String[] args) {
		TreeSet<Emp> treeSetEmp = new TreeSet<Emp>((Emp e1, Emp e2) -> e1.getEmpName().compareTo(e2.getEmpName()));
		treeSetEmp.add(new Emp("Ramesh"));
		treeSetEmp.add(new Emp("Hari"));
		treeSetEmp.add(new Emp("Mohan"));
		treeSetEmp.add(new Emp("Ravi"));
		treeSetEmp.add(new Emp("Abhi"));
		treeSetEmp.forEach((s) -> System.out.println(s));

	}

}
