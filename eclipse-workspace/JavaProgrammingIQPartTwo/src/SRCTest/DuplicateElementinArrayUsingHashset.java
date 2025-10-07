package SRCTest;

import java.util.HashSet;

public class DuplicateElementinArrayUsingHashset {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,3,4,5,5,6,7,7,8,9,9};
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (int i =0;i<arr.length;i++) {
			
			if(!hs.add(arr[i])) {
				System.out.println(arr[i] + "Duplicatevalue ");
			}
		}
		
		

	}

}
