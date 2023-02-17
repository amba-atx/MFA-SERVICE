package com.amba.service.mfa.JSONObjects;

public class OOBEmailChallengeRequestPayloadJson {
	
	private EmailInfoJson emailInfo;
	private String fromAddress;
	private String fromName;
	private Boolean noOp;
	private String subject;
	
	public EmailInfoJson getEmailInfo() {
		return emailInfo;
	}
	public void setEmailInfo(EmailInfoJson emailInfo) {
		this.emailInfo = emailInfo;
	}
	public String getFromAddress() {
		return fromAddress;
	}
	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}
	public String getFromName() {
		return fromName;
	}
	public void setFromName(String fromName) {
		this.fromName = fromName;
	}
	public Boolean getNoOp() {
		return noOp;
	}
	public void setNoOp(Boolean noOp) {
		this.noOp = noOp;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
