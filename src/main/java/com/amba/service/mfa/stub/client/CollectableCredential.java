
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This defines the collectable credential types
 * 
 * <p>Java class for CollectableCredential complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollectableCredential"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="collectionReason" type="{http://ws.csd.rsa.com}CollectionReason" minOccurs="0"/&gt;
 *         &lt;element name="collectionType" type="{http://ws.csd.rsa.com}CollectionType" minOccurs="0"/&gt;
 *         &lt;element name="credentialType" type="{http://ws.csd.rsa.com}CredentialType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectableCredential", propOrder = {
    "collectionReason",
    "collectionType",
    "credentialType"
})
public class CollectableCredential {

    @XmlSchemaType(name = "string")
    protected CollectionReason collectionReason;
    @XmlSchemaType(name = "string")
    protected CollectionType collectionType;
    @XmlSchemaType(name = "string")
    protected CredentialType credentialType;

    /**
     * Gets the value of the collectionReason property.
     * 
     * @return
     *     possible object is
     *     {@link CollectionReason }
     *     
     */
    public CollectionReason getCollectionReason() {
        return collectionReason;
    }

    /**
     * Sets the value of the collectionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionReason }
     *     
     */
    public void setCollectionReason(CollectionReason value) {
        this.collectionReason = value;
    }

    /**
     * Gets the value of the collectionType property.
     * 
     * @return
     *     possible object is
     *     {@link CollectionType }
     *     
     */
    public CollectionType getCollectionType() {
        return collectionType;
    }

    /**
     * Sets the value of the collectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionType }
     *     
     */
    public void setCollectionType(CollectionType value) {
        this.collectionType = value;
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

}
