package org.baseclass;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	
	RequestSpecification reqSpec;
	Response response;
	
	public void addHeader(String key, String value) {
		reqSpec = RestAssured.given().header(key, value);
	}
	
	public void addQueryParam(String key, String value) {
		reqSpec = reqSpec.queryParam(key, value);
			
	}
	
	public void addPathParam(String key, String value) {
		reqSpec = reqSpec.pathParam(key, value);
	}
	
	public void addBody(String body) {
		reqSpec = reqSpec.body(body);
	}
	
	public Response requestType(String reqType, String endPoint) {
		switch (reqType) {
		case "GET":
			response  = reqSpec.get(endPoint);
			break;

		case "POST":
			response  = reqSpec.get(endPoint);
			break;

		case "PUT":
			response  = reqSpec.get(endPoint);
			break;

		case "DELETE":
			response  = reqSpec.get(endPoint);
			break;

		default:
			break;
		}
		return response;

	}
	
	public int getStatusCode(Response response) {
		int statusCode = response.getStatusCode();
		return statusCode;
	}
	
	public String getResponseBodyAsString(Response response) {
		String asString = response.asString();
		return asString;
	
	}
	
	public String getResponseBodyAsPrettyString(Response response) {
		String asPrettyString = response.asPrettyString();
		return asPrettyString;
			
	}
	
	

}
