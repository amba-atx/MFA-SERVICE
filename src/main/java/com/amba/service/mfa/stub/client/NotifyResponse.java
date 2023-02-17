
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="notifyReturn" type="{http://ws.csd.rsa.com}NotifyResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "notifyReturn"
})
@XmlRootElement(name = "notifyResponse")
public class NotifyResponse {

    @XmlElement(required = true)
    protected NotifyResponse2 notifyReturn;

    /**
     * Gets the value of the notifyReturn property.
     * 
     * @return
     *     possible object is
     *     {@link NotifyResponse2 }
     *     
     */
    public NotifyResponse2 getNotifyReturn() {
        return notifyReturn;
    }

    /**
     * Sets the value of the notifyReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifyResponse2 }
     *     
     */
    public void setNotifyReturn(NotifyResponse2 value) {
        this.notifyReturn = value;
    }

}
