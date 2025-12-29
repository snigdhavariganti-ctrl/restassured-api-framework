package com.api.base;


import java.util.HashMap;
import java.util.Map;

import com.api.helpers.AuthContext;
import com.api.models.request.LogInRequest;
import com.api.models.request.SignUpRequest;
import com.api.models.response.LogInResponse;

import io.restassured.response.Response;

public class AuthService extends BaseService {
	   private static final String BASE_PATH = "/api/auth/";	
	   

	
	public void login(LogInRequest payload) {
		
		Response response=  PostRequest(payload,BASE_PATH+"login");
		  
		  LogInResponse loginresponse = response.as(LogInResponse.class);
		  
		  AuthContext.setToken(loginresponse.getToken());
		
	
	}
	
	public Response forgotpassword(String emailAddress) {
		
		Map<String,String> payload = new HashMap<>();
		
		payload.put("email", emailAddress);
		
		return PostRequest(payload,BASE_PATH+"forgot-password");
	}
	
	
	public Response signup(SignUpRequest signuprequest) {
		
		return PostRequest(signuprequest,BASE_PATH+"signup");
	}
	


}
