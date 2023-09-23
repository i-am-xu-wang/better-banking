package betterbanking.repository;

import betterbanking.Transaction;
import betterbanking.integration.OBTransactionAdapter;
import betterbanking.model.OBReadTransaction6;
import betterbanking.model.OBTransaction6;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Repository
public class RESTTransactionsAPIClient implements TransactionApiClient {
    private WebClient client;
    private OBTransactionAdapter obTransactionAdapter = new OBTransactionAdapter();

    @Autowired
    public RESTTransactionsAPIClient(WebClient client) {
        this.client = client;
    }

    public List<Transaction> findAllByAccountNumber(Integer accountNumber) {
        OBReadTransaction6 res = null;
        try {
            res = client.get()
                    .uri("accounts/" + accountNumber + "/transactions")
                    .retrieve()
                    .bodyToMono(OBReadTransaction6.class).block();
        } catch (Exception ex) {
            log.error("failed to retrieve account information due to the following reason {}", ex.getMessage());
        }
        if (res == null || res.getData() == null) {
            return new ArrayList<>();
        }
        List<Transaction> transactions = new ArrayList<>();
        for (OBTransaction6 ob : res.getData().getTransaction()) {
            transactions.add(obTransactionAdapter.adapt(ob));
        }
        return transactions;
    }

}
