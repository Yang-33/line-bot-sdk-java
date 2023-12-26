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
 * https://openapi-generator.tech Do not edit the class manually.
 */
package com.linecorp.bot.messaging.model;



import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/** Gets or Sets AgeDemographic */
public enum AgeDemographic {
  @JsonProperty("age_15")
  AGE_15,

  @JsonProperty("age_20")
  AGE_20,

  @JsonProperty("age_25")
  AGE_25,

  @JsonProperty("age_30")
  AGE_30,

  @JsonProperty("age_35")
  AGE_35,

  @JsonProperty("age_40")
  AGE_40,

  @JsonProperty("age_45")
  AGE_45,

  @JsonProperty("age_50")
  AGE_50,

  @JsonEnumDefaultValue
  UNDEFINED;

  @JsonValue
  public String toValue() {
    return switch (this) {
      case AGE_15 -> "age_15";
      case AGE_20 -> "age_20";
      case AGE_25 -> "age_25";
      case AGE_30 -> "age_30";
      case AGE_35 -> "age_35";
      case AGE_40 -> "age_40";
      case AGE_45 -> "age_45";
      case AGE_50 -> "age_50";

      default -> "UNDEFINED";
    };
  }
}
