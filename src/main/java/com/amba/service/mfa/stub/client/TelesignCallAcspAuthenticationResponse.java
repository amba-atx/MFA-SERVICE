
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelesignCallAcspAuthenticationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelesignCallAcspAuthenticationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.gen.rsaaa.plugin.telesign.com}TelesignGenAcspAuthenticationResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="telesign_status_code" type="{http://ws.call.rsaaa.plugin.telesign.com}StatusCodeEnum"/&gt;
 *         &lt;element name="call_forwarding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelesignCallAcspAuthenticationResponse", namespace = "http://ws.call.rsaaa.plugin.telesign.com", propOrder = {
    "telesignStatusCode",
    "callForwarding"
})
public class TelesignCallAcspAuthenticationResponse
    extends TelesignGenAcspAuthenticationResponse
{

    @XmlElement(name = "telesign_status_code", required = true)
    @XmlSchemaType(name = "string")
    protected StatusCodeEnum telesignStatusCode;
    @XmlElement(name = "call_forwarding")
    protected String callForwarding;

    /**
     * Gets the value of the telesignStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCodeEnum }
     *     
     */
    public StatusCodeEnum getTelesignStatusCode() {
        return telesignStatusCode;
    }

    /**
     * Sets the value of the telesignStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCodeEnum }
     *     
     */
    public void setTelesignStatusCode(StatusCodeEnum value) {
        this.telesignStatusCode = value;
    }

    /**
     * Gets the value of the callForwarding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallForwarding() {
        return callForwarding;
    }

    /**
     * Sets the value of the callForwarding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallForwarding(String value) {
        this.callForwarding = value;
    }

}
