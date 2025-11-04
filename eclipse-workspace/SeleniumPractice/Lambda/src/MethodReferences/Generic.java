package MethodReferences;

import java.util.ArrayList;
import java.util.List;

public class Generic {

	public static void main(String[] args) {
		
		List<String> List = new ArrayList<>();
		List.add("Ram");
		List.add("Sita");
		
		
		
		List anotherlist = new ArrayList(); //Generic
		anotherlist.add(33);
		anotherlist.add(33.99);
		anotherlist.add("Ram");
		
		System.out.println(List);
		System.out.println(anotherlist);
		
		

	}

}
