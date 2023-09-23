package betterbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Other tariff type which is not in the standard list.
 */
@Schema(description = "Other tariff type which is not in the standard list.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-17T00:31:53.138782330Z[GMT]")


public class OBReadProduct2DataOtherProductTypeOtherTariffType   {
  @JsonProperty("Code")
  private String code = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Description")
  private String description = null;

  public OBReadProduct2DataOtherProductTypeOtherTariffType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The four letter Mnemonic used within an XML file to identify a code
   * @return code
   **/
  @Schema(description = "The four letter Mnemonic used within an XML file to identify a code")
  
  @Pattern(regexp="^\\\\w{0,4}$")   public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OBReadProduct2DataOtherProductTypeOtherTariffType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Long name associated with the code
   * @return name
   **/
  @Schema(required = true, description = "Long name associated with the code")
      @NotNull

  @Size(min=1,max=70)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBReadProduct2DataOtherProductTypeOtherTariffType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description to describe the purpose of the code
   * @return description
   **/
  @Schema(required = true, description = "Description to describe the purpose of the code")
      @NotNull

  @Size(min=1,max=350)   public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataOtherProductTypeOtherTariffType obReadProduct2DataOtherProductTypeOtherTariffType = (OBReadProduct2DataOtherProductTypeOtherTariffType) o;
    return Objects.equals(this.code, obReadProduct2DataOtherProductTypeOtherTariffType.code) &&
        Objects.equals(this.name, obReadProduct2DataOtherProductTypeOtherTariffType.name) &&
        Objects.equals(this.description, obReadProduct2DataOtherProductTypeOtherTariffType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeOtherTariffType {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
