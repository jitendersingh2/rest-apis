package com.barclays.mastercom.transactions;

import com.barclays.mastercom.AppTest;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.Transactions;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class RetrieveAuthDetailTest extends AppTest {

    private String claimId = "200002020654";
    private String transactionId = "FIEaEgnM3bwPijwZgjc3Te+Y0ieLbN9ijUugqNSvJmVbO1xs6Jh5iIlmpOpkbax79L8Yj1rBOWBACx+Vj17rzvOepWobpgWNJNdsgHB4ag";

    private String accountNumber = "5154676300000001";
    private String acquiringInstitutionId = "2705";

    private Transactions transactions;

    @Before
    public void retrieveAuthDetail() throws Exception {

        RequestMap map = new RequestMap();
        map.set("claim-id", claimId);
        map.set("transaction-id", transactionId);

        transactions = Transactions.retrieveAuthorizationDetail("", map);
    }

    @Test
    public void testResponseNotNull() {

        assertNotNull(transactions);
    }

    @Test
    public void testAuthDetailResponse() {

        assertEquals(transactions.get("accountNumber"), accountNumber);
        assertEquals(transactions.get("acquiringInstitutionId"), acquiringInstitutionId);
    }
}
