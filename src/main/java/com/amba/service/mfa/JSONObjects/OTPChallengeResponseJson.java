package com.amba.service.mfa.JSONObjects;

public class OTPChallengeResponseJson  extends AcspChallengeResponseJson
{

    public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	private String otp;
}
