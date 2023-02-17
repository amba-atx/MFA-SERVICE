
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChallengeQuestionActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChallengeQuestionActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADD_USER_QUESTION"/&gt;
 *     &lt;enumeration value="BROWSE_QUESTION"/&gt;
 *     &lt;enumeration value="GET_USER_QUESTION"/&gt;
 *     &lt;enumeration value="SET_USER_QUESTION"/&gt;
 *     &lt;enumeration value="RESET_USER_QUESTION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChallengeQuestionActionType")
@XmlEnum
public enum ChallengeQuestionActionType {

    ADD_USER_QUESTION,
    BROWSE_QUESTION,
    GET_USER_QUESTION,
    SET_USER_QUESTION,
    RESET_USER_QUESTION;

    public String value() {
        return name();
    }

    public static ChallengeQuestionActionType fromValue(String v) {
        return valueOf(v);
    }

}
