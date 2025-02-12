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
package com.linecorp.bot.audience.model;



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Gets data for more than one audience.
 *
 * @see <a href="https://developers.line.biz/en/reference/messaging-api/#get-audience-groups">
 *     Documentation</a>
 */
@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record GetSharedAudienceGroupsResponse(
    /**
     * An array of audience data. If there are no audiences that match the specified filter, an
     * empty array will be returned.
     */
    @JsonProperty("audienceGroups") List<AudienceGroup> audienceGroups,
    /** true when this is not the last page. */
    @JsonProperty("hasNextPage") Boolean hasNextPage,
    /** The total number of audiences that can be returned with the specified filter. */
    @JsonProperty("totalCount") Long totalCount,
    /**
     * Of the audiences you can get with the specified filter, the number of audiences with the
     * update permission set to READ_WRITE.
     */
    @JsonProperty("readWriteAudienceGroupTotalCount") Long readWriteAudienceGroupTotalCount,
    /** The current page number. */
    @JsonProperty("page") Long page,
    /** The maximum number of audiences on the current page. */
    @JsonProperty("size") Long size) {

  public static class Builder {
    private List<AudienceGroup> audienceGroups;
    private Boolean hasNextPage;
    private Long totalCount;
    private Long readWriteAudienceGroupTotalCount;
    private Long page;
    private Long size;

    public Builder() {}

    public Builder audienceGroups(List<AudienceGroup> audienceGroups) {
      this.audienceGroups = audienceGroups;
      return this;
    }

    public Builder hasNextPage(Boolean hasNextPage) {
      this.hasNextPage = hasNextPage;
      return this;
    }

    public Builder totalCount(Long totalCount) {
      this.totalCount = totalCount;
      return this;
    }

    public Builder readWriteAudienceGroupTotalCount(Long readWriteAudienceGroupTotalCount) {
      this.readWriteAudienceGroupTotalCount = readWriteAudienceGroupTotalCount;
      return this;
    }

    public Builder page(Long page) {
      this.page = page;
      return this;
    }

    public Builder size(Long size) {
      this.size = size;
      return this;
    }

    public GetSharedAudienceGroupsResponse build() {
      return new GetSharedAudienceGroupsResponse(
          audienceGroups, hasNextPage, totalCount, readWriteAudienceGroupTotalCount, page, size);
    }
  }
}
