package SRCTest;

public class CheckOnlyDigits {

	public static void main(String[] args) {
		
		String input = "6363698746";
		
		if(input.matches("\\d+")) {
			
			System.out.println(" The String contains only digits ");
		}  else {
			System.out.println(" The String does not contains only digits ");
		}
	}

}
