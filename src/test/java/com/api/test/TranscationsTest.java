package com.api.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.TranscationService;
import com.api.helpers.AuthContext;
import com.api.models.request.LogInRequest;
import com.api.models.request.TransactionTransferRequest;
import com.api.models.request.TranscationsRequest;

import io.restassured.response.Response;

public class TranscationsTest {
	
	
	 @BeforeMethod
	    public void setup() {
		 AuthService authservice = new AuthService();
			
			authservice.login(new LogInRequest("snigdha.variganti@gmail.com","Variganti@13"));
			
			System.out.println(AuthContext.getToken());
	    }
	 
		TranscationService trnsactionservice = new TranscationService();

	@Test
	public void transferTest() {
		
		TransactionTransferRequest transactiontransferrequest = 
				new TransactionTransferRequest("7117363535","7117198764",123,"transferrequest");
		
		
	Response res =	trnsactionservice.transferAmount(transactiontransferrequest);
	
	System.out.println(res.asPrettyString());
	}
	@Test
	public void transferInitiateTest() {
		
		TransactionTransferRequest transactiontransferrequest = 
				new TransactionTransferRequest("7117363535","7117198764",123,"transferrequest");
		
		
	Response res =	trnsactionservice.transferInitiate(transactiontransferrequest);
		
		System.out.println(res.asPrettyString());
		
	}
	
	@Test
	public void depositTest() {
		TranscationsRequest transactionrequest = new TranscationsRequest("7117363535",123,"deposit");
		
		Response res =trnsactionservice.amountDeposit(transactionrequest);
		
		System.out.println(res.asPrettyString());
	}
	@Test
	public void withdraw() {
		TranscationsRequest transactionrequest = new TranscationsRequest("7117363535",120,"deposit");
		
		Response res =trnsactionservice.withdraw(transactionrequest);
		
		System.out.println(res.asPrettyString());
	}
	
	@Test
	public void transferCompleteTest() {
		
		Response res= trnsactionservice.transferComplete("123456", "TXN1767254857164");
		System.out.println(res.asPrettyString());
		
	}
	
	@Test
	public void transactionsHistoryTest() {
	Response res =	trnsactionservice.transactionHistory("7117363535", 1, 3);
	
	System.out.println(res.asPrettyString());
	}
	
	
	

}
