package com.barclays.mastercom.claims;

import com.barclays.mastercom.AppTest;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.Claims;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class RetrieveClaimTest extends AppTest {

    private String claimId = "200002020654";
    private String acquireId = "002222";
    private String acquirerRefNum = "55306608112341123451234";
    private String primaryAccountNum = "52751494691484000";
    private String resClaimId = "200002000191";
    private String claimType = "Standard";

    private Claims retrieveClaimResponse;

    @Before
    public void retrieveClaim() throws Exception {

        RequestMap map = new RequestMap();
        map.set("claim-id", claimId);
        retrieveClaimResponse = Claims.retrieve("", map);
    }

    @Test
    public void testResponseNotNull() {

        assertNotNull(retrieveClaimResponse);
    }

    @Test
    public void testResponse() {

        assertEquals(retrieveClaimResponse.get("acquirerId"), acquireId);
        assertEquals(retrieveClaimResponse.get("acquirerRefNum"), acquirerRefNum);
        assertEquals(retrieveClaimResponse.get("primaryAccountNum"), primaryAccountNum);
        assertEquals(retrieveClaimResponse.get("claimId"), resClaimId);
        assertEquals(retrieveClaimResponse.get("claimType"), claimType);
    }
}
