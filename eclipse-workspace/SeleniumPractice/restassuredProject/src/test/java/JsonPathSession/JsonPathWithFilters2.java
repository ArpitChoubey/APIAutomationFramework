package JsonPathSession;

import java.io.File;
import java.util.List;

import io.restassured.path.json.JsonPath;

public class JsonPathWithFilters2 {

	public static void main(String[] args) {
		
		
		String filepath =System.getProperty("user.dir") + "\\src\\test\\java\\JsonPathSession\\Details.json";
		
        File jsonArrayFile = new File(filepath);
		
		JsonPath jsonPath = new JsonPath(jsonArrayFile);
		
		System.out.println(jsonPath.getString("[0].first_name"));
		
		List<String> allFirstNames  = jsonPath.getList("first_name");
		System.out.println(allFirstNames);
		
		List<String> allFemaleFirstnames = jsonPath.getList("findAll{it.gender == 'Female'}.first_name");
		System.out.println(allFemaleFirstnames);
		
        System.out.println(jsonPath.getList("findAll{it.id <=5}.first_name"));
		
		System.out.println(jsonPath.getInt("size()"));

	}

}
