package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayDemo {

	public static void main(String[] args) {
//		//ArrayList<Integer> arrList=new ArrayList<Integer>();
//		int[] arr=new int[6];
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("enter number to the array");
//		arr[i]=sc.nextInt();
//			
//			
//		}
		ArrayList<Integer> oddArrayList =new ArrayList<Integer>();
		oddArrayList.add(1);
		oddArrayList.add(2);
		oddArrayList.add(3);
		oddArrayList.add(4);
		oddArrayList.add(5);
		oddArrayList.add(6);
		List<Integer> collect = oddArrayList.stream().filter(x->x%2!=0).collect(Collectors.toList());
		for (Integer integer : collect) {
			System.out.println(integer);
		}
	

	}
	/**
	 * 
	 * @param arr
	 * @return
	 */
	public static int getOddSum(int[] arr) {
		int oddSum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (!(arr[i] % 2 == 0)) {
				oddSum = oddSum + arr[i];
			}
		}
		return oddSum;
	}
}
