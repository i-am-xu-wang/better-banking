package betterbanking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Transaction {
    String type;
    String date;
    Integer accountNumber;
    String currency;
    Double amount;
    String merchantName;
    String merchantLogo;
}
