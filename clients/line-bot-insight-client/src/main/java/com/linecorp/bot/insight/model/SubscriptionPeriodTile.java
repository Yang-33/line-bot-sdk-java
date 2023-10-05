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


package com.linecorp.bot.insight.model;

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
 * SubscriptionPeriodTile
 */

@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record SubscriptionPeriodTile (
/**
    * Subscription period. Possible values: &#x60;within7days&#x60;, &#x60;within90days&#x60;, &#x60;unknown&#x60; etc.
    */
    

    @JsonProperty("subscriptionPeriod")
    SubscriptionPeriod subscriptionPeriod,
/**
    * Percentage. Possible values: [0.0,100.0] e.g. 0, 2.9, 37.6.
    */
    

    @JsonProperty("percentage")
    Double percentage

)  {
/**
     * Subscription period. Possible values: &#x60;within7days&#x60;, &#x60;within90days&#x60;, &#x60;unknown&#x60; etc.
     */
    public enum SubscriptionPeriod {
@JsonProperty("within7days")
      WITHIN7DAYS,
    @JsonProperty("within30days")
      WITHIN30DAYS,
    @JsonProperty("within90days")
      WITHIN90DAYS,
    @JsonProperty("within180days")
      WITHIN180DAYS,
    @JsonProperty("within365days")
      WITHIN365DAYS,
    @JsonProperty("over365days")
      OVER365DAYS,
    @JsonProperty("unknown")
      UNKNOWN,
    

      @JsonEnumDefaultValue
      UNDEFINED;
    }


}
