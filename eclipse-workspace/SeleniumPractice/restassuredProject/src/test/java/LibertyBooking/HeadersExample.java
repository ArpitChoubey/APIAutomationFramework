package LibertyBooking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;

public class HeadersExample {
	
	@Test
	public void passHeader() {
		
		RestAssured
		.given()
		.log()
		.all()
		.header("header1", "value1")
		.header("header21", "value2","value3","value6")
		.when()
		.get();
		
	}
    
	
	@Test
	public void passHeader2() {
		
		RestAssured
		.given()
		.log()
		.all()
		.header("header19", "value13")
		.header("header21", "value22","value33","value66")
		.when()
		.get();
		
	}
	
	@Test
	public void passHeader7() {
		Header header = new Header("header19", "value13");
		RestAssured
		.given()
		.log()
		.all()
		.header(header)
	
		.when()
		.get();
		
	}
	
	@Test
	public void passHeader5() {
		
		RestAssured
		.given()
		.log()
		.all()
		.headers("header19", "value13","header14", "value14","header16", "value16")
	
		.when()
		.get();
		
	}
	
	@Test
	public void passHeader4() {
		
		Map<String,String> headerMap = new HashMap<>();
		headerMap.put("h1", "v1");
		headerMap.put("h2", "v2");
		headerMap.put("h3", "v3");
		headerMap.put("h4", "v3");
		headerMap.put("h5", "v6");
		
		RestAssured
		.given()
		.log()
		.all()
		.headers(headerMap)
	
		.when()
		.get();
		
	}
	
	@Test
	public void passHeader9() {
		
	List<Header> allHeaders = new ArrayList<>();
	
	Header header = new Header("header19", "value13");
	Header header1 = new Header("header33", "value23");
	allHeaders.add(header);
	allHeaders.add(header1);
	
	Headers headers = new Headers(header);
	
		RestAssured
		.given()
		.log()
		.all()
		.headers(headers)
	
		.when()
		.get();
		
	}
}
