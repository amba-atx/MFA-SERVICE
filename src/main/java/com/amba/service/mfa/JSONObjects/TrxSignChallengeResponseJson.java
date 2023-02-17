package com.amba.service.mfa.JSONObjects;

public class TrxSignChallengeResponseJson extends AcspChallengeResponseJson {
	
	private String encryptedkey;
	private String encryptedtrxpayload;
	private String correlationId;
	
	public String getEncryptedkey() {
		return encryptedkey;
	}
	public void setEncryptedkey(String encryptedkey) {
		this.encryptedkey = encryptedkey;
	}
	public String getEncryptedtrxpayload() {
		return encryptedtrxpayload;
	}
	public void setEncryptedtrxpayload(String encryptedtrxpayload) {
		this.encryptedtrxpayload = encryptedtrxpayload;
	}
	public String getCorrelationId() {
		return correlationId;
	}
	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

}
