package com.amba.service.mfa.JSONObjects;

import java.util.ArrayList;
import java.util.List;

public class CredentialListJson {
	
	private List<CredentialJson> credential;

	public List<CredentialJson> getCredential() {
		if (credential == null) {
			credential = new ArrayList<CredentialJson>();        
			}
		return this.credential;
	}

	public void setCredential(List<CredentialJson> credential) {
		this.credential = credential;
	}

}
