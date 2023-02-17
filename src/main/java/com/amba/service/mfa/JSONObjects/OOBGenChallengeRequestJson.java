package com.amba.service.mfa.JSONObjects;

public class OOBGenChallengeRequestJson extends AcspChallengeRequestJson{

	
	
    private OOBPhoneInfoJson contactList;

	public OOBPhoneInfoJson getContactList() {
		return contactList;
	}

	public void setContactList(OOBPhoneInfoJson contactList) {
		this.contactList = contactList;
	}

    
    
}
