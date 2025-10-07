package SRCTest;

import java.util.Scanner;

public class EncodedString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String to Encode :");
		
		String input = sc.nextLine();
		
		String encoded = encode(input);
		
		System.out.println("Encoded String : "+encoded);
		
		sc.close();
	}
	
	public static String encode(String str) {
		
		if(str == null || str.isEmpty()) {
			
			return "";
		}
		
		StringBuilder result = new StringBuilder();
		
		int count =1;
		
		for(int i=1; i<str.length(); i++) {
		 if(str.charAt(i) == str.charAt(i-1)) {
			 
			 count++;
		 } else {
			 result.append(str.charAt(i - 1)).append(count);
             count = 1;
			 
			 
		 }
		}
		result.append(str.charAt(str.length()-1)).append(count);
		return result.toString();
	}

}
