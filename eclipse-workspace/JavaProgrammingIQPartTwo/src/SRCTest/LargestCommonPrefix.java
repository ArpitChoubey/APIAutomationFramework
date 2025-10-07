package SRCTest;

import java.util.Arrays;

public class LargestCommonPrefix {
	
	public static String findLCP(String[] strs) {
		
		if(strs == null || strs.length == 0) {
			
			return "";
		}
		String prefix = strs[0];
		
		for(int i =1; i<strs.length;i++) {
			
			String current = strs[i];
			String temp = "";
			for(int j = 0; j<prefix.length() && j< current.length(); j++) {
				
				if(prefix.charAt(j) == current.charAt(j)) {
					
					temp += prefix.charAt(j);
				}else {
					break;
				}
			}
			if(temp.length()>0) {
				prefix = temp;
				
			} else {
				prefix = "";
				break;
			}
		}
		return prefix;	
	}

	public static void main(String[] args) {
		
		String [] words = {"Flower", "Flow", "Flight"};
		
		System.out.println("Input Strings : " +Arrays.toString(words));
		
		String lcp = findLCP(words);
		
		if(lcp.isEmpty()) {
			
			System.out.println("No Common Prefix Found.");
		}else {
			System.out.println("Longest Common Prefix :" +lcp);
		}
		

	}

}
