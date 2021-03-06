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
 * The interface for the Base Drive Item Version Request.
 */
public interface IBaseDriveItemVersionRequest extends IHttpRequest {

    /**
     * Gets the DriveItemVersion from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<DriveItemVersion> callback);

    /**
     * Gets the DriveItemVersion from the service
     * @return The DriveItemVersion from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    DriveItemVersion get() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DriveItemVersion with a source
     * @param sourceDriveItemVersion The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final DriveItemVersion sourceDriveItemVersion, final ICallback<DriveItemVersion> callback);

    /**
     * Patches this DriveItemVersion with a source
     * @param sourceDriveItemVersion The source object with updates
     * @return The updated DriveItemVersion
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    DriveItemVersion patch(final DriveItemVersion sourceDriveItemVersion) throws ClientException;

    /**
     * Posts a DriveItemVersion with a new object
     * @param newDriveItemVersion The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final DriveItemVersion newDriveItemVersion, final ICallback<DriveItemVersion> callback);

    /**
     * Posts a DriveItemVersion with a new object
     * @param newDriveItemVersion The new object to create
     * @return The created DriveItemVersion
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    DriveItemVersion post(final DriveItemVersion newDriveItemVersion) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseDriveItemVersionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseDriveItemVersionRequest expand(final String value);

}

