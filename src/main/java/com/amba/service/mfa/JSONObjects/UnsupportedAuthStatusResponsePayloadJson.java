package com.amba.service.mfa.JSONObjects;

public class UnsupportedAuthStatusResponsePayloadJson {
	
	private AuthenticationResultJson authenticationResult;
	private CallStatusJson callStatus;
	
	public AuthenticationResultJson getAuthenticationResult() {
		return authenticationResult;
	}
	public void setAuthenticationResult(AuthenticationResultJson authenticationResult) {
		this.authenticationResult = authenticationResult;
	}
	public CallStatusJson getCallStatus() {
		return callStatus;
	}
	public void setCallStatus(CallStatusJson callStatus) {
		this.callStatus = callStatus;
	}
	
	

}
