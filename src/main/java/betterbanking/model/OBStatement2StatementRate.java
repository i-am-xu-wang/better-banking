package betterbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Set of elements used to provide details of a generic rate related to the statement resource.
 */
@Schema(description = "Set of elements used to provide details of a generic rate related to the statement resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-17T00:31:53.138782330Z[GMT]")


public class OBStatement2StatementRate   {
  @JsonProperty("Rate")
  private String rate = null;

  @JsonProperty("Type")
  private String type = null;

  public OBStatement2StatementRate rate(String rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Rate associated with the statement rate type.
   * @return rate
   **/
  @Schema(required = true, description = "Rate associated with the statement rate type.")
      @NotNull

  @Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")   public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  public OBStatement2StatementRate type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Statement rate type, in a coded form.
   * @return type
   **/
  @Schema(required = true, description = "Statement rate type, in a coded form.")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement2StatementRate obStatement2StatementRate = (OBStatement2StatementRate) o;
    return Objects.equals(this.rate, obStatement2StatementRate.rate) &&
        Objects.equals(this.type, obStatement2StatementRate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2StatementRate {\n");
    
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
