
package com.amba.service.mfa.stub.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AdaptiveAuthenticationInterface", targetNamespace = "http://ws.csd.rsa.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AdaptiveAuthenticationInterface {


    /**
     * 
     * @param request
     * @return
     *     returns com.lt.auth.service.stub.client.NotifyResponse2
     * @throws AdaptiveAuthenticationSoapFault
     */
    @WebMethod(action = "rsa:notify:Notify")
    @WebResult(name = "notifyReturn", targetNamespace = "http://ws.csd.rsa.com")
    @RequestWrapper(localName = "notify", targetNamespace = "http://ws.csd.rsa.com", className = "com.lt.auth.service.stub.client.Notify")
    @ResponseWrapper(localName = "notifyResponse", targetNamespace = "http://ws.csd.rsa.com", className = "com.lt.auth.service.stub.client.NotifyResponse")
    public NotifyResponse2 notify(
        @WebParam(name = "request", targetNamespace = "http://ws.csd.rsa.com")
        NotifyRequest request)
        throws AdaptiveAuthenticationSoapFault
    ;

    /**
     * 
     * @param request
     * @return
     *     returns com.lt.auth.service.stub.client.QueryResponse2
     * @throws AdaptiveAuthenticationSoapFault
     */
    @WebMethod(action = "rsa:query:Query")
    @WebResult(name = "queryReturn", targetNamespace = "http://ws.csd.rsa.com")
    @RequestWrapper(localName = "query", targetNamespace = "http://ws.csd.rsa.com", className = "com.lt.auth.service.stub.client.Query")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "http://ws.csd.rsa.com", className = "com.lt.auth.service.stub.client.QueryResponse")
    public QueryResponse2 query(
        @WebParam(name = "request", targetNamespace = "http://ws.csd.rsa.com")
        QueryRequest request)
        throws AdaptiveAuthenticationSoapFault
    ;

    /**
     * 
     * @param request
     * @return
     *     returns com.lt.auth.service.stub.client.AnalyzeResponse2
     * @throws AdaptiveAuthenticationSoapFault
     */
    @WebMethod(action = "rsa:analyze:Analyze")
    @WebResult(name = "analyzeReturn", targetNamespace = "http://ws.csd.rsa.com")
    @RequestWrapper(localName = "analyze", targetNamespace = "http://ws.csd.rsa.com", className = "com.lt.auth.service.stub.client.Analyze")
    @ResponseWrapper(localName = "analyzeResponse", targetNamespace = "http://ws.csd.rsa.com", className = "com.lt.auth.service.stub.client.AnalyzeResponse")
    public AnalyzeResponse2 analyze(
        @WebParam(name = "request", targetNamespace = "http://ws.csd.rsa.com")
        AnalyzeRequest request)
        throws AdaptiveAuthenticationSoapFault
    ;

    /**
     * 
     * @param request
     * @return
     *     returns com.lt.auth.service.stub.client.AuthenticateResponse2
     * @throws AdaptiveAuthenticationSoapFault
     */
    @WebMethod(action = "rsa:authenticate:Authenticate")
    @WebResult(name = "authenticateReturn", targetNamespace = "http://ws.csd.rsa.com")
    @RequestWrapper(localName = "authenticate", targetNamespace = "http://ws.csd.rsa.com", className = "com.lt.auth.service.stub.client.Authenticate")
    @ResponseWrapper(localName = "authenticateResponse", targetNamespace = "http://ws.csd.rsa.com", className = "com.lt.auth.service.stub.client.AuthenticateResponse")
    public AuthenticateResponse2 authenticate(
        @WebParam(name = "request", targetNamespace = "http://ws.csd.rsa.com")
        AuthenticateRequest request)
        throws AdaptiveAuthenticationSoapFault
    ;

    /**
     * 
     * @param request
     * @return
     *     returns com.lt.auth.service.stub.client.ChallengeResponse2
     * @throws AdaptiveAuthenticationSoapFault
     */
    @WebMethod(action = "rsa:challenge:Challenge")
    @WebResult(name = "challengeReturn", targetNamespace = "http://ws.csd.rsa.com")
    @RequestWrapper(localName = "challenge", targetNamespace = "http://ws.csd.rsa.com", className = "com.lt.auth.service.stub.client.Challenge")
    @ResponseWrapper(localName = "challengeResponse", targetNamespace = "http://ws.csd.rsa.com", className = "com.lt.auth.service.stub.client.ChallengeResponse")
    public ChallengeResponse2 challenge(
        @WebParam(name = "request", targetNamespace = "http://ws.csd.rsa.com")
        ChallengeRequest request)
        throws AdaptiveAuthenticationSoapFault
    ;

    /**
     * 
     * @param request
     * @return
     *     returns com.lt.auth.service.stub.client.CreateUserResponse2
     * @throws AdaptiveAuthenticationSoapFault
     */
    @WebMethod(action = "rsa:createuser:CreateUser")
    @WebResult(name = "createUserReturn", targetNamespace = "http://ws.csd.rsa.com")
    @RequestWrapper(localName = "createUser", targetNamespace = "http://ws.csd.rsa.com", className = "com.lt.auth.service.stub.client.CreateUser")
    @ResponseWrapper(localName = "createUserResponse", targetNamespace = "http://ws.csd.rsa.com", className = "com.lt.auth.service.stub.client.CreateUserResponse")
    public CreateUserResponse2 createUser(
        @WebParam(name = "request", targetNamespace = "http://ws.csd.rsa.com")
        CreateUserRequest request)
        throws AdaptiveAuthenticationSoapFault
    ;

    /**
     * 
     * @param request
     * @return
     *     returns com.lt.auth.service.stub.client.QueryAuthStatusResponse2
     * @throws AdaptiveAuthenticationSoapFault
     */
    @WebMethod(action = "rsa:queryauthstatus:QueryAuthStatus")
    @WebResult(name = "queryAuthStatusReturn", targetNamespace = "http://ws.csd.rsa.com")
    @RequestWrapper(localName = "queryAuthStatus", targetNamespace = "http://ws.csd.rsa.com", className = "com.lt.auth.service.stub.client.QueryAuthStatus")
    @ResponseWrapper(localName = "queryAuthStatusResponse", targetNamespace = "http://ws.csd.rsa.com", className = "com.lt.auth.service.stub.client.QueryAuthStatusResponse")
    public QueryAuthStatusResponse2 queryAuthStatus(
        @WebParam(name = "request", targetNamespace = "http://ws.csd.rsa.com")
        QueryAuthStatusRequest request)
        throws AdaptiveAuthenticationSoapFault
    ;

    /**
     * 
     * @param request
     * @return
     *     returns com.lt.auth.service.stub.client.UpdateUserResponse2
     * @throws AdaptiveAuthenticationSoapFault
     */
    @WebMethod(action = "rsa:udpateuser:UpdateUser")
    @WebResult(name = "updateUserReturn", targetNamespace = "http://ws.csd.rsa.com")
    @RequestWrapper(localName = "updateUser", targetNamespace = "http://ws.csd.rsa.com", className = "com.lt.auth.service.stub.client.UpdateUser")
    @ResponseWrapper(localName = "updateUserResponse", targetNamespace = "http://ws.csd.rsa.com", className = "com.lt.auth.service.stub.client.UpdateUserResponse")
    public UpdateUserResponse2 updateUser(
        @WebParam(name = "request", targetNamespace = "http://ws.csd.rsa.com")
        UpdateUserRequest request)
        throws AdaptiveAuthenticationSoapFault
    ;

}
