package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class SignUpTest {
	@Test
	public void signup() {
		
		AuthService authservice = new AuthService();
		
		SignUpRequest signuprequest = new SignUpRequest.Builder()
				.email("snigdha.variganti@yahoo.com")
				.firstName("snigdha")
				.lastName("goud")
				.password("abv@1234")
				.mobileNumber("9059950613")
				.username("Svariganti")
				.build();
		
		 Response response =authservice.signup(signuprequest);
		
		System.out.println(response.asPrettyString());
	}
	
	
}
