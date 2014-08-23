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
 * Model definition for InvideoBranding.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InvideoBranding extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageBytes;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InvideoPosition position;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetChannelId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InvideoTiming timing;

  /**
   * @see #decodeImageBytes()
   * @return value or {@code null} for none
   */
  public java.lang.String getImageBytes() {
    return imageBytes;
  }

  /**

   * @see #getImageBytes()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeImageBytes() {
    return com.google.api.client.util.Base64.decodeBase64(imageBytes);
  }

  /**
   * @see #encodeImageBytes()
   * @param imageBytes imageBytes or {@code null} for none
   */
  public InvideoBranding setImageBytes(java.lang.String imageBytes) {
    this.imageBytes = imageBytes;
    return this;
  }

  /**

   * @see #setImageBytes()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public InvideoBranding encodeImageBytes(byte[] imageBytes) {
    this.imageBytes = com.google.api.client.util.Base64.encodeBase64URLSafeString(imageBytes);
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getImageUrl() {
    return imageUrl;
  }

  /**
   * @param imageUrl imageUrl or {@code null} for none
   */
  public InvideoBranding setImageUrl(java.lang.String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public InvideoPosition getPosition() {
    return position;
  }

  /**
   * @param position position or {@code null} for none
   */
  public InvideoBranding setPosition(InvideoPosition position) {
    this.position = position;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetChannelId() {
    return targetChannelId;
  }

  /**
   * @param targetChannelId targetChannelId or {@code null} for none
   */
  public InvideoBranding setTargetChannelId(java.lang.String targetChannelId) {
    this.targetChannelId = targetChannelId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public InvideoTiming getTiming() {
    return timing;
  }

  /**
   * @param timing timing or {@code null} for none
   */
  public InvideoBranding setTiming(InvideoTiming timing) {
    this.timing = timing;
    return this;
  }

  @Override
  public InvideoBranding set(String fieldName, Object value) {
    return (InvideoBranding) super.set(fieldName, value);
  }

  @Override
  public InvideoBranding clone() {
    return (InvideoBranding) super.clone();
  }

}
