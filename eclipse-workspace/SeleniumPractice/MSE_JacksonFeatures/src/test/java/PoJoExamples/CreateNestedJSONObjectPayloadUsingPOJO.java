package PoJoExamples;

import io.restassured.RestAssured;

public class CreateNestedJSONObjectPayloadUsingPOJO {

	public static void main(String[] args) {
		
		
		StudentDetails S1 = new StudentDetails();
		S1.setFirstname("Arpit");
		S1.setLastname("Choubey");
		S1.setProfession("Software Test Engineer");
		
		Address A = new Address();
		A.setHouseNo(207);
		A.setStreet("Nagar Nigam Colony");
		A.setCity("Bangalore");
		A.setCountry("India");
		
		S1.setAddress(A);

		
		RestAssured.given().log().all()
		  .body(S1)
		  .post();
	}

}
