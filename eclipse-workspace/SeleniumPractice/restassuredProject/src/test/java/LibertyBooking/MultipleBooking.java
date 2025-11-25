package LibertyBooking;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class MultipleBooking {
	
	
	@Test
	public void CreateBooking(){
		RestAssured
		.given()
		.log()
		.all()
		.baseUri("https://restful-booker.herokuapp.com/")
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
		.contentType(ContentType.JSON)
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
		    .log()
	         .all()
		      .baseUri("https://restful-booker.herokuapp.com/")
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
