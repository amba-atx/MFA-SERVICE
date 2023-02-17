package com.amba.service.mfa.JSONObjects;

public class ClientReturnDataJson {
	
	private String returnUrl;
    private AuthorizationMethodJson validationMethod;
    
	public String getReturnUrl() {
		return returnUrl;
	}
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}
	public AuthorizationMethodJson getValidationMethod() {
		return validationMethod;
	}
	public void setValidationMethod(AuthorizationMethodJson validationMethod) {
		this.validationMethod = validationMethod;
	}

}
