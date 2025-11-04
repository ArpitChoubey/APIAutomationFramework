package Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {

	public static void main(String[] args) {
		
		
		UnaryOperator<Integer> func = x -> x *7;
		
		int n1 = func.apply(10);
		
		System.out.println(n1);
		
		Function<Integer,Integer> func1 = x ->x*10;
		
		System.out.println(func1.apply(40));
		
		List<String> langlist = new ArrayList<String>();
		
		langlist.add("Java");
		
		langlist.add("Ruby");
		
		langlist.add("Python");
		
		System.out.println(langlist);
		
		langlist.replaceAll(ele -> ele + "Arpit");
		
		System.out.println(langlist);
		
		
		
		
		
		
		
	}

}
