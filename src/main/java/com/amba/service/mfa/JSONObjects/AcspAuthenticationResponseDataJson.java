package com.amba.service.mfa.JSONObjects;

public class AcspAuthenticationResponseDataJson {
	
	private String acspAccountId;
    private CallStatusJson callStatus;
    private AcspAuthenticationResponseJson payload;
    
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
	public AcspAuthenticationResponseJson getPayload() {
		return payload;
	}
	public void setPayload(AcspAuthenticationResponseJson payload) {
		this.payload = payload;
	}

}
