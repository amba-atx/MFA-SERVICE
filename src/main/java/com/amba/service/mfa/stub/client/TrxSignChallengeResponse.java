
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrxSignChallengeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrxSignChallengeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}AcspChallengeResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ENCRYPTED_KEY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENCRYPTED_TRX_PAYLOAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="correlationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrxSignChallengeResponse", namespace = "http://axis.ws.trxsign.acsp.rsa.com", propOrder = {
    "encryptedkey",
    "encryptedtrxpayload",
    "correlationId"
})
public class TrxSignChallengeResponse
    extends AcspChallengeResponse
{

    @XmlElement(name = "ENCRYPTED_KEY")
    protected String encryptedkey;
    @XmlElement(name = "ENCRYPTED_TRX_PAYLOAD")
    protected String encryptedtrxpayload;
    protected String correlationId;

    /**
     * Gets the value of the encryptedkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENCRYPTEDKEY() {
        return encryptedkey;
    }

    /**
     * Sets the value of the encryptedkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENCRYPTEDKEY(String value) {
        this.encryptedkey = value;
    }

    /**
     * Gets the value of the encryptedtrxpayload property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENCRYPTEDTRXPAYLOAD() {
        return encryptedtrxpayload;
    }

    /**
     * Sets the value of the encryptedtrxpayload property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENCRYPTEDTRXPAYLOAD(String value) {
        this.encryptedtrxpayload = value;
    }

    /**
     * Gets the value of the correlationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationId() {
        return correlationId;
    }

    /**
     * Sets the value of the correlationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationId(String value) {
        this.correlationId = value;
    }

}
