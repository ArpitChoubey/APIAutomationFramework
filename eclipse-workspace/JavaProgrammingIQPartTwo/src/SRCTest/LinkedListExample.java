package SRCTest;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> List = new LinkedList<>();
		
		List.add("Apple");
		List.add("Banana");
		List.add("Cherry");
		List.addFirst("Mango");
		List.addLast("Grapes");
		
		System.out.println("LinkedList after adding elements: " + List);
		
		System.out.println("First Element :" +List.getFirst());
		System.out.println("Last Element : " +List.getLast());
		System.out.println("Element at index 2:" +List.get(2));
		
		List.remove("Banana");
		List.removeFirst();
		List.removeLast();
		
		System.out.println("LinkedList after removing elements: " + List);
		
		System.out.println("Iterating using for-each loop:");
        for (String fruit : List) {
            System.out.println(fruit);
        }

        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = List.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
		
        if (List.contains("Cherry")) {
            System.out.println("LinkedList contains Cherry");
        } else {
            System.out.println("LinkedList does not contain Cherry");
        }

		
        System.out.println("Size of LinkedList: " + List.size());
	}

}
