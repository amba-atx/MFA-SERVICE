package com.amba.service.mfa.JSONObjects;

import java.util.List;

public class OOBGenManagementRequestJson     extends AcspManagementRequestJson
{

	
	private Action2Json action;
    private List<OOBPhoneInfoJson> contactList;
    
	public Action2Json getAction() {
		return action;
	}
	public void setAction(Action2Json action) {
		this.action = action;
	}
	public List<OOBPhoneInfoJson> getContactList() {
		return contactList;
	}
	public void setContactList(List<OOBPhoneInfoJson> contactList) {
		this.contactList = contactList;
	}

}
