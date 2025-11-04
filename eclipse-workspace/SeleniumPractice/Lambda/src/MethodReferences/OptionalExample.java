package MethodReferences;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		
		String str = "Java is my Favorite Language ";
		
		if(str==null)
		{
			System.out.println("This is Null Object");
		} else {
			System.out.println(str.length());
		}
		
       Optional<String> optional = Optional.ofNullable(str);
		
		System.out.println(optional.isPresent()); 
		System.out.println(optional.get());
		System.out.println(optional.orElse("No value is this object"));

	}
           

	
}
