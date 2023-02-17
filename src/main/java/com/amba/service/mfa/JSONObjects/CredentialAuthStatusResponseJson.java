package com.amba.service.mfa.JSONObjects;

public class CredentialAuthStatusResponseJson extends CredentialResponseListJson{
	
	private ChallengeQuestionAuthStatusResponseJson challengeQuestionAuthStatusResponse;
	private OobEmailAuthStatusResponseJson oobEmailAuthStatusResponse;
	private OobPhoneAuthStatusResponseJson oobPhoneAuthStatusResponse;
	private AcspAuthStatusResponseDataJson acspAuthStatusResponseData;
	public ChallengeQuestionAuthStatusResponseJson getChallengeQuestionAuthStatusResponse() {
		return challengeQuestionAuthStatusResponse;
	}
	public void setChallengeQuestionAuthStatusResponse(
			ChallengeQuestionAuthStatusResponseJson challengeQuestionAuthStatusResponse) {
		this.challengeQuestionAuthStatusResponse = challengeQuestionAuthStatusResponse;
	}
	public OobEmailAuthStatusResponseJson getOobEmailAuthStatusResponse() {
		return oobEmailAuthStatusResponse;
	}
	public void setOobEmailAuthStatusResponse(OobEmailAuthStatusResponseJson oobEmailAuthStatusResponse) {
		this.oobEmailAuthStatusResponse = oobEmailAuthStatusResponse;
	}
	public OobPhoneAuthStatusResponseJson getOobPhoneAuthStatusResponse() {
		return oobPhoneAuthStatusResponse;
	}
	public void setOobPhoneAuthStatusResponse(OobPhoneAuthStatusResponseJson oobPhoneAuthStatusResponse) {
		this.oobPhoneAuthStatusResponse = oobPhoneAuthStatusResponse;
	}
	public AcspAuthStatusResponseDataJson getAcspAuthStatusResponseData() {
		return acspAuthStatusResponseData;
	}
	public void setAcspAuthStatusResponseData(AcspAuthStatusResponseDataJson acspAuthStatusResponseData) {
		this.acspAuthStatusResponseData = acspAuthStatusResponseData;
	}

}
