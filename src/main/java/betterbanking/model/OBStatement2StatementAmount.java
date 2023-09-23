package betterbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Set of elements used to provide details of a generic amount for the statement resource.
 */
@Schema(description = "Set of elements used to provide details of a generic amount for the statement resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-17T00:31:53.138782330Z[GMT]")


public class OBStatement2StatementAmount   {
  @JsonProperty("CreditDebitIndicator")
  private OBCreditDebitCode0 creditDebitIndicator = null;

  @JsonProperty("Type")
  private String type = null;

  @JsonProperty("Amount")
  private OBReadBalance1DataAmount amount = null;

  @JsonProperty("LocalAmount")
  private OBStatement2LocalAmount localAmount = null;

  public OBStatement2StatementAmount creditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

  /**
   * Get creditDebitIndicator
   * @return creditDebitIndicator
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public OBCreditDebitCode0 getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBStatement2StatementAmount type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Amount type, in a coded form.
   * @return type
   **/
  @Schema(required = true, description = "Amount type, in a coded form.")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OBStatement2StatementAmount amount(OBReadBalance1DataAmount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public OBReadBalance1DataAmount getAmount() {
    return amount;
  }

  public void setAmount(OBReadBalance1DataAmount amount) {
    this.amount = amount;
  }

  public OBStatement2StatementAmount localAmount(OBStatement2LocalAmount localAmount) {
    this.localAmount = localAmount;
    return this;
  }

  /**
   * Get localAmount
   * @return localAmount
   **/
  @Schema(description = "")
  
    @Valid
    public OBStatement2LocalAmount getLocalAmount() {
    return localAmount;
  }

  public void setLocalAmount(OBStatement2LocalAmount localAmount) {
    this.localAmount = localAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement2StatementAmount obStatement2StatementAmount = (OBStatement2StatementAmount) o;
    return Objects.equals(this.creditDebitIndicator, obStatement2StatementAmount.creditDebitIndicator) &&
        Objects.equals(this.type, obStatement2StatementAmount.type) &&
        Objects.equals(this.amount, obStatement2StatementAmount.amount) &&
        Objects.equals(this.localAmount, obStatement2StatementAmount.localAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditDebitIndicator, type, amount, localAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2StatementAmount {\n");
    
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    localAmount: ").append(toIndentedString(localAmount)).append("\n");
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
