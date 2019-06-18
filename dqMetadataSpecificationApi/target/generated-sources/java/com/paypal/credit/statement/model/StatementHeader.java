package com.paypal.credit.statement.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.*;
import com.paypal.credit.statement.model.Money;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;

        /**
* A statement header that includes info such as statement date, balance amount and availability of PDF and Snapshot formats of the statement
*/
@javax.annotation.Generated(value = "com.paypal.ppaas.swagger.codegen.PPaaSJAXRSSwaggerCodegen", date = "2019-06-18T17:06:52.818+05:30[Asia/Calcutta]")
@JsonInclude(value = JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StatementHeader   {
        @JsonProperty("id")
        @NotNull(message = "MISSING_REQUIRED_PARAMETER")



        private Long id;

        @JsonProperty("closing_date")
        @NotNull(message = "MISSING_REQUIRED_PARAMETER")
    @Pattern(regexp = "^[0-9]{4}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$", message = "INVALID_PARAMETER_SYNTAX")
        @Size(min = 10, max = 10, message = "INVALID_STRING_LENGTH")



        private String closingDate;

        @JsonProperty("start_date")
        @Pattern(regexp = "^[0-9]{4}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$", message = "INVALID_PARAMETER_SYNTAX")
        @Size(min = 10, max = 10, message = "INVALID_STRING_LENGTH")



        private String startDate;

        @JsonProperty("balance")
                            @Valid
    @NotNull(message = "MISSING_REQUIRED_PARAMETER")



        private Money balance = null;

        @JsonProperty("available_media_types")
    


        private List<String> availableMediaTypes = null;

    public StatementHeader id(Long id) {
    this.id = id;
    return this;
    }

    /**
        * Sequence generated Statement ID.
    * @return id
    **/
    public Long getId() {
    return id;
    }

    public void setId(Long id) {
    this.id = id;
    }

    public StatementHeader closingDate(String closingDate) {
    this.closingDate = closingDate;
    return this;
    }

    /**
        * A standalone date, as represented by the full-date chunk specified in RFC 3339, section 5.6. Dates with no associated time or time-zone data SHOULD be used to represent special legal values, such as date of birth. Implementers SHOULD consider using the standard date_time schema whenever possible instead. Note that this regular expression is not a complete validation: February 31, for example, is allowed, and nothing is known about leap years.
    * @return closingDate
    **/
    public String getClosingDate() {
    return closingDate;
    }

    public void setClosingDate(String closingDate) {
    this.closingDate = closingDate;
    }

    public StatementHeader startDate(String startDate) {
    this.startDate = startDate;
    return this;
    }

    /**
        * A standalone date, as represented by the full-date chunk specified in RFC 3339, section 5.6. Dates with no associated time or time-zone data SHOULD be used to represent special legal values, such as date of birth. Implementers SHOULD consider using the standard date_time schema whenever possible instead. Note that this regular expression is not a complete validation: February 31, for example, is allowed, and nothing is known about leap years.
    * @return startDate
    **/
    public String getStartDate() {
    return startDate;
    }

    public void setStartDate(String startDate) {
    this.startDate = startDate;
    }

    public StatementHeader balance(Money balance) {
    this.balance = balance;
    return this;
    }

    /**
        * Get balance
    * @return balance
    **/
    public Money getBalance() {
    return balance;
    }

    public void setBalance(Money balance) {
    this.balance = balance;
    }

    public StatementHeader availableMediaTypes(List<String> availableMediaTypes) {
    this.availableMediaTypes = availableMediaTypes;
    return this;
    }

        public StatementHeader addAvailableMediaTypesItem(String availableMediaTypesItem) {
            if (this.availableMediaTypes == null) {
            this.availableMediaTypes = new ArrayList<>();
            }
        this.availableMediaTypes.add(availableMediaTypesItem);
        return this;
        }

    /**
        * List of available media types for the statement. Currently only &#x60;application/pdf&#x60; and &#x60;application/json&#x60; are available
    * @return availableMediaTypes
    **/
    public List<String> getAvailableMediaTypes() {
    return availableMediaTypes;
    }

    public void setAvailableMediaTypes(List<String> availableMediaTypes) {
    this.availableMediaTypes = availableMediaTypes;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
            StatementHeader statementHeader = (StatementHeader) o;
            return Objects.equals(this.id, statementHeader.id) &&
            Objects.equals(this.closingDate, statementHeader.closingDate) &&
            Objects.equals(this.startDate, statementHeader.startDate) &&
            Objects.equals(this.balance, statementHeader.balance) &&
            Objects.equals(this.availableMediaTypes, statementHeader.availableMediaTypes);    }

    @Override
    public int hashCode() {
        return Objects.hash(id, closingDate, startDate, balance, availableMediaTypes);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatementHeader {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    closingDate: ").append(toIndentedString(closingDate)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("    availableMediaTypes: ").append(toIndentedString(availableMediaTypes)).append("\n");
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

