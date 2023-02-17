package com.amba.service.mfa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;

import javax.xml.bind.Marshaller;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class BeanConfig {
    @Bean
    public Jaxb2Marshaller marshaller()  {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("com.amba.service.mfa.stub.client");
        Map<String, Object> mp = new HashMap<String, Object>();
        mp.put(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.setMarshallerProperties(mp);
        // for SSL connections installs all-trusting trust-manager
        return marshaller;
    }

    @Bean
    public SoapClient soapConnector(Jaxb2Marshaller marshaller) {
        SoapClient client = new SoapClient();
        client.setDefaultUri("https://amba.us1.qeadaptiveauth.com/AdaptiveAuthentication/services/AdaptiveAuthentication/");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        ClientInterceptor[] interceptors = new ClientInterceptor[] {securityInterceptor()};
        client.setInterceptors(interceptors);
        return client;
    }
    @Bean
    public Wss4jSecurityInterceptor securityInterceptor(){
        Wss4jSecurityInterceptor wss4jSecurityInterceptor = new Wss4jSecurityInterceptor();
        wss4jSecurityInterceptor.setSecurementActions("UsernameToken");
        wss4jSecurityInterceptor.setSecurementUsername("RSASoapUser");
        wss4jSecurityInterceptor.setSecurementPassword("AtlantaGA@092022");
        wss4jSecurityInterceptor.setSecurementUsernameTokenNonce(true);
        wss4jSecurityInterceptor.setSecurementMustUnderstand(true);
        wss4jSecurityInterceptor.setSecurementPasswordType("PasswordText");
        wss4jSecurityInterceptor.setSecurementUsernameTokenCreated(true);
        return wss4jSecurityInterceptor;
    }

}