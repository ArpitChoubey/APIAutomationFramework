package SRCTest;

import java.util.Scanner;

public class BinarytoDecimal {

	public static void main(String[] args) {
		
		
Scanner Sc = new Scanner(System.in);
		
		
        System.out.print("Enter a Binary Number : ");
        
        String binary = Sc.nextLine();
        
        int decimal  = Integer.parseInt(binary, 2);
        
        System.out.println("Decimal Representation : " +decimal);
        
        Sc.close();

	}

}
