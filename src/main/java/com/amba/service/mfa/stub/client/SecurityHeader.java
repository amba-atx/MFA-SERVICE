
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This identifies the credential used to authenticate the caller to the RSA System
 * 
 * <p>Java class for SecurityHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callerCredential" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="callerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="method" type="{http://ws.csd.rsa.com}AuthorizationMethod"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityHeader", propOrder = {
    "callerCredential",
    "callerId",
    "method"
})
public class SecurityHeader {

    @XmlElement(required = true)
    protected String callerCredential;
    @XmlElement(required = true)
    protected String callerId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AuthorizationMethod method;

    /**
     * Gets the value of the callerCredential property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerCredential() {
        return callerCredential;
    }

    /**
     * Sets the value of the callerCredential property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerCredential(String value) {
        this.callerCredential = value;
    }

    /**
     * Gets the value of the callerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerId() {
        return callerId;
    }

    /**
     * Sets the value of the callerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerId(String value) {
        this.callerId = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationMethod }
     *     
     */
    public AuthorizationMethod getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationMethod }
     *     
     */
    public void setMethod(AuthorizationMethod value) {
        this.method = value;
    }

}
