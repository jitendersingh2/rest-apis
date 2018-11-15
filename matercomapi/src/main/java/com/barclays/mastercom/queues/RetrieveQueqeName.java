package com.barclays.mastercom.queues;

import com.barclays.mastercom.utils.Utils;
import com.mastercard.api.core.exception.ApiException;
import com.mastercard.api.core.model.ResourceList;
import com.mastercard.api.mastercom.Queues;

public class RetrieveQueqeName {

    public static void main_retrieveQueqeName() throws Exception {
        final Utils utils = new Utils();

        try {
            ResourceList<Queues> responseList = Queues.retrieveQueueNames();
            Queues response = responseList.getList().get(0);

            utils.out(response, "queueName"); //-->Closed
            utils.out(response, "queueDescription"); //-->Closed


        } catch (ApiException e) {
            utils.err("HttpStatus: "+e.getHttpStatus());
            utils.err("Message: "+e.getMessage());
            utils.err("ReasonCode: "+e.getReasonCode());
            utils.err("Source: "+e.getSource());
        }
    }
}
