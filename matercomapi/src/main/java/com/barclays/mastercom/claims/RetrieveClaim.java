package com.barclays.mastercom.claims;

import com.mastercard.api.core.exception.ApiException;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.Claims;
import java.util.List;
import java.util.Map;
import com.barclays.mastercom.utils.Utils;

public class RetrieveClaim {

    public static void main_retrieveClaim() throws Exception {
        final Utils utils = new Utils();

        try {
            RequestMap map = new RequestMap();
            map.set("claim-id", "200002020654");
            Claims response = Claims.retrieve("", map);

            utils.out(response, "acquirerId"); //-->002222
            utils.out(response, "acquirerRefNum"); //-->55306608112341123451234
            utils.out(response, "primaryAccountNum"); //-->52751494691484000
            utils.out(response, "claimId"); //-->200002000191
            utils.out(response, "claimType"); //-->Standard
            utils.out(response, "claimValue"); //-->123.28 USD
            utils.out(response, "clearingDueDate"); //-->2017-12-14
            utils.out(response, "clearingNetwork"); //-->GCMS
            utils.out(response, "createDate"); //-->2017-10-27
            utils.out(response, "dueDate"); //-->2017-12-11
            utils.out(response, "transactionId"); //-->g1f4kmlMcfQaLHtRX+WWB2TfOiyAIO0ZrxZ2zJ226sQuH6EsoypShLUwzD95i2QeIxoHYh7qrAqy9qMdbmDgw&#x3D;&#x3D;
            utils.out(response, "isAccurate"); //-->true
            utils.out(response, "isAcquirer"); //-->true
            utils.out(response, "isIssuer"); //-->false
            utils.out(response, "isOpen"); //-->true
            utils.out(response, "issuerId"); //-->001111
            utils.out(response, "lastModifiedBy"); //-->user1234
            utils.out(response, "lastModifiedDate"); //-->2017-11-13
            utils.out(response, "merchantId"); //-->0024038000200
            utils.out(response, "queueName"); //-->Pending
            utils.out(response, "retrievalDetails.acquirerRefNum"); //-->55306608112341123451234
            utils.out(response, "retrievalDetails.acquirerResponseCd"); //-->D
            utils.out(response, "retrievalDetails.acquirerMemo"); //-->This is an example memo .
            utils.out(response, "retrievalDetails.acquirerResponseDt"); //-->2018-01-29
            utils.out(response, "retrievalDetails.amount"); //-->196.42
            utils.out(response, "retrievalDetails.currency"); //-->PLN
            utils.out(response, "retrievalDetails.claimId"); //-->200002000191
            utils.out(response, "retrievalDetails.issuerResponseCd"); //-->REJECT_DOCUMENTATION_NOT_AS_REQUIRED
            utils.out(response, "retrievalDetails.issuerRejectRsnCd"); //-->02
            utils.out(response, "retrievalDetails.issuerMemo"); //-->This is an example memo .
            utils.out(response, "retrievalDetails.issuerResponseDt"); //-->2018-01-29
            utils.out(response, "retrievalDetails.imageReviewDecision"); //-->I
            utils.out(response, "retrievalDetails.imageReviewDt"); //-->2018-01-29
            utils.out(response, "retrievalDetails.primaryAcctNum"); //-->52751494691484000
            utils.out(response, "retrievalDetails.requestId"); //-->200002000151
            utils.out(response, "retrievalDetails.retrievalRequestReason"); //-->6305
            utils.out(response, "retrievalDetails.docNeeded"); //-->1
            utils.out(response, "retrievalDetails.createDate"); //-->2017-10-30
            utils.out(response, "chargebackDetails[0].currency"); //-->USD
            utils.out(response, "chargebackDetails[0].documentIndicator"); //-->false
            utils.out(response, "chargebackDetails[0].messageText"); //-->AUTHORIZATION DECLINED MMDDYY
            utils.out(response, "chargebackDetails[0].amount"); //-->196.43
            utils.out(response, "chargebackDetails[0].reasonCode"); //-->4808
            utils.out(response, "chargebackDetails[0].isPartialChargeback"); //-->false
            utils.out(response, "chargebackDetails[0].chargebackType"); //-->CHARGEBACK
            utils.out(response, "chargebackDetails[0].chargebackId"); //-->200002000151
            utils.out(response, "chargebackDetails[0].claimId"); //-->200002000191
            utils.out(response, "chargebackDetails[0].reversed"); //-->false
            utils.out(response, "chargebackDetails[0].reversal"); //-->false
            utils.out(response, "chargebackDetails[0].createDate"); //-->2017-10-27
            utils.out(response, "chargebackDetails[1].currency"); //-->USD
            utils.out(response, "chargebackDetails[1].documentIndicator"); //-->false
            utils.out(response, "chargebackDetails[1].amount"); //-->196.43
            utils.out(response, "chargebackDetails[1].reasonCode"); //-->2001
            utils.out(response, "chargebackDetails[1].isPartialChargeback"); //-->false
            utils.out(response, "chargebackDetails[1].chargebackType"); //-->SECOND_PRESENTMENT
            utils.out(response, "chargebackDetails[1].chargebackId"); //-->200002000151
            utils.out(response, "chargebackDetails[1].claimId"); //-->200002000191
            utils.out(response, "chargebackDetails[1].reversed"); //-->false
            utils.out(response, "chargebackDetails[1].reversal"); //-->false
            utils.out(response, "chargebackDetails[1].createDate"); //-->2017-11-08
            utils.out(response, "chargebackDetails[2].currency"); //-->USD
            utils.out(response, "chargebackDetails[2].documentIndicator"); //-->false
            utils.out(response, "chargebackDetails[2].amount"); //-->61.64
            utils.out(response, "chargebackDetails[2].reasonCode"); //-->4807
            utils.out(response, "chargebackDetails[2].isPartialChargeback"); //-->false
            utils.out(response, "chargebackDetails[2].chargebackType"); //-->ARB_CHARGEBACK
            utils.out(response, "chargebackDetails[2].chargebackId"); //-->200002000151
            utils.out(response, "chargebackDetails[2].claimId"); //-->200002000191
            utils.out(response, "chargebackDetails[2].reversed"); //-->false
            utils.out(response, "chargebackDetails[2].reversal"); //-->false
            utils.out(response, "chargebackDetails[2].createDate"); //-->2017-10-30
            utils.out(response, "feeDetails[0].cardAcceptorIdCode"); //-->Test ID
            utils.out(response, "feeDetails[0].cardNumber"); //-->52751494691484000
            utils.out(response, "feeDetails[0].countryCode"); //-->USA
            utils.out(response, "feeDetails[0].currency"); //-->USD
            utils.out(response, "feeDetails[0].feeDate"); //-->2018-02-07
            utils.out(response, "feeDetails[0].destinationMember"); //-->001527
            utils.out(response, "feeDetails[0].feeAmount"); //-->0.24
            utils.out(response, "feeDetails[0].creditSender"); //-->true
            utils.out(response, "feeDetails[0].creditReceiver"); //-->false
            utils.out(response, "feeDetails[0].message"); //-->00000013502000000135020626065946717713065946
            utils.out(response, "feeDetails[0].reason"); //-->7623
            utils.out(response, "feeDetails[0].feeId"); //-->300002002247
            utils.out(response, "caseFilingDetails.caseFilingStatus"); //-->Closed
            utils.out(response, "caseFilingDetails.caseFilingDetails.claimId"); //-->200002000151
            utils.out(response, "caseFilingDetails.caseFilingDetails.claimType"); //-->CaseFiling
            utils.out(response, "caseFilingDetails.caseFilingDetails.caseId"); //-->9000000012
            utils.out(response, "caseFilingDetails.caseFilingDetails.caseType"); //-->4
            utils.out(response, "caseFilingDetails.caseFilingDetails.chargebackRefNum[0]"); //-->1111423456,2222123456
            utils.out(response, "caseFilingDetails.caseFilingDetails.currencyCode"); //-->USD
            utils.out(response, "caseFilingDetails.caseFilingDetails.disputeAmount"); //-->50.00
            utils.out(response, "caseFilingDetails.caseFilingDetails.dueDate"); //-->2017-11-13
            utils.out(response, "caseFilingDetails.caseFilingDetails.filingAgaintstIca"); //-->5482
            utils.out(response, "caseFilingDetails.caseFilingDetails.filingAs"); //-->A
            utils.out(response, "caseFilingDetails.caseFilingDetails.filingIca"); //-->6000
            utils.out(response, "caseFilingDetails.caseFilingDetails.merchantName"); //-->test name
            utils.out(response, "caseFilingDetails.caseFilingDetails.primaryAccountNum"); //-->52751494691484000
            utils.out(response, "caseFilingDetails.caseFilingDetails.violationCode"); //-->D.2
            utils.out(response, "caseFilingDetails.caseFilingDetails.violationDate"); //-->2017-12-18
            utils.out(response, "caseFilingDetails.caseFilingDetails.rulingDate"); //-->2018-01-24
            utils.out(response, "caseFilingDetails.caseFilingDetails.rulingStatus"); //-->Favor Sender
            utils.out(response, "caseFilingDetails.caseFilingRespHistory[0].memo"); //-->Sample Memo
            utils.out(response, "caseFilingDetails.caseFilingRespHistory[0].action"); //-->FAVOR SENDER
            utils.out(response, "caseFilingDetails.caseFilingRespHistory[0].responseDate"); //-->2018-01-24
            utils.out(response, "caseFilingDetails.caseFilingRespHistory[1].memo"); //-->Sample Memo
            utils.out(response, "caseFilingDetails.caseFilingRespHistory[1].action"); //-->REBUT
            utils.out(response, "caseFilingDetails.caseFilingRespHistory[1].responseDate"); //-->2017-12-18
            utils.out(response, "caseFilingDetails.caseFilingRespHistory[2].memo"); //-->Sample Memo
            utils.out(response, "caseFilingDetails.caseFilingRespHistory[2].action"); //-->ESCALATE
            utils.out(response, "caseFilingDetails.caseFilingRespHistory[2].responseDate"); //-->2017-12-18
            utils.out(response, "caseFilingDetails.caseFilingRespHistory[3].memo"); //-->Sample Memo
            utils.out(response, "caseFilingDetails.caseFilingRespHistory[3].action"); //-->REJECT
            utils.out(response, "caseFilingDetails.caseFilingRespHistory[3].responseDate"); //-->2017-12-18
            // This sample shows looping through chargebackDetails
            System.out.println("This sample shows looping through chargebackDetails");
            for(Map<String,Object> item : (List<Map<String, Object>>) response.get("chargebackDetails")) {
                utils.out(item, "currency");
                utils.out(item, "documentIndicator");
                utils.out(item, "messageText");
                utils.out(item, "amount");
                utils.out(item, "reasonCode");
                utils.out(item, "isPartialChargeback");
                utils.out(item, "chargebackType");
                utils.out(item, "chargebackId");
                utils.out(item, "claimId");
                utils.out(item, "reversed");
                utils.out(item, "reversal");
                utils.out(item, "createDate");
            }



        } catch (ApiException e) {
            utils.err("HttpStatus: "+e.getHttpStatus());
            utils.err("Message: "+e.getMessage());
            utils.err("ReasonCode: "+e.getReasonCode());
            utils.err("Source: "+e.getSource());
        }
    }
}
