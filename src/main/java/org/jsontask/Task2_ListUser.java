package org.jsontask;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Task2_ListUser {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader fileReader = new FileReader(System.getProperty("user.dir")+"\\src\\main\\resources\\Task2List_Users.json");
	JSONParser jsonParser = new JSONParser();
	Object object = jsonParser.parse(fileReader);
	JSONObject jsonObject = (JSONObject) object;
	Object page = jsonObject.get("page");
	System.out.println(page);
	Object per_page = jsonObject.get("per_page");
	System.out.println(per_page);
	Object total = jsonObject.get("total");
	System.out.println(total);
	Object total_pages = jsonObject.get("total_pages");
	System.out.println(total_pages);
	
	Object object2 = jsonObject.get("data");
	System.out.println(object2);
	
	JSONArray a = (JSONArray) object2;
	
	
	for (int i = 0; i < a.size(); i++) {
		Object object3 = a.get(i);
		JSONObject jsonObject2 = (JSONObject) object3;
		Object id = jsonObject2.get("id");
		Object email = jsonObject2.get("email");
		Object first_name = jsonObject2.get("first_name");
		Object last_name = jsonObject2.get("last_name");
		Object avatar = jsonObject2.get("avatar");
		System.out.println(id);
		System.out.println(email);
		System.out.println(first_name);
		System.out.println(last_name);
		System.out.println(avatar+"\n");
		
	}
	
	Object object4 = jsonObject.get("support");
	System.out.println(object4);
	JSONObject jsonObject3 =(JSONObject) object4;
	Object url = jsonObject3.get("url");
	System.out.println(url);
	Object text = jsonObject3.get("text");
	System.out.println(text);
	}
}
