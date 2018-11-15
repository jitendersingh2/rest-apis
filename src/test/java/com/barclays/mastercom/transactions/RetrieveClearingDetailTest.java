package com.barclays.mastercom.transactions;

import com.barclays.mastercom.AppTest;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.Transactions;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class RetrieveClearingDetailTest extends AppTest {

    private String claimId = "200002020654";
    private String transactionId = "FIEaEgnM3bwPijwZgjc3Te+Y0ieLbN9ijUugqNSvJmVbO1xs6Jh5iIlmpOpkbax79L8Yj1rBOWBACx+Vj17rzvOepWobpgWNJNdsgHB4ag";

    private String accountLevelManagementAccountCategoryCode = "N";
    private String acquirerReferenceData = "25131304365000000033393";

    private Transactions transactions;

    @Before
    public void retrieveClearingDetail() throws Exception {

        RequestMap map = new RequestMap();
        map.set("claim-id", claimId);
        map.set("transaction-id", transactionId);

        transactions = Transactions.retrieveClearingDetail("", map);
    }

    @Test
    public void testResponseNotNull() {

        assertNotNull(transactions);
    }

    @Test
    public void testClearingDetailResponse() {

        assertEquals(transactions.get("accountLevelManagementAccountCategoryCode"), accountLevelManagementAccountCategoryCode);
        assertEquals(transactions.get("acquirerReferenceData"), acquirerReferenceData);
    }
}
