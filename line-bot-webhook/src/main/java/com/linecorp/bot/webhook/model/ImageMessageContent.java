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

import com.linecorp.bot.webhook.model.ContentProvider;
import com.linecorp.bot.webhook.model.ImageSet;
import com.linecorp.bot.webhook.model.MessageContent;


/**
 * ImageMessageContent
 */
@JsonTypeName("image")

@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record ImageMessageContent (
/**
    * Message ID
    */
    
    @JsonProperty("id")
    String id,
/**
    * Get contentProvider
    */
    
    @JsonProperty("contentProvider")
    ContentProvider contentProvider,
/**
    * Get imageSet
    */
    
    @JsonProperty("imageSet")
    ImageSet imageSet,
/**
    * Quote token to quote this message. 
    */
    
    @JsonProperty("quoteToken")
    String quoteToken

) implements MessageContent {


    public static class Builder {
private String id;
    
        private boolean id$set;
    
private ContentProvider contentProvider;
    
        private boolean contentProvider$set;
    
private ImageSet imageSet;
    
private String quoteToken;
    
        private boolean quoteToken$set;
    


        public Builder() {
        }

public Builder id(String id) {
            this.id = id;
    
            this.id$set = true;
    
            return this;
        }
public Builder contentProvider(ContentProvider contentProvider) {
            this.contentProvider = contentProvider;
    
            this.contentProvider$set = true;
    
            return this;
        }
public Builder imageSet(ImageSet imageSet) {
            this.imageSet = imageSet;
    
            return this;
        }
public Builder quoteToken(String quoteToken) {
            this.quoteToken = quoteToken;
    
            this.quoteToken$set = true;
    
            return this;
        }


        public ImageMessageContent build() {

            if (!this.id$set) {
                throw new IllegalStateException("'id' must be set for ImageMessageContent.");
            }
    

            if (!this.contentProvider$set) {
                throw new IllegalStateException("'contentProvider' must be set for ImageMessageContent.");
            }
    


            if (!this.quoteToken$set) {
                throw new IllegalStateException("'quoteToken' must be set for ImageMessageContent.");
            }
    


            return new ImageMessageContent(
id,contentProvider,imageSet,quoteToken
            );
        }
    }
}
