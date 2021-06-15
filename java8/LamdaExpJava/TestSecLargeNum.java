package LamdaExpJava;

import java.util.ArrayList;
import java.util.Collections;

public class TestSecLargeNum {

	public static void main(String[] args) {
		InterfListP ip = (ArrayList<Integer> arg) -> {
			Collections.sort(arg);
			int total=arg.size();
			Integer integer = arg.get(total-2);
			System.out.println(integer);
		};

		ArrayList<Integer> arrg=new ArrayList<Integer>();
		arrg.add(1);
		arrg.add(5);
		arrg.add(9);
		arrg.add(7);
		arrg.add(2);
		arrg.add(3);
		
		ip.validateSecList(arrg);
	}

}
