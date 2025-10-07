package SRCTest;

import java.util.Scanner;

public class CountSetBits {

	public static void main(String[] args) {
		
		
	Scanner Sc = new Scanner(System.in);
	
	System.out.print("Enter an Integer : ");
	
	int num = Sc.nextInt();
	
	int count = 0;
	
	int n = num;
	
	while(n>0) {
		
		n = n & (n-1);
		
		count++;	
		
	}
	System.out.println("Number of set bits in " + num + " = " + count);

    Sc.close();
	}

}
