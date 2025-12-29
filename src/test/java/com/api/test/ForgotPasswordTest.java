package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.response.ForgotPasswordResponse;

import io.restassured.response.Response;

public class ForgotPasswordTest {
	
	@Test(description ="verify if forgot-password API is working")
	public void forgotPassword() {
		
		AuthService authservice = new AuthService();

	Response response =	authservice.forgotpassword("snigdha.variganti@gmail.com");
		
	System.out.println(response.asPrettyString());
	
	ForgotPasswordResponse forgotpasswordresponse=    response.as(ForgotPasswordResponse.class);
	
	Assert.assertEquals(forgotpasswordresponse.getFpmessage(), "reset link sent to mail box");
	}

}
