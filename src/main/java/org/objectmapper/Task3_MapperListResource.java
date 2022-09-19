package org.objectmapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Task3_MapperListResource {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File file = new File(System.getProperty("user.dir") + "\\src\\main\\resources\\Task3ListResources.json");
		ObjectMapper mapper = new ObjectMapper();
		Task3Root readValue = mapper.readValue(file, Task3Root.class);
		int page = readValue.getPage();
		System.out.println(page);
		int per_page = readValue.getPer_page();
		System.out.println(per_page);
		int total = readValue.getTotal();
		System.out.println(total);
		int total_pages = readValue.getTotal_pages();
		System.out.println(total_pages);
		ArrayList<Task3DataP> data = readValue.getData();
		for (Task3DataP task3DataP : data) {
			System.out.println(task3DataP.getId());
			System.out.println(task3DataP.getName());
			System.out.println(task3DataP.getYear());
			System.out.println(task3DataP.getColor());
			System.out.println(task3DataP.getPantone_value()+"\n");

		}
	}

}
