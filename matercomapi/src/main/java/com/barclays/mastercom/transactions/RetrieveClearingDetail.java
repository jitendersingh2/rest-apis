package com.barclays.mastercom.transactions;

import com.barclays.mastercom.utils.Utils;
import com.mastercard.api.core.exception.ApiException;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.mastercom.Transactions;

public class RetrieveClearingDetail {

    public static void main_retrieveClearingDetail() throws Exception {
        final Utils utils = new Utils();

        try {
            RequestMap map = new RequestMap();
            map.set("claim-id", "200002020654");
            map.set("transaction-id", "FIEaEgnM3bwPijwZgjc3Te+Y0ieLbN9ijUugqNSvJmVbO1xs6Jh5iIlmpOpkbax79L8Yj1rBOWBACx+Vj17rzvOepWobpgWNJNdsgHB4ag");
            Transactions response = Transactions.retrieveClearingDetail("", map);

            utils.out(response, "accountLevelManagementAccountCategoryCode"); //-->N
            utils.out(response, "acquirerReferenceData"); //-->25131304365000000033393
            utils.out(response, "acquiringInstitutionIdCode"); //-->999663
            utils.out(response, "approvalCode"); //-->111111
            utils.out(response, "businessCycle"); //-->01
            utils.out(response, "businessServiceArrangementTypeCode"); //-->2
            utils.out(response, "businessServiceIdCode"); //-->10001
            utils.out(response, "cardAcceptorBusinessCode"); //-->5411
            utils.out(response, "cardAcceptorCity"); //-->TEST CITY
            utils.out(response, "cardAcceptorClassificationOverrideIndicator"); //-->N
            utils.out(response, "cardAcceptorCountry"); //-->USA
            utils.out(response, "cardAcceptorIdCode"); //-->Test ID
            utils.out(response, "cardAcceptorName"); //-->TEST MERCHANT NAME
            utils.out(response, "cardAcceptorPostalCode"); //-->TEST ZIP
            utils.out(response, "cardAcceptorState"); //-->MO
            utils.out(response, "cardAcceptorStreetAddress"); //-->TEST STREET ADDRESS
            utils.out(response, "cardAcceptorTerminalId"); //-->73429189
            utils.out(response, "cardAcceptorUrl"); //-->www.yoururl.com
            utils.out(response, "cardCaptureCapability"); //-->9
            utils.out(response, "cardDataInputCapability"); //-->5
            utils.out(response, "cardDataInputMode"); //-->R
            utils.out(response, "cardDataOutputCapability"); //-->0
            utils.out(response, "cardholderAuthenticationCapability"); //-->9
            utils.out(response, "cardholderAuthenticationEntity"); //-->9
            utils.out(response, "cardholderAuthenticationMethod"); //-->9
            utils.out(response, "cardholderBillingAmount"); //-->2500
            utils.out(response, "cardholderBillingCurrencyCode"); //-->840
            utils.out(response, "cardholderFromAccountCode"); //-->00
            utils.out(response, "cardholderPresentData"); //-->0
            utils.out(response, "cardholderToAccountCode"); //-->00
            utils.out(response, "cardIssuerReferenceData"); //-->9000000959
            utils.out(response, "cardPresentData"); //-->1
            utils.out(response, "cardProgramIdentifier"); //-->MCC
            utils.out(response, "centralSiteBusinessDate"); //-->171014
            utils.out(response, "centralSiteProcessingDateOriginalMessage"); //-->060318
            utils.out(response, "currencyCodeCardholderBilling"); //-->840
            utils.out(response, "currencyCodeReconciliation"); //-->840
            utils.out(response, "currencyCodeTransaction"); //-->840
            utils.out(response, "currencyExponentCardholderBilling"); //-->2
            utils.out(response, "currencyExponentReconciliation"); //-->2
            utils.out(response, "currencyExponentTransaction"); //-->2
            utils.out(response, "dataRecord"); //-->1
            utils.out(response, "electronicCommerceCardAuth"); //-->0
            utils.out(response, "electronicCommerceSecurityLevelIndicator"); //-->0
            utils.out(response, "electronicCommerceUcafCollectionIndicator"); //-->2
            utils.out(response, "forwardingInstitutionIdCode"); //-->5258
            utils.out(response, "functionCode"); //-->200
            utils.out(response, "gcmsProductIndentifier"); //-->MPL
            utils.out(response, "installmentPaymentData"); //-->20
            utils.out(response, "installmentPaymentDataAnnualPercentageRate"); //-->0
            utils.out(response, "installmentPaymentDataFirstInstallmentAmount"); //-->24
            utils.out(response, "installmentPaymentDataInstallmentFee"); //-->0
            utils.out(response, "installmentPaymentDataInterestRate"); //-->23
            utils.out(response, "installmentPaymentDataNumberInstallments"); //-->2
            utils.out(response, "installmentPaymentDataSubsequentInstallmentAmount"); //-->20
            utils.out(response, "integratedCircuitCardRelatedData"); //-->100
            utils.out(response, "interchangeRateDesignator"); //-->79
            utils.out(response, "licensedProductIndentifier"); //-->MPL
            utils.out(response, "legalCorporateName"); //-->COMPANY ABC LLC
            utils.out(response, "localTransactionDateTime"); //-->170719010100
            utils.out(response, "mastercardAssignedId"); //-->PDS176
            utils.out(response, "mastercardAssignedIdOverrideIndicator"); //-->N
            utils.out(response, "mastercardMappingServiceAccountNumber"); //-->5154676300000001
            utils.out(response, "masterPassIncentiveIndicator"); //-->N
            utils.out(response, "messageReasonCode"); //-->1401
            utils.out(response, "messageReversalIndicator"); //-->R
            utils.out(response, "originatingMessageFormat"); //-->2
            utils.out(response, "partnerIdCode"); //-->PDS190
            utils.out(response, "pinCaptureCapability"); //-->1
            utils.out(response, "primaryAccountNumber"); //-->5154676300000001
            utils.out(response, "processingCode"); //-->00
            utils.out(response, "productOverrideIndicator"); //-->Y
            utils.out(response, "programRegistrationId"); //-->C57
            utils.out(response, "qpsPaypassEligibilityIndicator"); //-->I
            utils.out(response, "rateIndicator"); //-->N
            utils.out(response, "receivingInstitutionIdCode"); //-->2202
            utils.out(response, "reconciliationAmount"); //-->2500
            utils.out(response, "reconciliationCurrencyCode"); //-->840
            utils.out(response, "remotePaymentsProgramData"); //-->1
            utils.out(response, "serviceCode"); //-->200
            utils.out(response, "settlementData"); //-->1
            utils.out(response, "settlementIndicator"); //-->M
            utils.out(response, "specialConditionsIndicator"); //-->N
            utils.out(response, "terminalDataOutputCapability"); //-->0
            utils.out(response, "terminalOperatingEnvironment"); //-->2
            utils.out(response, "terminalType"); //-->CT6
            utils.out(response, "tokenRequestorId"); //-->vwxyz123456
            utils.out(response, "transactionAmountLocal"); //-->2500
            utils.out(response, "transactionCategoryIndicator"); //-->02
            utils.out(response, "transactionCurrencyCode"); //-->840
            utils.out(response, "transactionDestinationInstitutionIdCode"); //-->2705
            utils.out(response, "transactionLifeCycleId"); //-->MPL2OSTCV0728
            utils.out(response, "transactionOriginatorInstitutionIdCode"); //-->5258
            utils.out(response, "transactionType"); //-->Clearing
            utils.out(response, "transitProgramCode"); //-->05
            utils.out(response, "walletIdentifierMdes"); //-->101

        } catch (ApiException e) {
            utils.err("HttpStatus: "+e.getHttpStatus());
            utils.err("Message: "+e.getMessage());
            utils.err("ReasonCode: "+e.getReasonCode());
            utils.err("Source: "+e.getSource());
        }
    }
}
