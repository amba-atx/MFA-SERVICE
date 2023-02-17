package com.amba.service.mfa.JSONObjects;

import java.util.ArrayList;
import java.util.List;

import com.amba.service.mfa.stub.client.PhoneInfo;

public class PhoneManagementRequestPayloadJson extends OOBManagementRequestPayloadJson {

    private List<PhoneInfoJson> contactList;


	public void setContactList(List<PhoneInfoJson> contactList) {
		this.contactList = contactList;
	}
	public List<PhoneInfoJson> getContactList() {
        if (contactList == null) {
            contactList = new ArrayList<PhoneInfoJson>();
        }
        return this.contactList;
    }

}
