package com.barclays.mastercom.fraud;

import com.barclays.mastercom.utils.Utils;
import com.mastercard.api.core.exception.ApiException;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.Fraud;

public class CreateFraud {

    public static void main_createFraud() throws Exception {
        final Utils utils = new Utils();

        try {
            RequestMap map = new RequestMap();
            map.set("claim-id", "200002020654");
            map.set("deviceType", "1");
            map.set("acctStatus", "ACCT_IS_OPEN");
            map.set("reportDate", "2017-02-11");
            map.set("fraudType", "00");
            map.set("subType", "K");
            map.set("cvcInvalidIndicator", "Y");
            map.set("chgbkIndicator", "1");
            Fraud response = Fraud.createForMasterCard(map);

            utils.out(response, "fraudId"); //-->300002292548

        } catch (ApiException e) {
            utils.err("HttpStatus: "+e.getHttpStatus());
            utils.err("Message: "+e.getMessage());
            utils.err("ReasonCode: "+e.getReasonCode());
            utils.err("Source: "+e.getSource());
        }
    }
}
