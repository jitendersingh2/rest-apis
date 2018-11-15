package com.barclays.mastercom.transactions;

import com.barclays.mastercom.utils.Utils;
import com.mastercard.api.core.exception.ApiException;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.Transactions;

public class RetrieveAuthDetail {

    public static void main_retrieveClaimsFromQueqe() throws Exception {
        final Utils utils = new Utils();

        try {
            RequestMap map = new RequestMap();
            map.set("claim-id", "200002020654");
            map.set("transaction-id", "FIEaEgnM3bwPijwZgjc3Te+Y0ieLbN9ijUugqNSvJmVbO1xs6Jh5iIlmpOpkbax79L8Yj1rBOWBACx+Vj17rzvOepWobpgWNJNdsgHB4ag");
            Transactions response = Transactions.retrieveAuthorizationDetail("", map);

            utils.out(response, "accountNumber"); //-->5154676300000001
            utils.out(response, "accountNumberIndicator"); //-->I
            utils.out(response, "acquirer"); //-->N
            utils.out(response, "acquiringInstitutionCountryCode"); //-->USA
            utils.out(response, "acquiringInstitutionId"); //-->2705
            utils.out(response, "addressVerificationServiceResponse"); //-->S
            utils.out(response, "adviceReasonCode"); //-->160
            utils.out(response, "atcDiscrepancyIndicator"); //-->G
            utils.out(response, "atcDiscrepancyValue"); //-->00005
            utils.out(response, "atcValue"); //-->00053
            utils.out(response, "authenticationIndicator"); //-->1
            utils.out(response, "authorizationIdResponse"); //-->11111
            utils.out(response, "banknetDate"); //-->170719
            utils.out(response, "banknetReferenceNumber"); //-->SDYP1MRWD
            utils.out(response, "billingCurrencyCode"); //-->840
            utils.out(response, "cardAcceptorCity"); //-->SAINT LOUIS
            utils.out(response, "cardAcceptorId"); //-->0024038000200
            utils.out(response, "cardAcceptorName"); //-->Test Name
            utils.out(response, "cardAcceptorState"); //-->MO
            utils.out(response, "cardAcceptorTerminalId"); //-->TERM-041
            utils.out(response, "cardholderActivatedTerminalLevel"); //-->6
            utils.out(response, "cardholderBillingActualAmount"); //-->000000010000
            utils.out(response, "cardholderBillingAmount"); //-->000000010000
            utils.out(response, "cardAuthenticationMethodValidationCode"); //-->N
            utils.out(response, "conversionDate"); //-->0727
            utils.out(response, "conversionRate"); //-->61000000
            utils.out(response, "electronicCommerceIndicators"); //-->215
            utils.out(response, "electronicCommerceSecurityLevelIndicatorAndUcafCollectionIndicator"); //-->10
            utils.out(response, "expirationDatePresenceInd"); //-->N
            utils.out(response, "finalAuthorizationIndicator"); //-->0
            utils.out(response, "financialNetworkCode"); //-->MPL
            utils.out(response, "forwardingInstitutionId"); //-->5258
            utils.out(response, "infData"); //-->4814653169024340
            utils.out(response, "integratedCircuitCardRelatedData"); //-->100
            utils.out(response, "issuer"); //-->N
            utils.out(response, "mastercardPromotionCode"); //-->HGMINS
            utils.out(response, "mccMessageId"); //-->MCW
            utils.out(response, "merchantAdviceCode"); //-->03
            utils.out(response, "merchantCategoryCode"); //-->3370
            utils.out(response, "originalAcquiringInstitutionIdCode"); //-->2705
            utils.out(response, "originalElectronicCommerceSecurityLevelIndicatorAndUcafCollectionIndicator"); //-->0
            utils.out(response, "originalIssuerForwardingInstitutionIdCode"); //-->5258
            utils.out(response, "originalMessageTypeIdentifier"); //-->0110
            utils.out(response, "pinServiceCode"); //-->TV
            utils.out(response, "posCardDataTerminalInputCapability"); //-->0
            utils.out(response, "posCardholderPresence"); //-->0
            utils.out(response, "posCardPresence"); //-->0
            utils.out(response, "posEntryModePan"); //-->05
            utils.out(response, "posEntryModePin"); //-->1
            utils.out(response, "posTerminalAttendance"); //-->0
            utils.out(response, "posTerminalLocation"); //-->0
            utils.out(response, "posTransactionStatus"); //-->0
            utils.out(response, "primaryAccountNumber"); //-->510001000000134
            utils.out(response, "primaryAccountNumberAccountRange"); //-->888888888
            utils.out(response, "privateData"); //-->38038405002UU90220107ACQREG10207ISSREG17104C2C 102101920CM04020CM0402S1I13530411000000000000501006040CVA07040CXL00031440101R0201A4011SN402RG123A42430106GLBALL02050000103021704020105021606020041280110019 020 03100485604875
            utils.out(response, "processingCode"); //-->00
            utils.out(response, "realTimeSubstantiationIndicator"); //-->0
            utils.out(response, "reasonForUcafCollectionIndicatorDowngrade"); //-->210
            utils.out(response, "recordDataPresenceIndicator"); //-->N
            utils.out(response, "responseCode"); //-->00
            utils.out(response, "retrievalReferenceNumber"); //-->730607628081
            utils.out(response, "settlementActualAmount"); //-->000000010000
            utils.out(response, "settlementDate"); //-->0728
            utils.out(response, "stan"); //-->002511
            utils.out(response, "storageTechnology"); //-->01
            utils.out(response, "systemsTraceAuditNumber"); //-->002511
            utils.out(response, "tokenAssuranceLevel"); //-->99
            utils.out(response, "tokenRequestorId"); //-->12345678936
            utils.out(response, "track1"); //-->N
            utils.out(response, "track2"); //-->Y101
            utils.out(response, "transactionActualAmount"); //-->000000010000
            utils.out(response, "transactionAmountLocal"); //-->10000
            utils.out(response, "transactionCategoryCode"); //-->R
            utils.out(response, "transactionCurrencyCode"); //-->840
            utils.out(response, "transactionType"); //-->Authorization
            utils.out(response, "transmissionDateAndTime"); //-->728075837
            utils.out(response, "universalCardholderAuthenticationFieldUcaf"); //-->PARTIALSHIPMENT0000000000000 ALrP9TrnbuMCAANkrglrAoABFA&#x3D;&#x3D; ACFa0knOekU7AAnwugwJAoABFA&#x3D;&#x3D; ICQk7mTHQKqwx9tKqqY&#x3D; hgeiVCYsZLM8YwAAAFcqCVkAAAA&#x3D; hgeiVCYsZLM8YwAAAIFuCEYAAAA&#x3D; hmJA2XBYTaCdCAEAABneAAAAAAA&#x3D;
            utils.out(response, "vcnProductCode"); //-->MCO
            utils.out(response, "walletIdentifier"); //-->100

        } catch (ApiException e) {
            utils.err("HttpStatus: "+e.getHttpStatus());
            utils.err("Message: "+e.getMessage());
            utils.err("ReasonCode: "+e.getReasonCode());
            utils.err("Source: "+e.getSource());
        }
    }
}
