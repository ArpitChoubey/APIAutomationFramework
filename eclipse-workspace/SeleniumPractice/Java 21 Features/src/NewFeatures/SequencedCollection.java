package NewFeatures;

import java.util.ArrayList;
import java.util.List;

public class SequencedCollection {

	public static void main(String[] args) {
		
		List<String> List = new ArrayList();
		
		List.addFirst("First Element");
		List.addLast("Last Element");
		
		System.out.println(List);
		System.out.println(List.getFirst());
		System.out.println(List.reversed());
		System.out.println(List.getLast());
		System.out.println(List.removeFirst());
		System.out.println(List.removeLast());
		
		
		
		

	}

}
