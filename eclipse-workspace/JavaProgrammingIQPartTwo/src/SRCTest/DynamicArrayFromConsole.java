package SRCTest;

import java.util.Scanner;

public class DynamicArrayFromConsole {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of Elements :");
		
		int size = scanner.nextInt();
		
		int[] numbers = new int[size];
		
		System.out.println("Enter" +size+  "elements :");
		
		for(int i =0; i<size;i++) {
			
			System.out.println("Elemnets " +(i+1)+  ":");
			
		numbers [i] = scanner.nextInt();
		
		}
		
		System.out.println("You entered the Following array :");
		
		for(int num : numbers) {
			System.out.print(num +"");
		}
		
                 scanner.close();
	}

}
