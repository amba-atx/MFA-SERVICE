package com.amba.service.mfa.JSONObjects;

import java.util.ArrayList;
import java.util.List;

public class OOBActionTypeListJson
    extends ActionTypeListJson
{

    private List<OOBActionTypeJson> oobActionType;
    
    public List<OOBActionTypeJson> getOobActionType() {
        if (oobActionType == null) {
            oobActionType = new ArrayList<OOBActionTypeJson>();
        }
        return this.oobActionType;
    }

}

