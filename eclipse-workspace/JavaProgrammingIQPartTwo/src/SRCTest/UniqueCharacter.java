package SRCTest;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacter {

	public static void main(String[] args) {
		
		String str1 = "Apple";
		
		String str2 = "Grapes";
		
		Set<Character> Set1 = new HashSet<>();
		
		Set<Character> Set2 = new HashSet<>();
		

		for(char ch : str1.toCharArray()) {
			Set1.add(ch);
		}
			
			for(char ch : str2.toCharArray()) {
				
				Set2.add(ch);
			
		}
			Set<Character> Unique = new HashSet<>(Set1);
			
			Unique.addAll(Set2);
			Set<Character> Common = new HashSet<>(Set1);
			
			Common.addAll(Set2);
			Unique.removeAll(Common);
			
			StringBuilder result = new StringBuilder();
			for(char ch : Unique) {
				result.append(ch);
			}
			System.out.println("String 1 : " +str1);
			System.out.println("String 2 : " +str2);
			System.out.println("Unique Character  : " +result.toString());	

	}

}

