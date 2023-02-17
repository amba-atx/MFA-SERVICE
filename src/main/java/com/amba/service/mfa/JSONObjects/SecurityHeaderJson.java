package com.amba.service.mfa.JSONObjects;

public class SecurityHeaderJson {

	
	    private String callerCredential;
	    private String callerId;
	    private AuthorizationMethodJson method;
		public String getCallerCredential() {
			return callerCredential;
		}
		public void setCallerCredential(String callerCredential) {
			this.callerCredential = callerCredential;
		}
		public String getCallerId() {
			return callerId;
		}
		public void setCallerId(String callerId) {
			this.callerId = callerId;
		}
		public AuthorizationMethodJson getMethod() {
			return method;
		}
		public void setMethod(AuthorizationMethodJson method) {
			this.method = method;
		}
	    
	    
}
