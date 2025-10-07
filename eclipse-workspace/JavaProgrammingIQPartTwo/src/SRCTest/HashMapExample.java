package SRCTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) {

       Scanner Sc = new Scanner(System.in);
       
       HashMap<String,String> Map = new HashMap<>();
       
       
        System.out.print("Enter number of key value pairs : ");
        
        int n = Sc.nextInt();
        
        Sc.nextLine();
        
        for(int i = 0; i<n; i++) {
        	System.out.print("Enter Key :");
        	String key = Sc.nextLine();
        	
        	System.out.print("Enter value :");
        	String value = Sc.nextLine();
        	
        	Map.put(key,value);
        	
        }
        System.out.println("\nStored Key-Value Pairs:");
        for (Map.Entry<String, String> entry : Map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        Sc.close();
	}

}
