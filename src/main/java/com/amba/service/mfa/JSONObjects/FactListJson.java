package com.amba.service.mfa.JSONObjects;

import java.util.ArrayList;
import java.util.List;

public class FactListJson {
	
	private List<ClientDefinedFactJson> fact;

	public List<ClientDefinedFactJson> getFact() {
		if (fact == null) {
			fact = new ArrayList<ClientDefinedFactJson>();
			}
		return this.fact;
	}

	public void setFact(List<ClientDefinedFactJson> fact) {
		this.fact = fact;
	}

}
