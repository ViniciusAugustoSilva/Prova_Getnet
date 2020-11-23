package Scenarios;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Test;

import Components.COMP_002_Get_SingleUser;
import util.JsonFunctions;

public class SCN_002_Get_SingleUser {
	
	private JsonFunctions jsonFunction = new JsonFunctions();
	private COMP_002_Get_SingleUser COMP_002_Get_SingleUser = new COMP_002_Get_SingleUser();

	@Test
	public void Get_SingleUser() throws IOException, ParseException {
		
		// Read Json
		JSONObject JSONOBJ = jsonFunction.readFromJsonFile("SCN_002_Get_SingleUser.json");
		
		// Get Single User
		COMP_002_Get_SingleUser.Get_SingleUser((String) JSONOBJ.get("URL"),
										  (String) JSONOBJ.get("USER_ID"));

	}

}
