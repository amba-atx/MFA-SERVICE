package com.amba.service.mfa.JSONObjects;

public class CredentialManagementResponseListJson extends CredentialResponseListJson {
	
	private ChallengeQuestionManagementResponseJson challengeQuestionManagementResponse;
	private OobEmailManagementResponseJson oobEmailManagementResponse;
	private OobPhoneManagementResponseJson oobPhoneManagementResponse;
	private AcspManagementResponseDataJson acspManagementResponseData;
	
	public ChallengeQuestionManagementResponseJson getChallengeQuestionManagementResponse() {
		return challengeQuestionManagementResponse;
	}
	public void setChallengeQuestionManagementResponse(
			ChallengeQuestionManagementResponseJson challengeQuestionManagementResponse) {
		this.challengeQuestionManagementResponse = challengeQuestionManagementResponse;
	}
	public OobEmailManagementResponseJson getOobEmailManagementResponse() {
		return oobEmailManagementResponse;
	}
	public void setOobEmailManagementResponse(OobEmailManagementResponseJson oobEmailManagementResponse) {
		this.oobEmailManagementResponse = oobEmailManagementResponse;
	}
	public OobPhoneManagementResponseJson getOobPhoneManagementResponse() {
		return oobPhoneManagementResponse;
	}
	public void setOobPhoneManagementResponse(OobPhoneManagementResponseJson oobPhoneManagementResponse) {
		this.oobPhoneManagementResponse = oobPhoneManagementResponse;
	}
	public AcspManagementResponseDataJson getAcspManagementResponseData() {
		return acspManagementResponseData;
	}
	public void setAcspManagementResponseData(AcspManagementResponseDataJson acspManagementResponseData) {
		this.acspManagementResponseData = acspManagementResponseData;
	}
	
}
