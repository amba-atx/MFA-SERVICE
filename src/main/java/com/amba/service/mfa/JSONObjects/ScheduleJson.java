package com.amba.service.mfa.JSONObjects;

import com.amba.service.mfa.stub.client.Schedule;

public enum ScheduleJson {

	IMMEDIATE,
    SCHEDULED,
    RECURRING;

    public String value() {
        return name();
    }

    public static ScheduleJson fromValue(String v) {
        return valueOf(v);
    }


}
