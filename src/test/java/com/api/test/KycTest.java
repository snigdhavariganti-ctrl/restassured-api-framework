package com.api.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.KycService;
import com.api.helpers.AuthContext;
import com.api.models.request.KycUpdateRequest;
import com.api.models.request.LogInRequest;

import io.restassured.response.Response;

public class KycTest {
	
	private String filecontent ="23df5rxc3cvbn";
	
	@BeforeMethod
	public void setup() {
		
		AuthService authservice = new AuthService();
		authservice.login(new LogInRequest("snigdha.variganti@gmail.com","Variganti@13"));
		System.out.println(AuthContext.getToken());
	}
	
	
	KycService kycservice = new KycService();
	@Test
	public void getKycSstatus() {
		
	Response res=	kycservice.getkycStatus();
	
	System.out.println(res.asPrettyString());
		
	}
	@Test
	public void KycUpload() {
		KycUpdateRequest kycupdaterequest = new KycUpdateRequest(filecontent);
	
	Response res=	kycservice.uploadDocument("Aadhar","1234567890",kycupdaterequest);
	
	System.out.println(res.asPrettyString());

}
	
}
