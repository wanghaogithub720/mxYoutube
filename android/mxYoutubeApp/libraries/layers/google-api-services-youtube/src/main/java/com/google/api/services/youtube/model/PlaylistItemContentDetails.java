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
 * Model definition for PlaylistItemContentDetails.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PlaylistItemContentDetails extends com.google.api.client.json.GenericJson {

  /**
   * The time, measured in seconds from the start of the video, when the video should stop playing.
   * (The playlist owner can specify the times when the video should start and stop playing when the
   * video is played in the context of the playlist.) By default, assume that the video.endTime is
   * the end of the video.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String endAt;

  /**
   * A user-generated note for this item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String note;

  /**
   * The time, measured in seconds from the start of the video, when the video should start playing.
   * (The playlist owner can specify the times when the video should start and stop playing when the
   * video is played in the context of the playlist.) The default value is 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startAt;

  /**
   * The ID that YouTube uses to uniquely identify a video. To retrieve the video resource, set the
   * id query parameter to this value in your API request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String videoId;

  /**
   * The time, measured in seconds from the start of the video, when the video should stop playing.
   * (The playlist owner can specify the times when the video should start and stop playing when the
   * video is played in the context of the playlist.) By default, assume that the video.endTime is
   * the end of the video.
   * @return value or {@code null} for none
   */
  public java.lang.String getEndAt() {
    return endAt;
  }

  /**
   * The time, measured in seconds from the start of the video, when the video should stop playing.
   * (The playlist owner can specify the times when the video should start and stop playing when the
   * video is played in the context of the playlist.) By default, assume that the video.endTime is
   * the end of the video.
   * @param endAt endAt or {@code null} for none
   */
  public PlaylistItemContentDetails setEndAt(java.lang.String endAt) {
    this.endAt = endAt;
    return this;
  }

  /**
   * A user-generated note for this item.
   * @return value or {@code null} for none
   */
  public java.lang.String getNote() {
    return note;
  }

  /**
   * A user-generated note for this item.
   * @param note note or {@code null} for none
   */
  public PlaylistItemContentDetails setNote(java.lang.String note) {
    this.note = note;
    return this;
  }

  /**
   * The time, measured in seconds from the start of the video, when the video should start playing.
   * (The playlist owner can specify the times when the video should start and stop playing when the
   * video is played in the context of the playlist.) The default value is 0.
   * @return value or {@code null} for none
   */
  public java.lang.String getStartAt() {
    return startAt;
  }

  /**
   * The time, measured in seconds from the start of the video, when the video should start playing.
   * (The playlist owner can specify the times when the video should start and stop playing when the
   * video is played in the context of the playlist.) The default value is 0.
   * @param startAt startAt or {@code null} for none
   */
  public PlaylistItemContentDetails setStartAt(java.lang.String startAt) {
    this.startAt = startAt;
    return this;
  }

  /**
   * The ID that YouTube uses to uniquely identify a video. To retrieve the video resource, set the
   * id query parameter to this value in your API request.
   * @return value or {@code null} for none
   */
  public java.lang.String getVideoId() {
    return videoId;
  }

  /**
   * The ID that YouTube uses to uniquely identify a video. To retrieve the video resource, set the
   * id query parameter to this value in your API request.
   * @param videoId videoId or {@code null} for none
   */
  public PlaylistItemContentDetails setVideoId(java.lang.String videoId) {
    this.videoId = videoId;
    return this;
  }

  @Override
  public PlaylistItemContentDetails set(String fieldName, Object value) {
    return (PlaylistItemContentDetails) super.set(fieldName, value);
  }

  @Override
  public PlaylistItemContentDetails clone() {
    return (PlaylistItemContentDetails) super.clone();
  }

}
