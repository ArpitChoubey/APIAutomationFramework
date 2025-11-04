package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

	public static void main(String[] args) {

           
		List<Integer> List1 = List.of(2,4,5,66,77,99,100,58,246);
		
		List<Integer> List2 = new ArrayList<>();
		List2.add(24);
		List2.add(56);
		List2.add(88);
		List2.add(64);
		
		List<Integer> list3 = Arrays.asList(23,64,66,88,100);
		
		List<Integer> listEven = new ArrayList<>();
		
		for(Integer i : List1) {
			if(i%2==0) {
				listEven.add(i);
			}
		}
		System.out.println(List1);
		System.out.println(listEven);
		
		Stream<Integer> Stream = List1.stream();
		
		List<Integer> newList = Stream.filter(i-> i%2==0).collect(Collectors.toList());
		
		System.out.println(newList);
		
		List<Integer> newList1 = List1.stream().filter(i-> i%2==0).collect(Collectors.toList());
		
		System.out.println(newList1);
		
		List<Integer> newList2 = List1.stream().filter(i-> i>10).collect(Collectors.toList());
		
		System.out.println(newList2);
		
		

	}

}
