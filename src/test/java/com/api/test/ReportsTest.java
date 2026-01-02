package com.api.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.ReportService;
import com.api.helpers.AuthContext;
import com.api.models.request.LogInRequest;

import io.restassured.response.Response;

public class ReportsTest {
	@BeforeMethod
	public void setup() {
		
		AuthService authservice = new AuthService();
		 authservice.login(new LogInRequest("snigdha.variganti@gmail.com","Variganti@13"));
		System.out.println(AuthContext.getToken());
	}
	ReportService reportservice = new ReportService();

	
	@Test
	public void getExcelReport() {
		Response res =reportservice.ExcelReport("7117363535", "2026-01-01", "2026-01-01");
		System.out.println(res.asPrettyString());
	}

	@Test
	public void getPdfReport() {
		Response res =reportservice.PdfReport("7117363535", "2026-01-01", "2026-01-01");
		System.out.println(res.asPrettyString());
	}

}
