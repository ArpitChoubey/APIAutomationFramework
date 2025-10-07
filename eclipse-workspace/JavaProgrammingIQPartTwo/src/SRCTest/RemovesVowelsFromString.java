package SRCTest;

public class RemovesVowelsFromString {

	public static void main(String[] args) {
		
		String input = "Ram Kumar working in a worst company";
		
		String result = input.replaceAll("(?i)[aeiou]", " ");
		
		System.out.println("Original String :"+input);
		
		System.out.println(" String without vowels :"+result);
		
		

	}

}
