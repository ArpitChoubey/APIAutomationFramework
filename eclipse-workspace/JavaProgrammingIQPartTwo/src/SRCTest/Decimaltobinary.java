package SRCTest;

import java.util.Scanner;

public class Decimaltobinary {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		
        System.out.print("Enter a decimal Number : ");
        
        int decimal = Sc.nextInt();
        
        String binary = Integer.toBinaryString(decimal);
        
        System.out.println("Binary Representation : " +binary);
        
        Sc.close();
	}

}
