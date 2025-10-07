package SRCTest;

import java.util.Arrays;

public class RotateArrayByK {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7};
		
		int k =3;
		
		System.out.println("Original Array : " +Arrays.toString(arr));
		
		if(k>arr.length) {
			k= k% arr.length;
		}
		int [] rotated = new int [arr.length];
		
		for (int i = 0; i < arr.length; i++) {
            int newIndex = i + k;
            if (newIndex < arr.length) {
                rotated[newIndex] = arr[i];
            } else {
                rotated[newIndex - arr.length] = arr[i];
            }
        }
		System.out.println("Array after rotating by " + k  + "  positions :" +Arrays.toString(rotated));
}
}
