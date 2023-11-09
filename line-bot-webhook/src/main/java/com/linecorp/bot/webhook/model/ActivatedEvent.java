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

import com.linecorp.bot.webhook.model.ChatControl;
import com.linecorp.bot.webhook.model.DeliveryContext;
import com.linecorp.bot.webhook.model.Event;
import com.linecorp.bot.webhook.model.EventMode;
import com.linecorp.bot.webhook.model.Source;


/**
 * This event indicates that the module channel has been switched to Active Channel by calling the Acquire Control API. Sent to the webhook URL server of the module channel.
 */
@JsonTypeName("activated")

@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record ActivatedEvent (
/**
    * Get source
    */
    
    @JsonProperty("source")
    Source source,
/**
    * Time of the event in milliseconds.
    */
    
    @JsonProperty("timestamp")
    Long timestamp,
/**
    * Get mode
    */
    
    @JsonProperty("mode")
    EventMode mode,
/**
    * Webhook Event ID. An ID that uniquely identifies a webhook event. This is a string in ULID format.
    */
    
    @JsonProperty("webhookEventId")
    String webhookEventId,
/**
    * Get deliveryContext
    */
    
    @JsonProperty("deliveryContext")
    DeliveryContext deliveryContext,
/**
    * Get chatControl
    */
    
    @JsonProperty("chatControl")
    ChatControl chatControl

) implements Event {


    public static class Builder {
private Source source;
    
private Long timestamp;
    
        private boolean timestamp$set;
    
private EventMode mode;
    
        private boolean mode$set;
    
private String webhookEventId;
    
        private boolean webhookEventId$set;
    
private DeliveryContext deliveryContext;
    
        private boolean deliveryContext$set;
    
private ChatControl chatControl;
    
        private boolean chatControl$set;
    


        public Builder() {
        }

public Builder source(Source source) {
            this.source = source;
    
            return this;
        }
public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
    
            this.timestamp$set = true;
    
            return this;
        }
public Builder mode(EventMode mode) {
            this.mode = mode;
    
            this.mode$set = true;
    
            return this;
        }
public Builder webhookEventId(String webhookEventId) {
            this.webhookEventId = webhookEventId;
    
            this.webhookEventId$set = true;
    
            return this;
        }
public Builder deliveryContext(DeliveryContext deliveryContext) {
            this.deliveryContext = deliveryContext;
    
            this.deliveryContext$set = true;
    
            return this;
        }
public Builder chatControl(ChatControl chatControl) {
            this.chatControl = chatControl;
    
            this.chatControl$set = true;
    
            return this;
        }


        public ActivatedEvent build() {


            if (!this.timestamp$set) {
                throw new IllegalStateException("'timestamp' must be set for ActivatedEvent.");
            }
    

            if (!this.mode$set) {
                throw new IllegalStateException("'mode' must be set for ActivatedEvent.");
            }
    

            if (!this.webhookEventId$set) {
                throw new IllegalStateException("'webhookEventId' must be set for ActivatedEvent.");
            }
    

            if (!this.deliveryContext$set) {
                throw new IllegalStateException("'deliveryContext' must be set for ActivatedEvent.");
            }
    

            if (!this.chatControl$set) {
                throw new IllegalStateException("'chatControl' must be set for ActivatedEvent.");
            }
    


            return new ActivatedEvent(
source,timestamp,mode,webhookEventId,deliveryContext,chatControl
            );
        }
    }
}
