package com.barclays.mastercom.fraud;

import com.barclays.mastercom.AppTest;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.Fraud;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CreateFraudTest extends AppTest {

    private String claimId = "200002020654";
    private String deviceType = "1";
    private String acctStatus = "ACCT_IS_OPEN";
    private String reportDate = "2017-02-11";
    private String fraudType = "00";
    private String subType = "K";
    private String cvcInvalidIndicator = "Y";
    private String chgbkIndicator = "1";
    private String acquirerRefNum = "05103246259000000000126";

    private String fraudId = "300002292548";

    private Fraud response;

    @Before
    public void createFraud() throws Exception {
        RequestMap map = new RequestMap();
        map.set("claim-id", claimId);
        map.set("deviceType", deviceType);
        map.set("acctStatus", acctStatus);
        map.set("reportDate", reportDate);
        map.set("fraudType", fraudType);
        map.set("subType", subType);
        map.set("cvcInvalidIndicator", cvcInvalidIndicator);
        map.set("chgbkIndicator", chgbkIndicator);

        response = Fraud.createForMasterCard(map);
    }

    @Test
    public void testResponseNotNull() {

        assertNotNull(response);
    }

    @Test
    public void testCreateFraudResponse() {

       assertEquals(response.get("fraudId"), fraudId);
    }
}
