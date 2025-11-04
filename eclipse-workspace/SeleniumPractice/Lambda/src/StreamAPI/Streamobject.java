package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streamobject {

	public static void main(String[] args) {

            
		Stream<Object> emptyStream = Stream.empty();
		
		String names [] = {"Durgesh", "Uttam", "Ankit", "Divya"};
		
		Stream<String>  Stream1 = Stream.of(names);
		
		Stream1.forEach(e -> {
			System.out.println(e);
		});
		
		Stream<Object> Streambuilder = Stream.builder().build();
		
		IntStream Stream = Arrays.stream(new int[] {2,4,65,564});
		
		Stream.forEach(e-> {
			System.out.println(e);
		});
		
		List<Integer> List2 = new ArrayList<>();
		List2.add(24);
		Stream<Integer> Stream2 = List2.stream();
		
		Stream2.forEach(e-> {
			System.out.println(e);
		});
		
		

	}

}
