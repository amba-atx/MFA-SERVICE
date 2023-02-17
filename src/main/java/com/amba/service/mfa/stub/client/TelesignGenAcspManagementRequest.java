
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelesignGenAcspManagementRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelesignGenAcspManagementRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}AcspManagementRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actionType" type="{http://ws.gen.rsaaa.plugin.telesign.com}ActionTypeEnum"/&gt;
 *         &lt;element name="phoneNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "TelesignGenAcspManagementRequest", namespace = "http://ws.gen.rsaaa.plugin.telesign.com", propOrder = {
    "actionType",
    "phoneNo",
    "language",
    "extensions"
})
@XmlSeeAlso({
    TelesignCallAcspManagementRequest.class,
    TelesignSmsAcspManagementRequest.class
})
public abstract class TelesignGenAcspManagementRequest
    extends AcspManagementRequest
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ActionTypeEnum actionType;
    protected String phoneNo;
    protected String language;
    protected TeleSignExtensions extensions;

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link ActionTypeEnum }
     *     
     */
    public ActionTypeEnum getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionTypeEnum }
     *     
     */
    public void setActionType(ActionTypeEnum value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the phoneNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * Sets the value of the phoneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNo(String value) {
        this.phoneNo = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
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
