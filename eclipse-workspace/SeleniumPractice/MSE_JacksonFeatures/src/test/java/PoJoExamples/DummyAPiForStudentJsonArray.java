package PoJoExamples;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;

public class DummyAPiForStudentJsonArray {

	public static void main(String[] args) {
		
		
		DetailsofEmployee S1 = new DetailsofEmployee();
		S1.setAccountNo(111);
		S1.setBalance(233.34);
		S1.setFirst_name("Ram");
		S1.setLast_name("Singh");
		S1.setGender("male");
		S1.setEmail("ramsingh@gmail.com");
		
		DetailsofEmployee S2 = new DetailsofEmployee();
		S2.setAccountNo(1991);
		S2.setBalance(399.34);
		S2.setFirst_name("Ankit");
		S2.setLast_name("Sahu");
		S2.setGender("male");
		S2.setEmail("AnkitSahu@gmail.com");
		
		List<DetailsofEmployee> jsonArrayStudent = new ArrayList<>();
		jsonArrayStudent.add(S1);
		jsonArrayStudent.add(S2);
		
		

		RestAssured
			.given()
			.log()
			.all()
			.body(jsonArrayStudent)
			.when()
			.get();
	}

}
