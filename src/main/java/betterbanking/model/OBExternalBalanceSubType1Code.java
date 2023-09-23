package betterbanking.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Amount sub type, in a coded form.
 */
public enum OBExternalBalanceSubType1Code {
  BASECURRENCY("BaseCurrency"),
    LOCALCURRENCY("LocalCurrency");

  private String value;

  OBExternalBalanceSubType1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBExternalBalanceSubType1Code fromValue(String text) {
    for (OBExternalBalanceSubType1Code b : OBExternalBalanceSubType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
