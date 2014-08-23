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
 * An activity resource contains information about an action that a particular channel, or user, has
 * taken on YouTube.The actions reported in activity feeds include rating a video, sharing a video,
 * marking a video as a favorite, commenting on a video, uploading a video, and so forth. Each
 * activity resource identifies the type of action, the channel associated with the action, and the
 * resource(s) associated with the action, such as the video that was rated or uploaded.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Activity extends com.google.api.client.json.GenericJson {

  /**
   * The contentDetails object contains information about the content associated with the activity.
   * For example, if the snippet.type value is videoRated, then the contentDetails object's content
   * identifies the rated video.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ActivityContentDetails contentDetails;

  /**
   * Etag of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The ID that YouTube uses to uniquely identify the activity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "youtube#activity".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The snippet object contains basic details about the activity, including the activity's type and
   * group ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ActivitySnippet snippet;

  /**
   * The contentDetails object contains information about the content associated with the activity.
   * For example, if the snippet.type value is videoRated, then the contentDetails object's content
   * identifies the rated video.
   * @return value or {@code null} for none
   */
  public ActivityContentDetails getContentDetails() {
    return contentDetails;
  }

  /**
   * The contentDetails object contains information about the content associated with the activity.
   * For example, if the snippet.type value is videoRated, then the contentDetails object's content
   * identifies the rated video.
   * @param contentDetails contentDetails or {@code null} for none
   */
  public Activity setContentDetails(ActivityContentDetails contentDetails) {
    this.contentDetails = contentDetails;
    return this;
  }

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
  public Activity setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The ID that YouTube uses to uniquely identify the activity.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID that YouTube uses to uniquely identify the activity.
   * @param id id or {@code null} for none
   */
  public Activity setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "youtube#activity".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "youtube#activity".
   * @param kind kind or {@code null} for none
   */
  public Activity setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The snippet object contains basic details about the activity, including the activity's type and
   * group ID.
   * @return value or {@code null} for none
   */
  public ActivitySnippet getSnippet() {
    return snippet;
  }

  /**
   * The snippet object contains basic details about the activity, including the activity's type and
   * group ID.
   * @param snippet snippet or {@code null} for none
   */
  public Activity setSnippet(ActivitySnippet snippet) {
    this.snippet = snippet;
    return this;
  }

  @Override
  public Activity set(String fieldName, Object value) {
    return (Activity) super.set(fieldName, value);
  }

  @Override
  public Activity clone() {
    return (Activity) super.clone();
  }

}
