package LibertyBooking;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class MultipleBookingwithRequestSpecification {
	
	RequestSpecification requestspecification;
	
	@BeforeClass
	public void setupRequestSpec()
	{
		requestspecification = RestAssured.given();
		requestspecification
		.log()
		.all()
		.baseUri("https://restful-booker.herokuapp.com/")
		
		.contentType(ContentType.JSON);
	}
	
	
	@Test
	public void CreateBooking(){
		RestAssured
		.given()
		.spec(requestspecification)
		.basePath("booking")
		.body("{\r\n"
				+ "			  \"firstname\": \"Arpit\",\r\n"
				+ "			  \"lastname\": \"Choubey\",\r\n"
				+ "			  \"totalprice\": 18,\r\n"
				+ "			  \"depositpaid\": false,\r\n"
				+ "			  \"bookingdates\": {\r\n"
				+ "			    \"checkin\": \"2026-01-01\",\r\n"
				+ "			    \"checkout\": \"2026-01-01\"\r\n"
				+ "			  },\r\n"
				+ "			  \"additionalneeds\": \"Breakfast\"\r\n"
				+ "			}")
		
		.post()
		.then()
		.log()
		.all()
		.statusCode(200);
	}
	
	@Test
	public void UpdateBooking(){

		RestAssured
		    .given()
		    .spec(requestspecification)
		    .basePath("booking/1")
		      .header("Content-Type","application/json")
		      .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
		      .body("{\r\n"
		      		+ "    \"firstname\" : \"James\",\r\n"
		      		+ "    \"lastname\" : \"Brown\",\r\n"
		      		+ "    \"totalprice\" : 111,\r\n"
		      		+ "    \"depositpaid\" : true,\r\n"
		      		+ "    \"bookingdates\" : {\r\n"
		      		+ "        \"checkin\" : \"2018-01-01\",\r\n"
		      		+ "        \"checkout\" : \"2019-01-01\"\r\n"
		      		+ "    },\r\n"
		      		+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
		      		+ "}")
		      
		      .when()
		        .put()
		      .then()
		         .log()
		         .all()
		         .assertThat()
		         .statusCode(200);
		         
	}


}
