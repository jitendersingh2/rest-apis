package com.barclays.mastercom.healthcheck;

import com.barclays.mastercom.utils.Utils;
import com.mastercard.api.core.exception.ApiException;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.HealthCheck;

public class Healthcheck {

    public static void main_healthcheck() throws Exception {
        final Utils utils = new Utils();

        try {
            RequestMap map = new RequestMap();

            HealthCheck response = HealthCheck.healthCheck(map);
            utils.out(response, "status"); //-->true

        } catch (ApiException e) {
            utils.err("HttpStatus: "+e.getHttpStatus());
            utils.err("Message: "+e.getMessage());
            utils.err("ReasonCode: "+e.getReasonCode());
            utils.err("Source: "+e.getSource());
        }
    }
}
