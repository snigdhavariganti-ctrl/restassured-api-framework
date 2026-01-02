package com.api.base;

import java.util.HashMap;
import java.util.Map;

import io.restassured.response.Response;

public class AccountService extends BaseService {
	
	private static final String Base_path ="/api/accounts";
	
	
	public Response createAccount(String branchName) {
		
		
		Map<String,String> payload = new HashMap<String,String>();
		payload.put("accountType", "SAVINGS");
		payload.put("branch",branchName);
		
	return	PostRequest(payload,Base_path);
		
	}
	
	public Response getAccount(String accountNumber) {
		Map<String,Object> pathParams = new HashMap<>();
		
		pathParams.put("accountNumber", accountNumber);

		 return getWithPathParams(Base_path+"/{accountNumber}",pathParams);
 
		
		
	}
	
	public Response getUserAccounts() {
		
	return	getRequest(Base_path+"/user");
	}

}
