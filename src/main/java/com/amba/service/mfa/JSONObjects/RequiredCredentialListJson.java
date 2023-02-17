package com.amba.service.mfa.JSONObjects;

import java.util.ArrayList;
import java.util.List;

public class RequiredCredentialListJson {

	
    private List<RequiredCredentialJson> requiredCredential;

    
    public List<RequiredCredentialJson> getRequiredCredential() {
        if (requiredCredential == null) {
            requiredCredential = new ArrayList<RequiredCredentialJson>();
        }
        return this.requiredCredential;
    }
}
