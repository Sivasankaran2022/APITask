package org.sample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Task1ParseObject {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader fileReader = new FileReader(System.getProperty("user.dir")+"\\Task1Json.json");
		JSONParser jsonParser = new JSONParser();
		Object parse = jsonParser.parse(fileReader);
		JSONObject jsonObject = (JSONObject) parse;
		Object object = jsonObject.get("email");
		String email = (String) object;
		System.out.println(email);
		Object name = jsonObject.get("name");
		System.out.println(name);
		Object phoneNo = jsonObject.get("phoneNo");
		System.out.println(phoneNo);
		
		Object address = jsonObject.get("address");
		System.out.println(address);
		
		JSONObject jsonObject2 = (JSONObject) address;
		Object streetName = jsonObject2.get("streetName");
		System.out.println(streetName);
	}

}
