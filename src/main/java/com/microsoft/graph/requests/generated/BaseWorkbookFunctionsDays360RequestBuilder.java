// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Days360Request Builder.
 */
public class BaseWorkbookFunctionsDays360RequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDays360
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param startDate the startDate
     * @param endDate the endDate
     * @param method the method
     */
    public BaseWorkbookFunctionsDays360RequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement startDate, final com.google.gson.JsonElement endDate, final com.google.gson.JsonElement method) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("startDate", startDate);
        bodyParams.put("endDate", endDate);
        bodyParams.put("method", method);
    }

    /**
     * Creates the IWorkbookFunctionsDays360Request
     *
     * @return the IWorkbookFunctionsDays360Request instance
     */
    public IWorkbookFunctionsDays360Request buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsDays360Request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDays360Request instance
     */
    public IWorkbookFunctionsDays360Request buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsDays360Request request = new WorkbookFunctionsDays360Request(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("startDate")) {
            request.body.startDate = getParameter("startDate");
        }

        if (hasParameter("endDate")) {
            request.body.endDate = getParameter("endDate");
        }

        if (hasParameter("method")) {
            request.body.method = getParameter("method");
        }

        return request;
    }
}
