
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrxSignAuthenticationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrxSignAuthenticationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}AcspAuthenticationRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isOffline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="approved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="bioValidation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="trxSignature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrxSignAuthenticationRequest", namespace = "http://axis.ws.trxsign.acsp.rsa.com", propOrder = {
    "isOffline",
    "approved",
    "bioValidation",
    "trxSignature"
})
public class TrxSignAuthenticationRequest
    extends AcspAuthenticationRequest
{

    protected Boolean isOffline;
    protected Boolean approved;
    protected Boolean bioValidation;
    protected String trxSignature;

    /**
     * Gets the value of the isOffline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOffline() {
        return isOffline;
    }

    /**
     * Sets the value of the isOffline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOffline(Boolean value) {
        this.isOffline = value;
    }

    /**
     * Gets the value of the approved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproved() {
        return approved;
    }

    /**
     * Sets the value of the approved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproved(Boolean value) {
        this.approved = value;
    }

    /**
     * Gets the value of the bioValidation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBioValidation() {
        return bioValidation;
    }

    /**
     * Sets the value of the bioValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBioValidation(Boolean value) {
        this.bioValidation = value;
    }

    /**
     * Gets the value of the trxSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxSignature() {
        return trxSignature;
    }

    /**
     * Sets the value of the trxSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrxSignature(String value) {
        this.trxSignature = value;
    }

}
