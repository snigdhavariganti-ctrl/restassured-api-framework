package com.api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.api.base.AdminService;
import com.api.base.AuthService;
import com.api.helpers.AuthContext;
import com.api.models.request.LogInRequest;

import io.restassured.response.Response;

public class AdminTest {
	AdminService adminservice = new AdminService();

	
	@BeforeMethod
	public void setup() {
		
		AuthService authservice = new AuthService();
		authservice.login(new LogInRequest("snigdha.variganti@gmail.com","Variganti@13"));
		System.out.println(AuthContext.getToken());
		
	}
	@Test
	public void getAdminAccounts() {
		
		Response response=	adminservice.getAdminAccounts(2, 10);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test
	public void FreezeAccountTest() {
	Response res=	adminservice.freezeAccount("7117198764", "suspicioustranscations");
	
	System.out.println(res.asPrettyString());
		
	}
	
	@Test
	public void UnFreezeAccountTest() {
	Response res=	adminservice.UnFreezeAccount("7117198764", "unfreezeAccount");
	
	System.out.println(res.asPrettyString());
		
	}
	
	@Test
	public void getTransactions() {
		adminservice.getTranscations(0, 10);
	}
	@Test
	public void getAdminUser() {
		adminservice.getAdminUser(3);
	}
	
	
	

}
