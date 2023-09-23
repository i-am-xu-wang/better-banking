package betterbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Set of elements used to provide details of a fee for the statement resource.
 */
@Schema(description = "Set of elements used to provide details of a fee for the statement resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-17T00:31:53.138782330Z[GMT]")


public class OBStatement2StatementFee   {
  @JsonProperty("Description")
  private String description = null;

  @JsonProperty("CreditDebitIndicator")
  private OBCreditDebitCode0 creditDebitIndicator = null;

  @JsonProperty("Type")
  private String type = null;

  @JsonProperty("Rate")
  private BigDecimal rate = null;

  @JsonProperty("RateType")
  private String rateType = null;

  @JsonProperty("Frequency")
  private String frequency = null;

  @JsonProperty("Amount")
  private OBActiveOrHistoricCurrencyAndAmount6 amount = null;

  public OBStatement2StatementFee description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description that may be available for the statement fee.
   * @return description
   **/
  @Schema(description = "Description that may be available for the statement fee.")
  
  @Size(min=1,max=128)   public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OBStatement2StatementFee creditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
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

  public OBStatement2StatementFee type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Fee type, in a coded form.
   * @return type
   **/
  @Schema(required = true, description = "Fee type, in a coded form.")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OBStatement2StatementFee rate(BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Rate charged for Statement Fee (where it is charged in terms of a rate rather than an amount)
   * @return rate
   **/
  @Schema(description = "Rate charged for Statement Fee (where it is charged in terms of a rate rather than an amount)")
  
    @Valid
    public BigDecimal getRate() {
    return rate;
  }

  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }

  public OBStatement2StatementFee rateType(String rateType) {
    this.rateType = rateType;
    return this;
  }

  /**
   * Description that may be available for the statement fee rate type.
   * @return rateType
   **/
  @Schema(description = "Description that may be available for the statement fee rate type.")
  
    public String getRateType() {
    return rateType;
  }

  public void setRateType(String rateType) {
    this.rateType = rateType;
  }

  public OBStatement2StatementFee frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * How frequently the fee is applied to the Account.
   * @return frequency
   **/
  @Schema(description = "How frequently the fee is applied to the Account.")
  
    public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public OBStatement2StatementFee amount(OBActiveOrHistoricCurrencyAndAmount6 amount) {
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
    public OBActiveOrHistoricCurrencyAndAmount6 getAmount() {
    return amount;
  }

  public void setAmount(OBActiveOrHistoricCurrencyAndAmount6 amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement2StatementFee obStatement2StatementFee = (OBStatement2StatementFee) o;
    return Objects.equals(this.description, obStatement2StatementFee.description) &&
        Objects.equals(this.creditDebitIndicator, obStatement2StatementFee.creditDebitIndicator) &&
        Objects.equals(this.type, obStatement2StatementFee.type) &&
        Objects.equals(this.rate, obStatement2StatementFee.rate) &&
        Objects.equals(this.rateType, obStatement2StatementFee.rateType) &&
        Objects.equals(this.frequency, obStatement2StatementFee.frequency) &&
        Objects.equals(this.amount, obStatement2StatementFee.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, creditDebitIndicator, type, rate, rateType, frequency, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2StatementFee {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
