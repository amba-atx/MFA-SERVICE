package com.amba.service.mfa.JSONObjects;

public class CredentialDataListJson extends CredentialRequestListJson{
	
	private ChallengeQuestionDataJson challengeQuestionData;    
	private OobEmailDataJson oobEmailData;
	private OobPhoneDataJson oobPhoneData;
	private AcspAuthenticationRequestDataJson acspAuthenticationRequestData;
	
	public ChallengeQuestionDataJson getChallengeQuestionData() {
		return challengeQuestionData;
	}
	public void setChallengeQuestionData(ChallengeQuestionDataJson challengeQuestionData) {
		this.challengeQuestionData = challengeQuestionData;
	}
	public OobEmailDataJson getOobEmailData() {
		return oobEmailData;
	}
	public void setOobEmailData(OobEmailDataJson oobEmailData) {
		this.oobEmailData = oobEmailData;
	}
	public OobPhoneDataJson getOobPhoneData() {
		return oobPhoneData;
	}
	public void setOobPhoneData(OobPhoneDataJson oobPhoneData) {
		this.oobPhoneData = oobPhoneData;
	}
	public AcspAuthenticationRequestDataJson getAcspAuthenticationRequestData() {
		return acspAuthenticationRequestData;
	}
	public void setAcspAuthenticationRequestData(AcspAuthenticationRequestDataJson acspAuthenticationRequestData) {
		this.acspAuthenticationRequestData = acspAuthenticationRequestData;
	}
}
