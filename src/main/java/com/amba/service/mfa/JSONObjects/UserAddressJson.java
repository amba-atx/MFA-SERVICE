package com.amba.service.mfa.JSONObjects;

public class UserAddressJson {
	
	private String addressLastUpdateDate;
	private String addressSetDate;
	private String country;
	private String postalCode;
	private String region;
	
	public String getAddressLastUpdateDate() {
		return addressLastUpdateDate;
	}
	public void setAddressLastUpdateDate(String addressLastUpdateDate) {
		this.addressLastUpdateDate = addressLastUpdateDate;
	}
	public String getAddressSetDate() {
		return addressSetDate;
	}
	public void setAddressSetDate(String addressSetDate) {
		this.addressSetDate = addressSetDate;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

}
