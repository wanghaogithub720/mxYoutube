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
 * Specifies suggestions on how to improve video content, including encoding hints, tag suggestions,
 * and editor suggestions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VideoSuggestions extends com.google.api.client.json.GenericJson {

  /**
   * A list of video editing operations that might improve the video quality or playback experience
   * of the uploaded video.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> editorSuggestions;

  /**
   * A list of errors that will prevent YouTube from successfully processing the uploaded video
   * video. These errors indicate that, regardless of the video's current processing status,
   * eventually, that status will almost certainly be failed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> processingErrors;

  /**
   * A list of suggestions that may improve YouTube's ability to process the video.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> processingHints;

  /**
   * A list of reasons why YouTube may have difficulty transcoding the uploaded video or that might
   * result in an erroneous transcoding. These warnings are generated before YouTube actually
   * processes the uploaded video file. In addition, they identify issues that are unlikely to cause
   * the video processing to fail but that might cause problems such as sync issues, video
   * artifacts, or a missing audio track.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> processingWarnings;

  /**
   * A list of keyword tags that could be added to the video's metadata to increase the likelihood
   * that users will locate your video when searching or browsing on YouTube.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<VideoSuggestionsTagSuggestion> tagSuggestions;

  static {
    // hack to force ProGuard to consider VideoSuggestionsTagSuggestion used, since otherwise it would be stripped out
    // see http://code.google.com/p/google-api-java-client/issues/detail?id=528
    com.google.api.client.util.Data.nullOf(VideoSuggestionsTagSuggestion.class);
  }

  /**
   * A list of video editing operations that might improve the video quality or playback experience
   * of the uploaded video.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEditorSuggestions() {
    return editorSuggestions;
  }

  /**
   * A list of video editing operations that might improve the video quality or playback experience
   * of the uploaded video.
   * @param editorSuggestions editorSuggestions or {@code null} for none
   */
  public VideoSuggestions setEditorSuggestions(java.util.List<java.lang.String> editorSuggestions) {
    this.editorSuggestions = editorSuggestions;
    return this;
  }

  /**
   * A list of errors that will prevent YouTube from successfully processing the uploaded video
   * video. These errors indicate that, regardless of the video's current processing status,
   * eventually, that status will almost certainly be failed.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProcessingErrors() {
    return processingErrors;
  }

  /**
   * A list of errors that will prevent YouTube from successfully processing the uploaded video
   * video. These errors indicate that, regardless of the video's current processing status,
   * eventually, that status will almost certainly be failed.
   * @param processingErrors processingErrors or {@code null} for none
   */
  public VideoSuggestions setProcessingErrors(java.util.List<java.lang.String> processingErrors) {
    this.processingErrors = processingErrors;
    return this;
  }

  /**
   * A list of suggestions that may improve YouTube's ability to process the video.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProcessingHints() {
    return processingHints;
  }

  /**
   * A list of suggestions that may improve YouTube's ability to process the video.
   * @param processingHints processingHints or {@code null} for none
   */
  public VideoSuggestions setProcessingHints(java.util.List<java.lang.String> processingHints) {
    this.processingHints = processingHints;
    return this;
  }

  /**
   * A list of reasons why YouTube may have difficulty transcoding the uploaded video or that might
   * result in an erroneous transcoding. These warnings are generated before YouTube actually
   * processes the uploaded video file. In addition, they identify issues that are unlikely to cause
   * the video processing to fail but that might cause problems such as sync issues, video
   * artifacts, or a missing audio track.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProcessingWarnings() {
    return processingWarnings;
  }

  /**
   * A list of reasons why YouTube may have difficulty transcoding the uploaded video or that might
   * result in an erroneous transcoding. These warnings are generated before YouTube actually
   * processes the uploaded video file. In addition, they identify issues that are unlikely to cause
   * the video processing to fail but that might cause problems such as sync issues, video
   * artifacts, or a missing audio track.
   * @param processingWarnings processingWarnings or {@code null} for none
   */
  public VideoSuggestions setProcessingWarnings(java.util.List<java.lang.String> processingWarnings) {
    this.processingWarnings = processingWarnings;
    return this;
  }

  /**
   * A list of keyword tags that could be added to the video's metadata to increase the likelihood
   * that users will locate your video when searching or browsing on YouTube.
   * @return value or {@code null} for none
   */
  public java.util.List<VideoSuggestionsTagSuggestion> getTagSuggestions() {
    return tagSuggestions;
  }

  /**
   * A list of keyword tags that could be added to the video's metadata to increase the likelihood
   * that users will locate your video when searching or browsing on YouTube.
   * @param tagSuggestions tagSuggestions or {@code null} for none
   */
  public VideoSuggestions setTagSuggestions(java.util.List<VideoSuggestionsTagSuggestion> tagSuggestions) {
    this.tagSuggestions = tagSuggestions;
    return this;
  }

  @Override
  public VideoSuggestions set(String fieldName, Object value) {
    return (VideoSuggestions) super.set(fieldName, value);
  }

  @Override
  public VideoSuggestions clone() {
    return (VideoSuggestions) super.clone();
  }

}
