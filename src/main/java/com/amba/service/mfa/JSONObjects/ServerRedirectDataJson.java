package com.amba.service.mfa.JSONObjects;

public class ServerRedirectDataJson {

	
	   private String redirectUrl;
	    private String secretKey;
	    private String instanceId;
	    private RedirectReasonJson redirectReason;
		public String getRedirectUrl() {
			return redirectUrl;
		}
		public void setRedirectUrl(String redirectUrl) {
			this.redirectUrl = redirectUrl;
		}
		public String getSecretKey() {
			return secretKey;
		}
		public void setSecretKey(String secretKey) {
			this.secretKey = secretKey;
		}
		public String getInstanceId() {
			return instanceId;
		}
		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
		public RedirectReasonJson getRedirectReason() {
			return redirectReason;
		}
		public void setRedirectReason(RedirectReasonJson redirectReason) {
			this.redirectReason = redirectReason;
		}
	    
	    
}
