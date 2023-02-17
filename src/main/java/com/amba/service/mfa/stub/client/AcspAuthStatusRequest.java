
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This type defines Interface for AuthStatus Request
 * 
 * <p>Java class for AcspAuthStatusRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcspAuthStatusRequest"&gt;
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
@XmlType(name = "AcspAuthStatusRequest")
@XmlSeeAlso({
    OTPAuthStatusRequest.class,
    OTPSMSAuthStatusRequest.class,
    OTPEmailAuthStatusRequest.class,
    KBAAuthStatusRequest.class,
    OOBGenAuthStatusRequest.class,
    OOBBioAuthAuthStatusRequest.class,
    TelesignGenAcspAuthStatusRequest.class,
    TrxSignAuthStatusRequest.class
})
public abstract class AcspAuthStatusRequest {


}
