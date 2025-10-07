package SRCTest;

public class CheckVowels {

	public static void main(String[] args) {
		
		String input = "Shyam Chandra Mishra ";
		String vowels = "aeiouAEIOU";
		
		Boolean vowelfound = false;
		
		System.out.println("Input String :"+input);
		System.out.println("vowel positions : ");
		
		for(int i=0; i<input.length();i++) {
			char ch = input.charAt(i);
			
			if(vowels.indexOf(ch)!=-1) {
				vowelfound = true;
				
				System.out.println("vowel '"+ch+     "found at position :"+i);
					
			}
		}
		   if(!vowelfound) {
			System.out.println("No vowels found in the input String.");
		}

	}

}
