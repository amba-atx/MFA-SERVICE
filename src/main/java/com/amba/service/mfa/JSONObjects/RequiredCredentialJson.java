package com.amba.service.mfa.JSONObjects;

import com.amba.service.mfa.stub.client.CredentialType;

public class RequiredCredentialJson {


	
	 private CredentialType credentialType;
	    private String genericCredentialType;
	    private String groupName;
	    private Integer preference;
	    private Boolean required;
		public CredentialType getCredentialType() {
			return credentialType;
		}
		public void setCredentialType(CredentialType credentialType) {
			this.credentialType = credentialType;
		}
		public String getGenericCredentialType() {
			return genericCredentialType;
		}
		public void setGenericCredentialType(String genericCredentialType) {
			this.genericCredentialType = genericCredentialType;
		}
		public String getGroupName() {
			return groupName;
		}
		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
		public Integer getPreference() {
			return preference;
		}
		public void setPreference(Integer preference) {
			this.preference = preference;
		}
		public Boolean getRequired() {
			return required;
		}
		public void setRequired(Boolean required) {
			this.required = required;
		}
	    
	    
	    
}
