package com.amba.service.mfa.JSONObjects;



public class MessageHeaderJson {
	    private ApiTypeJson apiType;
	    private String requestId;
	    private RequestTypeJson requestType;
	    private String timeStamp;
	    private String version;
		public ApiTypeJson getApiType() {
			return apiType;
		}
		public void setApiType(ApiTypeJson apiType) {
			this.apiType = apiType;
		}
		public String getRequestId() {
			return requestId;
		}
		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}
		public RequestTypeJson getRequestType() {
			return requestType;
		}
		public void setRequestType(RequestTypeJson requestType) {
			this.requestType = requestType;
		}
		public String getTimeStamp() {
			return timeStamp;
		}
		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}
		public String getVersion() {
			return version;
		}
		public void setVersion(String version) {
			this.version = version;
		}


}
