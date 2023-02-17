
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KBAManagementRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KBAManagementRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}AcspManagementRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="action" type="{http://ws.kba.csd.rsa.com}Action" minOccurs="0"/&gt;
 *         &lt;element name="personInfo" type="{http://ws.kba.csd.rsa.com}PersonInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KBAManagementRequest", namespace = "http://ws.kba.csd.rsa.com", propOrder = {
    "action",
    "personInfo"
})
public class KBAManagementRequest
    extends AcspManagementRequest
{

    @XmlSchemaType(name = "string")
    protected Action action;
    protected PersonInfo personInfo;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setAction(Action value) {
        this.action = value;
    }

    /**
     * Gets the value of the personInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInfo }
     *     
     */
    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    /**
     * Sets the value of the personInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfo }
     *     
     */
    public void setPersonInfo(PersonInfo value) {
        this.personInfo = value;
    }

}
