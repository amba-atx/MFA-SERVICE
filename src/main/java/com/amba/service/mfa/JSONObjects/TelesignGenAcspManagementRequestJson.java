package com.amba.service.mfa.JSONObjects;

public abstract class TelesignGenAcspManagementRequestJson extends AcspManagementRequestJson {
	
	private ActionTypeEnumJson actionType;
	private String phoneNo;
	private String language;
	private TeleSignExtensionsJson extensions;
	
	public ActionTypeEnumJson getActionType() {
		return actionType;
	}
	public void setActionType(ActionTypeEnumJson actionType) {
		this.actionType = actionType;
	}
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
	public TeleSignExtensionsJson getExtensions() {
		return extensions;
	}
	public void setExtensions(TeleSignExtensionsJson extensions) {
		this.extensions = extensions;
	}

}
