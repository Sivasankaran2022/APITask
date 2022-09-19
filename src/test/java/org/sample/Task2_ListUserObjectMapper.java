package org.sample;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.pojo.Datum;
import org.pojo.Task2ListUserObjectMapperInput;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Task2_ListUserObjectMapper {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File file = new File(System.getProperty("user.dir") + "\\Task2_ListUserObjectMapper.json");
		ObjectMapper mapper = new ObjectMapper();
		Task2ListUserObjectMapperInput task2ListUserObjectMapperInput = mapper.readValue(file,
				Task2ListUserObjectMapperInput.class);
		int page = task2ListUserObjectMapperInput.getPage();
		System.out.println(page);
		
		int per_page = task2ListUserObjectMapperInput.getPer_page();
		System.out.println(per_page);
		
		int total = task2ListUserObjectMapperInput.getTotal();
		System.out.println(total);
		
		int total_pages = task2ListUserObjectMapperInput.getTotal_pages();
		System.out.println(total_pages);
		
		ArrayList<Datum> data = task2ListUserObjectMapperInput.getData();
		System.out.println(data);
		
	}
}
