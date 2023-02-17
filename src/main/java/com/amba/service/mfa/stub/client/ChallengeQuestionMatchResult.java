
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChallengeQuestionMatchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChallengeQuestionMatchResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="failCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="matchCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="authFailCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="shouldBlock" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChallengeQuestionMatchResult", propOrder = {
    "failCount",
    "matchCount",
    "authFailCount",
    "shouldBlock"
})
public class ChallengeQuestionMatchResult {

    protected Integer failCount;
    protected Integer matchCount;
    protected Integer authFailCount;
    protected Boolean shouldBlock;

    /**
     * Gets the value of the failCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailCount() {
        return failCount;
    }

    /**
     * Sets the value of the failCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailCount(Integer value) {
        this.failCount = value;
    }

    /**
     * Gets the value of the matchCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMatchCount() {
        return matchCount;
    }

    /**
     * Sets the value of the matchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMatchCount(Integer value) {
        this.matchCount = value;
    }

    /**
     * Gets the value of the authFailCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuthFailCount() {
        return authFailCount;
    }

    /**
     * Sets the value of the authFailCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuthFailCount(Integer value) {
        this.authFailCount = value;
    }

    /**
     * Gets the value of the shouldBlock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldBlock() {
        return shouldBlock;
    }

    /**
     * Sets the value of the shouldBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldBlock(Boolean value) {
        this.shouldBlock = value;
    }

}
