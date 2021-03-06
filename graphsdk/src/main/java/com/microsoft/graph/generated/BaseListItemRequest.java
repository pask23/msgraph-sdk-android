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
 * The class for the Base List Item Request.
 */
public class BaseListItemRequest extends BaseRequest implements IBaseListItemRequest {

    /**
     * The request for the ListItem
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseListItemRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the ListItem from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<ListItem> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ListItem from the service
     * @return The ListItem from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public ListItem get() throws ClientException {
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
     * Patches this ListItem with a source
     * @param sourceListItem The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final ListItem sourceListItem, final ICallback<ListItem> callback) {
        send(HttpMethod.PATCH, callback, sourceListItem);
    }

    /**
     * Patches this ListItem with a source
     * @param sourceListItem The source object with updates
     * @return The updated ListItem
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public ListItem patch(final ListItem sourceListItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceListItem);
    }

    /**
     * Creates a ListItem with a new object
     * @param newListItem The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final ListItem newListItem, final ICallback<ListItem> callback) {
        send(HttpMethod.POST, callback, newListItem);
    }

    /**
     * Creates a ListItem with a new object
     * @param newListItem The new object to create
     * @return The created ListItem
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public ListItem post(final ListItem newListItem) throws ClientException {
        return send(HttpMethod.POST, newListItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IListItemRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ListItemRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IListItemRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ListItemRequest)this;
     }

}

