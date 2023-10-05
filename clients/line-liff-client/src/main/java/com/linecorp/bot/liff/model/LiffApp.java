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


package com.linecorp.bot.liff.model;

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

import com.linecorp.bot.liff.model.LiffBotPrompt;
import com.linecorp.bot.liff.model.LiffFeatures;
import com.linecorp.bot.liff.model.LiffScope;
import com.linecorp.bot.liff.model.LiffView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * LiffApp
 */

@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record LiffApp (
/**
    * LIFF app ID
    */
    

    @JsonProperty("liffId")
    String liffId,
/**
    * Get view
    */
    

    @JsonProperty("view")
    LiffView view,
/**
    * Name of the LIFF app
    */
    

    @JsonProperty("description")
    String description,
/**
    * Get features
    */
    

    @JsonProperty("features")
    LiffFeatures features,
/**
    * How additional information in LIFF URLs is handled. concat is returned. 
    */
    

    @JsonProperty("permanentLinkPattern")
    String permanentLinkPattern,
/**
    * Get scope
    */
    

    @JsonProperty("scope")
    List<LiffScope> scope,
/**
    * Get botPrompt
    */
    

    @JsonProperty("botPrompt")
    LiffBotPrompt botPrompt

)  {


}
