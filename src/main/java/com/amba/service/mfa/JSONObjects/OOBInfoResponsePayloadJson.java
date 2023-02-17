package com.amba.service.mfa.JSONObjects;

public class OOBInfoResponsePayloadJson {

	
	 private AuthenticationResultJson authenticationResult;
	    private CallStatusJson callStatus;
	    public AuthenticationResultJson getAuthenticationResult() {
			return authenticationResult;
		}
		public void setAuthenticationResult(AuthenticationResultJson authenticationResult) {
			this.authenticationResult = authenticationResult;
		}
		public CallStatusJson getCallStatus() {
			return callStatus;
		}
		public void setCallStatus(CallStatusJson callStatus) {
			this.callStatus = callStatus;
		}
		public String getChannelStatus() {
			return channelStatus;
		}
		public void setChannelStatus(String channelStatus) {
			this.channelStatus = channelStatus;
		}
		public String getReason() {
			return reason;
		}
		public void setReason(String reason) {
			this.reason = reason;
		}
		public String getToken() {
			return token;
		}
		public void setToken(String token) {
			this.token = token;
		}
		private String channelStatus;
	    private String reason;
	    private String token;

}
