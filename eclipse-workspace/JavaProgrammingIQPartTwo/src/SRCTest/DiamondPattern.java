package SRCTest;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
        int n = Sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = n - 1; i >= 1; i--) {
            
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        Sc.close();
      
	}

}
