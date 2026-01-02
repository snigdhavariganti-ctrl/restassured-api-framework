package com.api.base;

import static io.restassured.RestAssured.*;

import java.util.Map;

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
	
protected Response getWithPathParams(String endpoint,Map<String,Object> pathParams) {
		
		return request()
				.log().uri()
				.log().body()
				.log().headers()
				.pathParams(pathParams)
			    .get(endpoint);
		
	}
	protected Response putRequest(Object payload, String endpoint) {
		return request()
				.log().uri().
				log().body()
				.body(payload).put(endpoint);
	}
	
	
protected Response getWithQueryParams(String endpoint,Map<String, Object> queryparams) {
		
		return request()
				.log().uri()
				.log().body()
				.log().headers()
				.queryParams(queryparams)
			    .get(endpoint);
		
	}

protected Response putRequestWithParams(String endpoint,Map<String,String>pathparams,Map<String,String>queryparams) {
	
	return request()
			.pathParams(pathparams)
			.queryParams(queryparams)
			.log().uri()

			.put(endpoint);
			
}

protected Response PostRequestWithParams(String endpoint,Object payload, Map<String,Object>queryparams) {
	return request()
			.queryParams(queryparams)
			.body(payload)
			.log().uri()
			.log().body()
			.post(endpoint);


}
	

}
