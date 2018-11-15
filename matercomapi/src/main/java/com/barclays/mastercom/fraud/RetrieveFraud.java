package com.barclays.mastercom.fraud;

import com.barclays.mastercom.utils.Utils;
import com.mastercard.api.core.exception.ApiException;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.Fraud;
import java.util.List;
import java.util.Map;

public class RetrieveFraud {

    public static void main_retrieveFraud() throws Exception {
        final Utils utils = new Utils();

        try {
            RequestMap map = new RequestMap();
            map.set("claim-id", "200002020654");

            Fraud response = Fraud.getPossibleValueListsForCreate(map);
            utils.out(response, "acctDeviceTypes[0].name"); //-->1
            utils.out(response, "acctDeviceTypes[0].value"); //-->1 - Chip with PIN
            utils.out(response, "acctStatuses[0].name"); //-->N
            utils.out(response, "acctStatuses[0].value"); //-->N - Account has not been closed
            utils.out(response, "cardValidCodes[0].name"); //-->M
            utils.out(response, "cardValidCodes[0].value"); //-->M - CVC 2 Valid
            utils.out(response, "subTypes[0].name"); //-->01
            utils.out(response, "subTypes[0].value"); //-->01 - Card reported stolen
            // This sample shows looping through acctDeviceTypes
            System.out.println("This sample shows looping through acctDeviceTypes");
            for(Map<String,Object> item : (List<Map<String, Object>>) response.get("acctDeviceTypes")) {
                utils.out(item, "name");
                utils.out(item, "value");
            }

        } catch (ApiException e) {
            utils.err("HttpStatus: "+e.getHttpStatus());
            utils.err("Message: "+e.getMessage());
            utils.err("ReasonCode: "+e.getReasonCode());
            utils.err("Source: "+e.getSource());
        }
    }
}
