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

import com.linecorp.bot.webhook.model.MessageContent;


/**
 * FileMessageContent
 */
@JsonTypeName("file")

@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record FileMessageContent (
/**
    * Message ID
    */
    
    @JsonProperty("id")
    String id,
/**
    * File name
    */
    
    @JsonProperty("fileName")
    String fileName,
/**
    * File size in bytes
    */
    
    @JsonProperty("fileSize")
    Integer fileSize

) implements MessageContent {


    public static class Builder {
private String id;
    
        private boolean id$set;
    
private String fileName;
    
        private boolean fileName$set;
    
private Integer fileSize;
    
        private boolean fileSize$set;
    


        public Builder() {
        }

public Builder id(String id) {
            this.id = id;
    
            this.id$set = true;
    
            return this;
        }
public Builder fileName(String fileName) {
            this.fileName = fileName;
    
            this.fileName$set = true;
    
            return this;
        }
public Builder fileSize(Integer fileSize) {
            this.fileSize = fileSize;
    
            this.fileSize$set = true;
    
            return this;
        }


        public FileMessageContent build() {

            if (!this.id$set) {
                throw new IllegalStateException("'id' must be set for FileMessageContent.");
            }
    

            if (!this.fileName$set) {
                throw new IllegalStateException("'fileName' must be set for FileMessageContent.");
            }
    

            if (!this.fileSize$set) {
                throw new IllegalStateException("'fileSize' must be set for FileMessageContent.");
            }
    


            return new FileMessageContent(
id,fileName,fileSize
            );
        }
    }
}
