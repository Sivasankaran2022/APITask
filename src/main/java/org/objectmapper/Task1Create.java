package org.objectmapper;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Task1Create {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		File file = new File(System.getProperty("user.dir")+"\\src\\main\\resources\\Hello.json");
		ObjectMapper mapper = new ObjectMapper();
		Task1CreateRootP createRootP = new Task1CreateRootP("Sivasankaran", "Composition Specialist");
		mapper.writeValue(file, createRootP);
	}

}
