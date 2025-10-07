package SRCTest;

import java.util.Arrays;

public class RemoveNegativesSort {

	public static void main(String[] args) {
		
		
		int []arr = {1, 7, -4, 9, -3, 0, -5, 2, 6, -8};
		
		int [] result = Arrays.stream(arr)
				              .filter(n -> n >= 0) 
				              .sorted()
				              .toArray();
		
		System.out.println(Arrays.toString(result));

	}

}

// Write a program to remove negative integers from an integer array and sort the positive 
// integers without using for loops. int[] arr= {1,7,-4,9,-3,0,-5,2,6,-8}; O/P: [0,1,2,6,7,9]
