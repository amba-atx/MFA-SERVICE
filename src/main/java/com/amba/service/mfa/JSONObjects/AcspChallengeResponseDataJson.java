package com.amba.service.mfa.JSONObjects;

public class AcspChallengeResponseDataJson {
	
	private String acspAccountId;
    private CallStatusJson callStatus;
    private AcspChallengeResponseJson payload;
    
	public String getAcspAccountId() {
		return acspAccountId;
	}
	public void setAcspAccountId(String acspAccountId) {
		this.acspAccountId = acspAccountId;
	}
	public CallStatusJson getCallStatus() {
		return callStatus;
	}
	public void setCallStatus(CallStatusJson callStatus) {
		this.callStatus = callStatus;
	}
	public AcspChallengeResponseJson getPayload() {
		return payload;
	}
	public void setPayload(AcspChallengeResponseJson payload) {
		this.payload = payload;
	}

}
