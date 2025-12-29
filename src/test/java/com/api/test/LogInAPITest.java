package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LogInAPITest {
	@Test
	public void Logintest() {
		
		RestAssured.baseURI = "http://64.227.160.186:8080";		
	RequestSpecification x =	RestAssured.given();
	
	RequestSpecification y = x.header("content-tyep","json");
	
	RequestSpecification z=  y.body("{\"username\": \"snigdha.variganti@gmail.com\",\"password\": \"Variganti@13\"} ");
	
	
	Response r =z.post("/api/auth/login");
	
	System.out.println(r.asPrettyString());
	
Assert.assertEquals(r.statusCode(), 200);	
	
	
	}
	
	

}
