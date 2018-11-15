package com.barclays.mastercom.queues;

import com.barclays.mastercom.AppTest;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.core.model.ResourceList;
import com.mastercard.api.mastercom.Queues;
import com.mastercard.api.mastercom.Transactions;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class RetrieveQueqeNameTest extends AppTest {

    private String queueDescription = "Closed";

    private Queues queues;

    @Before
    public void retrieveQueqeName() throws Exception {

        ResourceList<Queues> responseList = Queues.retrieveQueueNames();
        queues = responseList.getList().get(0);
    }

    @Test
    public void testResponseNotNull() {

        assertNotNull(queues);
    }

    @Test
    public void testQueqeNameResponse() {

        assertEquals(queues.get("queueName"), queueDescription);
        assertEquals(queues.get("queueDescription"), queueDescription);
    }
}
