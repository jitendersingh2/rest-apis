package com.barclays.mastercom.claims;

import com.mastercard.api.core.exception.ApiException;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.Claims;
import com.barclays.mastercom.utils.Utils;

public class UpdateClaim {
    public static void main_updateClaim() throws Exception {
        final Utils utils = new Utils();

        try {
            RequestMap map = new RequestMap();
            map.set("claim-id", "200002020654");
            map.set("action", "CLOSE");
            map.set("closeClaimReasonCode", "10");
            Claims response = new Claims(map).update();

            utils.out(response, "claimId"); //-->200002020654

        } catch (ApiException e) {
            utils.err("HttpStatus: "+e.getHttpStatus());
            utils.err("Message: "+e.getMessage());
            utils.err("ReasonCode: "+e.getReasonCode());
            utils.err("Source: "+e.getSource());
        }
    }

}
