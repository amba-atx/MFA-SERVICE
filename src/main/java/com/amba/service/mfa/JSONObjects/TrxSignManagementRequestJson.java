package com.amba.service.mfa.JSONObjects;

public class TrxSignManagementRequestJson extends AcspManagementRequestJson {
	
	private Action4Json action;
	private String publicKey;
	private String entropy;
	private String indicies;
	
	public Action4Json getAction() {
		return action;
	}
	public void setAction(Action4Json action) {
		this.action = action;
	}
	public String getPublicKey() {
		return publicKey;
	}
	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}
	public String getEntropy() {
		return entropy;
	}
	public void setEntropy(String entropy) {
		this.entropy = entropy;
	}
	public String getIndicies() {
		return indicies;
	}
	public void setIndicies(String indicies) {
		this.indicies = indicies;
	}

}
