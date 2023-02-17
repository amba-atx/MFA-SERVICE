package com.amba.service.mfa.JSONObjects;

import java.util.List;

public class GenericActionTypeListJson extends ActionTypeListJson {
	
	private List<GenericActionTypeJson> genericActionTypes;

	public List<GenericActionTypeJson> getGenericActionTypes() {
		return genericActionTypes;
	}

	public void setGenericActionTypes(List<GenericActionTypeJson> genericActionTypes) {
		this.genericActionTypes = genericActionTypes;
	}

}
