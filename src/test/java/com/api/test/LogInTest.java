package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.helpers.AuthContext;
import com.api.models.request.LogInRequest;
import com.api.models.response.LogInResponse;

import io.restassured.response.Response;

public class LogInTest {
	
	@Test(description ="verify if Login API is working")
	public void LogInTest() {
		LogInRequest loginrequest  = new LogInRequest("snigdha.variganti@gmail.com","Variganti@13");
		
		AuthService authservice = new AuthService();
		
	  	authservice.login(loginrequest);
		
	
    Assert.assertTrue(AuthContext.getToken()!=null);
      
System.out.println(AuthContext.getToken());
	
	}
	
	

}
