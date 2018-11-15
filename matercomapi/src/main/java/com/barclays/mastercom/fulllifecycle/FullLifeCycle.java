package com.barclays.mastercom.fulllifecycle;

import com.barclays.mastercom.utils.Utils;
import com.mastercard.api.core.exception.ApiException;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.Claims;
import com.mastercard.api.mastercom.Fraud;
import com.mastercard.api.mastercom.Transactions;

public class FullLifeCycle {

    public static void main_fullLifeCycle() throws Exception {
        final String transactionIdPath = "authorizationSummary[0].transactionId";
        final String claimIdPath = "claimId";
        final String fraudIdPath = "fraudId";
        final Utils utils = new Utils();

        try {
            // Call transaction search
            RequestMap map0 = new RequestMap();
            map0.set("acquirerRefNumber", "05436847276000293995738");
            map0.set("primaryAccountNum", "5488888888887192");
            map0.set("transAmountFrom", "10000");
            map0.set("transAmountTo", "20050");
            map0.set("tranStartDate", "2017-10-01");
            map0.set("tranEndDate", "2017-10-01");
            Transactions response0 = Transactions.searchForTransaction(map0);

            // Check if transactionId is not null
            if (response0.get(transactionIdPath) != null) {
                // Get transactionId from transaction search response
                String transactionId = response0.get(transactionIdPath).toString();
                utils.out(response0, transactionIdPath);

                // Create Claim
                try {
                    RequestMap map1 = new RequestMap();
                    map1.set("disputedAmount", "100.00");
                    map1.set("disputedCurrency", "USD");
                    map1.set("claimType", "Standard");
                    map1.set("clearingTransactionId", transactionId);
                    Claims response1 = Claims.create(map1);
                    // Check if claimId is not null
                    if(response1.get(claimIdPath) != null) {
                        // Get claimId from create claim response
                        String claimId = response1.get(claimIdPath).toString();
                        utils.out(response1, claimIdPath);
                        // Create Fraud
                        try {
                            RequestMap map2 = new RequestMap();
                            map2.set("claim-id", claimId);
                            map2.set("deviceType", "1");
                            map2.set("acctStatus", "ACCT_IS_OPEN");
                            map2.set("reportDate", "2017-02-11");
                            map2.set("fraudType", "00");
                            map2.set("subType", "K");
                            map2.set("cvcInvalidIndicator", "Y");
                            map2.set("chgbkIndicator", "1");
                            Fraud response2 = Fraud.createForMasterCard(map2);
                            utils.out(response2, fraudIdPath); //-->300002292548
                        } catch (ApiException e) {
                            utils.err("Create Fraud HttpStatus: " + e.getHttpStatus());
                            utils.err("Create Fraud Message: " + e.getMessage());
                            utils.err("Create Fraud ReasonCode: " + e.getReasonCode());
                            utils.err("Create Fraud Source: " + e.getSource());
                        }
                    }
                } catch (ApiException e) {
                    utils.err("Create Claim HttpStatus: " + e.getHttpStatus());
                    utils.err("Create Claim Message: " + e.getMessage());
                    utils.err("Create Claim ReasonCode: " + e.getReasonCode());
                    utils.err("Create Claim Source: " + e.getSource());
                }
            }
        } catch (ApiException e) {
            utils.err("Transaction Search HttpStatus: "+e.getHttpStatus());
            utils.err("Transaction Search Message: "+e.getMessage());
            utils.err("Transaction Search ReasonCode: "+e.getReasonCode());
            utils.err("Transaction Search Source: "+e.getSource());
        }
    }
}
