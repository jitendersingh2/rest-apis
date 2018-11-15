package com.barclays.mastercom.transactions;

import com.barclays.mastercom.utils.Utils;
import com.mastercard.api.core.exception.ApiException;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.Transactions;
import java.util.List;
import java.util.Map;

public class TransactionSearch {

    public static void main_searchTransaction() throws Exception {
        final Utils utils = new Utils();

        try {
            RequestMap map = new RequestMap();
            map.set("acquirerRefNumber", "05436847276000293995738");
            map.set("primaryAccountNum", "5488888888887192");
            map.set("transAmountFrom", "10000");
            map.set("transAmountTo", "20050");
            map.set("tranStartDate", "2017-10-01");
            map.set("tranEndDate", "2017-10-01");
            Transactions response = Transactions.searchForTransaction(map);

            utils.out(response, "authorizationSummaryCount"); //-->1
            utils.out(response, "message"); //-->Search returned 1 records
            utils.out(response, "authorizationSummary[0].originalMessageTypeIdentifier"); //-->0110
            utils.out(response, "authorizationSummary[0].banknetDate"); //-->160107
            utils.out(response, "authorizationSummary[0].transactionAmountUsd"); //-->401.17
            utils.out(response, "authorizationSummary[0].primaryAccountNumber"); //-->5488888888887192
            utils.out(response, "authorizationSummary[0].processingCode"); //-->00
            utils.out(response, "authorizationSummary[0].transactionAmountLocal"); //-->000000010000
            utils.out(response, "authorizationSummary[0].authorizationDateAndTime"); //-->108125633
            utils.out(response, "authorizationSummary[0].track2"); //-->Y101
            utils.out(response, "authorizationSummary[0].authenticationId"); //-->111111
            utils.out(response, "authorizationSummary[0].cardAcceptorName"); //-->MASTERCARD
            utils.out(response, "authorizationSummary[0].cardAcceptorCity"); //-->SAINT LOUIS
            utils.out(response, "authorizationSummary[0].cardAcceptorState"); //-->MO
            utils.out(response, "authorizationSummary[0].track1"); //-->N
            utils.out(response, "authorizationSummary[0].currencyCode"); //-->840
            utils.out(response, "authorizationSummary[0].chipPresent"); //-->N
            utils.out(response, "authorizationSummary[0].transactionId"); //-->hqCnaMDqmto4wnL+BSUKSdzROqGJ7YELoKhEvluycwKNg3XTz/faIJhFDkl9hW081B5tTqFFiAwCpcocPdB2My4t7DtSTk63VXDl1CySA8Y
            utils.out(response, "authorizationSummary[0].clearingSummary[0].primaryAccountNumber"); //-->5488888888887192
            utils.out(response, "authorizationSummary[0].clearingSummary[0].transactionAmountLocal"); //-->2500
            utils.out(response, "authorizationSummary[0].clearingSummary[0].dateAndTimeLocal"); //-->170719010100
            utils.out(response, "authorizationSummary[0].clearingSummary[0].cardholderAuthenticationCapability"); //-->9
            utils.out(response, "authorizationSummary[0].clearingSummary[0].cardPresent"); //-->1
            utils.out(response, "authorizationSummary[0].clearingSummary[0].acquirerReferenceNumber"); //-->05413364365000000000667
            utils.out(response, "authorizationSummary[0].clearingSummary[0].cardAcceptorName"); //-->TEST MERCHANT NAME
            utils.out(response, "authorizationSummary[0].clearingSummary[0].currencyCode"); //-->840
            utils.out(response, "authorizationSummary[0].clearingSummary[0].transactionId"); //-->U7dImb1ncs24LKNU9dDpl+FHlPzyfYOOv/5PijTlO6wHH09l7aiVJ1KJHp3sWPUHH0l90J1U82DGrE3hq72A
            // This sample shows looping through authorizationSummary
            System.out.println("This sample shows looping through authorizationSummary");
            for(Map<String,Object> item : (List<Map<String, Object>>) response.get("authorizationSummary")) {
                utils.out(item, "originalMessageTypeIdentifier");
                utils.out(item, "banknetDate");
                utils.out(item, "transactionAmountUsd");
                utils.out(item, "primaryAccountNumber");
                utils.out(item, "processingCode");
                utils.out(item, "transactionAmountLocal");
                utils.out(item, "authorizationDateAndTime");
                utils.out(item, "track2");
                utils.out(item, "authenticationId");
                utils.out(item, "cardAcceptorName");
                utils.out(item, "cardAcceptorCity");
                utils.out(item, "cardAcceptorState");
                utils.out(item, "track1");
                utils.out(item, "currencyCode");
                utils.out(item, "chipPresent");
                utils.out(item, "transactionId");
                utils.out(item, "clearingSummary");
            }


        } catch (ApiException e) {
            utils.err("HttpStatus: "+e.getHttpStatus());
            utils.err("Message: "+e.getMessage());
            utils.err("ReasonCode: "+e.getReasonCode());
            utils.err("Source: "+e.getSource());
        }
    }
}
