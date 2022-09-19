package org.sample;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Task1ListUserArray {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader fileReader = new FileReader(System.getProperty("user.dir") + "\\Task1ListUserArray.json");
		JSONParser jsonParser = new JSONParser();
		Object parse = jsonParser.parse(fileReader);

		JSONObject jsonObject = (JSONObject) parse;
		Object page = jsonObject.get("page");
		System.out.println(page);

		Object per_page = jsonObject.get("per_page");
		System.out.println(per_page);

		Object total = jsonObject.get("total");
		System.out.println(total);

		Object total_pages = jsonObject.get("total_pages");
		System.out.println(total_pages);

		Object data = jsonObject.get("data");

		JSONArray a = (JSONArray) data;

		for (int i = 0; i < a.size(); i++) {
			Object d = a.get(i);

			JSONObject jsonObject2 = (JSONObject) d;
			Object id = jsonObject2.get("id");
			System.out.println(id);

			Object email = jsonObject2.get("email");
			System.out.println(email);

			Object first_name = jsonObject2.get("first_name");
			System.out.println(first_name);

			Object last_name = jsonObject2.get("last_name");
			System.out.println(last_name);

			Object avatar = jsonObject2.get("avatar");
			System.out.println(avatar+"\n");

		}

		Object support = jsonObject.get("support");
		
		JSONObject jsonObject3 = (JSONObject) support;
		Object url = jsonObject3.get("url");
		System.out.println(url);
		
		Object text = jsonObject3.get("text");
		System.out.println(text);
		
	}
}
