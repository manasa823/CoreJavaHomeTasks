package Test;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Task3 {

	@Test
	public void verifyBody() {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

		RequestSpecification httpReq = RestAssured.given();

		Response response = httpReq.get("/users");

		JsonPath json = response.jsonPath();

		/*
		 * Users[] users = json.getObject("", Users[].class);
		 * 
		 * for(Users user:users) {
		 * 
		 * System.out.println(user.getName()); }
		 * 
		 * Assert.assertEquals(users.length,10);
		 */
		
		List<Users> users = json.getList("", Users.class);
		
		for(Users user:users) {
			
			System.out.println(user.getName());
		}
		
		Assert.assertEquals(users.size(), 10);
		

	}
}
