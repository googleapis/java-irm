/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/irm/v1alpha2/incidents.proto

package com.google.irm.service.v1alpha2.api;

public interface CommunicationChannelOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.irm.v1alpha2.CommunicationChannel)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Messages will be delivered via email.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.CommunicationChannel.Email email = 1;</code>
   *
   * @return Whether the email field is set.
   */
  boolean hasEmail();
  /**
   *
   *
   * <pre>
   * Messages will be delivered via email.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.CommunicationChannel.Email email = 1;</code>
   *
   * @return The email.
   */
  com.google.irm.service.v1alpha2.api.CommunicationChannel.Email getEmail();
  /**
   *
   *
   * <pre>
   * Messages will be delivered via email.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.CommunicationChannel.Email email = 1;</code>
   */
  com.google.irm.service.v1alpha2.api.CommunicationChannel.EmailOrBuilder getEmailOrBuilder();

  /**
   *
   *
   * <pre>
   * Messages will be delivered via a Stackdriver notification channel.
   * </pre>
   *
   * <code>
   * .google.cloud.irm.v1alpha2.CommunicationChannel.NotificationChannel notification_channel = 2;
   * </code>
   *
   * @return Whether the notificationChannel field is set.
   */
  boolean hasNotificationChannel();
  /**
   *
   *
   * <pre>
   * Messages will be delivered via a Stackdriver notification channel.
   * </pre>
   *
   * <code>
   * .google.cloud.irm.v1alpha2.CommunicationChannel.NotificationChannel notification_channel = 2;
   * </code>
   *
   * @return The notificationChannel.
   */
  com.google.irm.service.v1alpha2.api.CommunicationChannel.NotificationChannel
      getNotificationChannel();
  /**
   *
   *
   * <pre>
   * Messages will be delivered via a Stackdriver notification channel.
   * </pre>
   *
   * <code>
   * .google.cloud.irm.v1alpha2.CommunicationChannel.NotificationChannel notification_channel = 2;
   * </code>
   */
  com.google.irm.service.v1alpha2.api.CommunicationChannel.NotificationChannelOrBuilder
      getNotificationChannelOrBuilder();

  public com.google.irm.service.v1alpha2.api.CommunicationChannel.EndpointCase getEndpointCase();
}
