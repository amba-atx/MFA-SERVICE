package com.amba.service.mfa.JSONObjects;

public class AcspAuthStatusResponseDataJson {
	
	private String acspAccountId;
    private CallStatusJson callStatus;
    private AcspAuthStatusResponseJson payload;
    
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
	public AcspAuthStatusResponseJson getPayload() {
		return payload;
	}
	public void setPayload(AcspAuthStatusResponseJson payload) {
		this.payload = payload;
	}
    
    

}
