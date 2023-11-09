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

import com.linecorp.bot.messaging.model.Action;
import com.linecorp.bot.messaging.model.FlexComponent;
import java.net.URI;


/**
 * FlexVideo
 */
@JsonTypeName("video")

@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record FlexVideo (
/**
    * Get url
    */
    
    @JsonProperty("url")
    URI url,
/**
    * Get previewUrl
    */
    
    @JsonProperty("previewUrl")
    URI previewUrl,
/**
    * Get altContent
    */
    
    @JsonProperty("altContent")
    FlexComponent altContent,
/**
    * Get aspectRatio
    */
    
    @JsonProperty("aspectRatio")
    String aspectRatio,
/**
    * Get action
    */
    
    @JsonProperty("action")
    Action action

) implements FlexComponent {


    public static class Builder {
private URI url;
    
        private boolean url$set;
    
private URI previewUrl;
    
        private boolean previewUrl$set;
    
private FlexComponent altContent;
    
        private boolean altContent$set;
    
private String aspectRatio;
    
private Action action;
    


        public Builder() {
        }

public Builder url(URI url) {
            this.url = url;
    
            this.url$set = true;
    
            return this;
        }
public Builder previewUrl(URI previewUrl) {
            this.previewUrl = previewUrl;
    
            this.previewUrl$set = true;
    
            return this;
        }
public Builder altContent(FlexComponent altContent) {
            this.altContent = altContent;
    
            this.altContent$set = true;
    
            return this;
        }
public Builder aspectRatio(String aspectRatio) {
            this.aspectRatio = aspectRatio;
    
            return this;
        }
public Builder action(Action action) {
            this.action = action;
    
            return this;
        }


        public FlexVideo build() {

            if (!this.url$set) {
                throw new IllegalStateException("'url' must be set for FlexVideo.");
            }
    

            if (!this.previewUrl$set) {
                throw new IllegalStateException("'previewUrl' must be set for FlexVideo.");
            }
    

            if (!this.altContent$set) {
                throw new IllegalStateException("'altContent' must be set for FlexVideo.");
            }
    




            return new FlexVideo(
url,previewUrl,altContent,aspectRatio,action
            );
        }
    }
}
