package com.amba.service.mfa.JSONObjects;

public class OTPSMSChallengeResponseJson     extends AcspChallengeResponseJson
 {

    private String otp;

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}
    
    

}
