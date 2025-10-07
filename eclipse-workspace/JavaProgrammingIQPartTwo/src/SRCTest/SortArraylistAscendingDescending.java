package SRCTest;

import java.util.ArrayList;
import java.util.Collections;

public class SortArraylistAscendingDescending {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(20);
		arrList.add(5);
		arrList.add(50);
		arrList.add(26);
		arrList.add(100);
		
		System.out.println("Input Array List : "+arrList);
		Collections.sort(arrList);
		
		System.out.println("Sorted Array List : "+arrList);
		
		Collections.sort(arrList, Collections.reverseOrder());
		
		System.out.println("Sorted Array List : "+arrList);
		
		

	}

}
