package betterbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBReadBalance1Data
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-17T00:31:53.138782330Z[GMT]")


public class OBReadBalance1Data   {
  @JsonProperty("Balance")
  @Valid
  private List<OBReadBalance1DataBalance> balance = new ArrayList<OBReadBalance1DataBalance>();

  @JsonProperty("TotalValue")
  private OBReadBalance1DataTotalValue totalValue = null;

  public OBReadBalance1Data balance(List<OBReadBalance1DataBalance> balance) {
    this.balance = balance;
    return this;
  }

  public OBReadBalance1Data addBalanceItem(OBReadBalance1DataBalance balanceItem) {
    this.balance.add(balanceItem);
    return this;
  }

  /**
   * Get balance
   * @return balance
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1)   public List<OBReadBalance1DataBalance> getBalance() {
    return balance;
  }

  public void setBalance(List<OBReadBalance1DataBalance> balance) {
    this.balance = balance;
  }

  public OBReadBalance1Data totalValue(OBReadBalance1DataTotalValue totalValue) {
    this.totalValue = totalValue;
    return this;
  }

  /**
   * Get totalValue
   * @return totalValue
   **/
  @Schema(description = "")
  
    @Valid
    public OBReadBalance1DataTotalValue getTotalValue() {
    return totalValue;
  }

  public void setTotalValue(OBReadBalance1DataTotalValue totalValue) {
    this.totalValue = totalValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadBalance1Data obReadBalance1Data = (OBReadBalance1Data) o;
    return Objects.equals(this.balance, obReadBalance1Data.balance) &&
        Objects.equals(this.totalValue, obReadBalance1Data.totalValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, totalValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadBalance1Data {\n");
    
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    totalValue: ").append(toIndentedString(totalValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
