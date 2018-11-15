package com.barclays.mastercom.queues;


import com.barclays.mastercom.utils.Utils;
import com.mastercard.api.core.exception.ApiException;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.core.model.ResourceList;
import com.mastercard.api.mastercom.Queues;

public class RetrieveClaimsFromQueqe {

    public static void main_retrieveClaimsFromQueqe() throws Exception {
        final Utils utils = new Utils();

        try {
            RequestMap map = new RequestMap();
            map.set("queue-name", "Closed");

            ResourceList<Queues> responseList = Queues.retrieveClaimsFromQueue(map);
            Queues response = responseList.getList().get(0);

            utils.out(response, "acquirerId"); //-->00000005195
            utils.out(response, "acquirerRefNum"); //-->05103246259000000000126
            utils.out(response, "primaryAccountNum"); //-->52751494691484000
            utils.out(response, "claimId"); //-->200002020654
            utils.out(response, "clearingDueDate"); //-->2017-11-13
            utils.out(response, "clearingNetwork"); //-->GCMS
            utils.out(response, "createDate"); //-->2017-11-13
            utils.out(response, "dueDate"); //-->2017-11-13
            utils.out(response, "transactionId"); //-->118411681
            utils.out(response, "isAccurate"); //-->true
            utils.out(response, "isAcquirer"); //-->true
            utils.out(response, "isIssuer"); //-->false
            utils.out(response, "isOpen"); //-->true
            utils.out(response, "issuerId"); //-->5258
            utils.out(response, "lastModifiedBy"); //-->user1234
            utils.out(response, "lastModifiedDate"); //-->2017-11-08
            utils.out(response, "merchantId"); //-->0024038000200
            utils.out(response, "progressState"); //-->CB1-4807-O-A-NEW
            utils.out(response, "claimType"); //-->Standard
            utils.out(response, "claimValue"); //-->25.0 USD


        } catch (ApiException e) {
            utils.err("HttpStatus: "+e.getHttpStatus());
            utils.err("Message: "+e.getMessage());
            utils.err("ReasonCode: "+e.getReasonCode());
            utils.err("Source: "+e.getSource());
        }
    }
}
