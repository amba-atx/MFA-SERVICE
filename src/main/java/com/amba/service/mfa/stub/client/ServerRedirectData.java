
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This defines the Server Redirect Data - returned in an anaylize response for redirection after authentication
 * 
 * <p>Java class for ServerRedirectData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServerRedirectData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="redirectUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="secretKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="redirectReason" type="{http://ws.csd.rsa.com}RedirectReason" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerRedirectData", propOrder = {
    "redirectUrl",
    "secretKey",
    "instanceId",
    "redirectReason"
})
public class ServerRedirectData {

    protected String redirectUrl;
    protected String secretKey;
    protected String instanceId;
    @XmlSchemaType(name = "string")
    protected RedirectReason redirectReason;

    /**
     * Gets the value of the redirectUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * Sets the value of the redirectUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectUrl(String value) {
        this.redirectUrl = value;
    }

    /**
     * Gets the value of the secretKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * Sets the value of the secretKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecretKey(String value) {
        this.secretKey = value;
    }

    /**
     * Gets the value of the instanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Sets the value of the instanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceId(String value) {
        this.instanceId = value;
    }

    /**
     * Gets the value of the redirectReason property.
     * 
     * @return
     *     possible object is
     *     {@link RedirectReason }
     *     
     */
    public RedirectReason getRedirectReason() {
        return redirectReason;
    }

    /**
     * Sets the value of the redirectReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedirectReason }
     *     
     */
    public void setRedirectReason(RedirectReason value) {
        this.redirectReason = value;
    }

}
