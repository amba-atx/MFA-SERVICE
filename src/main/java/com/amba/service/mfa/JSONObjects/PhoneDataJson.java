package com.amba.service.mfa.JSONObjects;

public class PhoneDataJson extends DeviceIdentifierJson
 {
	 private String phoneNo;
	    private String countryCode;
	    private String areaCode;
	    private String extension;
		public String getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
		public String getCountryCode() {
			return countryCode;
		}
		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}
		public String getAreaCode() {
			return areaCode;
		}
		public void setAreaCode(String areaCode) {
			this.areaCode = areaCode;
		}
		public String getExtension() {
			return extension;
		}
		public void setExtension(String extension) {
			this.extension = extension;
		}

	

}
