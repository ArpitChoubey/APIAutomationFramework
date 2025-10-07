package SRCTest;

import java.util.Arrays;

public class SelectionSortExample {

	public static void main(String[] args) {
		
		int[] arr = {64,25,32,43,11,28};
		
		System.out.println("Original Array : " +Arrays.toString(arr));
		
		for(int i=0; i<arr.length -1; i++) {
			
			int minindex = i;
			
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j] < arr[minindex]) {
					minindex = j;	
				}
			}
			
			int temp = arr[minindex];
			arr[minindex] = arr[i];
			arr[i] = temp;	
		}
		System.out.println("Sorted Array using Selection Sort : " + Arrays.toString(arr));
	}

}
