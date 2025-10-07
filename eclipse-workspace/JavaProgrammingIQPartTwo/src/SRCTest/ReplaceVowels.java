package SRCTest;

public class ReplaceVowels {

	public static void main(String[] args) {
		
		String input = "Arpit is a QA Engineer";
		
		char replacementchar = '*';
		
		String output = input.replaceAll("(?i)[aeiou]", String.valueOf(replacementchar));
		
		System.out.println("Original String : " +input);
		
		System.out.println("Modified String : " +output);
	}

}
