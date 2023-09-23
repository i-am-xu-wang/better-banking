package betterbanking.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class InMemoryMerchantDetailsRepository implements MerchantDetailsRepository {
    Map<String, String> map;
    public InMemoryMerchantDetailsRepository() {
        map = new HashMap<>();
        //map.put("acme", ""acme-logo.png)
    }
    @Override
    public Optional<String> findMerchantLogo(String merchantName) {
        if (merchantName == null) {
            return Optional.empty();
        }
        return Optional.of(merchantName + ".png");
    }
}
