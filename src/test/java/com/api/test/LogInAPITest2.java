package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class LogInAPITest2 {
	
	@Test(description ="verify if Login API is working")
	public void Logintest() {
		
		baseURI = "http://64.227.160.186:8080";	
		
	Response response=	given()	
			.baseUri(baseURI)
	.header("Content-Type","application/json")
	.body("{\"username\": \"snigdha.variganti@gmail.com\",\"password\": \"Variganti@13\"} ")
	.post("/api/auth/login");
	
	System.out.println(response.asPrettyString());
	
Assert.assertEquals(response.statusCode(), 200);	
	
	
	}
	
	

}
