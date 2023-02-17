package com.amba.service.mfa.JSONObjects;

public class OTPAuthenticationRequestJson extends AcspAuthenticationRequestJson
{
    private String otp;

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

}
