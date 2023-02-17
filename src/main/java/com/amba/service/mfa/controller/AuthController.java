package com.amba.service.mfa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amba.service.mfa.postmanRequest.AnalyzeRequestPostman;
import com.amba.service.mfa.postmanRequest.CreateUserRequestPostman;
import com.amba.service.mfa.postmanRequest.NotifyRequestPostman;
import com.amba.service.mfa.postmanRequest.QueryRequestPostman;
import com.amba.service.mfa.postmanRequest.UpdateUserRequestPostman;
import com.amba.service.mfa.service.AuthService;
import com.amba.service.mfa.stub.client.*;

@RestController
public class AuthController {
    
    @Autowired
    AuthService authService;

    @PostMapping("/analyze")
    public AnalyzeResponse analyze(@RequestBody AnalyzeRequestPostman postmanRequest) {
    	return authService.analyzeUser(postmanRequest);
    }
    
    @PostMapping("/updateUser")
    public UpdateUserResponse update(@RequestBody UpdateUserRequestPostman postmanRequest) {
    	return authService.updateUser(postmanRequest);
    }
    
    @PostMapping("/createUser")
    public CreateUserResponse create(@RequestBody CreateUserRequestPostman postmanRequest) {
    	return authService.createUser(postmanRequest);
    }
    
    @PostMapping("/query")
    public QueryResponse query(@RequestBody QueryRequestPostman postmanRequest) {
    	return authService.query(postmanRequest);
    }
    
    @PostMapping("/notify")
    public NotifyResponse notify(@RequestBody NotifyRequestPostman postmanRequest) {
    	return authService.notifyRsa(postmanRequest);
    }
    
    
}