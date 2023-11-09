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



/**
 * ActionResult
 */

@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record ActionResult (
/**
    * Get type
    */
    
    @JsonProperty("type")
    Type type,
/**
    * Base64-encoded binary data
    */
    
    @JsonProperty("data")
    String data

)  {
/**
     * Gets or Sets type
     */
    public enum Type {
@JsonProperty("void")
      VOID,
    @JsonProperty("binary")
      BINARY,
    

      @JsonEnumDefaultValue
      UNDEFINED;
    }


    public static class Builder {
private Type type;
    
        private boolean type$set;
    
private String data;
    


        public Builder() {
        }

public Builder type(Type type) {
            this.type = type;
    
            this.type$set = true;
    
            return this;
        }
public Builder data(String data) {
            this.data = data;
    
            return this;
        }


        public ActionResult build() {

            if (!this.type$set) {
                throw new IllegalStateException("'type' must be set for ActionResult.");
            }
    



            return new ActionResult(
type,data
            );
        }
    }
}
