package Test;

import java.net.http.HttpRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Task2 {

	@Test
	public void verifyHeader() {
		
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Response response = httpRequest.get("/users");
		
		Headers headers = response.headers();
		
		for(Header head : headers) {
			
			if(head.getName().equalsIgnoreCase("Content-Type")) {
				
				System.out.println(head);
				
				Assert.assertEquals(head.getValue(), "application/json; charset=utf-8");
				
				break;
			}
		}
	}
}
