package com.amba.service.mfa.JSONObjects;

import java.util.ArrayList;
import java.util.List;

public class EmailManagementResponsePayloadJson extends OOBManagementResponsePayloadJson {
	
	private List<EmailInfoJson> contactList;

	public List<EmailInfoJson> getContactList() {
		if (contactList == null) {
			contactList = new ArrayList<EmailInfoJson>();
			}
		return this.contactList;
	}

	public void setContactList(List<EmailInfoJson> contactList) {
		this.contactList = contactList;
	}

}
