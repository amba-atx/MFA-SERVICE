
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTPChallengeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTPChallengeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}AcspChallengeResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="otp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTPChallengeResponse", propOrder = {
    "otp"
})
public class OTPChallengeResponse
    extends AcspChallengeResponse
{

    protected String otp;

    /**
     * Gets the value of the otp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtp() {
        return otp;
    }

    /**
     * Sets the value of the otp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtp(String value) {
        this.otp = value;
    }

}
