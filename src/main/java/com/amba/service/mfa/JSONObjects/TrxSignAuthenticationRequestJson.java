package com.amba.service.mfa.JSONObjects;

public class TrxSignAuthenticationRequestJson extends AcspAuthenticationRequestJson {
	
	private Boolean isOffline;
	private Boolean approved;
	private Boolean bioValidation;
	private String trxSignature;
	
	public Boolean getIsOffline() {
		return isOffline;
	}
	public void setIsOffline(Boolean isOffline) {
		this.isOffline = isOffline;
	}
	public Boolean getApproved() {
		return approved;
	}
	public void setApproved(Boolean approved) {
		this.approved = approved;
	}
	public Boolean getBioValidation() {
		return bioValidation;
	}
	public void setBioValidation(Boolean bioValidation) {
		this.bioValidation = bioValidation;
	}
	public String getTrxSignature() {
		return trxSignature;
	}
	public void setTrxSignature(String trxSignature) {
		this.trxSignature = trxSignature;
	}

}
