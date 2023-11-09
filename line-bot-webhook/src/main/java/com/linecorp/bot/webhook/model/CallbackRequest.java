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


package com.linecorp.bot.webhook.model;

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

import com.linecorp.bot.webhook.model.Event;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * The request body contains a JSON object with the user ID of a bot that should receive webhook events and an array of webhook event objects. 
 * @see <a href="https://developers.line.biz/en/reference/messaging-api/#request-body"> Documentation</a>
 */

@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record CallbackRequest (
/**
    * User ID of a bot that should receive webhook events. The user ID value is a string that matches the regular expression, &#x60;U[0-9a-f]{32}&#x60;. 
    */
    
    @JsonProperty("destination")
    String destination,
/**
    * Array of webhook event objects. The LINE Platform may send an empty array that doesn&#39;t include a webhook event object to confirm communication. 
    */
    
    @JsonProperty("events")
    List<Event> events

)  {


    public static class Builder {
private String destination;
    
        private boolean destination$set;
    
private List<Event> events;
    
        private boolean events$set;
    


        public Builder() {
        }

public Builder destination(String destination) {
            this.destination = destination;
    
            this.destination$set = true;
    
            return this;
        }
public Builder events(List<Event> events) {
            this.events = events;
    
            this.events$set = true;
    
            return this;
        }


        public CallbackRequest build() {

            if (!this.destination$set) {
                throw new IllegalStateException("'destination' must be set for CallbackRequest.");
            }
    

            if (!this.events$set) {
                throw new IllegalStateException("'events' must be set for CallbackRequest.");
            }
    


            return new CallbackRequest(
destination,events
            );
        }
    }
}
