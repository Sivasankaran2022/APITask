package org.jsontask;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Task2Array {
public static void main(String[] args) throws IOException, ParseException {
	FileReader fileReader = new FileReader(System.getProperty("user.dir")+"\\src\\main\\resources\\Task2Array.json");
	JSONParser jsonParser = new JSONParser();
	Object object = jsonParser.parse(fileReader);
	JSONObject jsonObject = (JSONObject) object;
	Object name = jsonObject.get("name");
	System.out.println(name);
	Object email = jsonObject.get("email");
	System.out.println(email);
	Object phoneNo = jsonObject.get("phoneNo");
	System.out.println(phoneNo);
	
	Object courses = jsonObject.get("courses");
	System.out.println(courses);
	JSONArray jsonArray = (JSONArray) courses;
	for (Object object2 : jsonArray) {
		System.out.println(object2);
		
	}
}
}
