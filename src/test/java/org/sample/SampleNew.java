package org.sample;

import org.baseclass.BaseClass;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class SampleNew extends BaseClass{
	@Test
	public void getUsers() {
		addHeader("Content-Type", "application/json");
		Response response = requestType("GET", "https://reqres.in/api/users?page=2");
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
	}

}
