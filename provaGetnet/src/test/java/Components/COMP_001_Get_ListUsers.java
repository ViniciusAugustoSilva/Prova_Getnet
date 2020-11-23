package Components;

import org.junit.Test;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class COMP_001_Get_ListUsers {
	
	@Test
	public void Get_ListUsers(String url, String page) {
		RestAssured.baseURI = url;

		Response response = RestAssured.given()
				.params("page", page).when().get();
		
		System.out.println(response.prettyPrint());
		System.out.println("getStatusCode: "+response.getStatusCode());
		
		//Validate Status Code
		Assert.assertEquals(response.getStatusCode(), 200);

	}

}
