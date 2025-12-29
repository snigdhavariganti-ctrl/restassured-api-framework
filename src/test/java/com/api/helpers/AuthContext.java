package com.api.helpers;

public class AuthContext {
	
	private static final ThreadLocal<String> Token = new ThreadLocal<>();
	
	private AuthContext() {
		
	}
	
	public static void setToken(String token) {
		
		Token.set(token);
	}

	public static String getToken() {

		return Token.get();
	
}
	
	public static boolean isAuthenticated() {
		
		return	Token.get()!=null && !Token.get().isEmpty();
		}
		
	
	public void clearToken() {
	
		Token.remove();
}
	
	
}
