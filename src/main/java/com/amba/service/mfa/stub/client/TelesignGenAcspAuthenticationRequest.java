
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelesignGenAcspAuthenticationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelesignGenAcspAuthenticationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}AcspAuthenticationRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="verify_code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelesignGenAcspAuthenticationRequest", namespace = "http://ws.gen.rsaaa.plugin.telesign.com", propOrder = {
    "verifyCode"
})
@XmlSeeAlso({
    TelesignCallAcspAuthenticationRequest.class,
    TelesignSmsAcspAuthenticationRequest.class
})
public abstract class TelesignGenAcspAuthenticationRequest
    extends AcspAuthenticationRequest
{

    @XmlElement(name = "verify_code", required = true)
    protected String verifyCode;

    /**
     * Gets the value of the verifyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifyCode() {
        return verifyCode;
    }

    /**
     * Sets the value of the verifyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifyCode(String value) {
        this.verifyCode = value;
    }

}
