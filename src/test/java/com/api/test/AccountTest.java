package com.api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.api.base.AccountService;
import com.api.base.AuthService;
import com.api.helpers.AuthContext;
import com.api.models.request.LogInRequest;

import io.restassured.response.Response;

public class AccountTest {
	
	 @BeforeMethod
	    public void setup() {
		 AuthService authservice = new AuthService();
			
			authservice.login(new LogInRequest("snigdha.variganti@gmail.com","Variganti@13"));
			
			System.out.println(AuthContext.getToken());
	    }
	 @Test
	 public void createUserAccount() {
						
			AccountService accountservice = new AccountService();			
		    Response response =accountservice.createAccount("Hyderabad");			
			Assert.assertEquals(response.getStatusCode(), 200);			
		}
	@Test
	public void getAccountTest() {

		AccountService accountservice = new AccountService();
		Response response= accountservice.getAccount("7117198764");
		System.out.println(response.asPrettyString());
	}
	@Test
   public void getUserAccountTest() {
		
		AccountService accountservice = new AccountService();
		Response response=accountservice.getUserAccounts();
		System.out.println(response.asPrettyString());

}
}
