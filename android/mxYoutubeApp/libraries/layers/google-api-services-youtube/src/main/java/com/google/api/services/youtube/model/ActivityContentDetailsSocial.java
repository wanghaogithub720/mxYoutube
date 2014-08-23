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
 * Details about a social network post.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ActivityContentDetailsSocial extends com.google.api.client.json.GenericJson {

  /**
   * The author of the social network post.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String author;

  /**
   * An image of the post's author.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageUrl;

  /**
   * The URL of the social network post.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String referenceUrl;

  /**
   * The resourceId object encapsulates information that identifies the resource associated with a
   * social network post.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResourceId resourceId;

  /**
   * The name of the social network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The author of the social network post.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthor() {
    return author;
  }

  /**
   * The author of the social network post.
   * @param author author or {@code null} for none
   */
  public ActivityContentDetailsSocial setAuthor(java.lang.String author) {
    this.author = author;
    return this;
  }

  /**
   * An image of the post's author.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageUrl() {
    return imageUrl;
  }

  /**
   * An image of the post's author.
   * @param imageUrl imageUrl or {@code null} for none
   */
  public ActivityContentDetailsSocial setImageUrl(java.lang.String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * The URL of the social network post.
   * @return value or {@code null} for none
   */
  public java.lang.String getReferenceUrl() {
    return referenceUrl;
  }

  /**
   * The URL of the social network post.
   * @param referenceUrl referenceUrl or {@code null} for none
   */
  public ActivityContentDetailsSocial setReferenceUrl(java.lang.String referenceUrl) {
    this.referenceUrl = referenceUrl;
    return this;
  }

  /**
   * The resourceId object encapsulates information that identifies the resource associated with a
   * social network post.
   * @return value or {@code null} for none
   */
  public ResourceId getResourceId() {
    return resourceId;
  }

  /**
   * The resourceId object encapsulates information that identifies the resource associated with a
   * social network post.
   * @param resourceId resourceId or {@code null} for none
   */
  public ActivityContentDetailsSocial setResourceId(ResourceId resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The name of the social network.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The name of the social network.
   * @param type type or {@code null} for none
   */
  public ActivityContentDetailsSocial setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public ActivityContentDetailsSocial set(String fieldName, Object value) {
    return (ActivityContentDetailsSocial) super.set(fieldName, value);
  }

  @Override
  public ActivityContentDetailsSocial clone() {
    return (ActivityContentDetailsSocial) super.clone();
  }

}
