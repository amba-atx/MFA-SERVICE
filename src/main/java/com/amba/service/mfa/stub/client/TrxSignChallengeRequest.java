
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrxSignChallengeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrxSignChallengeRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}AcspChallengeRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="payload" type="{http://axis.ws.trxsign.acsp.rsa.com}Payload" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrxSignChallengeRequest", namespace = "http://axis.ws.trxsign.acsp.rsa.com", propOrder = {
    "payload"
})
public class TrxSignChallengeRequest
    extends AcspChallengeRequest
{

    protected Payload payload;

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link Payload }
     *     
     */
    public Payload getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payload }
     *     
     */
    public void setPayload(Payload value) {
        this.payload = value;
    }

}
