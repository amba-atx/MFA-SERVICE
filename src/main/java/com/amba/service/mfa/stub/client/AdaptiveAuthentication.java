
package com.amba.service.mfa.stub.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AdaptiveAuthentication", targetNamespace = "http://ws.csd.rsa.com", wsdlLocation = "file:/C:/Users/pratap.sawant/Downloads/lt-service-auth/lt-service-auth/lt-service-auth/src/main/resources/wsdl/AdaptiveAuthentication.wsdl")
public class AdaptiveAuthentication
    extends Service
{

    private final static URL ADAPTIVEAUTHENTICATION_WSDL_LOCATION;
    private final static WebServiceException ADAPTIVEAUTHENTICATION_EXCEPTION;
    private final static QName ADAPTIVEAUTHENTICATION_QNAME = new QName("http://ws.csd.rsa.com", "AdaptiveAuthentication");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/pratap.sawant/Downloads/lt-service-auth/lt-service-auth/lt-service-auth/src/main/resources/wsdl/AdaptiveAuthentication.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADAPTIVEAUTHENTICATION_WSDL_LOCATION = url;
        ADAPTIVEAUTHENTICATION_EXCEPTION = e;
    }

    public AdaptiveAuthentication() {
        super(__getWsdlLocation(), ADAPTIVEAUTHENTICATION_QNAME);
    }

    public AdaptiveAuthentication(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADAPTIVEAUTHENTICATION_QNAME, features);
    }

    public AdaptiveAuthentication(URL wsdlLocation) {
        super(wsdlLocation, ADAPTIVEAUTHENTICATION_QNAME);
    }

    public AdaptiveAuthentication(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADAPTIVEAUTHENTICATION_QNAME, features);
    }

    public AdaptiveAuthentication(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdaptiveAuthentication(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AdaptiveAuthenticationInterface
     */
    @WebEndpoint(name = "AdaptiveAuthentication")
    public AdaptiveAuthenticationInterface getAdaptiveAuthentication() {
        return super.getPort(new QName("http://ws.csd.rsa.com", "AdaptiveAuthentication"), AdaptiveAuthenticationInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdaptiveAuthenticationInterface
     */
    @WebEndpoint(name = "AdaptiveAuthentication")
    public AdaptiveAuthenticationInterface getAdaptiveAuthentication(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.csd.rsa.com", "AdaptiveAuthentication"), AdaptiveAuthenticationInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADAPTIVEAUTHENTICATION_EXCEPTION!= null) {
            throw ADAPTIVEAUTHENTICATION_EXCEPTION;
        }
        return ADAPTIVEAUTHENTICATION_WSDL_LOCATION;
    }

}
