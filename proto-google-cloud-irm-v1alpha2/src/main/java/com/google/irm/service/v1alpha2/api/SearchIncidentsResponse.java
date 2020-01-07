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

/**
 *
 *
 * <pre>
 * Response for the SearchIncidents method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.irm.v1alpha2.SearchIncidentsResponse}
 */
public final class SearchIncidentsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.irm.v1alpha2.SearchIncidentsResponse)
    SearchIncidentsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SearchIncidentsResponse.newBuilder() to construct.
  private SearchIncidentsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SearchIncidentsResponse() {
    incidents_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SearchIncidentsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SearchIncidentsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                incidents_ =
                    new java.util.ArrayList<com.google.irm.service.v1alpha2.api.Incident>();
                mutable_bitField0_ |= 0x00000001;
              }
              incidents_.add(
                  input.readMessage(
                      com.google.irm.service.v1alpha2.api.Incident.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        incidents_ = java.util.Collections.unmodifiableList(incidents_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.irm.service.v1alpha2.api.IncidentsService
        .internal_static_google_cloud_irm_v1alpha2_SearchIncidentsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.irm.service.v1alpha2.api.IncidentsService
        .internal_static_google_cloud_irm_v1alpha2_SearchIncidentsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.irm.service.v1alpha2.api.SearchIncidentsResponse.class,
            com.google.irm.service.v1alpha2.api.SearchIncidentsResponse.Builder.class);
  }

  public static final int INCIDENTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.irm.service.v1alpha2.api.Incident> incidents_;
  /**
   *
   *
   * <pre>
   * Incidents.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
   */
  public java.util.List<com.google.irm.service.v1alpha2.api.Incident> getIncidentsList() {
    return incidents_;
  }
  /**
   *
   *
   * <pre>
   * Incidents.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
   */
  public java.util.List<? extends com.google.irm.service.v1alpha2.api.IncidentOrBuilder>
      getIncidentsOrBuilderList() {
    return incidents_;
  }
  /**
   *
   *
   * <pre>
   * Incidents.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
   */
  public int getIncidentsCount() {
    return incidents_.size();
  }
  /**
   *
   *
   * <pre>
   * Incidents.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
   */
  public com.google.irm.service.v1alpha2.api.Incident getIncidents(int index) {
    return incidents_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Incidents.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
   */
  public com.google.irm.service.v1alpha2.api.IncidentOrBuilder getIncidentsOrBuilder(int index) {
    return incidents_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
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
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
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
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < incidents_.size(); i++) {
      output.writeMessage(1, incidents_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < incidents_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, incidents_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.irm.service.v1alpha2.api.SearchIncidentsResponse)) {
      return super.equals(obj);
    }
    com.google.irm.service.v1alpha2.api.SearchIncidentsResponse other =
        (com.google.irm.service.v1alpha2.api.SearchIncidentsResponse) obj;

    if (!getIncidentsList().equals(other.getIncidentsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getIncidentsCount() > 0) {
      hash = (37 * hash) + INCIDENTS_FIELD_NUMBER;
      hash = (53 * hash) + getIncidentsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.irm.service.v1alpha2.api.SearchIncidentsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.SearchIncidentsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.SearchIncidentsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.SearchIncidentsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.SearchIncidentsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.SearchIncidentsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.SearchIncidentsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.SearchIncidentsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.SearchIncidentsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.SearchIncidentsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.SearchIncidentsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.SearchIncidentsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.irm.service.v1alpha2.api.SearchIncidentsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response for the SearchIncidents method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.irm.v1alpha2.SearchIncidentsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.irm.v1alpha2.SearchIncidentsResponse)
      com.google.irm.service.v1alpha2.api.SearchIncidentsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.irm.service.v1alpha2.api.IncidentsService
          .internal_static_google_cloud_irm_v1alpha2_SearchIncidentsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.irm.service.v1alpha2.api.IncidentsService
          .internal_static_google_cloud_irm_v1alpha2_SearchIncidentsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.irm.service.v1alpha2.api.SearchIncidentsResponse.class,
              com.google.irm.service.v1alpha2.api.SearchIncidentsResponse.Builder.class);
    }

    // Construct using com.google.irm.service.v1alpha2.api.SearchIncidentsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getIncidentsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (incidentsBuilder_ == null) {
        incidents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        incidentsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.irm.service.v1alpha2.api.IncidentsService
          .internal_static_google_cloud_irm_v1alpha2_SearchIncidentsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.SearchIncidentsResponse getDefaultInstanceForType() {
      return com.google.irm.service.v1alpha2.api.SearchIncidentsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.SearchIncidentsResponse build() {
      com.google.irm.service.v1alpha2.api.SearchIncidentsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.SearchIncidentsResponse buildPartial() {
      com.google.irm.service.v1alpha2.api.SearchIncidentsResponse result =
          new com.google.irm.service.v1alpha2.api.SearchIncidentsResponse(this);
      int from_bitField0_ = bitField0_;
      if (incidentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          incidents_ = java.util.Collections.unmodifiableList(incidents_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.incidents_ = incidents_;
      } else {
        result.incidents_ = incidentsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.irm.service.v1alpha2.api.SearchIncidentsResponse) {
        return mergeFrom((com.google.irm.service.v1alpha2.api.SearchIncidentsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.irm.service.v1alpha2.api.SearchIncidentsResponse other) {
      if (other == com.google.irm.service.v1alpha2.api.SearchIncidentsResponse.getDefaultInstance())
        return this;
      if (incidentsBuilder_ == null) {
        if (!other.incidents_.isEmpty()) {
          if (incidents_.isEmpty()) {
            incidents_ = other.incidents_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureIncidentsIsMutable();
            incidents_.addAll(other.incidents_);
          }
          onChanged();
        }
      } else {
        if (!other.incidents_.isEmpty()) {
          if (incidentsBuilder_.isEmpty()) {
            incidentsBuilder_.dispose();
            incidentsBuilder_ = null;
            incidents_ = other.incidents_;
            bitField0_ = (bitField0_ & ~0x00000001);
            incidentsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getIncidentsFieldBuilder()
                    : null;
          } else {
            incidentsBuilder_.addAllMessages(other.incidents_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.irm.service.v1alpha2.api.SearchIncidentsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.irm.service.v1alpha2.api.SearchIncidentsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.irm.service.v1alpha2.api.Incident> incidents_ =
        java.util.Collections.emptyList();

    private void ensureIncidentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        incidents_ =
            new java.util.ArrayList<com.google.irm.service.v1alpha2.api.Incident>(incidents_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.irm.service.v1alpha2.api.Incident,
            com.google.irm.service.v1alpha2.api.Incident.Builder,
            com.google.irm.service.v1alpha2.api.IncidentOrBuilder>
        incidentsBuilder_;

    /**
     *
     *
     * <pre>
     * Incidents.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
     */
    public java.util.List<com.google.irm.service.v1alpha2.api.Incident> getIncidentsList() {
      if (incidentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(incidents_);
      } else {
        return incidentsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Incidents.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
     */
    public int getIncidentsCount() {
      if (incidentsBuilder_ == null) {
        return incidents_.size();
      } else {
        return incidentsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Incidents.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
     */
    public com.google.irm.service.v1alpha2.api.Incident getIncidents(int index) {
      if (incidentsBuilder_ == null) {
        return incidents_.get(index);
      } else {
        return incidentsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Incidents.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
     */
    public Builder setIncidents(int index, com.google.irm.service.v1alpha2.api.Incident value) {
      if (incidentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIncidentsIsMutable();
        incidents_.set(index, value);
        onChanged();
      } else {
        incidentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Incidents.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
     */
    public Builder setIncidents(
        int index, com.google.irm.service.v1alpha2.api.Incident.Builder builderForValue) {
      if (incidentsBuilder_ == null) {
        ensureIncidentsIsMutable();
        incidents_.set(index, builderForValue.build());
        onChanged();
      } else {
        incidentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Incidents.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
     */
    public Builder addIncidents(com.google.irm.service.v1alpha2.api.Incident value) {
      if (incidentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIncidentsIsMutable();
        incidents_.add(value);
        onChanged();
      } else {
        incidentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Incidents.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
     */
    public Builder addIncidents(int index, com.google.irm.service.v1alpha2.api.Incident value) {
      if (incidentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIncidentsIsMutable();
        incidents_.add(index, value);
        onChanged();
      } else {
        incidentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Incidents.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
     */
    public Builder addIncidents(
        com.google.irm.service.v1alpha2.api.Incident.Builder builderForValue) {
      if (incidentsBuilder_ == null) {
        ensureIncidentsIsMutable();
        incidents_.add(builderForValue.build());
        onChanged();
      } else {
        incidentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Incidents.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
     */
    public Builder addIncidents(
        int index, com.google.irm.service.v1alpha2.api.Incident.Builder builderForValue) {
      if (incidentsBuilder_ == null) {
        ensureIncidentsIsMutable();
        incidents_.add(index, builderForValue.build());
        onChanged();
      } else {
        incidentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Incidents.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
     */
    public Builder addAllIncidents(
        java.lang.Iterable<? extends com.google.irm.service.v1alpha2.api.Incident> values) {
      if (incidentsBuilder_ == null) {
        ensureIncidentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, incidents_);
        onChanged();
      } else {
        incidentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Incidents.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
     */
    public Builder clearIncidents() {
      if (incidentsBuilder_ == null) {
        incidents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        incidentsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Incidents.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
     */
    public Builder removeIncidents(int index) {
      if (incidentsBuilder_ == null) {
        ensureIncidentsIsMutable();
        incidents_.remove(index);
        onChanged();
      } else {
        incidentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Incidents.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
     */
    public com.google.irm.service.v1alpha2.api.Incident.Builder getIncidentsBuilder(int index) {
      return getIncidentsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Incidents.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
     */
    public com.google.irm.service.v1alpha2.api.IncidentOrBuilder getIncidentsOrBuilder(int index) {
      if (incidentsBuilder_ == null) {
        return incidents_.get(index);
      } else {
        return incidentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Incidents.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
     */
    public java.util.List<? extends com.google.irm.service.v1alpha2.api.IncidentOrBuilder>
        getIncidentsOrBuilderList() {
      if (incidentsBuilder_ != null) {
        return incidentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(incidents_);
      }
    }
    /**
     *
     *
     * <pre>
     * Incidents.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
     */
    public com.google.irm.service.v1alpha2.api.Incident.Builder addIncidentsBuilder() {
      return getIncidentsFieldBuilder()
          .addBuilder(com.google.irm.service.v1alpha2.api.Incident.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Incidents.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
     */
    public com.google.irm.service.v1alpha2.api.Incident.Builder addIncidentsBuilder(int index) {
      return getIncidentsFieldBuilder()
          .addBuilder(index, com.google.irm.service.v1alpha2.api.Incident.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Incidents.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Incident incidents = 1;</code>
     */
    public java.util.List<com.google.irm.service.v1alpha2.api.Incident.Builder>
        getIncidentsBuilderList() {
      return getIncidentsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.irm.service.v1alpha2.api.Incident,
            com.google.irm.service.v1alpha2.api.Incident.Builder,
            com.google.irm.service.v1alpha2.api.IncidentOrBuilder>
        getIncidentsFieldBuilder() {
      if (incidentsBuilder_ == null) {
        incidentsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.irm.service.v1alpha2.api.Incident,
                com.google.irm.service.v1alpha2.api.Incident.Builder,
                com.google.irm.service.v1alpha2.api.IncidentOrBuilder>(
                incidents_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        incidents_ = null;
      }
      return incidentsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
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
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
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
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Page token to fetch the next set of incidents.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Page token to fetch the next set of incidents.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Page token to fetch the next set of incidents.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.irm.v1alpha2.SearchIncidentsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.irm.v1alpha2.SearchIncidentsResponse)
  private static final com.google.irm.service.v1alpha2.api.SearchIncidentsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.irm.service.v1alpha2.api.SearchIncidentsResponse();
  }

  public static com.google.irm.service.v1alpha2.api.SearchIncidentsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchIncidentsResponse> PARSER =
      new com.google.protobuf.AbstractParser<SearchIncidentsResponse>() {
        @java.lang.Override
        public SearchIncidentsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SearchIncidentsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SearchIncidentsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchIncidentsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.irm.service.v1alpha2.api.SearchIncidentsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
