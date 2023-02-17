
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelesignSmsAcspChallengeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelesignSmsAcspChallengeRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.gen.rsaaa.plugin.telesign.com}TelesignGenAcspChallengeRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="template" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelesignSmsAcspChallengeRequest", namespace = "http://ws.sms.rsaaa.plugin.telesign.com", propOrder = {
    "template"
})
public class TelesignSmsAcspChallengeRequest
    extends TelesignGenAcspChallengeRequest
{

    protected String template;

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

}
