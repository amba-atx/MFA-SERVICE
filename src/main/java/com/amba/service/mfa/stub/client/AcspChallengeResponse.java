
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This type defines Interface for Challenge Response
 * 
 * <p>Java class for AcspChallengeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcspChallengeResponse"&gt;
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
@XmlType(name = "AcspChallengeResponse")
@XmlSeeAlso({
    OTPChallengeResponse.class,
    OTPSMSChallengeResponse.class,
    OTPEmailChallengeResponse.class,
    KBAChallengeResponse.class,
    OOBGenChallengeResponse.class,
    OOBBioAuthChallengeResponse.class,
    TelesignGenAcspChallengeResponse.class,
    TrxSignChallengeResponse.class
})
public abstract class AcspChallengeResponse {


}
