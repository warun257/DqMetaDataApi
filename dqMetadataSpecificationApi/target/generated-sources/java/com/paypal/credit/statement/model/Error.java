package com.paypal.credit.statement.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.*;
import com.paypal.credit.statement.model.ErrorDetails;
import com.paypal.credit.statement.model.LinkDescription;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;

        /**
* Error details.
*/
@javax.annotation.Generated(value = "com.paypal.ppaas.swagger.codegen.PPaaSJAXRSSwaggerCodegen", date = "2019-06-18T17:06:52.818+05:30[Asia/Calcutta]")
@JsonInclude(value = JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Error   {
        @JsonProperty("name")
        @NotNull(message = "MISSING_REQUIRED_PARAMETER")



        private String name;

        @JsonProperty("message")
        @NotNull(message = "MISSING_REQUIRED_PARAMETER")



        private String message;

        @JsonProperty("debug_id")
        @NotNull(message = "MISSING_REQUIRED_PARAMETER")



        private String debugId;

        @JsonProperty("information_link")
    


        private String informationLink;

        @JsonProperty("details")
                            @Valid



        private List<ErrorDetails> details = null;

        @JsonProperty("links")
                            @Valid



        private List<LinkDescription> links = null;

    public Error name(String name) {
    this.name = name;
    return this;
    }

    /**
        * Human-readable, unique name of the error.
    * @return name
    **/
    public String getName() {
    return name;
    }

    public void setName(String name) {
    this.name = name;
    }

    public Error message(String message) {
    this.message = message;
    return this;
    }

    /**
        * A message that describes the error.
    * @return message
    **/
    public String getMessage() {
    return message;
    }

    public void setMessage(String message) {
    this.message = message;
    }

    public Error debugId(String debugId) {
    this.debugId = debugId;
    return this;
    }

    /**
        * PayPal internal ID that is used for correlation purposes.
    * @return debugId
    **/
    public String getDebugId() {
    return debugId;
    }

    public void setDebugId(String debugId) {
    this.debugId = debugId;
    }

    public Error informationLink(String informationLink) {
    this.informationLink = informationLink;
    return this;
    }

    /**
        * An information link, or URI, that shows detailed information about this error for the developer.
    * @return informationLink
    **/
    public String getInformationLink() {
    return informationLink;
    }

    public void setInformationLink(String informationLink) {
    this.informationLink = informationLink;
    }

    public Error details(List<ErrorDetails> details) {
    this.details = details;
    return this;
    }

        public Error addDetailsItem(ErrorDetails detailsItem) {
            if (this.details == null) {
            this.details = new ArrayList<>();
            }
        this.details.add(detailsItem);
        return this;
        }

    /**
        * Additional details about the error.
    * @return details
    **/
    public List<ErrorDetails> getDetails() {
    return details;
    }

    public void setDetails(List<ErrorDetails> details) {
    this.details = details;
    }

    public Error links(List<LinkDescription> links) {
    this.links = links;
    return this;
    }

        public Error addLinksItem(LinkDescription linksItem) {
            if (this.links == null) {
            this.links = new ArrayList<>();
            }
        this.links.add(linksItem);
        return this;
        }

    /**
        * Error context-specific [HATEOAS links](/docs/api/hateoas-links/).
    * @return links
    **/
    public List<LinkDescription> getLinks() {
    return links;
    }

    public void setLinks(List<LinkDescription> links) {
    this.links = links;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
            Error error = (Error) o;
            return Objects.equals(this.name, error.name) &&
            Objects.equals(this.message, error.message) &&
            Objects.equals(this.debugId, error.debugId) &&
            Objects.equals(this.informationLink, error.informationLink) &&
            Objects.equals(this.details, error.details) &&
            Objects.equals(this.links, error.links);    }

    @Override
    public int hashCode() {
        return Objects.hash(name, message, debugId, informationLink, details, links);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Error {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    debugId: ").append(toIndentedString(debugId)).append("\n");
        sb.append("    informationLink: ").append(toIndentedString(informationLink)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

