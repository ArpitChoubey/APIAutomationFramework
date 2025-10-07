package SRCTest;

public class ImplementAtoi {
	
	public static int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        int result = 0;
        int sign = 1;
        int i = 0;

        
        str = str.trim();


        if (i < str.length()) {
            if (str.charAt(i) == '-') {
                sign = -1;
                i++;
            } else if (str.charAt(i) == '+') {
                i++;
            }
        }

        
        for (; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                int digit = ch - '0';

                // Handle integer overflow/underflow
                if (result > (Integer.MAX_VALUE - digit) / 10) {
                    if (sign == 1) {
                        return Integer.MAX_VALUE;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                }

                result = result * 10 + digit;
            } else {
                break; 
            }
        }

        return result * sign;
    }

	public static void main(String[] args) {
		
		String str1 = "   -12345";
        String str2 = "4193 with words";
        String str3 = "+987";
        String str4 = "words 123";

        System.out.println("Input: \"" + str1 + "\" → Output: " + myAtoi(str1));
        System.out.println("Input: \"" + str2 + "\" → Output: " + myAtoi(str2));
        System.out.println("Input: \"" + str3 + "\" → Output: " + myAtoi(str3));
        System.out.println("Input: \"" + str4 + "\" → Output: " + myAtoi(str4));

	}

}
