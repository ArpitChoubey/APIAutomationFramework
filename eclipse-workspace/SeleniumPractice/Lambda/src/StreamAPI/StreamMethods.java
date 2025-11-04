package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

	public static void main(String[] args) {

               
		List<String> names = List.of("Aman","Ankit", "Abhinav", "Durgesh");
		
		List<String> Newnames = names.stream().filter(e-> e.startsWith("A")).collect(Collectors.toList());
		
		System.out.println(Newnames);
		
		List<Integer> numbers = List.of(2,4,5,66,77,99,100,58,246);
		
		List<Integer> newnumbers =    numbers.stream().map(i->i*i).collect(Collectors.toList());
		     
		System.out.println(newnumbers);  
		
		names.stream().forEach(
				e->{
					System.out.println(e);	
				}
				);
		Newnames.stream().forEach(System.out :: println);
		
		Newnames.stream().sorted().forEach(System.out :: println);
		
		Integer integer = numbers.stream().min(x,y) ->  x.compareto(y)).get();
		
	}

}
