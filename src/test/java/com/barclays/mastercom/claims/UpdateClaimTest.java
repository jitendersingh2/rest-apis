package com.barclays.mastercom.claims;

import com.barclays.mastercom.AppTest;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.Claims;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class UpdateClaimTest extends AppTest {

    private String claimId = "200002020654";
    private String action = "CLOSE";
    private String closeClaimReasonCode = "10";

    private Claims updateClaimResponse;

    @Before
    public void updateClaim() throws Exception {

        RequestMap map = new RequestMap();
        map.set("claim-id", claimId);
        map.set("action", action);
        map.set("closeClaimReasonCode", closeClaimReasonCode);
        updateClaimResponse = new Claims(map).update();
    }

    @Test
    public void testResponseNotNull() {

        assertNotNull(updateClaimResponse);
    }

    @Test
    public void testClaimId() {

        assertEquals(updateClaimResponse.get("claimId"), claimId);
    }
}
