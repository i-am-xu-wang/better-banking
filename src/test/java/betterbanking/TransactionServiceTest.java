package betterbanking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TransactionServiceTest {
    private final TransactionService transactionService = new TransactionService();
    @Test void testFindAllByAccountNumber(){
        assertTrue(transactionService.findAllByAccountNumber(123).size() > 0);
    }

}
