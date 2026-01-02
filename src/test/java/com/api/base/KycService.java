package com.api.base;

import java.util.HashMap;
import java.util.Map;

import com.api.models.request.KycUpdateRequest;

import io.restassured.response.Response;

public class KycService extends BaseService{
	
	
	private static final String Base_path = "/api/kyc/";
	
	public Response getkycStatus() {
		
	return	getRequest(Base_path+"status");
	}
	
	
	public Response uploadDocument(String documentType,String documentNumber,KycUpdateRequest fileContent) {
		
		Map<String,Object> queryparams =  new HashMap<>();
		queryparams.put("documentType", documentType);
		queryparams.put("documentNumber", documentNumber);
		
 		
		
		//Map<String,Object> body = new HashMap<>();
		//body.put("file",fileContent);
		
		
		return PostRequestWithParams(Base_path+"upload",fileContent,queryparams);
		
		
	}


}
