/*
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-04-15 19:10:39 UTC)
 * on 2014-05-23 at 17:34:18 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.youtube.model;

/**
 * Model definition for GuideCategoryListResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GuideCategoryListResponse extends com.google.api.client.json.GenericJson {

  /**
   * Etag of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Serialized EventId of the request which produced this response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventId;

  /**
   * A list of categories that can be associated with YouTube channels. In this map, the category ID
   * is the map key, and its value is the corresponding guideCategory resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GuideCategory> items;

  static {
    // hack to force ProGuard to consider GuideCategory used, since otherwise it would be stripped out
    // see http://code.google.com/p/google-api-java-client/issues/detail?id=528
    com.google.api.client.util.Data.nullOf(GuideCategory.class);
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "youtube#guideCategoryListResponse".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The token that can be used as the value of the pageToken parameter to retrieve the next page in
   * the result set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PageInfo pageInfo;

  /**
   * The token that can be used as the value of the pageToken parameter to retrieve the previous
   * page in the result set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String prevPageToken;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TokenPagination tokenPagination;

  /**
   * The visitorId identifies the visitor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String visitorId;

  /**
   * Etag of this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Etag of this resource.
   * @param etag etag or {@code null} for none
   */
  public GuideCategoryListResponse setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Serialized EventId of the request which produced this response.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventId() {
    return eventId;
  }

  /**
   * Serialized EventId of the request which produced this response.
   * @param eventId eventId or {@code null} for none
   */
  public GuideCategoryListResponse setEventId(java.lang.String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * A list of categories that can be associated with YouTube channels. In this map, the category ID
   * is the map key, and its value is the corresponding guideCategory resource.
   * @return value or {@code null} for none
   */
  public java.util.List<GuideCategory> getItems() {
    return items;
  }

  /**
   * A list of categories that can be associated with YouTube channels. In this map, the category ID
   * is the map key, and its value is the corresponding guideCategory resource.
   * @param items items or {@code null} for none
   */
  public GuideCategoryListResponse setItems(java.util.List<GuideCategory> items) {
    this.items = items;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "youtube#guideCategoryListResponse".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "youtube#guideCategoryListResponse".
   * @param kind kind or {@code null} for none
   */
  public GuideCategoryListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The token that can be used as the value of the pageToken parameter to retrieve the next page in
   * the result set.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The token that can be used as the value of the pageToken parameter to retrieve the next page in
   * the result set.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GuideCategoryListResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public PageInfo getPageInfo() {
    return pageInfo;
  }

  /**
   * @param pageInfo pageInfo or {@code null} for none
   */
  public GuideCategoryListResponse setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

  /**
   * The token that can be used as the value of the pageToken parameter to retrieve the previous
   * page in the result set.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrevPageToken() {
    return prevPageToken;
  }

  /**
   * The token that can be used as the value of the pageToken parameter to retrieve the previous
   * page in the result set.
   * @param prevPageToken prevPageToken or {@code null} for none
   */
  public GuideCategoryListResponse setPrevPageToken(java.lang.String prevPageToken) {
    this.prevPageToken = prevPageToken;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public TokenPagination getTokenPagination() {
    return tokenPagination;
  }

  /**
   * @param tokenPagination tokenPagination or {@code null} for none
   */
  public GuideCategoryListResponse setTokenPagination(TokenPagination tokenPagination) {
    this.tokenPagination = tokenPagination;
    return this;
  }

  /**
   * The visitorId identifies the visitor.
   * @return value or {@code null} for none
   */
  public java.lang.String getVisitorId() {
    return visitorId;
  }

  /**
   * The visitorId identifies the visitor.
   * @param visitorId visitorId or {@code null} for none
   */
  public GuideCategoryListResponse setVisitorId(java.lang.String visitorId) {
    this.visitorId = visitorId;
    return this;
  }

  @Override
  public GuideCategoryListResponse set(String fieldName, Object value) {
    return (GuideCategoryListResponse) super.set(fieldName, value);
  }

  @Override
  public GuideCategoryListResponse clone() {
    return (GuideCategoryListResponse) super.clone();
  }

}
