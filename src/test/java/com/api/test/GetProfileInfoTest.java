package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserManagementService;
import com.api.models.request.LogInRequest;
import com.api.models.response.LogInResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class GetProfileInfoTest {
	@Test
	public void profileinfo() {
		
		UserManagementService usermanagementservice = new UserManagementService();
		AuthService authservice = new AuthService();
		
		authservice.login(new LogInRequest("snigdha.variganti@gmail.com","Variganti@13"));   

	    Response response =	usermanagementservice.getProfile();
	  
	  UserProfileResponse userprofileresponse =   response.as(UserProfileResponse.class);
	  
	  System.out.println(userprofileresponse.getEmail());
	  System.out.println(userprofileresponse.getId());
		
		
	}

}
