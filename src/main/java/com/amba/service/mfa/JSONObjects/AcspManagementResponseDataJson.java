package com.amba.service.mfa.JSONObjects;

public class AcspManagementResponseDataJson {
	
	private String acspAccountId;
    private CallStatusJson callStatus;
    private AcspManagementResponseJson payload;
    
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
	public AcspManagementResponseJson getPayload() {
		return payload;
	}
	public void setPayload(AcspManagementResponseJson payload) {
		this.payload = payload;
	}
    
    

}
