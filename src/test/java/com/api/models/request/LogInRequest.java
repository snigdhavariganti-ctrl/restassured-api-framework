package com.api.models.request;

public class LogInRequest {
	
	private String username;
	 private String password;
	@Override
	public String toString() {
		return "LogInRequest [username=" + username + ", password=" + password + ", getUsername()=" + getUsername()
				+ ", getPassword()=" + getPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LogInRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

}
