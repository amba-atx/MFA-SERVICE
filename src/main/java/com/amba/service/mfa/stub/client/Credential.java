
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This defines what makes up a credential
 * 
 * <p>Java class for Credential complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Credential"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="credentialStatus" type="{http://ws.csd.rsa.com}CredentialStatus" minOccurs="0"/&gt;
 *         &lt;element name="credentialType" type="{http://ws.csd.rsa.com}CredentialType" minOccurs="0"/&gt;
 *         &lt;element name="genericCredentialType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Credential", propOrder = {
    "credentialStatus",
    "credentialType",
    "genericCredentialType"
})
public class Credential {

    @XmlSchemaType(name = "string")
    protected CredentialStatus credentialStatus;
    @XmlSchemaType(name = "string")
    protected CredentialType credentialType;
    protected String genericCredentialType;

    /**
     * Gets the value of the credentialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialStatus }
     *     
     */
    public CredentialStatus getCredentialStatus() {
        return credentialStatus;
    }

    /**
     * Sets the value of the credentialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialStatus }
     *     
     */
    public void setCredentialStatus(CredentialStatus value) {
        this.credentialStatus = value;
    }

    /**
     * Gets the value of the credentialType property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialType }
     *     
     */
    public CredentialType getCredentialType() {
        return credentialType;
    }

    /**
     * Sets the value of the credentialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialType }
     *     
     */
    public void setCredentialType(CredentialType value) {
        this.credentialType = value;
    }

    /**
     * Gets the value of the genericCredentialType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericCredentialType() {
        return genericCredentialType;
    }

    /**
     * Sets the value of the genericCredentialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericCredentialType(String value) {
        this.genericCredentialType = value;
    }

}
