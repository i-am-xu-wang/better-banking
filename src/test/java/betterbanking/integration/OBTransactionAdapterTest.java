package betterbanking.integration;

import betterbanking.entity.Transaction;
import betterbanking.model.OBActiveOrHistoricCurrencyAndAmount9;
import betterbanking.model.OBCreditDebitCode1;
import betterbanking.model.OBTransaction6;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OBTransactionAdapterTest {
    final OBTransactionAdapter adapter = new OBTransactionAdapter();
    @Test
    public void testNullMerchant() {
        OBTransaction6 ob = new OBTransaction6();
        ob.setAccountId("1234567");
        ob.setCreditDebitIndicator(OBCreditDebitCode1.DEBIT);
        ob.setAmount(amount());
        Transaction t = adapter.adapt(ob);
        assertEquals(null, t.getMerchantName());
    }

    @Test
    public void testInvalidAmount() {
        OBTransaction6 ob = new OBTransaction6();
        ob.setAccountId("1234567");
        ob.setCreditDebitIndicator(OBCreditDebitCode1.DEBIT);
        ob.setAmount(invalidAmount());
        Transaction t = adapter.adapt(ob);
        assertEquals(0.0d, t.getAmount());
    }


    private OBActiveOrHistoricCurrencyAndAmount9 amount() {
        var amount = new OBActiveOrHistoricCurrencyAndAmount9();
        amount.setAmount("100.00");
        amount.setCurrency("USD");
        return amount;
    }

    private OBActiveOrHistoricCurrencyAndAmount9 invalidAmount() {
        var amount = new OBActiveOrHistoricCurrencyAndAmount9();
        amount.setCurrency("100.00");
        amount.setAmount("USD");
        return amount;
    }

}
