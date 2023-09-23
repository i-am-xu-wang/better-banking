package betterbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Set of elements used to provide details of a generic interest amount related to the statement resource.
 */
@Schema(description = "Set of elements used to provide details of a generic interest amount related to the statement resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-17T00:31:53.138782330Z[GMT]")


public class OBStatement2StatementInterest   {
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
  private OBActiveOrHistoricCurrencyAndAmount7 amount = null;

  public OBStatement2StatementInterest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description that may be available for the statement interest.
   * @return description
   **/
  @Schema(description = "Description that may be available for the statement interest.")
  
  @Size(min=1,max=128)   public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OBStatement2StatementInterest creditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
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

  public OBStatement2StatementInterest type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Interest amount type, in a coded form.
   * @return type
   **/
  @Schema(required = true, description = "Interest amount type, in a coded form.")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OBStatement2StatementInterest rate(BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  /**
   * field representing a percentage (e.g. 0.05 represents 5% and 0.9525 represents 95.25%). Note the number of decimal places may vary.
   * @return rate
   **/
  @Schema(description = "field representing a percentage (e.g. 0.05 represents 5% and 0.9525 represents 95.25%). Note the number of decimal places may vary.")
  
    @Valid
    public BigDecimal getRate() {
    return rate;
  }

  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }

  public OBStatement2StatementInterest rateType(String rateType) {
    this.rateType = rateType;
    return this;
  }

  /**
   * Description that may be available for the statement Interest rate type.
   * @return rateType
   **/
  @Schema(description = "Description that may be available for the statement Interest rate type.")
  
    public String getRateType() {
    return rateType;
  }

  public void setRateType(String rateType) {
    this.rateType = rateType;
  }

  public OBStatement2StatementInterest frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Specifies the statement fee type requested
   * @return frequency
   **/
  @Schema(description = "Specifies the statement fee type requested")
  
    public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public OBStatement2StatementInterest amount(OBActiveOrHistoricCurrencyAndAmount7 amount) {
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
    public OBActiveOrHistoricCurrencyAndAmount7 getAmount() {
    return amount;
  }

  public void setAmount(OBActiveOrHistoricCurrencyAndAmount7 amount) {
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
    OBStatement2StatementInterest obStatement2StatementInterest = (OBStatement2StatementInterest) o;
    return Objects.equals(this.description, obStatement2StatementInterest.description) &&
        Objects.equals(this.creditDebitIndicator, obStatement2StatementInterest.creditDebitIndicator) &&
        Objects.equals(this.type, obStatement2StatementInterest.type) &&
        Objects.equals(this.rate, obStatement2StatementInterest.rate) &&
        Objects.equals(this.rateType, obStatement2StatementInterest.rateType) &&
        Objects.equals(this.frequency, obStatement2StatementInterest.frequency) &&
        Objects.equals(this.amount, obStatement2StatementInterest.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, creditDebitIndicator, type, rate, rateType, frequency, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2StatementInterest {\n");
    
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
