package com.amba.service.mfa.JSONObjects;

public class OOBSMSAuthenticationRequestJson extends OOBGenAuthenticationRequestJson
 {

    private String otp;

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

}
