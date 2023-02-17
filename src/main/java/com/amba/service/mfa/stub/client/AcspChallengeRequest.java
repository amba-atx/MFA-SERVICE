
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This type defines Interface for Challenge Request
 * 
 * <p>Java class for AcspChallengeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcspChallengeRequest"&gt;
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
@XmlType(name = "AcspChallengeRequest")
@XmlSeeAlso({
    OTPChallengeRequest.class,
    OTPSMSChallengeRequest.class,
    OTPEmailhallengeRequest.class,
    KBAChallengeRequest.class,
    OOBGenChallengeRequest.class,
    OOBBioAuthChallengeRequest.class,
    TelesignGenAcspChallengeRequest.class,
    TrxSignChallengeRequest.class
})
public abstract class AcspChallengeRequest {


}
