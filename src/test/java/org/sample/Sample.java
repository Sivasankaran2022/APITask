package org.sample;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sample {

	public static void main(String[] args) {
		RequestSpecification reqSpec;
		// 1. Initialize the RestAssured Class
		reqSpec = RestAssured.given();
		// 2. Header, Authentication, path/query parameter, Body
		reqSpec = reqSpec.header("Content-Type", "application/json");
		// 3. Path Param
		reqSpec = reqSpec.pathParam("page", "2");
		// 4. req method type and endpoint
		Response response = reqSpec.get("https://reqres.in/api/users/{page}");
		// 5. Get the status cod/Res Code
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		// 6. Get the Res Body

		String asString = response.asString();
		System.out.println(asString);

		String asPrettyString = response.asPrettyString();
		System.out.println(asPrettyString);
	}
}
