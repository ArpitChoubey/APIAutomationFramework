package SRCTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionsofArrays {

	public static void main(String[] args) {
		
		int [] arr1 = {1,2,3,4,5};
		
		int [] arr2 = {3,4,5,6,7};
		
		System.out.println("Array1 : " +Arrays.toString(arr1));
		
		System.out.println("Array2 : " +Arrays.toString(arr2));
		
		Set<Integer> UnionSet = new HashSet<>();
		
		for(int num : arr1) {
			UnionSet.add(num);
		}
		
		for(int num : arr2) {
			UnionSet.add(num);
		}
		
		Integer[] UnionArray = UnionSet.toArray(new Integer[0]);
		
		System.out.println("Union of Two Arrays :" +Arrays.toString(UnionArray));	
	}

}
