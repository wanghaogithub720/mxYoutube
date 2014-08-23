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
 * Basic details about a search result, including title, description and thumbnails of the item
 * referenced by the search result.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchResultSnippet extends com.google.api.client.json.GenericJson {

  /**
   * The value that YouTube uses to uniquely identify the channel that published the resource that
   * the search result identifies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String channelId;

  /**
   * The title of the channel that published the resource that the search result identifies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String channelTitle;

  /**
   * A description of the search result.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * It indicates if the resource (video or channel) has upcoming/active live broadcast content. Or
   * it's "none" if there is not any upcoming/active live broadcasts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String liveBroadcastContent;

  /**
   * The creation date and time of the resource that the search result identifies. The value is
   * specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime publishedAt;

  /**
   * A map of thumbnail images associated with the search result. For each object in the map, the
   * key is the name of the thumbnail image, and the value is an object that contains other
   * information about the thumbnail.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ThumbnailDetails thumbnails;

  /**
   * The title of the search result.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The value that YouTube uses to uniquely identify the channel that published the resource that
   * the search result identifies.
   * @return value or {@code null} for none
   */
  public java.lang.String getChannelId() {
    return channelId;
  }

  /**
   * The value that YouTube uses to uniquely identify the channel that published the resource that
   * the search result identifies.
   * @param channelId channelId or {@code null} for none
   */
  public SearchResultSnippet setChannelId(java.lang.String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The title of the channel that published the resource that the search result identifies.
   * @return value or {@code null} for none
   */
  public java.lang.String getChannelTitle() {
    return channelTitle;
  }

  /**
   * The title of the channel that published the resource that the search result identifies.
   * @param channelTitle channelTitle or {@code null} for none
   */
  public SearchResultSnippet setChannelTitle(java.lang.String channelTitle) {
    this.channelTitle = channelTitle;
    return this;
  }

  /**
   * A description of the search result.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A description of the search result.
   * @param description description or {@code null} for none
   */
  public SearchResultSnippet setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * It indicates if the resource (video or channel) has upcoming/active live broadcast content. Or
   * it's "none" if there is not any upcoming/active live broadcasts.
   * @return value or {@code null} for none
   */
  public java.lang.String getLiveBroadcastContent() {
    return liveBroadcastContent;
  }

  /**
   * It indicates if the resource (video or channel) has upcoming/active live broadcast content. Or
   * it's "none" if there is not any upcoming/active live broadcasts.
   * @param liveBroadcastContent liveBroadcastContent or {@code null} for none
   */
  public SearchResultSnippet setLiveBroadcastContent(java.lang.String liveBroadcastContent) {
    this.liveBroadcastContent = liveBroadcastContent;
    return this;
  }

  /**
   * The creation date and time of the resource that the search result identifies. The value is
   * specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getPublishedAt() {
    return publishedAt;
  }

  /**
   * The creation date and time of the resource that the search result identifies. The value is
   * specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
   * @param publishedAt publishedAt or {@code null} for none
   */
  public SearchResultSnippet setPublishedAt(com.google.api.client.util.DateTime publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * A map of thumbnail images associated with the search result. For each object in the map, the
   * key is the name of the thumbnail image, and the value is an object that contains other
   * information about the thumbnail.
   * @return value or {@code null} for none
   */
  public ThumbnailDetails getThumbnails() {
    return thumbnails;
  }

  /**
   * A map of thumbnail images associated with the search result. For each object in the map, the
   * key is the name of the thumbnail image, and the value is an object that contains other
   * information about the thumbnail.
   * @param thumbnails thumbnails or {@code null} for none
   */
  public SearchResultSnippet setThumbnails(ThumbnailDetails thumbnails) {
    this.thumbnails = thumbnails;
    return this;
  }

  /**
   * The title of the search result.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of the search result.
   * @param title title or {@code null} for none
   */
  public SearchResultSnippet setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public SearchResultSnippet set(String fieldName, Object value) {
    return (SearchResultSnippet) super.set(fieldName, value);
  }

  @Override
  public SearchResultSnippet clone() {
    return (SearchResultSnippet) super.clone();
  }

}
