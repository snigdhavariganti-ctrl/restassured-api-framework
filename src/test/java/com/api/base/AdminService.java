package com.api.base;

import java.util.HashMap;
import java.util.Map;

import io.restassured.response.Response;

public class AdminService extends BaseService {
	
	private static final String Base_path ="/api/admin/accounts";
	private static final String AccountFreeze ="/freeze";
	private static final String AccountUnFreeze ="/unfreeze";
	private static final String Base_uri ="/api/admin/";



	public Response getAdminAccounts(int page, int size) {
		
		Map<String,Object> queryparams = new HashMap<>();
		
		queryparams.put("page", page);
		queryparams.put("size", size);
		
	return	getWithQueryParams(Base_path,queryparams);
	}
	
	
	
	public Response freezeAccount(String accountNumber,String reason) {
		
		Map<String,String> pathparams = new HashMap<>();
		pathparams.put("accountNumber",accountNumber);
		Map<String,String> queryparams = new HashMap<>();
		queryparams.put("reason", reason);
		
		 return putRequestWithParams(Base_path+"/{accountNumber}" +AccountFreeze,pathparams,queryparams);


		
	}
	
public Response UnFreezeAccount(String accountNumber,String reason) {
		
		Map<String,String> pathparams = new HashMap<>();
		pathparams.put("accountNumber",accountNumber);
		Map<String,String> queryparams = new HashMap<>();
		queryparams.put("reason", reason);
		
		 return putRequestWithParams(Base_path+"/{accountNumber}" +AccountUnFreeze,pathparams,queryparams);


		
	}


public Response getTranscations(int page, int size) {
	
	Map<String, Object> queryparams = new HashMap<>();
            
	queryparams.put("page", page);
	queryparams.put("size", size);
	
	 return getWithQueryParams(Base_uri+"transactions",queryparams);
	
}


public Response getAdminUser(int userId) {
	
	Map<String, Object> pathparams = new HashMap<>();
	pathparams.put("userId",userId);
	return getWithPathParams(Base_uri+"users"+"/{userId}",pathparams);
	
	

}


public Response ActivateUser(int userId) {
	
	Map<String, Object> pathparams = new HashMap<>();
	pathparams.put("userId",userId);
    return getWithPathParams(Base_uri+"users"+"/{userId}"+"/activate",pathparams);


}

public Response deActivateUser(int userId) {
	
	Map<String, Object> pathparams = new HashMap<>();
	pathparams.put("userId",userId);
    return getWithPathParams(Base_uri+"users"+"/{userId}"+"/deactivate",pathparams);


}


}
