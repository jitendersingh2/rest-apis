package com.barclays.mastercom.fraud;

import com.barclays.mastercom.AppTest;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.Fraud;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class RetrieveFraudTest extends AppTest {

    private String claimId = "200002020654";

    private String deviceName = "1";
    private String deviceType = "1 - Chip with PIN";

    private Fraud response;

    @Before
    public void retrieveFraud() throws Exception {
        RequestMap map = new RequestMap();
        map.set("claim-id", claimId);

        response = Fraud.getPossibleValueListsForCreate(map);
    }

    @Test
    public void testResponseNotNull() {

        assertNotNull(response);
    }

    @Test
    public void testRetrieveFraudResponse() {

        assertEquals(response.get("acctDeviceTypes[0].name"), deviceName);
        assertEquals(response.get("acctDeviceTypes[0].value"), deviceType);
    }
}
