// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Administrative Unit Request.
 */
public class BaseAdministrativeUnitRequest extends BaseRequest implements IBaseAdministrativeUnitRequest {

    /**
     * The request for the AdministrativeUnit
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseAdministrativeUnitRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the AdministrativeUnit from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<AdministrativeUnit> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AdministrativeUnit from the service
     * @return The AdministrativeUnit from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public AdministrativeUnit get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this AdministrativeUnit with a source
     * @param sourceAdministrativeUnit The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final AdministrativeUnit sourceAdministrativeUnit, final ICallback<AdministrativeUnit> callback) {
        send(HttpMethod.PATCH, callback, sourceAdministrativeUnit);
    }

    /**
     * Patches this AdministrativeUnit with a source
     * @param sourceAdministrativeUnit The source object with updates
     * @return The updated AdministrativeUnit
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public AdministrativeUnit patch(final AdministrativeUnit sourceAdministrativeUnit) throws ClientException {
        return send(HttpMethod.PATCH, sourceAdministrativeUnit);
    }

    /**
     * Creates a AdministrativeUnit with a new object
     * @param newAdministrativeUnit The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final AdministrativeUnit newAdministrativeUnit, final ICallback<AdministrativeUnit> callback) {
        send(HttpMethod.POST, callback, newAdministrativeUnit);
    }

    /**
     * Creates a AdministrativeUnit with a new object
     * @param newAdministrativeUnit The new object to create
     * @return The created AdministrativeUnit
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public AdministrativeUnit post(final AdministrativeUnit newAdministrativeUnit) throws ClientException {
        return send(HttpMethod.POST, newAdministrativeUnit);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IAdministrativeUnitRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (AdministrativeUnitRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IAdministrativeUnitRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (AdministrativeUnitRequest)this;
     }

}

