package betterbanking.repository;

import betterbanking.Transaction;

import java.util.List;

public interface TransactionApiClient {
    List<Transaction> findAllByAccountNumber(Integer accountNumber);
}
