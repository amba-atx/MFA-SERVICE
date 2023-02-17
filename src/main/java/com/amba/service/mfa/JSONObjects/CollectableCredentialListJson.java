package com.amba.service.mfa.JSONObjects;

import java.util.ArrayList;
import java.util.List;

public class CollectableCredentialListJson {
	
	private List<CollectableCredentialJson> collectableCredential;

	public List<CollectableCredentialJson> getCollectableCredential() {
		if (collectableCredential == null) {
            collectableCredential = new ArrayList<CollectableCredentialJson>();
        }
        return this.collectableCredential;
	}

	public void setCollectableCredential(List<CollectableCredentialJson> collectableCredential) {
		this.collectableCredential = collectableCredential;
	}


}
