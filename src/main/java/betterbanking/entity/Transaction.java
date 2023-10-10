package betterbanking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    String type;
    Date date;
    Integer accountNumber;
    String currency;
    Double amount;
    String merchantName;
    String merchantLogo;
}
