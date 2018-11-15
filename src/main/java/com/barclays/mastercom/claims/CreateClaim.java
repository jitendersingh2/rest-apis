package com.barclays.mastercom.claims;

import com.mastercard.api.core.exception.ApiException;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.Claims;
import com.barclays.mastercom.utils.Utils;

import com.barclays.mastercom.*;

public class CreateClaim {

    public static void main_createClaim() throws Exception {
        final Utils utils = new Utils();

        try {
            RequestMap map = new RequestMap();
            map.set("disputedAmount", "100.00");
            map.set("disputedCurrency", "USD");
            map.set("claimType", "Standard");
            map.set("clearingTransactionId", "hqCnaMDqmto4wnL+BSUKSdzROqGJ7YELoKhEvluycwKNg3XTz/faIJhFDkl9hW081B5tTqFFiAwCpcocPdB2My4t7DtSTk63VXDl1CySA8Y");
            Claims response = Claims.create(map);

            utils.out(response, "claimId"); //-->200002020654

        } catch (ApiException e) {
            utils.err("HttpStatus: "+e.getHttpStatus());
            utils.err("Message: "+e.getMessage());
            utils.err("ReasonCode: "+e.getReasonCode());
            utils.err("Source: "+e.getSource());
        }
    }
}
