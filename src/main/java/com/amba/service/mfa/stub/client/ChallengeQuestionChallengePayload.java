
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This returns the results of the challenge question challenge method
 * 
 * <p>Java class for ChallengeQuestionChallengePayload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChallengeQuestionChallengePayload"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callStatus" type="{http://ws.csd.rsa.com}CallStatus" minOccurs="0"/&gt;
 *         &lt;element name="challengeQuestions" type="{http://ws.csd.rsa.com}ChallengeQuestionList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChallengeQuestionChallengePayload", propOrder = {
    "callStatus",
    "challengeQuestions"
})
public class ChallengeQuestionChallengePayload {

    protected CallStatus callStatus;
    protected ChallengeQuestionList challengeQuestions;

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
     * Gets the value of the challengeQuestions property.
     * 
     * @return
     *     possible object is
     *     {@link ChallengeQuestionList }
     *     
     */
    public ChallengeQuestionList getChallengeQuestions() {
        return challengeQuestions;
    }

    /**
     * Sets the value of the challengeQuestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChallengeQuestionList }
     *     
     */
    public void setChallengeQuestions(ChallengeQuestionList value) {
        this.challengeQuestions = value;
    }

}
