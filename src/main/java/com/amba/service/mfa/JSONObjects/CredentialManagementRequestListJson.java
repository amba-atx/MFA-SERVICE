package com.amba.service.mfa.JSONObjects;

public class CredentialManagementRequestListJson extends CredentialRequestListJson {
	
	private ChallengeQuestionManagementRequestJson challengeQuestionManagementRequest;
	private OobEmailManagementRequestJson oobEmailManagementRequest;
	private OobPhoneManagementRequestJson oobPhoneManagementRequest;
	private AcspManagementRequestDataJson acspManagementRequestData;
	
	public ChallengeQuestionManagementRequestJson getChallengeQuestionManagementRequest() {
		return challengeQuestionManagementRequest;
	}
	public void setChallengeQuestionManagementRequest(
			ChallengeQuestionManagementRequestJson challengeQuestionManagementRequest) {
		this.challengeQuestionManagementRequest = challengeQuestionManagementRequest;
	}
	public OobEmailManagementRequestJson getOobEmailManagementRequest() {
		return oobEmailManagementRequest;
	}
	public void setOobEmailManagementRequest(OobEmailManagementRequestJson oobEmailManagementRequest) {
		this.oobEmailManagementRequest = oobEmailManagementRequest;
	}
	public OobPhoneManagementRequestJson getOobPhoneManagementRequest() {
		return oobPhoneManagementRequest;
	}
	public void setOobPhoneManagementRequest(OobPhoneManagementRequestJson oobPhoneManagementRequest) {
		this.oobPhoneManagementRequest = oobPhoneManagementRequest;
	}
	public AcspManagementRequestDataJson getAcspManagementRequestData() {
		return acspManagementRequestData;
	}
	public void setAcspManagementRequestData(AcspManagementRequestDataJson acspManagementRequestData) {
		this.acspManagementRequestData = acspManagementRequestData;
	}

}
