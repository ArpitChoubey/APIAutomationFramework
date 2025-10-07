package SRCTest;

import java.util.Scanner;

public class PascalsTriangle {
	
	public static int factorial(int n) {
		
		int fact =1;
		
		for(int i=1; i<=n; i++) {
			fact *= i;
		}
		return fact;
		
		
	}
	
	public static int nCr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
		

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows for Pascal's Triangle: ");
        int rows = Sc.nextInt();
        
        for (int i = 0; i < rows; i++) {
            
            for (int s = 0; s < rows - i; s++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j <= i; j++) {
                System.out.print(nCr(i, j) + " ");
            }
            System.out.println();
        }

        Sc.close();
		

	}

}
