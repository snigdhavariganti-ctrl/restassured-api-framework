package com.api.base;

import java.util.HashMap;
import java.util.Map;

import io.restassured.response.Response;

public class ReportService extends BaseService {
	
	private static final String Base_Url = "/api/reports/statement/";
	
	public Response ExcelReport(String AccountNumber, String fromDate, String toDate) {
		
		Map<String,Object> params = new HashMap<>();
		params.put("AccountNumber", AccountNumber);
		params.put("fromDate", fromDate);
		params.put("toDate", toDate);
	return	getWithQueryParams(Base_Url+"excel", params);
		
	}
	
public Response PdfReport(String AccountNumber, String fromDate, String toDate) {
		
		Map<String,Object> params = new HashMap<>();
		params.put("AccountNumber", AccountNumber);
		params.put("fromDate", fromDate);
		params.put("toDate", toDate);
	return	getWithQueryParams(Base_Url+"pdf", params);
		
	}
	
}