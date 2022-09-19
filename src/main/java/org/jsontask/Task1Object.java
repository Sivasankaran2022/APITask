package org.jsontask;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Task1Object {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader fileReader = new FileReader(System.getProperty("user.dir")+"\\src\\main\\resources\\Task1Object.json");
		JSONParser jsonParser = new JSONParser();
		Object parse = jsonParser.parse(fileReader);
		JSONObject jsonObject = (JSONObject) parse;
		Object objectName = jsonObject.get("name");
		//String name = (String) objectName;
		System.out.println(objectName);
		Object email = jsonObject.get("email");
		System.out.println(email);
		Object phoneNo = jsonObject.get("phoneNo");
		System.out.println(phoneNo);
		Object prize = jsonObject.get("prize");
		System.out.println(prize);
		Object paymentReceive = jsonObject.get("paymentReceive");
		System.out.println(paymentReceive);
		
		Object objectAddress = jsonObject.get("address");
		JSONObject jsonObject2 = (JSONObject) objectAddress;
		Object streetName = jsonObject2.get("streetName");
		System.out.println(streetName);
		Object district = jsonObject2.get("district");
		System.out.println(district);
		Object state = jsonObject2.get("state");
		System.out.println(state);
	}

}
