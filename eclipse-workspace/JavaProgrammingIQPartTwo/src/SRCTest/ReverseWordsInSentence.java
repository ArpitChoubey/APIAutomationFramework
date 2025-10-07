package SRCTest;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
	
		String sentence = "Arpit is a QA Engineer";
		
		String[] words = sentence.split(" ");

        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
        	String reversedWord = new StringBuilder(word).reverse().toString();
            reversedSentence.append(reversedWord).append(" ");
        }
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Reversed Words Sentence: " + reversedSentence.toString().trim());
        }

	}

