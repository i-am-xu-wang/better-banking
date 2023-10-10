package betterbanking;

import betterbanking.entity.Transaction;
import betterbanking.repository.MerchantDetailsRepository;
import betterbanking.repository.TransactionApiClient;
import betterbanking.service.TransactionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


@SpringBootTest
public class TransactionServiceTest {
    @Mock private TransactionApiClient transactionApiClient;
    @Mock
    private MerchantDetailsRepository merchantDetailsRepository;
    @InjectMocks
    private TransactionService transactionService;

    @BeforeEach
    void setup() {
        when(transactionApiClient.findAllByAccountNumber(any())).thenReturn(List.of(new Transaction()));
    }
    @Test void testFindAllByAccountNumber(){
        assertTrue(transactionService.findAllByAccountNumber(123).size() > 0);
    }

}
