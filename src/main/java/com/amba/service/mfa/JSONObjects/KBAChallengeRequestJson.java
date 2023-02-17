package com.amba.service.mfa.JSONObjects;

public class KBAChallengeRequestJson extends AcspChallengeRequestJson {
	
	private PersonInfoJson personInfo;

	public PersonInfoJson getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(PersonInfoJson personInfo) {
		this.personInfo = personInfo;
	}

}
