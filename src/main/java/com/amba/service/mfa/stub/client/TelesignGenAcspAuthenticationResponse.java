
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelesignGenAcspAuthenticationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelesignGenAcspAuthenticationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}AcspAuthenticationResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="telesign_verify_state" type="{http://ws.gen.rsaaa.plugin.telesign.com}VerifyStateEnum"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelesignGenAcspAuthenticationResponse", namespace = "http://ws.gen.rsaaa.plugin.telesign.com", propOrder = {
    "telesignVerifyState"
})
@XmlSeeAlso({
    TelesignCallAcspAuthenticationResponse.class,
    TelesignSmsAcspAuthenticationResponse.class
})
public abstract class TelesignGenAcspAuthenticationResponse
    extends AcspAuthenticationResponse
{

    @XmlElement(name = "telesign_verify_state", required = true)
    @XmlSchemaType(name = "string")
    protected VerifyStateEnum telesignVerifyState;

    /**
     * Gets the value of the telesignVerifyState property.
     * 
     * @return
     *     possible object is
     *     {@link VerifyStateEnum }
     *     
     */
    public VerifyStateEnum getTelesignVerifyState() {
        return telesignVerifyState;
    }

    /**
     * Sets the value of the telesignVerifyState property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifyStateEnum }
     *     
     */
    public void setTelesignVerifyState(VerifyStateEnum value) {
        this.telesignVerifyState = value;
    }

}
