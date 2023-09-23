package betterbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBStandingOrder6
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-17T00:31:53.138782330Z[GMT]")


public class OBStandingOrder6   {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("StandingOrderId")
  private String standingOrderId = null;

  @JsonProperty("Frequency")
  private String frequency = null;

  @JsonProperty("Reference")
  private String reference = null;

  @JsonProperty("FirstPaymentDateTime")
  private OffsetDateTime firstPaymentDateTime = null;

  @JsonProperty("NextPaymentDateTime")
  private OffsetDateTime nextPaymentDateTime = null;

  @JsonProperty("LastPaymentDateTime")
  private OffsetDateTime lastPaymentDateTime = null;

  @JsonProperty("FinalPaymentDateTime")
  private OffsetDateTime finalPaymentDateTime = null;

  @JsonProperty("NumberOfPayments")
  private String numberOfPayments = null;

  @JsonProperty("StandingOrderStatusCode")
  private OBExternalStandingOrderStatus1Code standingOrderStatusCode = null;

  @JsonProperty("FirstPaymentAmount")
  private OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount = null;

  @JsonProperty("NextPaymentAmount")
  private OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount = null;

  @JsonProperty("LastPaymentAmount")
  private OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount = null;

  @JsonProperty("FinalPaymentAmount")
  private OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount = null;

  @JsonProperty("CreditorAgent")
  private OBBranchAndFinancialInstitutionIdentification51 creditorAgent = null;

  @JsonProperty("CreditorAccount")
  private OBCashAccount51 creditorAccount = null;

  @JsonProperty("SupplementaryData")
  private OBSupplementaryData1 supplementaryData = null;

  public OBStandingOrder6 accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
   * @return accountId
   **/
  @Schema(required = true, description = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
      @NotNull

  @Size(min=1,max=40)   public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBStandingOrder6 standingOrderId(String standingOrderId) {
    this.standingOrderId = standingOrderId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the standing order resource. This identifier has no meaning to the account owner.
   * @return standingOrderId
   **/
  @Schema(description = "A unique and immutable identifier used to identify the standing order resource. This identifier has no meaning to the account owner.")
  
  @Size(min=1,max=40)   public String getStandingOrderId() {
    return standingOrderId;
  }

  public void setStandingOrderId(String standingOrderId) {
    this.standingOrderId = standingOrderId;
  }

  public OBStandingOrder6 frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Individual Definitions: NotKnown - Not Known EvryDay - Every day EvryWorkgDay - Every working day IntrvlDay - An interval specified in number of calendar days (02 to 31) IntrvlWkDay - An interval specified in weeks (01 to 09), and the day within the week (01 to 07) WkInMnthDay - A monthly interval, specifying the week of the month (01 to 05) and day within the week (01 to 07) IntrvlMnthDay - An interval specified in months (between 01 to 06, 12, 24), specifying the day within the month (-05 to -01, 01 to 31) QtrDay - Quarterly (either ENGLISH, SCOTTISH, or RECEIVED) ENGLISH = Paid on the 25th March, 24th June, 29th September and 25th December. SCOTTISH = Paid on the 2nd February, 15th May, 1st August and 11th November. RECEIVED = Paid on the 20th March, 19th June, 24th September and 20th December. Individual Patterns: NotKnown (ScheduleCode) EvryDay (ScheduleCode) EvryWorkgDay (ScheduleCode) IntrvlDay:NoOfDay (ScheduleCode + NoOfDay) IntrvlWkDay:IntervalInWeeks:DayInWeek (ScheduleCode + IntervalInWeeks + DayInWeek) WkInMnthDay:WeekInMonth:DayInWeek (ScheduleCode + WeekInMonth + DayInWeek) IntrvlMnthDay:IntervalInMonths:DayInMonth (ScheduleCode + IntervalInMonths + DayInMonth) QtrDay: + either (ENGLISH, SCOTTISH or RECEIVED) ScheduleCode + QuarterDay The regular expression for this element combines five smaller versions for each permitted pattern. To aid legibility - the components are presented individually here: NotKnown EvryDay EvryWorkgDay IntrvlDay:((0[2-9])|([1-2][0-9])|3[0-1]) IntrvlWkDay:0[1-9]:0[1-7] WkInMnthDay:0[1-5]:0[1-7] IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]) QtrDay:(ENGLISH|SCOTTISH|RECEIVED) Full Regular Expression: ^(NotKnown)$|^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlDay:((0[2-9])|([1-2][0-9])|3[0-1]))$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$
   * @return frequency
   **/
  @Schema(required = true, description = "Individual Definitions: NotKnown - Not Known EvryDay - Every day EvryWorkgDay - Every working day IntrvlDay - An interval specified in number of calendar days (02 to 31) IntrvlWkDay - An interval specified in weeks (01 to 09), and the day within the week (01 to 07) WkInMnthDay - A monthly interval, specifying the week of the month (01 to 05) and day within the week (01 to 07) IntrvlMnthDay - An interval specified in months (between 01 to 06, 12, 24), specifying the day within the month (-05 to -01, 01 to 31) QtrDay - Quarterly (either ENGLISH, SCOTTISH, or RECEIVED) ENGLISH = Paid on the 25th March, 24th June, 29th September and 25th December. SCOTTISH = Paid on the 2nd February, 15th May, 1st August and 11th November. RECEIVED = Paid on the 20th March, 19th June, 24th September and 20th December. Individual Patterns: NotKnown (ScheduleCode) EvryDay (ScheduleCode) EvryWorkgDay (ScheduleCode) IntrvlDay:NoOfDay (ScheduleCode + NoOfDay) IntrvlWkDay:IntervalInWeeks:DayInWeek (ScheduleCode + IntervalInWeeks + DayInWeek) WkInMnthDay:WeekInMonth:DayInWeek (ScheduleCode + WeekInMonth + DayInWeek) IntrvlMnthDay:IntervalInMonths:DayInMonth (ScheduleCode + IntervalInMonths + DayInMonth) QtrDay: + either (ENGLISH, SCOTTISH or RECEIVED) ScheduleCode + QuarterDay The regular expression for this element combines five smaller versions for each permitted pattern. To aid legibility - the components are presented individually here: NotKnown EvryDay EvryWorkgDay IntrvlDay:((0[2-9])|([1-2][0-9])|3[0-1]) IntrvlWkDay:0[1-9]:0[1-7] WkInMnthDay:0[1-5]:0[1-7] IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]) QtrDay:(ENGLISH|SCOTTISH|RECEIVED) Full Regular Expression: ^(NotKnown)$|^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlDay:((0[2-9])|([1-2][0-9])|3[0-1]))$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$")
      @NotNull

  @Pattern(regexp="^(NotKnown)$|^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlDay:((0[2-9])|([1-2][0-9])|3[0-1]))$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$")   public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public OBStandingOrder6 reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.
   * @return reference
   **/
  @Schema(description = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.")
  
  @Size(min=1,max=35)   public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public OBStandingOrder6 firstPaymentDateTime(OffsetDateTime firstPaymentDateTime) {
    this.firstPaymentDateTime = firstPaymentDateTime;
    return this;
  }

  /**
   * The date on which the first payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return firstPaymentDateTime
   **/
  @Schema(description = "The date on which the first payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  
    @Valid
    public OffsetDateTime getFirstPaymentDateTime() {
    return firstPaymentDateTime;
  }

  public void setFirstPaymentDateTime(OffsetDateTime firstPaymentDateTime) {
    this.firstPaymentDateTime = firstPaymentDateTime;
  }

  public OBStandingOrder6 nextPaymentDateTime(OffsetDateTime nextPaymentDateTime) {
    this.nextPaymentDateTime = nextPaymentDateTime;
    return this;
  }

  /**
   * The date on which the next payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return nextPaymentDateTime
   **/
  @Schema(description = "The date on which the next payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  
    @Valid
    public OffsetDateTime getNextPaymentDateTime() {
    return nextPaymentDateTime;
  }

  public void setNextPaymentDateTime(OffsetDateTime nextPaymentDateTime) {
    this.nextPaymentDateTime = nextPaymentDateTime;
  }

  public OBStandingOrder6 lastPaymentDateTime(OffsetDateTime lastPaymentDateTime) {
    this.lastPaymentDateTime = lastPaymentDateTime;
    return this;
  }

  /**
   * The date on which the last (most recent) payment for a Standing Order schedule was made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return lastPaymentDateTime
   **/
  @Schema(description = "The date on which the last (most recent) payment for a Standing Order schedule was made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  
    @Valid
    public OffsetDateTime getLastPaymentDateTime() {
    return lastPaymentDateTime;
  }

  public void setLastPaymentDateTime(OffsetDateTime lastPaymentDateTime) {
    this.lastPaymentDateTime = lastPaymentDateTime;
  }

  public OBStandingOrder6 finalPaymentDateTime(OffsetDateTime finalPaymentDateTime) {
    this.finalPaymentDateTime = finalPaymentDateTime;
    return this;
  }

  /**
   * The date on which the final payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return finalPaymentDateTime
   **/
  @Schema(description = "The date on which the final payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  
    @Valid
    public OffsetDateTime getFinalPaymentDateTime() {
    return finalPaymentDateTime;
  }

  public void setFinalPaymentDateTime(OffsetDateTime finalPaymentDateTime) {
    this.finalPaymentDateTime = finalPaymentDateTime;
  }

  public OBStandingOrder6 numberOfPayments(String numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
    return this;
  }

  /**
   * Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date.
   * @return numberOfPayments
   **/
  @Schema(description = "Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date.")
  
  @Size(min=1,max=35)   public String getNumberOfPayments() {
    return numberOfPayments;
  }

  public void setNumberOfPayments(String numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
  }

  public OBStandingOrder6 standingOrderStatusCode(OBExternalStandingOrderStatus1Code standingOrderStatusCode) {
    this.standingOrderStatusCode = standingOrderStatusCode;
    return this;
  }

  /**
   * Get standingOrderStatusCode
   * @return standingOrderStatusCode
   **/
  @Schema(description = "")
  
    @Valid
    public OBExternalStandingOrderStatus1Code getStandingOrderStatusCode() {
    return standingOrderStatusCode;
  }

  public void setStandingOrderStatusCode(OBExternalStandingOrderStatus1Code standingOrderStatusCode) {
    this.standingOrderStatusCode = standingOrderStatusCode;
  }

  public OBStandingOrder6 firstPaymentAmount(OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount) {
    this.firstPaymentAmount = firstPaymentAmount;
    return this;
  }

  /**
   * Get firstPaymentAmount
   * @return firstPaymentAmount
   **/
  @Schema(description = "")
  
    @Valid
    public OBActiveOrHistoricCurrencyAndAmount2 getFirstPaymentAmount() {
    return firstPaymentAmount;
  }

  public void setFirstPaymentAmount(OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount) {
    this.firstPaymentAmount = firstPaymentAmount;
  }

  public OBStandingOrder6 nextPaymentAmount(OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount) {
    this.nextPaymentAmount = nextPaymentAmount;
    return this;
  }

  /**
   * Get nextPaymentAmount
   * @return nextPaymentAmount
   **/
  @Schema(description = "")
  
    @Valid
    public OBActiveOrHistoricCurrencyAndAmount3 getNextPaymentAmount() {
    return nextPaymentAmount;
  }

  public void setNextPaymentAmount(OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount) {
    this.nextPaymentAmount = nextPaymentAmount;
  }

  public OBStandingOrder6 lastPaymentAmount(OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount) {
    this.lastPaymentAmount = lastPaymentAmount;
    return this;
  }

  /**
   * Get lastPaymentAmount
   * @return lastPaymentAmount
   **/
  @Schema(description = "")
  
    @Valid
    public OBActiveOrHistoricCurrencyAndAmount11 getLastPaymentAmount() {
    return lastPaymentAmount;
  }

  public void setLastPaymentAmount(OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount) {
    this.lastPaymentAmount = lastPaymentAmount;
  }

  public OBStandingOrder6 finalPaymentAmount(OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount) {
    this.finalPaymentAmount = finalPaymentAmount;
    return this;
  }

  /**
   * Get finalPaymentAmount
   * @return finalPaymentAmount
   **/
  @Schema(description = "")
  
    @Valid
    public OBActiveOrHistoricCurrencyAndAmount4 getFinalPaymentAmount() {
    return finalPaymentAmount;
  }

  public void setFinalPaymentAmount(OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount) {
    this.finalPaymentAmount = finalPaymentAmount;
  }

  public OBStandingOrder6 creditorAgent(OBBranchAndFinancialInstitutionIdentification51 creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

  /**
   * Get creditorAgent
   * @return creditorAgent
   **/
  @Schema(description = "")
  
    @Valid
    public OBBranchAndFinancialInstitutionIdentification51 getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification51 creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public OBStandingOrder6 creditorAccount(OBCashAccount51 creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

  /**
   * Get creditorAccount
   * @return creditorAccount
   **/
  @Schema(description = "")
  
    @Valid
    public OBCashAccount51 getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(OBCashAccount51 creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public OBStandingOrder6 supplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

  /**
   * Get supplementaryData
   * @return supplementaryData
   **/
  @Schema(description = "")
  
    @Valid
    public OBSupplementaryData1 getSupplementaryData() {
    return supplementaryData;
  }

  public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStandingOrder6 obStandingOrder6 = (OBStandingOrder6) o;
    return Objects.equals(this.accountId, obStandingOrder6.accountId) &&
        Objects.equals(this.standingOrderId, obStandingOrder6.standingOrderId) &&
        Objects.equals(this.frequency, obStandingOrder6.frequency) &&
        Objects.equals(this.reference, obStandingOrder6.reference) &&
        Objects.equals(this.firstPaymentDateTime, obStandingOrder6.firstPaymentDateTime) &&
        Objects.equals(this.nextPaymentDateTime, obStandingOrder6.nextPaymentDateTime) &&
        Objects.equals(this.lastPaymentDateTime, obStandingOrder6.lastPaymentDateTime) &&
        Objects.equals(this.finalPaymentDateTime, obStandingOrder6.finalPaymentDateTime) &&
        Objects.equals(this.numberOfPayments, obStandingOrder6.numberOfPayments) &&
        Objects.equals(this.standingOrderStatusCode, obStandingOrder6.standingOrderStatusCode) &&
        Objects.equals(this.firstPaymentAmount, obStandingOrder6.firstPaymentAmount) &&
        Objects.equals(this.nextPaymentAmount, obStandingOrder6.nextPaymentAmount) &&
        Objects.equals(this.lastPaymentAmount, obStandingOrder6.lastPaymentAmount) &&
        Objects.equals(this.finalPaymentAmount, obStandingOrder6.finalPaymentAmount) &&
        Objects.equals(this.creditorAgent, obStandingOrder6.creditorAgent) &&
        Objects.equals(this.creditorAccount, obStandingOrder6.creditorAccount) &&
        Objects.equals(this.supplementaryData, obStandingOrder6.supplementaryData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, standingOrderId, frequency, reference, firstPaymentDateTime, nextPaymentDateTime, lastPaymentDateTime, finalPaymentDateTime, numberOfPayments, standingOrderStatusCode, firstPaymentAmount, nextPaymentAmount, lastPaymentAmount, finalPaymentAmount, creditorAgent, creditorAccount, supplementaryData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStandingOrder6 {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    standingOrderId: ").append(toIndentedString(standingOrderId)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    firstPaymentDateTime: ").append(toIndentedString(firstPaymentDateTime)).append("\n");
    sb.append("    nextPaymentDateTime: ").append(toIndentedString(nextPaymentDateTime)).append("\n");
    sb.append("    lastPaymentDateTime: ").append(toIndentedString(lastPaymentDateTime)).append("\n");
    sb.append("    finalPaymentDateTime: ").append(toIndentedString(finalPaymentDateTime)).append("\n");
    sb.append("    numberOfPayments: ").append(toIndentedString(numberOfPayments)).append("\n");
    sb.append("    standingOrderStatusCode: ").append(toIndentedString(standingOrderStatusCode)).append("\n");
    sb.append("    firstPaymentAmount: ").append(toIndentedString(firstPaymentAmount)).append("\n");
    sb.append("    nextPaymentAmount: ").append(toIndentedString(nextPaymentAmount)).append("\n");
    sb.append("    lastPaymentAmount: ").append(toIndentedString(lastPaymentAmount)).append("\n");
    sb.append("    finalPaymentAmount: ").append(toIndentedString(finalPaymentAmount)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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
