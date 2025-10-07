package SRCTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseList {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.print("Enter number of integers: ");
        int n = Sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("Enter integers:");
        for (int i = 0; i < n; i++) {
            list.add(Sc.nextInt());
        }
        
        Collections.reverse(list);
        
        System.out.println("\nReversed List:");
        for (int num : list) {
            System.out.print(num + " ");
        }
        Sc.close();	
	}
}
