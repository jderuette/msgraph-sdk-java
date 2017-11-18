// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

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

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Planner External Reference.
 */
public class BasePlannerExternalReference implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose(serialize = false)
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    public BasePlannerExternalReference() {
        oDataType = "microsoft.graph.plannerExternalReference";
    }

    /**
     * The Alias.
     * A name alias to describe the reference.
     */
    @SerializedName("alias")
    @Expose
    public String alias;

    /**
     * The Type.
     * Used to describe the type of the reference. Types include: PowerPoint, Word, Excel, Other.
     */
    @SerializedName("type")
    @Expose
    public String type;

    /**
     * The Preview Priority.
     * Used to set the relative priority order in which the reference will be shown as a preview on the task.
     */
    @SerializedName("previewPriority")
    @Expose
    public String previewPriority;

    /**
     * The Last Modified By.
     * Read-only. User ID by which this is last modified.
     */
    @SerializedName("lastModifiedBy")
    @Expose
    public IdentitySet lastModifiedBy;

    /**
     * The Last Modified Date Time.
     * Read-only. Date and time at which this is last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}