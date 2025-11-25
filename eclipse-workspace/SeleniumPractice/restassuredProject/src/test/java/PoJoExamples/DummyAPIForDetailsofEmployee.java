package PoJoExamples;

import io.restassured.RestAssured;

public class DummyAPIForDetailsofEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DetailsofEmployee S1 = new DetailsofEmployee();
		S1.setAccountNo(111);
		S1.setBalance(233.34);
		S1.setFirst_name("Ram");
		S1.setLast_name("Singh");
		S1.setGender("male");
		S1.setEmail("ramsingh@gmail.com");
		
		

		RestAssured
			.given()
			.log()
			.all()
			.body(S1)
			.when()
			.get();

	}

}
