package org.jsontask;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Task_SingleUser {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader fileReader = new FileReader(System.getProperty("user.dir")+"\\src\\main\\resources\\Task1_SingleUser.json");
		JSONParser jsonParser = new JSONParser();
		Object object = jsonParser.parse(fileReader);
		JSONObject jsonObject = (JSONObject) object;
		Object data = jsonObject.get("data");
		System.out.println(data);
		JSONObject jsonObject2 =(JSONObject) data;
		Object id = jsonObject2.get("id");
		System.out.println(id);
		Object email = jsonObject2.get("email");
		System.out.println(email);
		Object first_name = jsonObject2.get("first_name");
		System.out.println(first_name);
		Object last_name = jsonObject2.get("last_name");
		System.out.println(last_name);
		Object avatar = jsonObject2.get("avatar");
		System.out.println(avatar);
		JSONObject jsonObject3 = (JSONObject) object;
		Object support = jsonObject3.get("support");
		System.out.println(support);
		JSONObject jsonObject4 = (JSONObject) support;
		Object url = jsonObject4.get("url");
		System.out.println(url);
		Object text = jsonObject4.get("text");
		System.out.println(text);
		
		
	}

}
