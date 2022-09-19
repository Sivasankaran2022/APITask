package org.objectmapper;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Task2_MapperSingleUser {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File file = new File(System.getProperty("user.dir")+"\\src\\main\\resources\\Task2MapperListUser.json");
		ObjectMapper mapper = new ObjectMapper();
		Task2Root readValue = mapper.readValue(file, Task2Root.class);
		DataP data = readValue.getData();
		int id = data.getId();
		System.out.println(id);
		String name = data.getName();
		System.out.println(name);
		int year = data.getYear();
		System.out.println(year);
		String color = data.getColor();
		System.out.println(color);
		String pantone_value = data.getPantone_value();
		System.out.println(pantone_value);
		
		SupportP s = readValue.getSupport();
		String url = s.getUrl();
		System.out.println(url);
		String text = s.getText();
		System.out.println(text);
		
	}

}
