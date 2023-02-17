package com.amba.service.mfa.JSONObjects;

public class TrxSignManagementResponseJson extends AcspManagementResponseJson {
	
	private String encryptedhmackey;

	public String getEncryptedhmackey() {
		return encryptedhmackey;
	}

	public void setEncryptedhmackey(String encryptedhmackey) {
		this.encryptedhmackey = encryptedhmackey;
	}

}
