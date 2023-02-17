
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This type defines the Credential Management Request Payload
 * 
 * <p>Java class for AcspManagementRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcspManagementRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="credentialProvisioningStatus" type="{http://ws.csd.rsa.com}CredentialProvisioningStatus" minOccurs="0"/&gt;
 *         &lt;element name="payload" type="{http://ws.csd.rsa.com}AcspManagementRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcspManagementRequestData", propOrder = {
    "credentialProvisioningStatus",
    "payload"
})
public class AcspManagementRequestData {

    @XmlSchemaType(name = "string")
    protected CredentialProvisioningStatus credentialProvisioningStatus;
    protected AcspManagementRequest payload;

    /**
     * Gets the value of the credentialProvisioningStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialProvisioningStatus }
     *     
     */
    public CredentialProvisioningStatus getCredentialProvisioningStatus() {
        return credentialProvisioningStatus;
    }

    /**
     * Sets the value of the credentialProvisioningStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialProvisioningStatus }
     *     
     */
    public void setCredentialProvisioningStatus(CredentialProvisioningStatus value) {
        this.credentialProvisioningStatus = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link AcspManagementRequest }
     *     
     */
    public AcspManagementRequest getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcspManagementRequest }
     *     
     */
    public void setPayload(AcspManagementRequest value) {
        this.payload = value;
    }

}
