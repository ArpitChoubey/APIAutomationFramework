package SRCTest;

import java.util.Arrays;

public class MoveZerosToEndArray {

	public static void main(String[] args) {
		
		int[] arr = {0, 1, 0, 3, 12, 0, 5};

        System.out.println("Original Array: " + Arrays.toString(arr));
        
        int nonZeroIndex = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex] = 0;
            nonZeroIndex++;
        }

        System.out.println("Array after moving zeros to the end: " + Arrays.toString(arr));
        
        

	}

}
