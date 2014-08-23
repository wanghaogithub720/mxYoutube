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
 * Describes the spatial position of a visual widget inside a video. It is a union of various
 * position types, out of which only will be set one.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InvideoPosition extends com.google.api.client.json.GenericJson {

  /**
   * Describes in which corner of the video the visual widget will appear.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cornerPosition;

  /**
   * Defines the position type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Describes in which corner of the video the visual widget will appear.
   * @return value or {@code null} for none
   */
  public java.lang.String getCornerPosition() {
    return cornerPosition;
  }

  /**
   * Describes in which corner of the video the visual widget will appear.
   * @param cornerPosition cornerPosition or {@code null} for none
   */
  public InvideoPosition setCornerPosition(java.lang.String cornerPosition) {
    this.cornerPosition = cornerPosition;
    return this;
  }

  /**
   * Defines the position type.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Defines the position type.
   * @param type type or {@code null} for none
   */
  public InvideoPosition setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public InvideoPosition set(String fieldName, Object value) {
    return (InvideoPosition) super.set(fieldName, value);
  }

  @Override
  public InvideoPosition clone() {
    return (InvideoPosition) super.clone();
  }

}
