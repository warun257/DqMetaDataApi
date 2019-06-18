package com.paypal.credit.statement.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;

        /**
* A type for all financial value-related fields. For example, balance, payment due, and so on.
*/
@javax.annotation.Generated(value = "com.paypal.ppaas.swagger.codegen.PPaaSJAXRSSwaggerCodegen", date = "2019-06-18T17:06:52.818+05:30[Asia/Calcutta]")
@JsonInclude(value = JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Money   {
        @JsonProperty("currency_code")
        @NotNull(message = "MISSING_REQUIRED_PARAMETER")
        @Size(min = 3, max = 3, message = "INVALID_STRING_LENGTH")



        private String currencyCode;

        @JsonProperty("value")
        @NotNull(message = "MISSING_REQUIRED_PARAMETER")
    @Pattern(regexp = "^((-?[0-9]+)|(-?([0-9]+)?[.][0-9]+))$", message = "INVALID_PARAMETER_SYNTAX")
        @Size(max = 32, message = "INVALID_STRING_MAX_LENGTH")



        private String value;

    public Money currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
    }

    /**
        * The three-letter [ISO 4217](http://www.iso.org/iso/home/standards/currency_codes.htm) alphabetic currency code.
    * @return currencyCode
    **/
    public String getCurrencyCode() {
    return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }

    public Money value(String value) {
    this.value = value;
    return this;
    }

    /**
        * Can be anything from an integer for currencies that are not typically fractional, like JPY, to a three-place decimal fraction for currencies like TND that are subdivided into thousandths, to a currency like BitCoin that has eight decimal places. For the required number of decimal places for a currency code, see [ISO 4217](http://www.iso.org/iso/home/standards/currency_codes.htm).
    * @return value
    **/
    public String getValue() {
    return value;
    }

    public void setValue(String value) {
    this.value = value;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
            Money money = (Money) o;
            return Objects.equals(this.currencyCode, money.currencyCode) &&
            Objects.equals(this.value, money.value);    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyCode, value);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Money {\n");
        
        sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

