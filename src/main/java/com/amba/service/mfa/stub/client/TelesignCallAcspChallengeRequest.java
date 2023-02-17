
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelesignCallAcspChallengeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelesignCallAcspChallengeRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.gen.rsaaa.plugin.telesign.com}TelesignGenAcspChallengeRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="template" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="call_forward_action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="verifyMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extensions" type="{http://ws.gen.rsaaa.plugin.telesign.com}TeleSignExtensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelesignCallAcspChallengeRequest", namespace = "http://ws.call.rsaaa.plugin.telesign.com", propOrder = {
    "template",
    "callForwardAction",
    "verifyMethod",
    "extensions"
})
public class TelesignCallAcspChallengeRequest
    extends TelesignGenAcspChallengeRequest
{

    protected String template;
    @XmlElement(name = "call_forward_action")
    protected String callForwardAction;
    protected String verifyMethod;
    protected TeleSignExtensions extensions;

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplate(String value) {
        this.template = value;
    }

    /**
     * Gets the value of the callForwardAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallForwardAction() {
        return callForwardAction;
    }

    /**
     * Sets the value of the callForwardAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallForwardAction(String value) {
        this.callForwardAction = value;
    }

    /**
     * Gets the value of the verifyMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifyMethod() {
        return verifyMethod;
    }

    /**
     * Sets the value of the verifyMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifyMethod(String value) {
        this.verifyMethod = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link TeleSignExtensions }
     *     
     */
    public TeleSignExtensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeleSignExtensions }
     *     
     */
    public void setExtensions(TeleSignExtensions value) {
        this.extensions = value;
    }

}
