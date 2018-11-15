package com.barclays.mastercom;

import com.mastercard.api.core.ApiConfig;
import com.mastercard.api.core.model.Environment;
import com.mastercard.api.core.security.oauth.OAuthAuthentication;
import java.io.FileInputStream;
import java.io.InputStream;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Before
    public void setUp() throws Exception {
        String consumerKey = "9BSQYhM1dJDsK5EBq82r5iCkbkr8lVxXR0zlhPQU8b574c70!cdf9127b3b09425baf1dcd6a5e89dc520000000000000000";
        String keyAlias = "keyalias";
        String keyPassword = "keystorepassword";
        InputStream is = new FileInputStream("D:/proj/MasterCom_Integration_Gateway-sandbox.p12"); // e.g. /Users/yourname/project/sandbox.p12 | C:\Users\yourname\project\sandbox.p12
        ApiConfig.setAuthentication(new OAuthAuthentication(consumerKey, is, keyAlias, keyPassword));   // You only need to set this once
        ApiConfig.setDebug(true);   // Enable http wire logging
        // This is needed to change the environment to run the sample code. For production: use ApiConfig.setSandbox(false);
        ApiConfig.setEnvironment(Environment.parse("sandbox"));
    }
}
