package Scenarios;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Test;

import Components.COMP_003_Post_CreateUser;
import util.JsonFunctions;

public class SCN_003_Post_CreateUser {
	
	private JsonFunctions jsonFunction = new JsonFunctions();
	private COMP_003_Post_CreateUser COMP_003_Post_CreateUser = new COMP_003_Post_CreateUser();

	@Test
	public void CreateUser() throws IOException, ParseException {
		
		// Read Json
		JSONObject JSONOBJ = jsonFunction.readFromJsonFile("SCN_001_Get_ListUsers.json");
		
		// Post Create User
		COMP_003_Post_CreateUser.Post_CreateUser((String) JSONOBJ.get("URL"),
										  		 (String) JSONOBJ.get("NAME"),
										  		 (String) JSONOBJ.get("JOB"));

	}

}
