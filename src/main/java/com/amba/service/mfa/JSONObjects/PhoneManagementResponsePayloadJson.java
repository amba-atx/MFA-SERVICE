package com.amba.service.mfa.JSONObjects;

import java.util.ArrayList;
import java.util.List;

public class PhoneManagementResponsePayloadJson  extends OOBManagementResponsePayloadJson {
	
	private List<PhoneInfoJson> contactList;

	
	
	public List<PhoneInfoJson> getContactList() {
        if (contactList == null) {
            contactList = new ArrayList<PhoneInfoJson>();
        }
        return this.contactList;
    }

}

