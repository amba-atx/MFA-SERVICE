package com.amba.service.mfa.JSONObjects;

public enum ChallengeQuestionActionTypeJson {
	
	ADD_USER_QUESTION,
    BROWSE_QUESTION,
    GET_USER_QUESTION,
    SET_USER_QUESTION,
    RESET_USER_QUESTION;

    public String value() {
        return name();
    }

    public static ChallengeQuestionActionTypeJson fromValue(String v) {
        return valueOf(v);
    }

}
