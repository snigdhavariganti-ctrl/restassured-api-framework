package com.api.base;

import com.api.models.request.UpdateProfileRequest;

import io.restassured.response.Response;

public class UserManagementService extends BaseService {
	
	private static final String Base_URL = "/api/users/";
	
	
	
	public Response getProfile() {
		
		
	return	getRequest(Base_URL+"profile");
		
		
	}
	
	public Response UpdateProfile(UpdateProfileRequest payload) {
		
		
	return putRequest(payload,Base_URL+"profile");

	}
	

	

}
