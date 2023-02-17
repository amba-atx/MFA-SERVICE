package com.amba.service.mfa.JSONObjects;

public class OOBManagementResponsePayloadJson {

	
	 private String acspAccountId;
	    private CallStatusJson callStatus;
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

}
