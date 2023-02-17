
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrxSignManagementRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrxSignManagementRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}AcspManagementRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="action" type="{http://axis.ws.trxsign.acsp.rsa.com}Action" minOccurs="0"/&gt;
 *         &lt;element name="publicKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entropy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indicies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrxSignManagementRequest", namespace = "http://axis.ws.trxsign.acsp.rsa.com", propOrder = {
    "action",
    "publicKey",
    "entropy",
    "indicies"
})
public class TrxSignManagementRequest
    extends AcspManagementRequest
{

    @XmlSchemaType(name = "string")
    protected Action4 action;
    protected String publicKey;
    protected String entropy;
    protected String indicies;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link Action4 }
     *     
     */
    public Action4 getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action4 }
     *     
     */
    public void setAction(Action4 value) {
        this.action = value;
    }

    /**
     * Gets the value of the publicKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * Sets the value of the publicKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicKey(String value) {
        this.publicKey = value;
    }

    /**
     * Gets the value of the entropy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntropy() {
        return entropy;
    }

    /**
     * Sets the value of the entropy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntropy(String value) {
        this.entropy = value;
    }

    /**
     * Gets the value of the indicies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicies() {
        return indicies;
    }

    /**
     * Sets the value of the indicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicies(String value) {
        this.indicies = value;
    }

}
