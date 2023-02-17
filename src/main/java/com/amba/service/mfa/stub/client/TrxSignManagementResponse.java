
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrxSignManagementResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrxSignManagementResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}AcspManagementResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ENCRYPTED_HMAC_KEY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrxSignManagementResponse", namespace = "http://axis.ws.trxsign.acsp.rsa.com", propOrder = {
    "encryptedhmackey"
})
public class TrxSignManagementResponse
    extends AcspManagementResponse
{

    @XmlElement(name = "ENCRYPTED_HMAC_KEY")
    protected String encryptedhmackey;

    /**
     * Gets the value of the encryptedhmackey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENCRYPTEDHMACKEY() {
        return encryptedhmackey;
    }

    /**
     * Sets the value of the encryptedhmackey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENCRYPTEDHMACKEY(String value) {
        this.encryptedhmackey = value;
    }

}
