package org.objectmapper;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Task1 {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File file = new File("C:\\Users\\Sivasankaran\\eclipse-workspace\\APITask\\src\\main\\resources\\Task1Mapper.json");
		ObjectMapper mapper = new ObjectMapper();
		EmployeeP e = mapper.readValue(file, EmployeeP.class);
		String name = e.getName();
		System.out.println(name);
		String email = e.getEmail();
		System.out.println(email);
		long phoneNo = e.getPhoneNo();
		System.out.println(phoneNo);
		
		AddressP a = e.getAddress();
		String streetName = a.getStreetName();
		System.out.println(streetName);
		String district = a.getDistrict();
		System.out.println(district);
		String state = a.getState();
		System.out.println(state);
		
	}

}
