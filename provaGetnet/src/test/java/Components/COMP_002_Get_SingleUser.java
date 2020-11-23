package Components;

import org.json.simple.parser.ParseException;
import org.junit.Test;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import util.GenericMethods;

public class COMP_002_Get_SingleUser {
	
	private GenericMethods genericMethods = new GenericMethods();

	@Test
	public void Get_SingleUser(String url, String user_id) throws ParseException {
//		String url_aux = url+"/"+user_id;
//		RestAssured.baseURI = url_aux;
//		
//		Response response = RestAssured.given().when().get();
		
		RestAssured.baseURI = url;

		Response response = RestAssured.given()
				.params("id", user_id).when().get();
		
		//Get ID, First Name, Last Name and Email values
		String idValue = genericMethods.getValueSingleUser(response, "id", user_id);
		String first_nameValue = genericMethods.getValueSingleUser(response, "first_name", user_id);
		String last_nameValue = genericMethods.getValueSingleUser(response, "last_name", user_id);
		String emailValue = genericMethods.getValueSingleUser(response, "email", user_id);
		
		//Print values
		System.out.println("\nid: " + idValue);
		System.out.println("first_name: " + first_nameValue);
		System.out.println("last_name: " + last_nameValue);
		System.out.println("email: " + emailValue);
		System.out.println("getStatusCode: "+response.getStatusCode());
		
		//Validate Status Code
		Assert.assertEquals(response.getStatusCode(), 200);
		
		//Validate ID
		Assert.assertEquals(idValue, user_id);
		

	}

}
