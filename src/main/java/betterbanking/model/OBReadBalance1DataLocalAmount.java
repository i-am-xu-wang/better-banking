package betterbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Optional component providing the equivalent of Amount in local currency. Default is Local Currency (LCUR) if not specified
 */
@Schema(description = "Optional component providing the equivalent of Amount in local currency. Default is Local Currency (LCUR) if not specified")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-17T00:31:53.138782330Z[GMT]")


public class OBReadBalance1DataLocalAmount   {
  @JsonProperty("Amount")
  private String amount = null;

  @JsonProperty("Currency")
  private String currency = null;

  /**
   * The amount in the local market currency for which the asset is held.
   */
  public enum SubTypeEnum {
    BASECURRENCY("BaseCurrency"),
    
    LOCALCURRENCY("LocalCurrency");

    private String value;

    SubTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SubTypeEnum fromValue(String text) {
      for (SubTypeEnum b : SubTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("SubType")
  private SubTypeEnum subType = SubTypeEnum.LOCALCURRENCY;

  public OBReadBalance1DataLocalAmount amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.
   * @return amount
   **/
  @Schema(required = true, description = "A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.")
      @NotNull

  @Pattern(regexp="^\\d{1,13}$|^\\d{1,13}\\.\\d{1,5}$")   public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public OBReadBalance1DataLocalAmount currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".
   * @return currency
   **/
  @Schema(required = true, description = "A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".")
      @NotNull

  @Pattern(regexp="^[A-Z]{3,3}$")   public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public OBReadBalance1DataLocalAmount subType(SubTypeEnum subType) {
    this.subType = subType;
    return this;
  }

  /**
   * The amount in the local market currency for which the asset is held.
   * @return subType
   **/
  @Schema(description = "The amount in the local market currency for which the asset is held.")
  
    public SubTypeEnum getSubType() {
    return subType;
  }

  public void setSubType(SubTypeEnum subType) {
    this.subType = subType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadBalance1DataLocalAmount obReadBalance1DataLocalAmount = (OBReadBalance1DataLocalAmount) o;
    return Objects.equals(this.amount, obReadBalance1DataLocalAmount.amount) &&
        Objects.equals(this.currency, obReadBalance1DataLocalAmount.currency) &&
        Objects.equals(this.subType, obReadBalance1DataLocalAmount.subType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, subType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadBalance1DataLocalAmount {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
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
