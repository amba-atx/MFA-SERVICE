package com.amba.service.mfa.JSONObjects;

public class QueryAuthStatusRequestJson extends GenericRequestJson {

	
	
	 private CredentialAuthStatusRequestJson credentialAuthStatusRequest;
	    private ChannelIndicatorTypeJson channelIndicator;
		private String clientDefinedChannelIndicator;
		
		
		public CredentialAuthStatusRequestJson getCredentialAuthStatusRequest() {
			return credentialAuthStatusRequest;
		}
		public void setCredentialAuthStatusRequest(CredentialAuthStatusRequestJson credentialAuthStatusRequest) {
			this.credentialAuthStatusRequest = credentialAuthStatusRequest;
		}
		public ChannelIndicatorTypeJson getChannelIndicator() {
			return channelIndicator;
		}
		public void setChannelIndicator(ChannelIndicatorTypeJson channelIndicator) {
			this.channelIndicator = channelIndicator;
		}
		public String getClientDefinedChannelIndicator() {
			return clientDefinedChannelIndicator;
		}
		public void setClientDefinedChannelIndicator(String clientDefinedChannelIndicator) {
			this.clientDefinedChannelIndicator = clientDefinedChannelIndicator;
		}

}
