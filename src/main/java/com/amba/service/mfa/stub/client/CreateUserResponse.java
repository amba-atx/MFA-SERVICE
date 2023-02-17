
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
 *         &lt;element name="createUserReturn" type="{http://ws.csd.rsa.com}CreateUserResponse"/&gt;
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
    "createUserReturn"
})
@XmlRootElement(name = "createUserResponse")
public class CreateUserResponse {

    @XmlElement(required = true)
    protected CreateUserResponse2 createUserReturn;

    /**
     * Gets the value of the createUserReturn property.
     * 
     * @return
     *     possible object is
     *     {@link CreateUserResponse2 }
     *     
     */
    public CreateUserResponse2 getCreateUserReturn() {
        return createUserReturn;
    }

    /**
     * Sets the value of the createUserReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateUserResponse2 }
     *     
     */
    public void setCreateUserReturn(CreateUserResponse2 value) {
        this.createUserReturn = value;
    }

}
