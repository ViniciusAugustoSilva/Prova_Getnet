package Scenarios;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import org.junit.Test;

import Components.COMP_001_Get_ListUsers;
import util.JsonFunctions;

public class SCN_001_Get_ListUsers {
	
	private JsonFunctions jsonFunction = new JsonFunctions();
	private COMP_001_Get_ListUsers COMP_001_Get_ListUsers = new COMP_001_Get_ListUsers();

	@Test
	public void Get_ListUsers() throws IOException, ParseException {
		
		// Read Json
		JSONObject JSONOBJ = jsonFunction.readFromJsonFile("SCN_001_Get_ListUsers.json");
		
		// Get List Users
		COMP_001_Get_ListUsers.Get_ListUsers((String) JSONOBJ.get("URL"),
										  (String) JSONOBJ.get("PAGE"));

	}

}
