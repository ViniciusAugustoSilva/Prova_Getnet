package util;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GenericMethods {

	public String getValueSingleUser(Response response, String parameter, String user_id) {
		
		String responseBody = response.getBody().asString();
		
		String value = null;
		
		responseBody = responseBody.substring(responseBody.indexOf(":")+1, responseBody.indexOf("}")+1);
		responseBody = responseBody.replace("{", "[{");
		responseBody = responseBody.replace("}", "}]");
		
		String idValue = "\"id\":"+user_id+",";
		responseBody = responseBody.replace(idValue, "\"id\":\""+user_id+"\",");
		
		JSONArray array = new JSONArray(responseBody);
		for(int i=0; i<array.length(); i++) {
			
			JSONObject obj = array.getJSONObject(i);
			value = (String) obj.get(parameter);
		}
		return value;

	}

}
