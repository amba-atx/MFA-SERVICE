
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChallengeQuestionAuthStatusRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChallengeQuestionAuthStatusRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="payload" type="{http://ws.csd.rsa.com}UnsupportedAuthStatusRequestPayload" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChallengeQuestionAuthStatusRequest", propOrder = {
    "payload"
})
public class ChallengeQuestionAuthStatusRequest {

    protected UnsupportedAuthStatusRequestPayload payload;

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link UnsupportedAuthStatusRequestPayload }
     *     
     */
    public UnsupportedAuthStatusRequestPayload getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsupportedAuthStatusRequestPayload }
     *     
     */
    public void setPayload(UnsupportedAuthStatusRequestPayload value) {
        this.payload = value;
    }

}
