package SRCTest;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		
		int a  = Sc.nextInt();
		
		System.out.print("Enter Second Number : ");
		
		int b  = Sc.nextInt();
		
		int gcd  = findGCD(a,b);
		
		System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
		
		Sc.close();
	}

	

   private static int findGCD(int a, int b) {
    while(b != 0){
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;  
   }
}
