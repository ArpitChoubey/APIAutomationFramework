package JsonPathSession;

import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class ConvertJSONArrayResponsetoList {

	public static void main(String[] args) {
		
		List allEmp = 
		RestAssured
		.get("https://mocki.io/v1/0be5e165-4eb4-40c4-8e7c-1d0b8f1f4903")
	    // .as(List.class)
		.as(new TypeRef<List<Map<String,Object>>>(){});
		
		
		System.out.println(allEmp.size());
		
	Map<String,Object> emp1 = (Map<String,Object>) allEmp.get(0);
		
		System.out.println(emp1.get("first_name"));
		
       // Map<String,Object> emp1 = allEmp.get(0);
		
		//System.out.println(emp1.get("first_name"));
		
		
	}

}
