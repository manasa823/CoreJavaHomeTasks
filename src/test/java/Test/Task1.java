package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Task1 {
	
	@Test
	public void verifyStatus() {
		
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Response response = httpRequest.get("/users");
		
		System.out.println(response.getStatusCode());
		
		Assert.assertEquals(response.getStatusCode(),200);
		
		System.out.println(response.getStatusLine());
		
		Assert.assertEquals(response.getStatusLine().contains("OK"), true);
	}
}
