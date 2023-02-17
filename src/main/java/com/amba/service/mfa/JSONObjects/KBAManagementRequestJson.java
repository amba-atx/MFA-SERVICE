package com.amba.service.mfa.JSONObjects;

public class KBAManagementRequestJson extends AcspManagementRequestJson {
	
	private ActionJson action;
	private PersonInfoJson personInfo;
	
	public ActionJson getAction() {
		return action;
	}
	public void setAction(ActionJson action) {
		this.action = action;
	}
	public PersonInfoJson getPersonInfo() {
		return personInfo;
	}
	public void setPersonInfo(PersonInfoJson personInfo) {
		this.personInfo = personInfo;
	}

}
