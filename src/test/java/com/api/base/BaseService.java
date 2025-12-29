package com.api.base;

import static io.restassured.RestAssured.*;

import com.api.helpers.AuthContext;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
	
	private static final  String Base_URI ="http://64.227.160.186:8080";
	
	
	
	protected RequestSpecification request() {
		
		RequestSpecification spec = given()
				                 .baseUri(Base_URI)
				                 .contentType(ContentType.JSON);
		
		
		if(AuthContext.isAuthenticated()) {
			spec.header("Authorization","Bearer "+AuthContext.getToken());
		}
		
		return spec;
				                 
	}
	
	
	protected Response PostRequest(Object payload, String endpoint) {
		return request()
		.log().uri().
		log().body()
      .body(payload).post(endpoint);
		
	}
	
	protected Response getRequest(String endpoint) {
		
		return request()
				.log().uri()
				.log().body()
				.log().headers()
			    .get(endpoint);
		
	}
	
	protected Response putRequest(Object payload, String endpoint) {
		return request()
				.log().uri().
				log().body()
				.body(payload).put(endpoint);
	}
	
	
	
	

}
