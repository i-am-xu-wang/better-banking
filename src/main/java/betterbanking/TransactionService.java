package betterbanking;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    public List<Transaction> findAllByAccountNumber(Integer accountNumber) {
        return List.of(
            new Transaction("credit", null, 1234567, "USD", 100.00, "acme", "acme.png")
        );
    }
}
