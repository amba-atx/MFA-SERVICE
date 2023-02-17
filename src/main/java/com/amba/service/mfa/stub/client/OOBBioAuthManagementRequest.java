
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OOBBioAuthManagementRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OOBBioAuthManagementRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}AcspManagementRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="action" type="{http://ws.oobbio.csd.rsa.com}Action" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OOBBioAuthManagementRequest", namespace = "http://ws.oobbio.csd.rsa.com", propOrder = {
    "action"
})
public class OOBBioAuthManagementRequest
    extends AcspManagementRequest
{

    @XmlSchemaType(name = "string")
    protected Action3 action;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link Action3 }
     *     
     */
    public Action3 getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action3 }
     *     
     */
    public void setAction(Action3 value) {
        this.action = value;
    }

}
