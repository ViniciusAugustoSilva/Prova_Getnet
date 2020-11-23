package Components;

import org.junit.Test;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class COMP_003_Post_CreateUser {
	
	@Test
	public void Post_CreateUser(String url, String name, String job) {
		RestAssured.baseURI = url;
		String body = "{\r\n"
				+ "    \"name\": \""+name+"\",\r\n"
				+ "    \"job\": \""+job+"\"\r\n"
				+ "}";
		Response response = RestAssured.given().body(body).post();
		
		System.out.println(response.prettyPrint());
		System.out.println("getStatusCode: "+response.getStatusCode());
		
		//Validate Status Code
		Assert.assertEquals(response.getStatusCode(), 201);

	}

}
