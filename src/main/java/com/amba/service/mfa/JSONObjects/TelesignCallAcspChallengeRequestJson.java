package com.amba.service.mfa.JSONObjects;

public class TelesignCallAcspChallengeRequestJson extends TelesignGenAcspChallengeRequestJson {
	
	private String template;
	private String callForwardAction;
	private String verifyMethod;
	private TeleSignExtensionsJson extensions;
	
	public String getTemplate() {
		return template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}
	public String getCallForwardAction() {
		return callForwardAction;
	}
	public void setCallForwardAction(String callForwardAction) {
		this.callForwardAction = callForwardAction;
	}
	public String getVerifyMethod() {
		return verifyMethod;
	}
	public void setVerifyMethod(String verifyMethod) {
		this.verifyMethod = verifyMethod;
	}
	public TeleSignExtensionsJson getExtensions() {
		return extensions;
	}
	public void setExtensions(TeleSignExtensionsJson extensions) {
		this.extensions = extensions;
	}
	
}
