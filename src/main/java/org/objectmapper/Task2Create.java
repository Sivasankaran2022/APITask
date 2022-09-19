package org.objectmapper;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Task2Create {
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		File file = new File(System.getProperty("user.dir")+"\\src\\main\\resources\\Hello.json");
		ObjectMapper mapper = new ObjectMapper();
		Task2CreateAddress createAddress = new Task2CreateAddress("Kamarajar Street", "Kancheepuram", "Tamil Nadu");
		Task2CreateEmployeeP createEmployeeP = new Task2CreateEmployeeP("Sivasankaran", "sivasankaran1514@gmail.com", 8428753783l);
		mapper.writeValue(file, createEmployeeP);
	}

}
