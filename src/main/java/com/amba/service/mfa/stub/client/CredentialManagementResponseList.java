
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CredentialManagementResponseList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CredentialManagementResponseList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}CredentialResponseList"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="challengeQuestionManagementResponse" type="{http://ws.csd.rsa.com}ChallengeQuestionManagementResponse" minOccurs="0"/&gt;
 *         &lt;element name="oobEmailManagementResponse" type="{http://ws.csd.rsa.com}OobEmailManagementResponse" minOccurs="0"/&gt;
 *         &lt;element name="oobPhoneManagementResponse" type="{http://ws.csd.rsa.com}OobPhoneManagementResponse" minOccurs="0"/&gt;
 *         &lt;element name="acspManagementResponseData" type="{http://ws.csd.rsa.com}AcspManagementResponseData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CredentialManagementResponseList", propOrder = {
    "challengeQuestionManagementResponse",
    "oobEmailManagementResponse",
    "oobPhoneManagementResponse",
    "acspManagementResponseData"
})
public class CredentialManagementResponseList
    extends CredentialResponseList
{

    protected ChallengeQuestionManagementResponse challengeQuestionManagementResponse;
    protected OobEmailManagementResponse oobEmailManagementResponse;
    protected OobPhoneManagementResponse oobPhoneManagementResponse;
    protected AcspManagementResponseData acspManagementResponseData;

    /**
     * Gets the value of the challengeQuestionManagementResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ChallengeQuestionManagementResponse }
     *     
     */
    public ChallengeQuestionManagementResponse getChallengeQuestionManagementResponse() {
        return challengeQuestionManagementResponse;
    }

    /**
     * Sets the value of the challengeQuestionManagementResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChallengeQuestionManagementResponse }
     *     
     */
    public void setChallengeQuestionManagementResponse(ChallengeQuestionManagementResponse value) {
        this.challengeQuestionManagementResponse = value;
    }

    /**
     * Gets the value of the oobEmailManagementResponse property.
     * 
     * @return
     *     possible object is
     *     {@link OobEmailManagementResponse }
     *     
     */
    public OobEmailManagementResponse getOobEmailManagementResponse() {
        return oobEmailManagementResponse;
    }

    /**
     * Sets the value of the oobEmailManagementResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link OobEmailManagementResponse }
     *     
     */
    public void setOobEmailManagementResponse(OobEmailManagementResponse value) {
        this.oobEmailManagementResponse = value;
    }

    /**
     * Gets the value of the oobPhoneManagementResponse property.
     * 
     * @return
     *     possible object is
     *     {@link OobPhoneManagementResponse }
     *     
     */
    public OobPhoneManagementResponse getOobPhoneManagementResponse() {
        return oobPhoneManagementResponse;
    }

    /**
     * Sets the value of the oobPhoneManagementResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link OobPhoneManagementResponse }
     *     
     */
    public void setOobPhoneManagementResponse(OobPhoneManagementResponse value) {
        this.oobPhoneManagementResponse = value;
    }

    /**
     * Gets the value of the acspManagementResponseData property.
     * 
     * @return
     *     possible object is
     *     {@link AcspManagementResponseData }
     *     
     */
    public AcspManagementResponseData getAcspManagementResponseData() {
        return acspManagementResponseData;
    }

    /**
     * Sets the value of the acspManagementResponseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcspManagementResponseData }
     *     
     */
    public void setAcspManagementResponseData(AcspManagementResponseData value) {
        this.acspManagementResponseData = value;
    }

}
