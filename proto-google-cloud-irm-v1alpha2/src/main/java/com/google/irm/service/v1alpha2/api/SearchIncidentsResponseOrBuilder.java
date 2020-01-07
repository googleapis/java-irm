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

public interface SearchIncidentsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.irm.v1alpha2.SearchIncidentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Incidents.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
   */
  java.util.List<com.google.irm.service.v1alpha2.api.Incident> getIncidentsList();
  /**
   *
   *
   * <pre>
   * Incidents.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
   */
  com.google.irm.service.v1alpha2.api.Incident getIncidents(int index);
  /**
   *
   *
   * <pre>
   * Incidents.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
   */
  int getIncidentsCount();
  /**
   *
   *
   * <pre>
   * Incidents.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
   */
  java.util.List<? extends com.google.irm.service.v1alpha2.api.IncidentOrBuilder>
      getIncidentsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Incidents.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
   */
  com.google.irm.service.v1alpha2.api.IncidentOrBuilder getIncidentsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Page token to fetch the next set of incidents.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Page token to fetch the next set of incidents.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
