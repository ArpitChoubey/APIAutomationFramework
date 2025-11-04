package MethodReferences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterMap {

	public static void main(String[] args) {
		
		
		List<Customer> customerlist = Arrays.asList(
				new Customer("Tom",30),
				new Customer("Steve",30),
				new Customer("Donald",30),
				new Customer("Trump",30),
				new Customer("Peter",30),
				new Customer("Simon",30)
				);
		
		String name  = customerlist.stream().filter(x -> "Peter".equals(x.getName())).map(Customer::getName).findAny().orElse(null);
		
		System.out.println(name);
                  
		List<String> cutlist = customerlist.stream().map(Customer::getName).collect(Collectors.toList());
		
		System.out.println("-------------------");
		cutlist.forEach(System.out::println);
		
	}

}
