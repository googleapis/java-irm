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

public interface AnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.irm.v1alpha2.Annotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name of the annotation, for example,
   * "projects/{project_id}/incidents/{incident_id}/annotations/{annotation_id}".
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Resource name of the annotation, for example,
   * "projects/{project_id}/incidents/{incident_id}/annotations/{annotation_id}".
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Author of the annotation.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.User author = 2;</code>
   *
   * @return Whether the author field is set.
   */
  boolean hasAuthor();
  /**
   *
   *
   * <pre>
   * Output only. Author of the annotation.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.User author = 2;</code>
   *
   * @return The author.
   */
  com.google.irm.service.v1alpha2.api.User getAuthor();
  /**
   *
   *
   * <pre>
   * Output only. Author of the annotation.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.User author = 2;</code>
   */
  com.google.irm.service.v1alpha2.api.UserOrBuilder getAuthorOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time the annotation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time the annotation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time the annotation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Content of the annotation. Immutable.
   * </pre>
   *
   * <code>string content = 4;</code>
   *
   * @return The content.
   */
  java.lang.String getContent();
  /**
   *
   *
   * <pre>
   * Content of the annotation. Immutable.
   * </pre>
   *
   * <code>string content = 4;</code>
   *
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString getContentBytes();

  /**
   *
   *
   * <pre>
   * Content type of the annotation, for example, 'text/plain'
   * or 'text/markdown'. Immutable.
   * </pre>
   *
   * <code>string content_type = 5;</code>
   *
   * @return The contentType.
   */
  java.lang.String getContentType();
  /**
   *
   *
   * <pre>
   * Content type of the annotation, for example, 'text/plain'
   * or 'text/markdown'. Immutable.
   * </pre>
   *
   * <code>string content_type = 5;</code>
   *
   * @return The bytes for contentType.
   */
  com.google.protobuf.ByteString getContentTypeBytes();
}
