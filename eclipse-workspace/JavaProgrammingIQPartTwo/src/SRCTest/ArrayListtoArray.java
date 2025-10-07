package SRCTest;

import java.util.ArrayList;

public class ArrayListtoArray {

	public static void main(String[] args) {
		
		ArrayList<String> List = new ArrayList<>();
		
		List.add("Apple");
		List.add("Banana");
		List.add("Cherry");
		
		String [] array = new String[List.size()];
		
		array = List.toArray(array);
		
		System.out.println("Array elements:");
        for (String fruit : array) {
            System.out.println(fruit);
		
		
	}

}
}
