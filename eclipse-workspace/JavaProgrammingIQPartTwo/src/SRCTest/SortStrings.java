package SRCTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortStrings {

	public static void main(String[] args) {

          Scanner Sc = new Scanner(System.in);
          
          System.out.print("Enter number of Strings : ");
          
          int n = Sc.nextInt();
          
          Sc.nextLine();
          
          ArrayList<String> List = new ArrayList<>();
          
          System.out.println("Enter Strings : ");
          
          for(int i=0; i<n; i++) {
        	  List.add(Sc.nextLine());
          }
     
          Collections.sort(List);
          
          System.out.println("\n Sorted Strings : ");
          for (String str : List) {
        	  System.out.println(str);
          }
          Sc.close();     
	}

}
