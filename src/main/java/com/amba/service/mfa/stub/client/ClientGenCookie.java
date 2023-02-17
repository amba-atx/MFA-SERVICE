
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientGenCookie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientGenCookie"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}DeviceIdentifier"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clientGenCookie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clientFSOCookie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientGenCookie", propOrder = {
    "clientGenCookie",
    "clientFSOCookie"
})
public class ClientGenCookie
    extends DeviceIdentifier
{

    protected String clientGenCookie;
    protected String clientFSOCookie;

    /**
     * Gets the value of the clientGenCookie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientGenCookie() {
        return clientGenCookie;
    }

    /**
     * Sets the value of the clientGenCookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientGenCookie(String value) {
        this.clientGenCookie = value;
    }

    /**
     * Gets the value of the clientFSOCookie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientFSOCookie() {
        return clientFSOCookie;
    }

    /**
     * Sets the value of the clientFSOCookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientFSOCookie(String value) {
        this.clientFSOCookie = value;
    }

}
