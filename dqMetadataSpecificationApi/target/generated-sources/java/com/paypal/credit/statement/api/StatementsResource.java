package com.paypal.credit.statement.api;

import com.paypal.credit.statement.model.*;

import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.core.Context;
import com.paypal.credit.statement.model.Error;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import com.paypal.credit.statement.model.StatementHeader;
import javax.ws.rs.container.Suspended;

import java.util.Map;
import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import com.ebayinc.platform.services.jaxrs.PATCH;

import javax.validation.constraints.*;
import javax.validation.Valid;


@Path("/v1/ppcstatementserv/accounts")

@javax.annotation.Generated(value = "com.paypal.ppaas.swagger.codegen.PPaaSJAXRSSwaggerCodegen", date = "2019-06-18T17:06:52.818+05:30[Asia/Calcutta]")
public interface StatementsResource  {


        /**
         * Returns a list of statement headers for an account.
         */
        @GET
        @Path("/{account_id}/statements")
        
        @Produces({ "application/json" })
        Response getStatements(
            
final @NotNull(message="MISSING_REQUIRED_PARAMETER") @Pattern(regexp="^[0-9]{16}$",message="INVALID_PARAMETER_SYNTAX") @Size(min=16,max=16,message="INVALID_STRING_LENGTH") @PathParam("account_id") String accountId



);
        /**
         * Testing request context vendor extension
         */
        @GET
        @Path("/{account_id}/statements_with_async_response")
        
        @Produces({ "application/json" })
        void getStatementsWithAsyncResponse(
            
final @NotNull(message="MISSING_REQUIRED_PARAMETER") @Pattern(regexp="^[0-9]{16}$",message="INVALID_PARAMETER_SYNTAX") @Size(min=16,max=16,message="INVALID_STRING_LENGTH") @PathParam("account_id") String accountId



,
        final @Suspended AsyncResponse response);
        /**
         * Testing request context vendor extension
         */
        @GET
        @Path("/{account_id}/statements_with_request_context")
        
        @Produces({ "application/json" })
        Response getStatementsWithRequestContext(
            
final @NotNull(message="MISSING_REQUIRED_PARAMETER") @Pattern(regexp="^[0-9]{16}$",message="INVALID_PARAMETER_SYNTAX") @Size(min=16,max=16,message="INVALID_STRING_LENGTH") @PathParam("account_id") String accountId



,
        final @Context Request request);
    }
