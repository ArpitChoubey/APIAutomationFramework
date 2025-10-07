package SRCTest;

public class Implementstrstr {
	
	public static int strstr(String haystack, String needle) {
		
		if(haystack == null || needle == null) {
			return -1;
		}
		int n = haystack.length();
		int m = needle.length();
		
		if(m == 0) {
			return 0;
		}
		
		if(m>n) {
			return-1;
		}
		
		for(int i =0; i<= n-m; i++) {
			String substring = haystack.substring(i, i+m);
			if(substring.equals(needle)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		String haystack = "Hello world";	
		String needle = "world";
		int index = strstr(haystack,needle);
		
		if(index !=-1) {
			System.out.println("Substring \"" + needle + "\" found at index: " + index);
		} else {
			System.out.println("Substring \"" + needle + "\" not found. ");
		}
	}

}
