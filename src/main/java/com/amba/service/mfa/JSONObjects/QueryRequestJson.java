package com.amba.service.mfa.JSONObjects;

public class QueryRequestJson extends GenericRequestJson {

	
	
	 private CredentialManagementRequestListJson credentialManagementRequestList;
	    private DeviceManagementRequestPayloadJson deviceManagementRequest;
	    private ChannelIndicatorTypeJson channelIndicator;
	    public CredentialManagementRequestListJson getCredentialManagementRequestList() {
			return credentialManagementRequestList;
		}
		public void setCredentialManagementRequestList(CredentialManagementRequestListJson credentialManagementRequestList) {
			this.credentialManagementRequestList = credentialManagementRequestList;
		}
		public DeviceManagementRequestPayloadJson getDeviceManagementRequest() {
			return deviceManagementRequest;
		}
		public void setDeviceManagementRequest(DeviceManagementRequestPayloadJson deviceManagementRequest) {
			this.deviceManagementRequest = deviceManagementRequest;
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
		private String clientDefinedChannelIndicator;
}
