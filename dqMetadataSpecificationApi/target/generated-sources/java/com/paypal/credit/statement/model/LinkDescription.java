package com.paypal.credit.statement.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;

        /**
* The [HATEOAS links](/docs/api/hateoas-links/) related to the request.
*/
@javax.annotation.Generated(value = "com.paypal.ppaas.swagger.codegen.PPaaSJAXRSSwaggerCodegen", date = "2019-06-18T17:06:52.818+05:30[Asia/Calcutta]")
@JsonInclude(value = JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LinkDescription   {
        @JsonProperty("href")
        @NotNull(message = "MISSING_REQUIRED_PARAMETER")



        private String href;

        @JsonProperty("rel")
        @NotNull(message = "MISSING_REQUIRED_PARAMETER")



        private String rel;

        @JsonProperty("title")
    


        private String title;

        @JsonProperty("mediaType")
    


        private String mediaType;

        @JsonProperty("method")
    


        private String method;

        @JsonProperty("encType")
    


        private String encType = "application/json";

    public LinkDescription href(String href) {
    this.href = href;
    return this;
    }

    /**
        * The URL of the related [HATEOAS link](/docs/api/hateoas-links/) to use in subsequent calls.
    * @return href
    **/
    public String getHref() {
    return href;
    }

    public void setHref(String href) {
    this.href = href;
    }

    public LinkDescription rel(String rel) {
    this.rel = rel;
    return this;
    }

    /**
        * The relationship that this link has to the previous call. For example:&lt;ul&gt;&lt;li&gt;&lt;code&gt;self&lt;/code&gt;. Get details of the current call.&lt;/li&gt;&lt;li&gt;&lt;code&gt;parent_payment&lt;/code&gt;. Get details of the parent payment.&lt;/li&gt;&lt;li&gt;A related call, such as &lt;code&gt;execute&lt;/code&gt; or &lt;code&gt;refund&lt;/code&gt;.&lt;/li&gt;&lt;/ul&gt;
    * @return rel
    **/
    public String getRel() {
    return rel;
    }

    public void setRel(String rel) {
    this.rel = rel;
    }

    public LinkDescription title(String title) {
    this.title = title;
    return this;
    }

    /**
        * The link title.
    * @return title
    **/
    public String getTitle() {
    return title;
    }

    public void setTitle(String title) {
    this.title = title;
    }

    public LinkDescription mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
    }

    /**
        * The media type as defined by RFC 2046 that describes the link target.
    * @return mediaType
    **/
    public String getMediaType() {
    return mediaType;
    }

    public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
    }

    public LinkDescription method(String method) {
    this.method = method;
    return this;
    }

    /**
        * The HTTP method required for the related call.
    * @return method
    **/
    public String getMethod() {
    return method;
    }

    public void setMethod(String method) {
    this.method = method;
    }

    public LinkDescription encType(String encType) {
    this.encType = encType;
    return this;
    }

    /**
        * The media type in which to submit data in the request.
    * @return encType
    **/
    public String getEncType() {
    return encType;
    }

    public void setEncType(String encType) {
    this.encType = encType;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
            LinkDescription linkDescription = (LinkDescription) o;
            return Objects.equals(this.href, linkDescription.href) &&
            Objects.equals(this.rel, linkDescription.rel) &&
            Objects.equals(this.title, linkDescription.title) &&
            Objects.equals(this.mediaType, linkDescription.mediaType) &&
            Objects.equals(this.method, linkDescription.method) &&
            Objects.equals(this.encType, linkDescription.encType);    }

    @Override
    public int hashCode() {
        return Objects.hash(href, rel, title, mediaType, method, encType);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinkDescription {\n");
        
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    encType: ").append(toIndentedString(encType)).append("\n");
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

