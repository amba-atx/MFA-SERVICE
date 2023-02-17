
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelesignSmsAcspChallengeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelesignSmsAcspChallengeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.gen.rsaaa.plugin.telesign.com}TelesignGenAcspChallengeResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="telesign_status_code" type="{http://ws.sms.rsaaa.plugin.telesign.com}StatusCodeEnum"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelesignSmsAcspChallengeResponse", namespace = "http://ws.sms.rsaaa.plugin.telesign.com", propOrder = {
    "telesignStatusCode"
})
public class TelesignSmsAcspChallengeResponse
    extends TelesignGenAcspChallengeResponse
{

    @XmlElement(name = "telesign_status_code", required = true)
    @XmlSchemaType(name = "string")
    protected StatusCodeEnum2 telesignStatusCode;

    /**
     * Gets the value of the telesignStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCodeEnum2 }
     *     
     */
    public StatusCodeEnum2 getTelesignStatusCode() {
        return telesignStatusCode;
    }

    /**
     * Sets the value of the telesignStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCodeEnum2 }
     *     
     */
    public void setTelesignStatusCode(StatusCodeEnum2 value) {
        this.telesignStatusCode = value;
    }

}
