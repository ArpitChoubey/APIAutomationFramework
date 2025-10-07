package SRCTest;

public class EvenOddNumbersfromArray {

	public static void main(String[] args) {
		
		int[] numbers = {10,20,30,33,23,45,66,78,31,34,66,89,99};
		
		System.out.println("Even Numbers in the Array :");
		
		for(int num : numbers) {
			if(num % 2 ==0) {
				System.out.println(num + "");
			}
		}
		
		System.out.println("\nOdd Numbers in the Array :");
		
		for(int num : numbers) {
			if(num % 2!= 0) {
				System.out.println(num + "");
	}

		}
	}
}
