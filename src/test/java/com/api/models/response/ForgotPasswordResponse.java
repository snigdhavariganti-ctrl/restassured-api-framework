package com.api.models.response;

public class ForgotPasswordResponse {
	
	private String fpmessage;
	public ForgotPasswordResponse() {
	}
	
	public ForgotPasswordResponse(String fpmessage) {
		super();
		this.fpmessage = fpmessage;
	}

	public String getFpmessage() {
		return fpmessage;
	}

	public void setFpmessage(String fpmessage) {
		this.fpmessage = fpmessage;
	}

	@Override
	public String toString() {
		return "ForgotPasswordResponse [fpmessage=" + fpmessage + ", getFpmessage()=" + getFpmessage() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
