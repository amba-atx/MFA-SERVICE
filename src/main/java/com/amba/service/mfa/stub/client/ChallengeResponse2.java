
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChallengeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChallengeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}GenericResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="credentialChallengeList" type="{http://ws.csd.rsa.com}CredentialChallengeList" minOccurs="0"/&gt;
 *         &lt;element name="deviceManagementResponse" type="{http://ws.csd.rsa.com}DeviceManagementResponsePayload" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChallengeResponse", propOrder = {
    "credentialChallengeList",
    "deviceManagementResponse"
})
public class ChallengeResponse2
    extends GenericResponse
{

    protected CredentialChallengeList credentialChallengeList;
    protected DeviceManagementResponsePayload deviceManagementResponse;

    /**
     * Gets the value of the credentialChallengeList property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialChallengeList }
     *     
     */
    public CredentialChallengeList getCredentialChallengeList() {
        return credentialChallengeList;
    }

    /**
     * Sets the value of the credentialChallengeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialChallengeList }
     *     
     */
    public void setCredentialChallengeList(CredentialChallengeList value) {
        this.credentialChallengeList = value;
    }

    /**
     * Gets the value of the deviceManagementResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceManagementResponsePayload }
     *     
     */
    public DeviceManagementResponsePayload getDeviceManagementResponse() {
        return deviceManagementResponse;
    }

    /**
     * Sets the value of the deviceManagementResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceManagementResponsePayload }
     *     
     */
    public void setDeviceManagementResponse(DeviceManagementResponsePayload value) {
        this.deviceManagementResponse = value;
    }

}
