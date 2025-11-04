package MethodReferences;

import java.util.Arrays;
import java.util.List;

public class StreamsFilterFinAnyORElse {

	public static void main(String[] args) {
		
		
		List<Customer> customerlist = Arrays.asList(
				new Customer("Tom",30),
				new Customer("Steve",30),
				new Customer("Donald",30),
				new Customer("Trump",30),
				new Customer("Peter",30),
				new Customer("Simon",30)
				);
		
		Customer customer = customerlist.stream().filter(x -> "Peter".equals(x.getName())).findAny().orElse(null);
		
		System.out.println(customer.getName() +" "+customer.getAge());
		
		System.out.println("--------------------------------");
		
		Customer customer1 = customerlist.stream().filter(x -> "Arpit".equals(x.getName())).findAny().orElse(null);
		
		System.out.println(customer1);
		
		Customer customer2 = customerlist.stream().filter(x -> "Simon".equals(x.getName()) && 30 ==x.getAge()).findAny().orElse(null);
		
		System.out.println(customer2.getName() +" "+customer2.getAge());

	}

}
