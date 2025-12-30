package com.api.test;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;
import com.api.utils.ExcelUtils;

import io.restassured.response.Response;

public class SignUpTest {
	
	@DataProvider(name ="signupData")
	public Object[][] signupData() throws FileNotFoundException{
		
				return ExcelUtils.getTestData( "src/test/resources/testdata/signup_data.xlsx",
				        "Sheet1");
		
	}
	
	@Test(dataProvider="signupData")
	public void signUp( String username,
	        String email,
	        String password,
	        String firstName,
	        String lastName,
	        long expectedStatus)
	{
		
		
		SignUpRequest signuprequest = new SignUpRequest
				.Builder()
				.username(username)
				.email(email)
				.firstName(firstName)
				.lastName(lastName)
				.password(password)
				.mobileNumber("0909090909")
				.build();	
		
		
		AuthService authservice = new AuthService();
		
	Response response=	authservice.signup(signuprequest);
	     
          Assert.assertEquals(response.getStatusCode(), expectedStatus);	
		
	}
	
	
	
	

//	@Test
//	public void signup() {
//		
//		AuthService authservice = new AuthService();
//		
//		SignUpRequest signuprequest = new SignUpRequest.Builder()
//				.email("snigdha.variganti@yahoo.com")
//				.firstName("snigdha")
//				.lastName("goud")
//				.password("abv@1234")
//				.mobileNumber("9059950613")
//				.username("Svariganti")
//				.build();
//		
//		 Response response =authservice.signup(signuprequest);
//		
//		System.out.println(response.asPrettyString());
//	}
//	
	
	
	
}
