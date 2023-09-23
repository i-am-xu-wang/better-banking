package betterbanking.integration;

import betterbanking.Transaction;
import betterbanking.model.OBTransaction6;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class OBTransactionAdapter {

    private Function<OBTransaction6, Transaction> mapToTransaction = obTransaction6 -> {
        Transaction transaction = new Transaction();

        transaction.setAccountNumber(getAccountNumberFrom(obTransaction6));

        double amount = getAmountFrom(obTransaction6);
        double exchangeRate = getExchangeRateFrom(obTransaction6);
        transaction.setAmount(amount * exchangeRate);

        setIfPresent(obTransaction6, o -> o.getCurrencyExchange().getUnitCurrency(), transaction::setCurrency);
        setIfPresent(obTransaction6, o -> o.getCreditDebitIndicator().toString(), transaction::setType);
        setIfPresent(obTransaction6, o -> o.getMerchantDetails().getMerchantName(), transaction::setMerchantName);

        return transaction;
    };

    public Transaction adapt(final OBTransaction6 transaction6) {
        return mapToTransaction.apply(transaction6);
    }

    private int getAccountNumberFrom(OBTransaction6 obTransaction6) {
        return Integer.valueOf(obTransaction6.getAccountId());
    }

    private double getAmountFrom(OBTransaction6 obTransaction6) {
        return lift(obTransaction6, o -> Double.valueOf(o.getAmount().getAmount())).orElse(0.0);
    }

    private double getExchangeRateFrom(OBTransaction6 obTransaction6) {
        return lift(obTransaction6, o -> o.getCurrencyExchange().getExchangeRate().doubleValue()).orElse(1.0);
    }

    private <T> void setIfPresent(OBTransaction6 obTransaction6, Function<OBTransaction6, T> getterFunction, Consumer<T> setterFunction) {
        lift(obTransaction6, getterFunction).ifPresent(setterFunction);
    }

    private <T> Optional<T> lift(final OBTransaction6 transaction6, Function<OBTransaction6, T> func) {
        try {
            return Optional.of(func.apply(transaction6));
        } catch (Exception ex) {
            return Optional.empty();
        }
    }


}
