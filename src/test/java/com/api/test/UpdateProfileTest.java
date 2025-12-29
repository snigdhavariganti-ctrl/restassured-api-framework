package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserManagementService;
import com.api.helpers.AuthContext;
import com.api.models.request.LogInRequest;
import com.api.models.request.UpdateProfileRequest;
import com.api.models.response.LogInResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class UpdateProfileTest {
	@Test
	public void updateProfile() {
		
		AuthService auth = new AuthService();
		
		auth.login(new LogInRequest("snigdha.variganti@gmail.com","Variganti@13"));
		
		
		System.out.println(AuthContext.getToken());
		System.out.println("---------------------------------------------");
		
	// -------------------------------------------------------------------------//	
		
		UserManagementService usermanagementservice = new UserManagementService();
	 Response response=	usermanagementservice.getProfile();
	 UserProfileResponse userprofileresponse = response.as(UserProfileResponse.class);
		System.out.println(userprofileresponse.getFirstName());
		System.out.println("---------------------------------------------");

		
  //-----------------------------------------------------------------------------//		
		
		UpdateProfileRequest updateprofilerequest = new UpdateProfileRequest.Builder()
				.firstName("Sowmya")
				.lastName(userprofileresponse.getLastName())
				.email(userprofileresponse.getEmail())
				.mobileNumber(userprofileresponse.getMobileNumber())
				.build();
		
	 response =	usermanagementservice.UpdateProfile(updateprofilerequest);	
		UserProfileResponse userprofile = response.as(UserProfileResponse.class);
		System.out.println(userprofile.getFirstName());
		
	}

}
