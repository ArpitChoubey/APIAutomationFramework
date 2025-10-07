package SRCTest;

import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Enter number of elements: ");
		 
		 String str = sc.nextLine();
		 
		 int num1 = Integer.parseInt(str);
	        System.out.println("Converted using parseInt: " + num1);
	        
	        Integer num2 = Integer.valueOf(str);
	        System.out.println("Converted using valueOf: " + num2);

	        
	        System.out.println("After adding 10: " + (num1 + 10));

	        sc.close();

	}

}
