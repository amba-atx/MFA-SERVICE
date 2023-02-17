package com.amba.service.mfa.JSONObjects;

import java.util.List;

public class EmailManagementRequestPayloadJson extends OOBManagementRequestPayloadJson {
	
	private List<EmailInfoJson> contactList;

	public List<EmailInfoJson> getContactList() {
		return contactList;
	}

	public void setContactList(List<EmailInfoJson> contactList) {
		this.contactList = contactList;
	}

}
