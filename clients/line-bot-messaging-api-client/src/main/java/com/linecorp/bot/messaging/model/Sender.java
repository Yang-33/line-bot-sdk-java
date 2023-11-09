/*
 * Copyright 2023 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.linecorp.bot.messaging.model;

import java.time.Instant;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.net.URI;


/**
 * Change icon and display name
 */

@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record Sender (
/**
    * Display name. Certain words such as &#x60;LINE&#x60; may not be used.
    */
    
    @JsonProperty("name")
    String name,
/**
    * URL of the image to display as an icon when sending a message
    */
    
    @JsonProperty("iconUrl")
    URI iconUrl

)  {


    public static class Builder {
private String name;
    
private URI iconUrl;
    


        public Builder() {
        }

public Builder name(String name) {
            this.name = name;
    
            return this;
        }
public Builder iconUrl(URI iconUrl) {
            this.iconUrl = iconUrl;
    
            return this;
        }


        public Sender build() {




            return new Sender(
name,iconUrl
            );
        }
    }
}
