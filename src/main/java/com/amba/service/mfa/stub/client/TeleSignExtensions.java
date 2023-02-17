
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TeleSignExtensions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TeleSignExtensions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="extensionType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="extensionTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeleSignExtensions", namespace = "http://ws.gen.rsaaa.plugin.telesign.com", propOrder = {
    "extensionType",
    "extensionTemplate"
})
public class TeleSignExtensions {

    protected Integer extensionType;
    protected String extensionTemplate;

    /**
     * Gets the value of the extensionType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExtensionType() {
        return extensionType;
    }

    /**
     * Sets the value of the extensionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExtensionType(Integer value) {
        this.extensionType = value;
    }

    /**
     * Gets the value of the extensionTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionTemplate() {
        return extensionTemplate;
    }

    /**
     * Sets the value of the extensionTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionTemplate(String value) {
        this.extensionTemplate = value;
    }

}
