package com.amba.service.mfa.JSONObjects;


public class PhoneInfoJson extends OOBContactInfoObjectJson{
	
	 private String areaCode;
	    private String countryCode;
	    private String extension;
	    private String phoneNumber;
		public String getAreaCode() {
			return areaCode;
		}
		public void setAreaCode(String areaCode) {
			this.areaCode = areaCode;
		}
		public String getCountryCode() {
			return countryCode;
		}
		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}
		public String getExtension() {
			return extension;
		}
		public void setExtension(String extension) {
			this.extension = extension;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
	    
	    
	    
	    

}
