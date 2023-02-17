package com.amba.service.mfa.JSONObjects;

public abstract class TelesignGenAcspChallengeRequestJson extends AcspChallengeRequestJson {
	
	private String phoneNo;
	private String language;
	
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
}