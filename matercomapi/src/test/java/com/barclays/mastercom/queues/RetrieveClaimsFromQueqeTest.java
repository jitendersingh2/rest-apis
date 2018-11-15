package com.barclays.mastercom.queues;

import com.barclays.mastercom.AppTest;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.core.model.ResourceList;
import com.mastercard.api.mastercom.Queues;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class RetrieveClaimsFromQueqeTest extends AppTest {

    private String queueName = "Closed";
    private String acquirerId = "00000005195";
    private String acquirerRefNum = "05103246259000000000126";

    private Queues queues;

    @Before
    public void retrieveClaimsFromQueqeName() throws Exception {
        RequestMap map = new RequestMap();
        map.set("queue-name", queueName);

        ResourceList<Queues> responseList = Queues.retrieveClaimsFromQueue(map);
        queues = responseList.getList().get(0);
    }

    @Test
    public void testResponseNotNull() {

        assertNotNull(queues);
    }

    @Test
    public void testClaimsFromQueqeNameResponse() {

        assertEquals(queues.get("acquirerId"), acquirerId);
        assertEquals(queues.get("acquirerRefNum"), acquirerRefNum);
    }
}
