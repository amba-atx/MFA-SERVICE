package com.amba.service.mfa.JSONObjects;

public class TrxSignAuthStatusResponseJson extends AcspAuthStatusResponseJson {
	
	private Boolean bioValidation;

	public Boolean getBioValidation() {
		return bioValidation;
	}

	public void setBioValidation(Boolean bioValidation) {
		this.bioValidation = bioValidation;
	}

}
