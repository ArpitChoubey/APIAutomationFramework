package SRCTest;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthese {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String with Parentheses: ");
        String input = sc.nextLine();

        if (isBalanced(input)) {
            System.out.println("The String is balanced.");
        } else {
            System.out.println("The String is not balanced.");
        }

        sc.close();
    }

    // ✅ Method to check if parentheses are balanced
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            // If opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If closing bracket, check stack
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // No matching opening
                }
                char top = stack.pop();
                // Check matching pairs
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        // If stack is empty, balanced; else not balanced
        return stack.isEmpty();
    }
}

