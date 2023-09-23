package betterbanking.repository;

import betterbanking.Transaction;
import betterbanking.integration.OBTransactionAdapter;
import betterbanking.model.OBReadTransaction6;
import betterbanking.model.OBTransaction6;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Base64Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Repository
public class RESTTransactionsAPIClient implements TransactionApiClient {
    private WebClient client;
    private OBTransactionAdapter obTransactionAdapter = new OBTransactionAdapter();

    @Value("${testnet.integration.client}")
    private String clientId;
    @Value("${testnet.integration.secret}")
    private String secret;
    @Autowired
    public RESTTransactionsAPIClient(WebClient client) {
        this.client = client;
    }

    public List<Transaction> findAllByAccountNumber(Integer accountNumber) {
        OBReadTransaction6 res = null;
        String encodedClientCredentials = Base64Util.encode(String.format("%s:%s", clientId, secret));
        try {
            res = client.post()
                    .uri("/oauth/token")
                    .header("Authorization", "Basic " + encodedClientCredentials)
                    .body(BodyInserters.fromFormData("grant_type", "client_credentials"))
                    .retrieve()
                    .bodyToMono(JsonNode.class)
                    .flatMap(tokenResponse -> {
                        String accessTokenValue = tokenResponse.get("access_token")
                                .textValue();
                        return client.get()
                                .uri("accounts/" + accountNumber + "/transactions")
                                .headers(h -> h.setBearerAuth(accessTokenValue))
                                .retrieve()
                                .bodyToMono(OBReadTransaction6.class);
                    })
                    .block();
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
