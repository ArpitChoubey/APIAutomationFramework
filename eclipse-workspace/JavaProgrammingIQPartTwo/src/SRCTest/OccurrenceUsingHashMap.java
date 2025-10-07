package SRCTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccurrenceUsingHashMap {

	public static void main(String[] args) {
		
		List<String> items = Arrays.asList("Apple","Banana", "Apple","Cherry", "Banana","Cherry","Apple");
		
		HashMap<String,Integer> map = new HashMap<>();
		
		for(String item : items) {
			
			map.put(item, map.getOrDefault(item, 0) + 1);	
		}
		System.out.println("Occurrences of elements:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
		
	}

}
}
