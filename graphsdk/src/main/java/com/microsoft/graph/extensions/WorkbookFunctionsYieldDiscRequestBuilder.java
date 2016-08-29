// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.List;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Yield Disc Request Builder.
 */
public class WorkbookFunctionsYieldDiscRequestBuilder extends BaseWorkbookFunctionsYieldDiscRequestBuilder implements IWorkbookFunctionsYieldDiscRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsYieldDisc
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public WorkbookFunctionsYieldDiscRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement pr, final com.google.gson.JsonElement redemption, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions, settlement, maturity, pr, redemption, basis);
    }
}