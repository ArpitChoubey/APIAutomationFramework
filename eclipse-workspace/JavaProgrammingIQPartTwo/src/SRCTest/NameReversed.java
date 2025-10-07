package SRCTest;

public class NameReversed {

	public static void main(String[] args) {
		
		String name = "Arpit Choubey";
		
		String [] parts = name.split(" ");
		
		if (parts.length==2) {
			String reversedname = parts[1] + " " + parts[0];
			
			System.out.println("ReversedName :" +reversedname);
			
		} else {
			
			System.out.println("Please provide a name with exactly two parts. ");
		}

	}

}
