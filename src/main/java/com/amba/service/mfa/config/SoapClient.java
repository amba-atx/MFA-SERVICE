package com.amba.service.mfa.config;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.amba.service.mfa.stub.client.Analyze;
import com.amba.service.mfa.stub.client.AnalyzeResponse;
import com.amba.service.mfa.stub.client.CreateUser;
import com.amba.service.mfa.stub.client.CreateUserResponse;
import com.amba.service.mfa.stub.client.QueryResponse;
import com.amba.service.mfa.stub.client.UpdateUser;
import com.amba.service.mfa.stub.client.UpdateUserResponse;
import com.amba.service.mfa.stub.client.Query;

public class SoapClient extends WebServiceGatewaySupport {
	
    public CreateUserResponse CreateUserRequest(CreateUser request) {
        CreateUserResponse res = (CreateUserResponse) getWebServiceTemplate().marshalSendAndReceive(request);
        return res;
    }

	public AnalyzeResponse AnalyzeRequest(Analyze request) {
		  AnalyzeResponse res = (AnalyzeResponse) getWebServiceTemplate().marshalSendAndReceive(request);
	        return res;
	   
	}
	
	public UpdateUserResponse UpdateRequest(UpdateUser request) {
		UpdateUserResponse res = (UpdateUserResponse) getWebServiceTemplate().marshalSendAndReceive(request);	        
		return res;
	}
	
	public QueryResponse Query(Query request) {
		QueryResponse res = (QueryResponse) getWebServiceTemplate().marshalSendAndReceive(request);
		return res;
	}
	
}