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
 * Freebase topic information related to the video.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VideoTopicDetails extends com.google.api.client.json.GenericJson {

  /**
   * Similar to topic_id, except that these topics are merely relevant to the video. These are
   * topics that may be mentioned in, or appear in the video. You can retrieve information about
   * each topic using Freebase Topic API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> relevantTopicIds;

  /**
   * A list of Freebase topic IDs that are centrally associated with the video. These are topics
   * that are centrally featured in the video, and it can be said that the video is mainly about
   * each of these. You can retrieve information about each topic using the Freebase Topic API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> topicIds;

  /**
   * Similar to topic_id, except that these topics are merely relevant to the video. These are
   * topics that may be mentioned in, or appear in the video. You can retrieve information about
   * each topic using Freebase Topic API.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRelevantTopicIds() {
    return relevantTopicIds;
  }

  /**
   * Similar to topic_id, except that these topics are merely relevant to the video. These are
   * topics that may be mentioned in, or appear in the video. You can retrieve information about
   * each topic using Freebase Topic API.
   * @param relevantTopicIds relevantTopicIds or {@code null} for none
   */
  public VideoTopicDetails setRelevantTopicIds(java.util.List<java.lang.String> relevantTopicIds) {
    this.relevantTopicIds = relevantTopicIds;
    return this;
  }

  /**
   * A list of Freebase topic IDs that are centrally associated with the video. These are topics
   * that are centrally featured in the video, and it can be said that the video is mainly about
   * each of these. You can retrieve information about each topic using the Freebase Topic API.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTopicIds() {
    return topicIds;
  }

  /**
   * A list of Freebase topic IDs that are centrally associated with the video. These are topics
   * that are centrally featured in the video, and it can be said that the video is mainly about
   * each of these. You can retrieve information about each topic using the Freebase Topic API.
   * @param topicIds topicIds or {@code null} for none
   */
  public VideoTopicDetails setTopicIds(java.util.List<java.lang.String> topicIds) {
    this.topicIds = topicIds;
    return this;
  }

  @Override
  public VideoTopicDetails set(String fieldName, Object value) {
    return (VideoTopicDetails) super.set(fieldName, value);
  }

  @Override
  public VideoTopicDetails clone() {
    return (VideoTopicDetails) super.clone();
  }

}
