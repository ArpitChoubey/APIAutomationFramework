package SRCTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayUsingBuiltInMethods {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        Integer[] arr = new Integer[n];
	        
	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        
	        Arrays.sort(arr);
	        System.out.println("\nSorted in Ascending Order: " + Arrays.toString(arr));
	        
	        Arrays.sort(arr, Collections.reverseOrder());
	        System.out.println("Sorted in Descending Order: " + Arrays.toString(arr));

	        sc.close();
		
		
	}

}
