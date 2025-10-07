package MethodChaningConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Apple", "Oranges" , "Banana", "Grapes ");
		
		
		List<String> customName = new ArrayList<>();
		
		for(String s : names)
		{
			String newname = s + "Fruit";		
			customName.add(newname);
		}
		
		System.out.println("Before ---->"+names);
		
		System.out.println("After ---->"+customName);
		
		//Stream<String>  namestream = names.stream();
		//Stream<String>  nameMapStream = names.stream().map(anything -> anything + "Fruit").collect(collectors.tolist());
		//System.out.println(new names);
		
		List<String> nameMapList = names.stream()
                .map(anything -> anything + "Fruit")
                .collect(Collectors.toList());

System.out.println("After (using stream) ----> " + nameMapList);
		
		
		
		

	}

}
