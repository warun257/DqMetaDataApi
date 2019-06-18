package com.paypal.credit.statement.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;

        /**
* Details about a specific error. Mandatory for client-side 4*nn* errors.
*/
@javax.annotation.Generated(value = "com.paypal.ppaas.swagger.codegen.PPaaSJAXRSSwaggerCodegen", date = "2019-06-18T17:06:52.818+05:30[Asia/Calcutta]")
@JsonInclude(value = JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorDetails   {
        @JsonProperty("field")
    


        private String field;

        @JsonProperty("value")
    


        private String value;

        @JsonProperty("location")
    


        private String location;

        @JsonProperty("issue")
        @NotNull(message = "MISSING_REQUIRED_PARAMETER")



        private String issue;

    public ErrorDetails field(String field) {
    this.field = field;
    return this;
    }

    /**
        * The field that caused the error. If the field is in the body, set this value to the JSON pointer to that field. Required for client-side errors.
    * @return field
    **/
    public String getField() {
    return field;
    }

    public void setField(String field) {
    this.field = field;
    }

    public ErrorDetails value(String value) {
    this.value = value;
    return this;
    }

    /**
        * The value of the field that caused the error.
    * @return value
    **/
    public String getValue() {
    return value;
    }

    public void setValue(String value) {
    this.value = value;
    }

    public ErrorDetails location(String location) {
    this.location = location;
    return this;
    }

    /**
        * The location of the field that caused the error. A valid value is &#x60;body&#x60;, &#x60;path&#x60;, or &#x60;query&#x60;. Default is &#x60;body&#x60;.
    * @return location
    **/
    public String getLocation() {
    return location;
    }

    public void setLocation(String location) {
    this.location = location;
    }

    public ErrorDetails issue(String issue) {
    this.issue = issue;
    return this;
    }

    /**
        * The reason for the error.
    * @return issue
    **/
    public String getIssue() {
    return issue;
    }

    public void setIssue(String issue) {
    this.issue = issue;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
            ErrorDetails errorDetails = (ErrorDetails) o;
            return Objects.equals(this.field, errorDetails.field) &&
            Objects.equals(this.value, errorDetails.value) &&
            Objects.equals(this.location, errorDetails.location) &&
            Objects.equals(this.issue, errorDetails.issue);    }

    @Override
    public int hashCode() {
        return Objects.hash(field, value, location, issue);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorDetails {\n");
        
        sb.append("    field: ").append(toIndentedString(field)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
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

