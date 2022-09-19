package org.sample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Task1ListUserObject {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader fileReader = new FileReader(System.getProperty("user.dir")+"\\Task1ListUser.json");
		JSONParser jsonParser = new JSONParser();
		Object parse = jsonParser.parse(fileReader);
		JSONObject jsonObject = (JSONObject) parse;
		
		Object object = jsonObject.get("data");
		System.out.println(object+"\n");
		
		JSONObject jsonObject2 = (JSONObject) object;
		Object id = jsonObject2.get("id");
		System.out.println(id);
		
		Object email = jsonObject2.get("email");
		System.out.println(email);
		
		Object last_name = jsonObject2.get("last_name");
		System.out.println(last_name);
		
		Object avatar = jsonObject2.get("avatar");
		System.out.println(avatar+"\n");
		
				
		Object support = jsonObject.get("support");
		JSONObject jsonObject3 = (JSONObject) support;
		
		Object url = jsonObject3.get("url");
		System.out.println(url);
		
		Object text = jsonObject3.get("text");
		System.out.println(text);
	}

}
