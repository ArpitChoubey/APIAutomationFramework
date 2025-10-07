package SRCTest;

import java.util.Arrays;

public class InsertionSortExample {

	public static void main(String[] args) {
	
		int[] arr = {64,25,12,22,11};
		
System.out.println("Original Array : " +Arrays.toString(arr));
		
		for(int i=0; i<arr.length ; i++) {
			
			int key = arr[i];
			
			int j = i-1;
			
			while(j>=0 && arr[j]>key) {
				
				arr[j+1] = arr[j];
				
				j--;
				
			}
			arr[j+1] = key;
			
		}
		System.out.println("Sorted Array using Insertion Sort  : " +Arrays.toString(arr));	
	}

}
