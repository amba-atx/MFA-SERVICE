package com.amba.service.mfa.serviceImpl;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amba.service.mfa.config.SoapClient;
import com.amba.service.mfa.postmanRequest.AnalyzeRequestPostman;
import com.amba.service.mfa.postmanRequest.CreateUserRequestPostman;
import com.amba.service.mfa.postmanRequest.NotifyRequestPostman;
import com.amba.service.mfa.postmanRequest.QueryRequestPostman;
import com.amba.service.mfa.postmanRequest.UpdateUserRequestPostman;
import com.amba.service.mfa.service.AuthService;
import com.amba.service.mfa.stub.client.Analyze;
import com.amba.service.mfa.stub.client.AnalyzeRequest;
import com.amba.service.mfa.stub.client.AnalyzeResponse;
import com.amba.service.mfa.stub.client.CreateUser;
import com.amba.service.mfa.stub.client.CreateUserRequest;
import com.amba.service.mfa.stub.client.CreateUserResponse;
import com.amba.service.mfa.stub.client.NotifyResponse;
import com.amba.service.mfa.stub.client.Query;
import com.amba.service.mfa.stub.client.QueryRequest;
import com.amba.service.mfa.stub.client.QueryResponse;
import com.amba.service.mfa.stub.client.RunRiskType;
import com.amba.service.mfa.stub.client.UpdateUser;
import com.amba.service.mfa.stub.client.UpdateUserRequest;
import com.amba.service.mfa.stub.client.UpdateUserResponse;

@Service
public class AuthServiceImpl implements AuthService {

	@Autowired
	SoapClient soapClient;

	@Override
	public AnalyzeResponse analyzeUser(AnalyzeRequestPostman postmanRequest) {

		System.out.println(new JSONObject(postmanRequest).toString());

		Analyze request = new Analyze();
		AnalyzeRequest analyzeRequest = new AnalyzeRequest();

		analyzeRequest.setAutoCreateUserFlag(postmanRequest.getAutoCreateUserFlag());
		analyzeRequest.setActionTypeList(postmanRequest.getGenericActionTypeList());
		analyzeRequest.setDeviceRequest(postmanRequest.getDeviceRequest());
		analyzeRequest.setIdentificationData(postmanRequest.getIdentificationData());
		analyzeRequest.setMessageHeader(postmanRequest.getMessageHeader());
		analyzeRequest.setEventDataList(postmanRequest.getEventDataList());
		analyzeRequest.setRunRiskType(postmanRequest.getRunRiskType());
		request.setRequest(analyzeRequest);

		System.out.println(new JSONObject(request).toString());

		AnalyzeResponse response = soapClient.AnalyzeRequest(request);
		System.out.println(response);
		System.out.println(new JSONObject(response).toString());

		return response;

	}

	@Override
	public UpdateUserResponse updateUser(UpdateUserRequestPostman postmanRequest) {

		System.out.println(new JSONObject(postmanRequest).toString());

		UpdateUser request = new UpdateUser();
		UpdateUserRequest updateUserRequest = new UpdateUserRequest();

		updateUserRequest.setActionTypeList(postmanRequest.getGenericActionTypeList());
		updateUserRequest.setDeviceRequest(postmanRequest.getDeviceRequest());
		updateUserRequest.setIdentificationData(postmanRequest.getIdentificationData());
		updateUserRequest.setMessageHeader(postmanRequest.getMessageHeader());
		updateUserRequest.setEventDataList(postmanRequest.getEventDataList());
		updateUserRequest.setRunRiskType(postmanRequest.getRunRiskType());
		updateUserRequest.setConfigurationHeader(postmanRequest.getConfigurationHeader());
		updateUserRequest.setCredentialManagementRequestList(postmanRequest.getCredentialManagementRequestList());
		updateUserRequest.setDeviceManagementRequest(postmanRequest.getDeviceManagementRequestPayload());
		updateUserRequest.setUserData(postmanRequest.getUserData());
		updateUserRequest.setUserPreference(postmanRequest.getUserPreference());
		updateUserRequest.setClientDefinedChannelIndicator(postmanRequest.getClientDefinedChannelIndicator());

		request.setRequest(updateUserRequest);

		System.out.println(new JSONObject(request).toString());

		UpdateUserResponse response = new UpdateUserResponse();

		try {
			response = soapClient.UpdateRequest(request);
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			e.getLocalizedMessage();
			e.getCause();
		}

		// UpdateUserResponse response = soapClient.UpdateRequest(request);

		System.out.println(response);
		System.out.println(new JSONObject(response).toString());

		return response;
	}

	@Override
	public CreateUserResponse createUser(CreateUserRequestPostman postmanRequest) {
		// TODO Auto-generated method stub
		System.out.println(new JSONObject(postmanRequest).toString());

		CreateUser request = new CreateUser();
		CreateUserRequest createUserRequest = new CreateUserRequest();

		createUserRequest.setActionTypeList(postmanRequest.getGenericActionTypeList());
		createUserRequest.setConfigurationHeader(postmanRequest.getConfigurationHeader());
		createUserRequest.setDeviceRequest(postmanRequest.getDeviceRequest());
		createUserRequest.setIdentificationData(postmanRequest.getIdentificationData());
		createUserRequest.setMessageHeader(postmanRequest.getMessageHeader());
		createUserRequest.setCredentialManagementRequestList(postmanRequest.getCredentailManagementRequestList());
		createUserRequest.setDeviceManagementRequest(postmanRequest.getDeviceManagementRequest());
//		createUserRequest.setEventDataList(postmanRequest.getEventDataList());
		createUserRequest.setRunRiskType(postmanRequest.getRunRiskType());
		createUserRequest.setUserData(postmanRequest.getUserData());
//		createUserRequest.setUserPreference(postmanRequest.getUserPreference());
		createUserRequest.setChannelIndicator(postmanRequest.getChannelIndicator());
		createUserRequest.setClientDefinedChannelIndicator(postmanRequest.getClientDefinedChannelIndicator());

		request.setRequest(createUserRequest);
		CreateUserResponse response = new CreateUserResponse();

		try {
			response = soapClient.CreateUserRequest(request);
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			e.getLocalizedMessage();
			e.getCause();
		}

		System.out.println(response);
		System.out.println(new JSONObject(response).toString());

		return response;
	}

	@Override
	public QueryResponse query(QueryRequestPostman postmanRequest) {
		// TODO Auto-generated method stub
		System.out.println(new JSONObject(postmanRequest).toString());

		Query request = new Query();
		QueryRequest queryRequest = new QueryRequest();

		request.setRequest(queryRequest);

		QueryResponse response = new QueryResponse();

		try {
			response = soapClient.Query(request);
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			e.getLocalizedMessage();
			e.getCause();
		}

		return response;
	}

	@Override
	public NotifyResponse notifyRsa(NotifyRequestPostman postmanRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
