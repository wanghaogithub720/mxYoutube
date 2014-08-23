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
 * Details about the content to witch a subscription refers.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SubscriptionContentDetails extends com.google.api.client.json.GenericJson {

  /**
   * The type of activity this subscription is for (only uploads, everything).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String activityType;

  /**
   * The number of new items in the subscription since its content was last read.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long newItemCount;

  /**
   * The approximate number of items that the subscription points to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long totalItemCount;

  /**
   * The type of activity this subscription is for (only uploads, everything).
   * @return value or {@code null} for none
   */
  public java.lang.String getActivityType() {
    return activityType;
  }

  /**
   * The type of activity this subscription is for (only uploads, everything).
   * @param activityType activityType or {@code null} for none
   */
  public SubscriptionContentDetails setActivityType(java.lang.String activityType) {
    this.activityType = activityType;
    return this;
  }

  /**
   * The number of new items in the subscription since its content was last read.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNewItemCount() {
    return newItemCount;
  }

  /**
   * The number of new items in the subscription since its content was last read.
   * @param newItemCount newItemCount or {@code null} for none
   */
  public SubscriptionContentDetails setNewItemCount(java.lang.Long newItemCount) {
    this.newItemCount = newItemCount;
    return this;
  }

  /**
   * The approximate number of items that the subscription points to.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalItemCount() {
    return totalItemCount;
  }

  /**
   * The approximate number of items that the subscription points to.
   * @param totalItemCount totalItemCount or {@code null} for none
   */
  public SubscriptionContentDetails setTotalItemCount(java.lang.Long totalItemCount) {
    this.totalItemCount = totalItemCount;
    return this;
  }

  @Override
  public SubscriptionContentDetails set(String fieldName, Object value) {
    return (SubscriptionContentDetails) super.set(fieldName, value);
  }

  @Override
  public SubscriptionContentDetails clone() {
    return (SubscriptionContentDetails) super.clone();
  }

}
