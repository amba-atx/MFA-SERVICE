package com.amba.service.mfa.JSONObjects;

public class AuthenticationResultJson {
	
	private String authStatusCode;
    private Integer risk;
    
	public String getAuthStatusCode() {
		return authStatusCode;
	}
	public void setAuthStatusCode(String authStatusCode) {
		this.authStatusCode = authStatusCode;
	}
	public Integer getRisk() {
		return risk;
	}
	public void setRisk(Integer risk) {
		this.risk = risk;
	}
    
    

}
