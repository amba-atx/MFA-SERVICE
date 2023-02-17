package com.amba.service.mfa.JSONObjects;

import java.util.List;

public class QueryResponse2Json extends GenericResponseJson {
	
	private List<String> browsableGroupNames;
    private CredentialManagementResponseListJson credentialManagementResponseList;
    private DeviceManagementResponsePayloadJson deviceManagementResponse;
    private CredentialListJson systemCredentials;
    private CredentialListJson userCredentials;
    private UserPreferenceJson userPreference;
	public List<String> getBrowsableGroupNames() {
		return browsableGroupNames;
	}
	public void setBrowsableGroupNames(List<String> browsableGroupNames) {
		this.browsableGroupNames = browsableGroupNames;
	}
	public CredentialManagementResponseListJson getCredentialManagementResponseList() {
		return credentialManagementResponseList;
	}
	public void setCredentialManagementResponseList(CredentialManagementResponseListJson credentialManagementResponseList) {
		this.credentialManagementResponseList = credentialManagementResponseList;
	}
	public DeviceManagementResponsePayloadJson getDeviceManagementResponse() {
		return deviceManagementResponse;
	}
	public void setDeviceManagementResponse(DeviceManagementResponsePayloadJson deviceManagementResponse) {
		this.deviceManagementResponse = deviceManagementResponse;
	}
	public CredentialListJson getSystemCredentials() {
		return systemCredentials;
	}
	public void setSystemCredentials(CredentialListJson systemCredentials) {
		this.systemCredentials = systemCredentials;
	}
	public CredentialListJson getUserCredentials() {
		return userCredentials;
	}
	public void setUserCredentials(CredentialListJson userCredentials) {
		this.userCredentials = userCredentials;
	}
	public UserPreferenceJson getUserPreference() {
		return userPreference;
	}
	public void setUserPreference(UserPreferenceJson userPreference) {
		this.userPreference = userPreference;
	}

    
    
}
