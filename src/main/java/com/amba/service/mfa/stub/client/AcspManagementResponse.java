
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This type defines Interface for Management Response
 * 
 * <p>Java class for AcspManagementResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcspManagementResponse"&gt;
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
@XmlType(name = "AcspManagementResponse")
@XmlSeeAlso({
    OTPManagementResponse.class,
    OTPSMSManagementResponse.class,
    OTPEmailanagementResponse.class,
    KBAManagementResponse.class,
    OOBGenManagementResponse.class,
    OOBBioAuthManagementResponse.class,
    TelesignGenAcspManagementResponse.class,
    TrxSignManagementResponse.class
})
public abstract class AcspManagementResponse {


}
