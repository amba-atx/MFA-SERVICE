
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OobEmailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OobEmailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="payload" type="{http://ws.csd.rsa.com}OOBInfoRequestPayload" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OobEmailData", propOrder = {
    "payload"
})
public class OobEmailData {

    protected OOBInfoRequestPayload payload;

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link OOBInfoRequestPayload }
     *     
     */
    public OOBInfoRequestPayload getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link OOBInfoRequestPayload }
     *     
     */
    public void setPayload(OOBInfoRequestPayload value) {
        this.payload = value;
    }

}
