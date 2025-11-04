package Java8Features;

import java.util.function.Function;

public class FunctionInterfaceConcept {

	public static void main(String[] args) {
		
		
		Function<String,Integer> func = x ->x.length();
		
		int len = func.apply("This is Java 8 ");
		
		System.out.println(len);
		
		// Chaining Function :-
		
		Function<Integer,Integer> func1 = x ->x*2;
		
		int result =func.andThen(func1).apply("This is Arpit here");
		
		System.out.println(result);
	}

}
