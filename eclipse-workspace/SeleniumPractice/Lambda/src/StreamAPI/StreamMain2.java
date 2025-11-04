package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class StreamMain2 {

	public static void main(String[] args) {
			
	List<Integer> integers = new ArrayList<>(List.of(33, 44, 66, 77, 888, 999, 4444, 9999, 333, 444));
	
	System.out.println(integers);
	
	integers.stream().forEach(e ->{
		System.out.println(e);
	});

	integers.stream().forEach(System.out::println);

	}

}
