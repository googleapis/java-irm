/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/irm/v1alpha2/incidents_service.proto

package com.google.irm.service.v1alpha2.api;

public interface SendShiftHandoffResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.irm.v1alpha2.SendShiftHandoffResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Content type string, for example, 'text/plain' or 'text/html'.
   * </pre>
   *
   * <code>string content_type = 1;</code>
   *
   * @return The contentType.
   */
  java.lang.String getContentType();
  /**
   *
   *
   * <pre>
   * Content type string, for example, 'text/plain' or 'text/html'.
   * </pre>
   *
   * <code>string content_type = 1;</code>
   *
   * @return The bytes for contentType.
   */
  com.google.protobuf.ByteString getContentTypeBytes();

  /**
   *
   *
   * <pre>
   * The contents of the handoff that was sent or would have been sent (if the
   * request was preview_only).
   * This will typically contain a full HTML document.
   * </pre>
   *
   * <code>string content = 2;</code>
   *
   * @return The content.
   */
  java.lang.String getContent();
  /**
   *
   *
   * <pre>
   * The contents of the handoff that was sent or would have been sent (if the
   * request was preview_only).
   * This will typically contain a full HTML document.
   * </pre>
   *
   * <code>string content = 2;</code>
   *
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString getContentBytes();
}
