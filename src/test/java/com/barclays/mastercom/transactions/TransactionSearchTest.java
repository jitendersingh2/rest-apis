package com.barclays.mastercom.transactions;

import com.barclays.mastercom.AppTest;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.Claims;
import com.mastercard.api.mastercom.Transactions;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TransactionSearchTest extends AppTest {

    private String acquirerRefNumber = "05436847276000293995738";
    private String primaryAccountNum = "5488888888887192";
    private String transAmountFrom = "10000";
    private String transAmountTo = "20050";
    private String tranStartDate = "2017-10-01";
    private String tranEndDate = "2017-10-01";

    private String authorizationSummaryCount = "1";
    private String originalMessageTypeIdentifier = "0110";

    private Transactions transactions;

    @Before
    public void transactionSearch() throws Exception {

        RequestMap map = new RequestMap();
        map.set("acquirerRefNumber", acquirerRefNumber);
        map.set("primaryAccountNum", primaryAccountNum);
        map.set("transAmountFrom", transAmountFrom);
        map.set("transAmountTo", transAmountTo);
        map.set("tranStartDate", tranStartDate);
        map.set("tranEndDate", tranEndDate);
        transactions = Transactions.searchForTransaction(map);
    }

    @Test
    public void testResponseNotNull() {

        assertNotNull(transactions);
    }

    @Test
    public void testTransactionResponse() {

        assertEquals(transactions.get("authorizationSummaryCount"), authorizationSummaryCount);
        assertEquals(transactions.get("authorizationSummary[0].originalMessageTypeIdentifier"), originalMessageTypeIdentifier);
    }
}
