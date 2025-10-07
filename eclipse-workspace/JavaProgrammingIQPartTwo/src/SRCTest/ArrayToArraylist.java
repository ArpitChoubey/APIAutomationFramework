package SRCTest;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArraylist {

	public static void main(String[] args) {
		
		String[]array = {"Apple", "Banana", "Cherry"};
		
		ArrayList<String> List = new ArrayList<>(Arrays.asList(array));
		
		System.out.println("Array elements:");
        for (String fruit : array) {
            System.out.println(fruit);

	}

}
}
