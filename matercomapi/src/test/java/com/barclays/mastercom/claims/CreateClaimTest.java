package com.barclays.mastercom.claims;

import com.barclays.mastercom.AppTest;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.Claims;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertSame;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CreateClaimTest extends AppTest {

    private String disputedAmount = "100.00";
    private String disputedCurrency = "USD";
    private String claimType = "Standard";
    private String clearingTransactionId = "hqCnaMDqmto4wnL+BSUKSdzROqGJ7YELoKhEvluycwKNg3XTz/faIJhFDkl9hW081B5tTqFFiAwCpcocPdB2My4t7DtSTk63VXDl1CySA8Y";
    private String claimId = "200002020654";

    private Claims createClaimResponse;

    @Before
    public void createClaim() throws Exception {

        RequestMap map = new RequestMap();
        map.set("disputedAmount", disputedAmount);
        map.set("disputedCurrency", disputedCurrency);
        map.set("claimType", claimType);
        map.set("clearingTransactionId", clearingTransactionId);
        createClaimResponse = Claims.create(map);
    }

    @Test
    public void testResponseNotNull() {

        assertNotNull(createClaimResponse);
    }

    @Test
    public void testClaimId() {

       assertEquals(createClaimResponse.get("claimId"), claimId);
    }
}
