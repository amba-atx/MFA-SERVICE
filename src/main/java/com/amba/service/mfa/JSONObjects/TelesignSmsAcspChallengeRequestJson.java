package com.amba.service.mfa.JSONObjects;

public class TelesignSmsAcspChallengeRequestJson extends TelesignGenAcspChallengeRequestJson {
	
	private String template;

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

}
