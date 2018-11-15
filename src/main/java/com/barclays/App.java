package com.barclays;

import com.barclays.mastercom.fraud.CreateFraud;
import com.barclays.mastercom.fraud.RetrieveFraud;
import com.barclays.mastercom.fulllifecycle.FullLifeCycle;
import com.barclays.mastercom.healthcheck.Healthcheck;
import com.barclays.mastercom.claims.CreateClaim;
import com.barclays.mastercom.claims.RetrieveClaim;
import com.barclays.mastercom.claims.UpdateClaim;
import com.barclays.mastercom.queues.RetrieveClaimsFromQueqe;
import com.barclays.mastercom.queues.RetrieveQueqeName;
import com.barclays.mastercom.transactions.RetrieveAuthDetail;
import com.barclays.mastercom.transactions.RetrieveClearingDetail;
import com.barclays.mastercom.transactions.TransactionSearch;
import com.mastercard.api.core.ApiConfig;
import com.mastercard.api.core.model.Environment;
import com.mastercard.api.core.security.oauth.OAuthAuthentication;
import java.io.FileInputStream;
import java.io.InputStream;

public class App {

    public static void main(String[] args) throws Exception {
        String consumerKey = "9BSQYhM1dJDsK5EBq82r5iCkbkr8lVxXR0zlhPQU8b574c70!cdf9127b3b09425baf1dcd6a5e89dc520000000000000000";
        String keyAlias = "keyalias";
        String keyPassword = "keystorepassword";
        InputStream is = new FileInputStream("D:/proj/MasterCom_Integration_Gateway-sandbox.p12"); // e.g. /Users/yourname/project/sandbox.p12 | C:\Users\yourname\project\sandbox.p12
        ApiConfig.setAuthentication(new OAuthAuthentication(consumerKey, is, keyAlias, keyPassword));   // You only need to set this once
        ApiConfig.setDebug(true);   // Enable http wire logging
        // This is needed to change the environment to run the sample code. For production: use ApiConfig.setSandbox(false);
        ApiConfig.setEnvironment(Environment.parse("sandbox"));

//        Healthcheck.main_healthcheck();
//        CreateClaim.main_createClaim();
//        RetrieveClaim.main_retrieveClaim();
//        UpdateClaim.main_updateClaim();
//        CreateFraud.main_createFraud();
//        RetrieveFraud.main_retrieveFraud();
//        RetrieveQueqeName.main_retrieveQueqeName();
//        RetrieveClaimsFromQueqe.main_retrieveClaimsFromQueqe();
//        TransactionSearch.main_searchTransaction();
//        RetrieveClearingDetail.main_retrieveClearingDetail();
//        RetrieveAuthDetail.main_retrieveClaimsFromQueqe();
        FullLifeCycle.main_fullLifeCycle();
    }
}
