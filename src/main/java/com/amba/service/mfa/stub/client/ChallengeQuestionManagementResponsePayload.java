
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This defines the Challenge Question Management response
 * 
 * <p>Java class for ChallengeQuestionManagementResponsePayload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChallengeQuestionManagementResponsePayload"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acspAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="browsableChallQuesGroupList" type="{http://ws.csd.rsa.com}ChallengeQuestionGroupList" minOccurs="0"/&gt;
 *         &lt;element name="callStatus" type="{http://ws.csd.rsa.com}CallStatus" minOccurs="0"/&gt;
 *         &lt;element name="userChallQuesDataList" type="{http://ws.csd.rsa.com}ChallengeQuestionList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChallengeQuestionManagementResponsePayload", propOrder = {
    "acspAccountId",
    "browsableChallQuesGroupList",
    "callStatus",
    "userChallQuesDataList"
})
public class ChallengeQuestionManagementResponsePayload {

    protected String acspAccountId;
    protected ChallengeQuestionGroupList browsableChallQuesGroupList;
    protected CallStatus callStatus;
    protected ChallengeQuestionList userChallQuesDataList;

    /**
     * Gets the value of the acspAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcspAccountId() {
        return acspAccountId;
    }

    /**
     * Sets the value of the acspAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcspAccountId(String value) {
        this.acspAccountId = value;
    }

    /**
     * Gets the value of the browsableChallQuesGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link ChallengeQuestionGroupList }
     *     
     */
    public ChallengeQuestionGroupList getBrowsableChallQuesGroupList() {
        return browsableChallQuesGroupList;
    }

    /**
     * Sets the value of the browsableChallQuesGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChallengeQuestionGroupList }
     *     
     */
    public void setBrowsableChallQuesGroupList(ChallengeQuestionGroupList value) {
        this.browsableChallQuesGroupList = value;
    }

    /**
     * Gets the value of the callStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CallStatus }
     *     
     */
    public CallStatus getCallStatus() {
        return callStatus;
    }

    /**
     * Sets the value of the callStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallStatus }
     *     
     */
    public void setCallStatus(CallStatus value) {
        this.callStatus = value;
    }

    /**
     * Gets the value of the userChallQuesDataList property.
     * 
     * @return
     *     possible object is
     *     {@link ChallengeQuestionList }
     *     
     */
    public ChallengeQuestionList getUserChallQuesDataList() {
        return userChallQuesDataList;
    }

    /**
     * Sets the value of the userChallQuesDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChallengeQuestionList }
     *     
     */
    public void setUserChallQuesDataList(ChallengeQuestionList value) {
        this.userChallQuesDataList = value;
    }

}
