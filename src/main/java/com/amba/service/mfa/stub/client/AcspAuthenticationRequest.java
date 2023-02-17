
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This type defines Interface for Authentication Request
 * 
 * <p>Java class for AcspAuthenticationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcspAuthenticationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcspAuthenticationRequest")
@XmlSeeAlso({
    OTPAuthenticationRequest.class,
    OTPSMSAuthenticationRequest.class,
    OTPEmailAuthenticationRequest.class,
    KBAAuthenticationRequest.class,
    OOBGenAuthenticationRequest.class,
    OOBBioAuthAuthenticationRequest.class,
    TelesignGenAcspAuthenticationRequest.class,
    TrxSignAuthenticationRequest.class
})
public abstract class AcspAuthenticationRequest {


}
