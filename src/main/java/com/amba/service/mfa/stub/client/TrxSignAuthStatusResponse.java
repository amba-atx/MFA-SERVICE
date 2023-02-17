
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrxSignAuthStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrxSignAuthStatusResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}AcspAuthStatusResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bioValidation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrxSignAuthStatusResponse", namespace = "http://axis.ws.trxsign.acsp.rsa.com", propOrder = {
    "bioValidation"
})
public class TrxSignAuthStatusResponse
    extends AcspAuthStatusResponse
{

    protected Boolean bioValidation;

    /**
     * Gets the value of the bioValidation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBioValidation() {
        return bioValidation;
    }

    /**
     * Sets the value of the bioValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBioValidation(Boolean value) {
        this.bioValidation = value;
    }

}
