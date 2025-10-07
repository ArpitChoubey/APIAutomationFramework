package SRCTest;

import java.util.Scanner;

public class ArrayMatrixLoop {

	public static void main(String[] args) {
		
           Scanner Sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows : ");
		
		int rows = Sc.nextInt();
		
         System.out.print("Enter number of columns : ");
		
		int cols = Sc.nextInt();
		
		int[] [] matrix  = 	new int [rows][cols];
		
		
		System.out.println(" Enter elements of the Matrix : ");
		
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Sc.nextInt();
            }
        }
		System.out.println("\nMatrix elements are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        }

        Sc.close();

	}

}
