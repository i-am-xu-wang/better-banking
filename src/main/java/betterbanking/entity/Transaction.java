package betterbanking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    String type;
    Date date;
    Integer accountNumber;
    String currency;
    Double amount;
    String merchantName;
    String merchantLogo;
}
