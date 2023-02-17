package com.amba.service.mfa.service;

import org.springframework.stereotype.Service;

import com.amba.service.mfa.postmanRequest.AnalyzeRequestPostman;
import com.amba.service.mfa.postmanRequest.CreateUserRequestPostman;
import com.amba.service.mfa.postmanRequest.NotifyRequestPostman;
import com.amba.service.mfa.postmanRequest.QueryRequestPostman;
import com.amba.service.mfa.postmanRequest.UpdateUserRequestPostman;
import com.amba.service.mfa.stub.client.AnalyzeResponse;
import com.amba.service.mfa.stub.client.CreateUserResponse;
import com.amba.service.mfa.stub.client.NotifyResponse;
import com.amba.service.mfa.stub.client.QueryResponse;
import com.amba.service.mfa.stub.client.UpdateUserResponse;

@Service
public interface AuthService {
	
	AnalyzeResponse analyzeUser(AnalyzeRequestPostman postmanRequest);
	
	UpdateUserResponse updateUser(UpdateUserRequestPostman postmanRequest);

	CreateUserResponse createUser(CreateUserRequestPostman postmanRequest);

	QueryResponse query(QueryRequestPostman postmanRequest);
	
	NotifyResponse notifyRsa(NotifyRequestPostman postmanRequest);

}
