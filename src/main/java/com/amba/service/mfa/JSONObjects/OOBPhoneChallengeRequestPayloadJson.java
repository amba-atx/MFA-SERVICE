package com.amba.service.mfa.JSONObjects;

public class OOBPhoneChallengeRequestPayloadJson {

	
	 private Boolean noOp;
	    private PhoneInfoJson phoneInfo;
	    private Boolean tokenCollectionFlow;
		public Boolean getNoOp() {
			return noOp;
		}
		public void setNoOp(Boolean noOp) {
			this.noOp = noOp;
		}
		public PhoneInfoJson getPhoneInfo() {
			return phoneInfo;
		}
		public void setPhoneInfo(PhoneInfoJson phoneInfo) {
			this.phoneInfo = phoneInfo;
		}
		public Boolean getTokenCollectionFlow() {
			return tokenCollectionFlow;
		}
		public void setTokenCollectionFlow(Boolean tokenCollectionFlow) {
			this.tokenCollectionFlow = tokenCollectionFlow;
		}

}
