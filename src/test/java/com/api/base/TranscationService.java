package com.api.base;

import java.util.HashMap;
import java.util.Map;

import com.api.models.request.TransactionTransferRequest;
import com.api.models.request.TranscationsRequest;

import io.restassured.response.Response;

public class TranscationService extends BaseService {
	
	private static final String Base_Uri= "/api/transactions/";

	
	public Response transferAmount(TransactionTransferRequest transferpayload) {
		
		return PostRequest(transferpayload,Base_Uri+"transfer");
		
	}
	
	public Response transferInitiate(TransactionTransferRequest transferpayload) {
		return PostRequest(transferpayload,Base_Uri+"initiate");

	
}
	
	
	public Response amountDeposit(TranscationsRequest transactionrequest) {
		return PostRequest(transactionrequest,Base_Uri+"deposit");

		
	}
	
	
	public Response withdraw(TranscationsRequest transactionrequest) {
		return PostRequest(transactionrequest,Base_Uri+"withdraw");

		
	}
	
	public Response transferComplete(String otp,String transactionId) {
		Map<String,String> payload = new HashMap<String,String>();
		payload.put("otp", otp);
		payload.put("transactionId",transactionId);
		return PostRequest(payload,Base_Uri+"transfer/complete");

	
	}
	
	public Response transactionHistory(String accountNumber,int page,int size) {
		
		Map<String,Object> params = new HashMap<>();
		
		params.put("accountNumber",accountNumber);
		params.put("page", page);
		params.put("size", size);
		
		return getWithQueryParams(Base_Uri+"history",params);
		
	
	}
}