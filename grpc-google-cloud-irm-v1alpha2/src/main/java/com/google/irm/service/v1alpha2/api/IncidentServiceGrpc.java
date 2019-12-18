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
package com.google.irm.service.v1alpha2.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 *
 *
 * <pre>
 * The Incident API for Incident Response &amp; Management.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/cloud/irm/v1alpha2/incidents_service.proto")
public final class IncidentServiceGrpc {

  private IncidentServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.irm.v1alpha2.IncidentService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateIncidentMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateIncidentRequest,
          com.google.irm.service.v1alpha2.api.Incident>
      METHOD_CREATE_INCIDENT = getCreateIncidentMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateIncidentRequest,
          com.google.irm.service.v1alpha2.api.Incident>
      getCreateIncidentMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateIncidentRequest,
          com.google.irm.service.v1alpha2.api.Incident>
      getCreateIncidentMethod() {
    return getCreateIncidentMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateIncidentRequest,
          com.google.irm.service.v1alpha2.api.Incident>
      getCreateIncidentMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.CreateIncidentRequest,
            com.google.irm.service.v1alpha2.api.Incident>
        getCreateIncidentMethod;
    if ((getCreateIncidentMethod = IncidentServiceGrpc.getCreateIncidentMethod) == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getCreateIncidentMethod = IncidentServiceGrpc.getCreateIncidentMethod) == null) {
          IncidentServiceGrpc.getCreateIncidentMethod =
              getCreateIncidentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.CreateIncidentRequest,
                          com.google.irm.service.v1alpha2.api.Incident>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService", "CreateIncident"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.CreateIncidentRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.Incident.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier("CreateIncident"))
                      .build();
        }
      }
    }
    return getCreateIncidentMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetIncidentMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.GetIncidentRequest,
          com.google.irm.service.v1alpha2.api.Incident>
      METHOD_GET_INCIDENT = getGetIncidentMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.GetIncidentRequest,
          com.google.irm.service.v1alpha2.api.Incident>
      getGetIncidentMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.GetIncidentRequest,
          com.google.irm.service.v1alpha2.api.Incident>
      getGetIncidentMethod() {
    return getGetIncidentMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.GetIncidentRequest,
          com.google.irm.service.v1alpha2.api.Incident>
      getGetIncidentMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.GetIncidentRequest,
            com.google.irm.service.v1alpha2.api.Incident>
        getGetIncidentMethod;
    if ((getGetIncidentMethod = IncidentServiceGrpc.getGetIncidentMethod) == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getGetIncidentMethod = IncidentServiceGrpc.getGetIncidentMethod) == null) {
          IncidentServiceGrpc.getGetIncidentMethod =
              getGetIncidentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.GetIncidentRequest,
                          com.google.irm.service.v1alpha2.api.Incident>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService", "GetIncident"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.GetIncidentRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.Incident.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier("GetIncident"))
                      .build();
        }
      }
    }
    return getGetIncidentMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSearchIncidentsMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.SearchIncidentsRequest,
          com.google.irm.service.v1alpha2.api.SearchIncidentsResponse>
      METHOD_SEARCH_INCIDENTS = getSearchIncidentsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.SearchIncidentsRequest,
          com.google.irm.service.v1alpha2.api.SearchIncidentsResponse>
      getSearchIncidentsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.SearchIncidentsRequest,
          com.google.irm.service.v1alpha2.api.SearchIncidentsResponse>
      getSearchIncidentsMethod() {
    return getSearchIncidentsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.SearchIncidentsRequest,
          com.google.irm.service.v1alpha2.api.SearchIncidentsResponse>
      getSearchIncidentsMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.SearchIncidentsRequest,
            com.google.irm.service.v1alpha2.api.SearchIncidentsResponse>
        getSearchIncidentsMethod;
    if ((getSearchIncidentsMethod = IncidentServiceGrpc.getSearchIncidentsMethod) == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getSearchIncidentsMethod = IncidentServiceGrpc.getSearchIncidentsMethod) == null) {
          IncidentServiceGrpc.getSearchIncidentsMethod =
              getSearchIncidentsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.SearchIncidentsRequest,
                          com.google.irm.service.v1alpha2.api.SearchIncidentsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService", "SearchIncidents"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.SearchIncidentsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.SearchIncidentsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier("SearchIncidents"))
                      .build();
        }
      }
    }
    return getSearchIncidentsMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateIncidentMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.UpdateIncidentRequest,
          com.google.irm.service.v1alpha2.api.Incident>
      METHOD_UPDATE_INCIDENT = getUpdateIncidentMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.UpdateIncidentRequest,
          com.google.irm.service.v1alpha2.api.Incident>
      getUpdateIncidentMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.UpdateIncidentRequest,
          com.google.irm.service.v1alpha2.api.Incident>
      getUpdateIncidentMethod() {
    return getUpdateIncidentMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.UpdateIncidentRequest,
          com.google.irm.service.v1alpha2.api.Incident>
      getUpdateIncidentMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.UpdateIncidentRequest,
            com.google.irm.service.v1alpha2.api.Incident>
        getUpdateIncidentMethod;
    if ((getUpdateIncidentMethod = IncidentServiceGrpc.getUpdateIncidentMethod) == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getUpdateIncidentMethod = IncidentServiceGrpc.getUpdateIncidentMethod) == null) {
          IncidentServiceGrpc.getUpdateIncidentMethod =
              getUpdateIncidentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.UpdateIncidentRequest,
                          com.google.irm.service.v1alpha2.api.Incident>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService", "UpdateIncident"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.UpdateIncidentRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.Incident.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier("UpdateIncident"))
                      .build();
        }
      }
    }
    return getUpdateIncidentMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSearchSimilarIncidentsMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsRequest,
          com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsResponse>
      METHOD_SEARCH_SIMILAR_INCIDENTS = getSearchSimilarIncidentsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsRequest,
          com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsResponse>
      getSearchSimilarIncidentsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsRequest,
          com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsResponse>
      getSearchSimilarIncidentsMethod() {
    return getSearchSimilarIncidentsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsRequest,
          com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsResponse>
      getSearchSimilarIncidentsMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsRequest,
            com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsResponse>
        getSearchSimilarIncidentsMethod;
    if ((getSearchSimilarIncidentsMethod = IncidentServiceGrpc.getSearchSimilarIncidentsMethod)
        == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getSearchSimilarIncidentsMethod = IncidentServiceGrpc.getSearchSimilarIncidentsMethod)
            == null) {
          IncidentServiceGrpc.getSearchSimilarIncidentsMethod =
              getSearchSimilarIncidentsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsRequest,
                          com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService",
                              "SearchSimilarIncidents"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier("SearchSimilarIncidents"))
                      .build();
        }
      }
    }
    return getSearchSimilarIncidentsMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateAnnotationMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateAnnotationRequest,
          com.google.irm.service.v1alpha2.api.Annotation>
      METHOD_CREATE_ANNOTATION = getCreateAnnotationMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateAnnotationRequest,
          com.google.irm.service.v1alpha2.api.Annotation>
      getCreateAnnotationMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateAnnotationRequest,
          com.google.irm.service.v1alpha2.api.Annotation>
      getCreateAnnotationMethod() {
    return getCreateAnnotationMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateAnnotationRequest,
          com.google.irm.service.v1alpha2.api.Annotation>
      getCreateAnnotationMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.CreateAnnotationRequest,
            com.google.irm.service.v1alpha2.api.Annotation>
        getCreateAnnotationMethod;
    if ((getCreateAnnotationMethod = IncidentServiceGrpc.getCreateAnnotationMethod) == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getCreateAnnotationMethod = IncidentServiceGrpc.getCreateAnnotationMethod) == null) {
          IncidentServiceGrpc.getCreateAnnotationMethod =
              getCreateAnnotationMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.CreateAnnotationRequest,
                          com.google.irm.service.v1alpha2.api.Annotation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService", "CreateAnnotation"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.CreateAnnotationRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.Annotation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier("CreateAnnotation"))
                      .build();
        }
      }
    }
    return getCreateAnnotationMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListAnnotationsMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListAnnotationsRequest,
          com.google.irm.service.v1alpha2.api.ListAnnotationsResponse>
      METHOD_LIST_ANNOTATIONS = getListAnnotationsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListAnnotationsRequest,
          com.google.irm.service.v1alpha2.api.ListAnnotationsResponse>
      getListAnnotationsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListAnnotationsRequest,
          com.google.irm.service.v1alpha2.api.ListAnnotationsResponse>
      getListAnnotationsMethod() {
    return getListAnnotationsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListAnnotationsRequest,
          com.google.irm.service.v1alpha2.api.ListAnnotationsResponse>
      getListAnnotationsMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.ListAnnotationsRequest,
            com.google.irm.service.v1alpha2.api.ListAnnotationsResponse>
        getListAnnotationsMethod;
    if ((getListAnnotationsMethod = IncidentServiceGrpc.getListAnnotationsMethod) == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getListAnnotationsMethod = IncidentServiceGrpc.getListAnnotationsMethod) == null) {
          IncidentServiceGrpc.getListAnnotationsMethod =
              getListAnnotationsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.ListAnnotationsRequest,
                          com.google.irm.service.v1alpha2.api.ListAnnotationsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService", "ListAnnotations"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.ListAnnotationsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.ListAnnotationsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier("ListAnnotations"))
                      .build();
        }
      }
    }
    return getListAnnotationsMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateTagMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateTagRequest,
          com.google.irm.service.v1alpha2.api.Tag>
      METHOD_CREATE_TAG = getCreateTagMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateTagRequest,
          com.google.irm.service.v1alpha2.api.Tag>
      getCreateTagMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateTagRequest,
          com.google.irm.service.v1alpha2.api.Tag>
      getCreateTagMethod() {
    return getCreateTagMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateTagRequest,
          com.google.irm.service.v1alpha2.api.Tag>
      getCreateTagMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.CreateTagRequest,
            com.google.irm.service.v1alpha2.api.Tag>
        getCreateTagMethod;
    if ((getCreateTagMethod = IncidentServiceGrpc.getCreateTagMethod) == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getCreateTagMethod = IncidentServiceGrpc.getCreateTagMethod) == null) {
          IncidentServiceGrpc.getCreateTagMethod =
              getCreateTagMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.CreateTagRequest,
                          com.google.irm.service.v1alpha2.api.Tag>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService", "CreateTag"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.CreateTagRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.Tag.getDefaultInstance()))
                      .setSchemaDescriptor(new IncidentServiceMethodDescriptorSupplier("CreateTag"))
                      .build();
        }
      }
    }
    return getCreateTagMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteTagMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.DeleteTagRequest, com.google.protobuf.Empty>
      METHOD_DELETE_TAG = getDeleteTagMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.DeleteTagRequest, com.google.protobuf.Empty>
      getDeleteTagMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.DeleteTagRequest, com.google.protobuf.Empty>
      getDeleteTagMethod() {
    return getDeleteTagMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.DeleteTagRequest, com.google.protobuf.Empty>
      getDeleteTagMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.DeleteTagRequest, com.google.protobuf.Empty>
        getDeleteTagMethod;
    if ((getDeleteTagMethod = IncidentServiceGrpc.getDeleteTagMethod) == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getDeleteTagMethod = IncidentServiceGrpc.getDeleteTagMethod) == null) {
          IncidentServiceGrpc.getDeleteTagMethod =
              getDeleteTagMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.DeleteTagRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService", "DeleteTag"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.DeleteTagRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(new IncidentServiceMethodDescriptorSupplier("DeleteTag"))
                      .build();
        }
      }
    }
    return getDeleteTagMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListTagsMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListTagsRequest,
          com.google.irm.service.v1alpha2.api.ListTagsResponse>
      METHOD_LIST_TAGS = getListTagsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListTagsRequest,
          com.google.irm.service.v1alpha2.api.ListTagsResponse>
      getListTagsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListTagsRequest,
          com.google.irm.service.v1alpha2.api.ListTagsResponse>
      getListTagsMethod() {
    return getListTagsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListTagsRequest,
          com.google.irm.service.v1alpha2.api.ListTagsResponse>
      getListTagsMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.ListTagsRequest,
            com.google.irm.service.v1alpha2.api.ListTagsResponse>
        getListTagsMethod;
    if ((getListTagsMethod = IncidentServiceGrpc.getListTagsMethod) == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getListTagsMethod = IncidentServiceGrpc.getListTagsMethod) == null) {
          IncidentServiceGrpc.getListTagsMethod =
              getListTagsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.ListTagsRequest,
                          com.google.irm.service.v1alpha2.api.ListTagsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService", "ListTags"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.ListTagsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.ListTagsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new IncidentServiceMethodDescriptorSupplier("ListTags"))
                      .build();
        }
      }
    }
    return getListTagsMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateSignalMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateSignalRequest,
          com.google.irm.service.v1alpha2.api.Signal>
      METHOD_CREATE_SIGNAL = getCreateSignalMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateSignalRequest,
          com.google.irm.service.v1alpha2.api.Signal>
      getCreateSignalMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateSignalRequest,
          com.google.irm.service.v1alpha2.api.Signal>
      getCreateSignalMethod() {
    return getCreateSignalMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateSignalRequest,
          com.google.irm.service.v1alpha2.api.Signal>
      getCreateSignalMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.CreateSignalRequest,
            com.google.irm.service.v1alpha2.api.Signal>
        getCreateSignalMethod;
    if ((getCreateSignalMethod = IncidentServiceGrpc.getCreateSignalMethod) == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getCreateSignalMethod = IncidentServiceGrpc.getCreateSignalMethod) == null) {
          IncidentServiceGrpc.getCreateSignalMethod =
              getCreateSignalMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.CreateSignalRequest,
                          com.google.irm.service.v1alpha2.api.Signal>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService", "CreateSignal"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.CreateSignalRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.Signal.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier("CreateSignal"))
                      .build();
        }
      }
    }
    return getCreateSignalMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSearchSignalsMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.SearchSignalsRequest,
          com.google.irm.service.v1alpha2.api.SearchSignalsResponse>
      METHOD_SEARCH_SIGNALS = getSearchSignalsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.SearchSignalsRequest,
          com.google.irm.service.v1alpha2.api.SearchSignalsResponse>
      getSearchSignalsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.SearchSignalsRequest,
          com.google.irm.service.v1alpha2.api.SearchSignalsResponse>
      getSearchSignalsMethod() {
    return getSearchSignalsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.SearchSignalsRequest,
          com.google.irm.service.v1alpha2.api.SearchSignalsResponse>
      getSearchSignalsMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.SearchSignalsRequest,
            com.google.irm.service.v1alpha2.api.SearchSignalsResponse>
        getSearchSignalsMethod;
    if ((getSearchSignalsMethod = IncidentServiceGrpc.getSearchSignalsMethod) == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getSearchSignalsMethod = IncidentServiceGrpc.getSearchSignalsMethod) == null) {
          IncidentServiceGrpc.getSearchSignalsMethod =
              getSearchSignalsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.SearchSignalsRequest,
                          com.google.irm.service.v1alpha2.api.SearchSignalsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService", "SearchSignals"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.SearchSignalsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.SearchSignalsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier("SearchSignals"))
                      .build();
        }
      }
    }
    return getSearchSignalsMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getLookupSignalMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.LookupSignalRequest,
          com.google.irm.service.v1alpha2.api.Signal>
      METHOD_LOOKUP_SIGNAL = getLookupSignalMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.LookupSignalRequest,
          com.google.irm.service.v1alpha2.api.Signal>
      getLookupSignalMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.LookupSignalRequest,
          com.google.irm.service.v1alpha2.api.Signal>
      getLookupSignalMethod() {
    return getLookupSignalMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.LookupSignalRequest,
          com.google.irm.service.v1alpha2.api.Signal>
      getLookupSignalMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.LookupSignalRequest,
            com.google.irm.service.v1alpha2.api.Signal>
        getLookupSignalMethod;
    if ((getLookupSignalMethod = IncidentServiceGrpc.getLookupSignalMethod) == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getLookupSignalMethod = IncidentServiceGrpc.getLookupSignalMethod) == null) {
          IncidentServiceGrpc.getLookupSignalMethod =
              getLookupSignalMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.LookupSignalRequest,
                          com.google.irm.service.v1alpha2.api.Signal>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService", "LookupSignal"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.LookupSignalRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.Signal.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier("LookupSignal"))
                      .build();
        }
      }
    }
    return getLookupSignalMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetSignalMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.GetSignalRequest,
          com.google.irm.service.v1alpha2.api.Signal>
      METHOD_GET_SIGNAL = getGetSignalMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.GetSignalRequest,
          com.google.irm.service.v1alpha2.api.Signal>
      getGetSignalMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.GetSignalRequest,
          com.google.irm.service.v1alpha2.api.Signal>
      getGetSignalMethod() {
    return getGetSignalMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.GetSignalRequest,
          com.google.irm.service.v1alpha2.api.Signal>
      getGetSignalMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.GetSignalRequest,
            com.google.irm.service.v1alpha2.api.Signal>
        getGetSignalMethod;
    if ((getGetSignalMethod = IncidentServiceGrpc.getGetSignalMethod) == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getGetSignalMethod = IncidentServiceGrpc.getGetSignalMethod) == null) {
          IncidentServiceGrpc.getGetSignalMethod =
              getGetSignalMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.GetSignalRequest,
                          com.google.irm.service.v1alpha2.api.Signal>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService", "GetSignal"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.GetSignalRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.Signal.getDefaultInstance()))
                      .setSchemaDescriptor(new IncidentServiceMethodDescriptorSupplier("GetSignal"))
                      .build();
        }
      }
    }
    return getGetSignalMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateSignalMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.UpdateSignalRequest,
          com.google.irm.service.v1alpha2.api.Signal>
      METHOD_UPDATE_SIGNAL = getUpdateSignalMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.UpdateSignalRequest,
          com.google.irm.service.v1alpha2.api.Signal>
      getUpdateSignalMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.UpdateSignalRequest,
          com.google.irm.service.v1alpha2.api.Signal>
      getUpdateSignalMethod() {
    return getUpdateSignalMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.UpdateSignalRequest,
          com.google.irm.service.v1alpha2.api.Signal>
      getUpdateSignalMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.UpdateSignalRequest,
            com.google.irm.service.v1alpha2.api.Signal>
        getUpdateSignalMethod;
    if ((getUpdateSignalMethod = IncidentServiceGrpc.getUpdateSignalMethod) == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getUpdateSignalMethod = IncidentServiceGrpc.getUpdateSignalMethod) == null) {
          IncidentServiceGrpc.getUpdateSignalMethod =
              getUpdateSignalMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.UpdateSignalRequest,
                          com.google.irm.service.v1alpha2.api.Signal>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService", "UpdateSignal"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.UpdateSignalRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.Signal.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier("UpdateSignal"))
                      .build();
        }
      }
    }
    return getUpdateSignalMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getEscalateIncidentMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.EscalateIncidentRequest,
          com.google.irm.service.v1alpha2.api.EscalateIncidentResponse>
      METHOD_ESCALATE_INCIDENT = getEscalateIncidentMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.EscalateIncidentRequest,
          com.google.irm.service.v1alpha2.api.EscalateIncidentResponse>
      getEscalateIncidentMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.EscalateIncidentRequest,
          com.google.irm.service.v1alpha2.api.EscalateIncidentResponse>
      getEscalateIncidentMethod() {
    return getEscalateIncidentMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.EscalateIncidentRequest,
          com.google.irm.service.v1alpha2.api.EscalateIncidentResponse>
      getEscalateIncidentMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.EscalateIncidentRequest,
            com.google.irm.service.v1alpha2.api.EscalateIncidentResponse>
        getEscalateIncidentMethod;
    if ((getEscalateIncidentMethod = IncidentServiceGrpc.getEscalateIncidentMethod) == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getEscalateIncidentMethod = IncidentServiceGrpc.getEscalateIncidentMethod) == null) {
          IncidentServiceGrpc.getEscalateIncidentMethod =
              getEscalateIncidentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.EscalateIncidentRequest,
                          com.google.irm.service.v1alpha2.api.EscalateIncidentResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService", "EscalateIncident"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.EscalateIncidentRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.EscalateIncidentResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier("EscalateIncident"))
                      .build();
        }
      }
    }
    return getEscalateIncidentMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateArtifactMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateArtifactRequest,
          com.google.irm.service.v1alpha2.api.Artifact>
      METHOD_CREATE_ARTIFACT = getCreateArtifactMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateArtifactRequest,
          com.google.irm.service.v1alpha2.api.Artifact>
      getCreateArtifactMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateArtifactRequest,
          com.google.irm.service.v1alpha2.api.Artifact>
      getCreateArtifactMethod() {
    return getCreateArtifactMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateArtifactRequest,
          com.google.irm.service.v1alpha2.api.Artifact>
      getCreateArtifactMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.CreateArtifactRequest,
            com.google.irm.service.v1alpha2.api.Artifact>
        getCreateArtifactMethod;
    if ((getCreateArtifactMethod = IncidentServiceGrpc.getCreateArtifactMethod) == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getCreateArtifactMethod = IncidentServiceGrpc.getCreateArtifactMethod) == null) {
          IncidentServiceGrpc.getCreateArtifactMethod =
              getCreateArtifactMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.CreateArtifactRequest,
                          com.google.irm.service.v1alpha2.api.Artifact>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService", "CreateArtifact"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.CreateArtifactRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.Artifact.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier("CreateArtifact"))
                      .build();
        }
      }
    }
    return getCreateArtifactMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListArtifactsMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListArtifactsRequest,
          com.google.irm.service.v1alpha2.api.ListArtifactsResponse>
      METHOD_LIST_ARTIFACTS = getListArtifactsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListArtifactsRequest,
          com.google.irm.service.v1alpha2.api.ListArtifactsResponse>
      getListArtifactsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListArtifactsRequest,
          com.google.irm.service.v1alpha2.api.ListArtifactsResponse>
      getListArtifactsMethod() {
    return getListArtifactsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListArtifactsRequest,
          com.google.irm.service.v1alpha2.api.ListArtifactsResponse>
      getListArtifactsMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.ListArtifactsRequest,
            com.google.irm.service.v1alpha2.api.ListArtifactsResponse>
        getListArtifactsMethod;
    if ((getListArtifactsMethod = IncidentServiceGrpc.getListArtifactsMethod) == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getListArtifactsMethod = IncidentServiceGrpc.getListArtifactsMethod) == null) {
          IncidentServiceGrpc.getListArtifactsMethod =
              getListArtifactsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.ListArtifactsRequest,
                          com.google.irm.service.v1alpha2.api.ListArtifactsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService", "ListArtifacts"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.ListArtifactsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.ListArtifactsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier("ListArtifacts"))
                      .build();
        }
      }
    }
    return getListArtifactsMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateArtifactMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.UpdateArtifactRequest,
          com.google.irm.service.v1alpha2.api.Artifact>
      METHOD_UPDATE_ARTIFACT = getUpdateArtifactMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.UpdateArtifactRequest,
          com.google.irm.service.v1alpha2.api.Artifact>
      getUpdateArtifactMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.UpdateArtifactRequest,
          com.google.irm.service.v1alpha2.api.Artifact>
      getUpdateArtifactMethod() {
    return getUpdateArtifactMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.UpdateArtifactRequest,
          com.google.irm.service.v1alpha2.api.Artifact>
      getUpdateArtifactMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.UpdateArtifactRequest,
            com.google.irm.service.v1alpha2.api.Artifact>
        getUpdateArtifactMethod;
    if ((getUpdateArtifactMethod = IncidentServiceGrpc.getUpdateArtifactMethod) == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getUpdateArtifactMethod = IncidentServiceGrpc.getUpdateArtifactMethod) == null) {
          IncidentServiceGrpc.getUpdateArtifactMethod =
              getUpdateArtifactMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.UpdateArtifactRequest,
                          com.google.irm.service.v1alpha2.api.Artifact>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService", "UpdateArtifact"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.UpdateArtifactRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.Artifact.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier("UpdateArtifact"))
                      .build();
        }
      }
    }
    return getUpdateArtifactMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteArtifactMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.DeleteArtifactRequest, com.google.protobuf.Empty>
      METHOD_DELETE_ARTIFACT = getDeleteArtifactMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.DeleteArtifactRequest, com.google.protobuf.Empty>
      getDeleteArtifactMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.DeleteArtifactRequest, com.google.protobuf.Empty>
      getDeleteArtifactMethod() {
    return getDeleteArtifactMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.DeleteArtifactRequest, com.google.protobuf.Empty>
      getDeleteArtifactMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.DeleteArtifactRequest, com.google.protobuf.Empty>
        getDeleteArtifactMethod;
    if ((getDeleteArtifactMethod = IncidentServiceGrpc.getDeleteArtifactMethod) == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getDeleteArtifactMethod = IncidentServiceGrpc.getDeleteArtifactMethod) == null) {
          IncidentServiceGrpc.getDeleteArtifactMethod =
              getDeleteArtifactMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.DeleteArtifactRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService", "DeleteArtifact"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.DeleteArtifactRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier("DeleteArtifact"))
                      .build();
        }
      }
    }
    return getDeleteArtifactMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSendShiftHandoffMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.SendShiftHandoffRequest,
          com.google.irm.service.v1alpha2.api.SendShiftHandoffResponse>
      METHOD_SEND_SHIFT_HANDOFF = getSendShiftHandoffMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.SendShiftHandoffRequest,
          com.google.irm.service.v1alpha2.api.SendShiftHandoffResponse>
      getSendShiftHandoffMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.SendShiftHandoffRequest,
          com.google.irm.service.v1alpha2.api.SendShiftHandoffResponse>
      getSendShiftHandoffMethod() {
    return getSendShiftHandoffMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.SendShiftHandoffRequest,
          com.google.irm.service.v1alpha2.api.SendShiftHandoffResponse>
      getSendShiftHandoffMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.SendShiftHandoffRequest,
            com.google.irm.service.v1alpha2.api.SendShiftHandoffResponse>
        getSendShiftHandoffMethod;
    if ((getSendShiftHandoffMethod = IncidentServiceGrpc.getSendShiftHandoffMethod) == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getSendShiftHandoffMethod = IncidentServiceGrpc.getSendShiftHandoffMethod) == null) {
          IncidentServiceGrpc.getSendShiftHandoffMethod =
              getSendShiftHandoffMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.SendShiftHandoffRequest,
                          com.google.irm.service.v1alpha2.api.SendShiftHandoffResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService", "SendShiftHandoff"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.SendShiftHandoffRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.SendShiftHandoffResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier("SendShiftHandoff"))
                      .build();
        }
      }
    }
    return getSendShiftHandoffMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateSubscriptionMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateSubscriptionRequest,
          com.google.irm.service.v1alpha2.api.Subscription>
      METHOD_CREATE_SUBSCRIPTION = getCreateSubscriptionMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateSubscriptionRequest,
          com.google.irm.service.v1alpha2.api.Subscription>
      getCreateSubscriptionMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateSubscriptionRequest,
          com.google.irm.service.v1alpha2.api.Subscription>
      getCreateSubscriptionMethod() {
    return getCreateSubscriptionMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateSubscriptionRequest,
          com.google.irm.service.v1alpha2.api.Subscription>
      getCreateSubscriptionMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.CreateSubscriptionRequest,
            com.google.irm.service.v1alpha2.api.Subscription>
        getCreateSubscriptionMethod;
    if ((getCreateSubscriptionMethod = IncidentServiceGrpc.getCreateSubscriptionMethod) == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getCreateSubscriptionMethod = IncidentServiceGrpc.getCreateSubscriptionMethod)
            == null) {
          IncidentServiceGrpc.getCreateSubscriptionMethod =
              getCreateSubscriptionMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.CreateSubscriptionRequest,
                          com.google.irm.service.v1alpha2.api.Subscription>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService", "CreateSubscription"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.CreateSubscriptionRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.Subscription
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier("CreateSubscription"))
                      .build();
        }
      }
    }
    return getCreateSubscriptionMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateSubscriptionMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.UpdateSubscriptionRequest,
          com.google.irm.service.v1alpha2.api.Subscription>
      METHOD_UPDATE_SUBSCRIPTION = getUpdateSubscriptionMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.UpdateSubscriptionRequest,
          com.google.irm.service.v1alpha2.api.Subscription>
      getUpdateSubscriptionMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.UpdateSubscriptionRequest,
          com.google.irm.service.v1alpha2.api.Subscription>
      getUpdateSubscriptionMethod() {
    return getUpdateSubscriptionMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.UpdateSubscriptionRequest,
          com.google.irm.service.v1alpha2.api.Subscription>
      getUpdateSubscriptionMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.UpdateSubscriptionRequest,
            com.google.irm.service.v1alpha2.api.Subscription>
        getUpdateSubscriptionMethod;
    if ((getUpdateSubscriptionMethod = IncidentServiceGrpc.getUpdateSubscriptionMethod) == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getUpdateSubscriptionMethod = IncidentServiceGrpc.getUpdateSubscriptionMethod)
            == null) {
          IncidentServiceGrpc.getUpdateSubscriptionMethod =
              getUpdateSubscriptionMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.UpdateSubscriptionRequest,
                          com.google.irm.service.v1alpha2.api.Subscription>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService", "UpdateSubscription"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.UpdateSubscriptionRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.Subscription
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier("UpdateSubscription"))
                      .build();
        }
      }
    }
    return getUpdateSubscriptionMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListSubscriptionsMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListSubscriptionsRequest,
          com.google.irm.service.v1alpha2.api.ListSubscriptionsResponse>
      METHOD_LIST_SUBSCRIPTIONS = getListSubscriptionsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListSubscriptionsRequest,
          com.google.irm.service.v1alpha2.api.ListSubscriptionsResponse>
      getListSubscriptionsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListSubscriptionsRequest,
          com.google.irm.service.v1alpha2.api.ListSubscriptionsResponse>
      getListSubscriptionsMethod() {
    return getListSubscriptionsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListSubscriptionsRequest,
          com.google.irm.service.v1alpha2.api.ListSubscriptionsResponse>
      getListSubscriptionsMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.ListSubscriptionsRequest,
            com.google.irm.service.v1alpha2.api.ListSubscriptionsResponse>
        getListSubscriptionsMethod;
    if ((getListSubscriptionsMethod = IncidentServiceGrpc.getListSubscriptionsMethod) == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getListSubscriptionsMethod = IncidentServiceGrpc.getListSubscriptionsMethod) == null) {
          IncidentServiceGrpc.getListSubscriptionsMethod =
              getListSubscriptionsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.ListSubscriptionsRequest,
                          com.google.irm.service.v1alpha2.api.ListSubscriptionsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService", "ListSubscriptions"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.ListSubscriptionsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.ListSubscriptionsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier("ListSubscriptions"))
                      .build();
        }
      }
    }
    return getListSubscriptionsMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteSubscriptionMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.DeleteSubscriptionRequest, com.google.protobuf.Empty>
      METHOD_DELETE_SUBSCRIPTION = getDeleteSubscriptionMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.DeleteSubscriptionRequest, com.google.protobuf.Empty>
      getDeleteSubscriptionMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.DeleteSubscriptionRequest, com.google.protobuf.Empty>
      getDeleteSubscriptionMethod() {
    return getDeleteSubscriptionMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.DeleteSubscriptionRequest, com.google.protobuf.Empty>
      getDeleteSubscriptionMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.DeleteSubscriptionRequest,
            com.google.protobuf.Empty>
        getDeleteSubscriptionMethod;
    if ((getDeleteSubscriptionMethod = IncidentServiceGrpc.getDeleteSubscriptionMethod) == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getDeleteSubscriptionMethod = IncidentServiceGrpc.getDeleteSubscriptionMethod)
            == null) {
          IncidentServiceGrpc.getDeleteSubscriptionMethod =
              getDeleteSubscriptionMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.DeleteSubscriptionRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService", "DeleteSubscription"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.DeleteSubscriptionRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier("DeleteSubscription"))
                      .build();
        }
      }
    }
    return getDeleteSubscriptionMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateIncidentRoleAssignmentMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      METHOD_CREATE_INCIDENT_ROLE_ASSIGNMENT = getCreateIncidentRoleAssignmentMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      getCreateIncidentRoleAssignmentMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      getCreateIncidentRoleAssignmentMethod() {
    return getCreateIncidentRoleAssignmentMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      getCreateIncidentRoleAssignmentMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest,
            com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
        getCreateIncidentRoleAssignmentMethod;
    if ((getCreateIncidentRoleAssignmentMethod =
            IncidentServiceGrpc.getCreateIncidentRoleAssignmentMethod)
        == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getCreateIncidentRoleAssignmentMethod =
                IncidentServiceGrpc.getCreateIncidentRoleAssignmentMethod)
            == null) {
          IncidentServiceGrpc.getCreateIncidentRoleAssignmentMethod =
              getCreateIncidentRoleAssignmentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest,
                          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService",
                              "CreateIncidentRoleAssignment"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api
                                  .CreateIncidentRoleAssignmentRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.IncidentRoleAssignment
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier(
                              "CreateIncidentRoleAssignment"))
                      .build();
        }
      }
    }
    return getCreateIncidentRoleAssignmentMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteIncidentRoleAssignmentMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.DeleteIncidentRoleAssignmentRequest,
          com.google.protobuf.Empty>
      METHOD_DELETE_INCIDENT_ROLE_ASSIGNMENT = getDeleteIncidentRoleAssignmentMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.DeleteIncidentRoleAssignmentRequest,
          com.google.protobuf.Empty>
      getDeleteIncidentRoleAssignmentMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.DeleteIncidentRoleAssignmentRequest,
          com.google.protobuf.Empty>
      getDeleteIncidentRoleAssignmentMethod() {
    return getDeleteIncidentRoleAssignmentMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.DeleteIncidentRoleAssignmentRequest,
          com.google.protobuf.Empty>
      getDeleteIncidentRoleAssignmentMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.DeleteIncidentRoleAssignmentRequest,
            com.google.protobuf.Empty>
        getDeleteIncidentRoleAssignmentMethod;
    if ((getDeleteIncidentRoleAssignmentMethod =
            IncidentServiceGrpc.getDeleteIncidentRoleAssignmentMethod)
        == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getDeleteIncidentRoleAssignmentMethod =
                IncidentServiceGrpc.getDeleteIncidentRoleAssignmentMethod)
            == null) {
          IncidentServiceGrpc.getDeleteIncidentRoleAssignmentMethod =
              getDeleteIncidentRoleAssignmentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.DeleteIncidentRoleAssignmentRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService",
                              "DeleteIncidentRoleAssignment"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api
                                  .DeleteIncidentRoleAssignmentRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier(
                              "DeleteIncidentRoleAssignment"))
                      .build();
        }
      }
    }
    return getDeleteIncidentRoleAssignmentMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListIncidentRoleAssignmentsMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsRequest,
          com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsResponse>
      METHOD_LIST_INCIDENT_ROLE_ASSIGNMENTS = getListIncidentRoleAssignmentsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsRequest,
          com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsResponse>
      getListIncidentRoleAssignmentsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsRequest,
          com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsResponse>
      getListIncidentRoleAssignmentsMethod() {
    return getListIncidentRoleAssignmentsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsRequest,
          com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsResponse>
      getListIncidentRoleAssignmentsMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsRequest,
            com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsResponse>
        getListIncidentRoleAssignmentsMethod;
    if ((getListIncidentRoleAssignmentsMethod =
            IncidentServiceGrpc.getListIncidentRoleAssignmentsMethod)
        == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getListIncidentRoleAssignmentsMethod =
                IncidentServiceGrpc.getListIncidentRoleAssignmentsMethod)
            == null) {
          IncidentServiceGrpc.getListIncidentRoleAssignmentsMethod =
              getListIncidentRoleAssignmentsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsRequest,
                          com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService",
                              "ListIncidentRoleAssignments"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api
                                  .ListIncidentRoleAssignmentsResponse.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier(
                              "ListIncidentRoleAssignments"))
                      .build();
        }
      }
    }
    return getListIncidentRoleAssignmentsMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRequestIncidentRoleHandoverMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.RequestIncidentRoleHandoverRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      METHOD_REQUEST_INCIDENT_ROLE_HANDOVER = getRequestIncidentRoleHandoverMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.RequestIncidentRoleHandoverRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      getRequestIncidentRoleHandoverMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.RequestIncidentRoleHandoverRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      getRequestIncidentRoleHandoverMethod() {
    return getRequestIncidentRoleHandoverMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.RequestIncidentRoleHandoverRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      getRequestIncidentRoleHandoverMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.RequestIncidentRoleHandoverRequest,
            com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
        getRequestIncidentRoleHandoverMethod;
    if ((getRequestIncidentRoleHandoverMethod =
            IncidentServiceGrpc.getRequestIncidentRoleHandoverMethod)
        == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getRequestIncidentRoleHandoverMethod =
                IncidentServiceGrpc.getRequestIncidentRoleHandoverMethod)
            == null) {
          IncidentServiceGrpc.getRequestIncidentRoleHandoverMethod =
              getRequestIncidentRoleHandoverMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.RequestIncidentRoleHandoverRequest,
                          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService",
                              "RequestIncidentRoleHandover"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.RequestIncidentRoleHandoverRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.IncidentRoleAssignment
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier(
                              "RequestIncidentRoleHandover"))
                      .build();
        }
      }
    }
    return getRequestIncidentRoleHandoverMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getConfirmIncidentRoleHandoverMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ConfirmIncidentRoleHandoverRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      METHOD_CONFIRM_INCIDENT_ROLE_HANDOVER = getConfirmIncidentRoleHandoverMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ConfirmIncidentRoleHandoverRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      getConfirmIncidentRoleHandoverMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ConfirmIncidentRoleHandoverRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      getConfirmIncidentRoleHandoverMethod() {
    return getConfirmIncidentRoleHandoverMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ConfirmIncidentRoleHandoverRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      getConfirmIncidentRoleHandoverMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.ConfirmIncidentRoleHandoverRequest,
            com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
        getConfirmIncidentRoleHandoverMethod;
    if ((getConfirmIncidentRoleHandoverMethod =
            IncidentServiceGrpc.getConfirmIncidentRoleHandoverMethod)
        == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getConfirmIncidentRoleHandoverMethod =
                IncidentServiceGrpc.getConfirmIncidentRoleHandoverMethod)
            == null) {
          IncidentServiceGrpc.getConfirmIncidentRoleHandoverMethod =
              getConfirmIncidentRoleHandoverMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.ConfirmIncidentRoleHandoverRequest,
                          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService",
                              "ConfirmIncidentRoleHandover"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.ConfirmIncidentRoleHandoverRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.IncidentRoleAssignment
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier(
                              "ConfirmIncidentRoleHandover"))
                      .build();
        }
      }
    }
    return getConfirmIncidentRoleHandoverMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getForceIncidentRoleHandoverMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      METHOD_FORCE_INCIDENT_ROLE_HANDOVER = getForceIncidentRoleHandoverMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      getForceIncidentRoleHandoverMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      getForceIncidentRoleHandoverMethod() {
    return getForceIncidentRoleHandoverMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      getForceIncidentRoleHandoverMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest,
            com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
        getForceIncidentRoleHandoverMethod;
    if ((getForceIncidentRoleHandoverMethod =
            IncidentServiceGrpc.getForceIncidentRoleHandoverMethod)
        == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getForceIncidentRoleHandoverMethod =
                IncidentServiceGrpc.getForceIncidentRoleHandoverMethod)
            == null) {
          IncidentServiceGrpc.getForceIncidentRoleHandoverMethod =
              getForceIncidentRoleHandoverMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest,
                          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService",
                              "ForceIncidentRoleHandover"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.IncidentRoleAssignment
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier("ForceIncidentRoleHandover"))
                      .build();
        }
      }
    }
    return getForceIncidentRoleHandoverMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCancelIncidentRoleHandoverMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CancelIncidentRoleHandoverRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      METHOD_CANCEL_INCIDENT_ROLE_HANDOVER = getCancelIncidentRoleHandoverMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CancelIncidentRoleHandoverRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      getCancelIncidentRoleHandoverMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CancelIncidentRoleHandoverRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      getCancelIncidentRoleHandoverMethod() {
    return getCancelIncidentRoleHandoverMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CancelIncidentRoleHandoverRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      getCancelIncidentRoleHandoverMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.irm.service.v1alpha2.api.CancelIncidentRoleHandoverRequest,
            com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
        getCancelIncidentRoleHandoverMethod;
    if ((getCancelIncidentRoleHandoverMethod =
            IncidentServiceGrpc.getCancelIncidentRoleHandoverMethod)
        == null) {
      synchronized (IncidentServiceGrpc.class) {
        if ((getCancelIncidentRoleHandoverMethod =
                IncidentServiceGrpc.getCancelIncidentRoleHandoverMethod)
            == null) {
          IncidentServiceGrpc.getCancelIncidentRoleHandoverMethod =
              getCancelIncidentRoleHandoverMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.irm.service.v1alpha2.api.CancelIncidentRoleHandoverRequest,
                          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.irm.v1alpha2.IncidentService",
                              "CancelIncidentRoleHandover"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.CancelIncidentRoleHandoverRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.irm.service.v1alpha2.api.IncidentRoleAssignment
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new IncidentServiceMethodDescriptorSupplier("CancelIncidentRoleHandover"))
                      .build();
        }
      }
    }
    return getCancelIncidentRoleHandoverMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static IncidentServiceStub newStub(io.grpc.Channel channel) {
    return new IncidentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IncidentServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    return new IncidentServiceBlockingStub(channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static IncidentServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    return new IncidentServiceFutureStub(channel);
  }

  /**
   *
   *
   * <pre>
   * The Incident API for Incident Response &amp; Management.
   * </pre>
   */
  public abstract static class IncidentServiceImplBase implements io.grpc.BindableService {

    /**
     *
     *
     * <pre>
     * Creates a new incident.
     * </pre>
     */
    public void createIncident(
        com.google.irm.service.v1alpha2.api.CreateIncidentRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Incident>
            responseObserver) {
      asyncUnimplementedUnaryCall(getCreateIncidentMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns an incident by name.
     * </pre>
     */
    public void getIncident(
        com.google.irm.service.v1alpha2.api.GetIncidentRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Incident>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetIncidentMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns a list of incidents.
     * Incidents are ordered by start time, with the most recent incidents first.
     * </pre>
     */
    public void searchIncidents(
        com.google.irm.service.v1alpha2.api.SearchIncidentsRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.SearchIncidentsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getSearchIncidentsMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates an existing incident.
     * </pre>
     */
    public void updateIncident(
        com.google.irm.service.v1alpha2.api.UpdateIncidentRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Incident>
            responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateIncidentMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns a list of incidents that are "similar" to the specified incident
     * or signal. This functionality is provided on a best-effort basis and the
     * definition of "similar" is subject to change.
     * </pre>
     */
    public void searchSimilarIncidents(
        com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getSearchSimilarIncidentsMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates an annotation on an existing incident. Only 'text/plain' and
     * 'text/markdown' annotations can be created via this method.
     * </pre>
     */
    public void createAnnotation(
        com.google.irm.service.v1alpha2.api.CreateAnnotationRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Annotation>
            responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAnnotationMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists annotations that are part of an incident. No assumptions should be
     * made on the content-type of the annotation returned.
     * </pre>
     */
    public void listAnnotations(
        com.google.irm.service.v1alpha2.api.ListAnnotationsRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.ListAnnotationsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListAnnotationsMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a tag on an existing incident.
     * </pre>
     */
    public void createTag(
        com.google.irm.service.v1alpha2.api.CreateTagRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Tag> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTagMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes an existing tag.
     * </pre>
     */
    public void deleteTag(
        com.google.irm.service.v1alpha2.api.DeleteTagRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteTagMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists tags that are part of an incident.
     * </pre>
     */
    public void listTags(
        com.google.irm.service.v1alpha2.api.ListTagsRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.ListTagsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListTagsMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new signal.
     * </pre>
     */
    public void createSignal(
        com.google.irm.service.v1alpha2.api.CreateSignalRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Signal> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSignalMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists signals that are part of an incident.
     * Signals are returned in reverse chronological order.
     * </pre>
     */
    public void searchSignals(
        com.google.irm.service.v1alpha2.api.SearchSignalsRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.SearchSignalsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getSearchSignalsMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Finds a signal by other unique IDs.
     * </pre>
     */
    public void lookupSignal(
        com.google.irm.service.v1alpha2.api.LookupSignalRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Signal> responseObserver) {
      asyncUnimplementedUnaryCall(getLookupSignalMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns a signal by name.
     * </pre>
     */
    public void getSignal(
        com.google.irm.service.v1alpha2.api.GetSignalRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Signal> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSignalMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates an existing signal (for example, to assign/unassign it to an
     * incident).
     * </pre>
     */
    public void updateSignal(
        com.google.irm.service.v1alpha2.api.UpdateSignalRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Signal> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSignalMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Escalates an incident.
     * </pre>
     */
    public void escalateIncident(
        com.google.irm.service.v1alpha2.api.EscalateIncidentRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.EscalateIncidentResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getEscalateIncidentMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new artifact.
     * </pre>
     */
    public void createArtifact(
        com.google.irm.service.v1alpha2.api.CreateArtifactRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Artifact>
            responseObserver) {
      asyncUnimplementedUnaryCall(getCreateArtifactMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns a list of artifacts for an incident.
     * </pre>
     */
    public void listArtifacts(
        com.google.irm.service.v1alpha2.api.ListArtifactsRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.ListArtifactsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListArtifactsMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates an existing artifact.
     * </pre>
     */
    public void updateArtifact(
        com.google.irm.service.v1alpha2.api.UpdateArtifactRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Artifact>
            responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateArtifactMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes an existing artifact.
     * </pre>
     */
    public void deleteArtifact(
        com.google.irm.service.v1alpha2.api.DeleteArtifactRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteArtifactMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Sends a summary of the shift for oncall handoff.
     * </pre>
     */
    public void sendShiftHandoff(
        com.google.irm.service.v1alpha2.api.SendShiftHandoffRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.SendShiftHandoffResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getSendShiftHandoffMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new subscription.
     * This will fail if:
     *    a. there are too many (50) subscriptions in the incident already
     *    b. a subscription using the given channel already exists
     * </pre>
     */
    public void createSubscription(
        com.google.irm.service.v1alpha2.api.CreateSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Subscription>
            responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSubscriptionMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a subscription.
     * </pre>
     */
    public void updateSubscription(
        com.google.irm.service.v1alpha2.api.UpdateSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Subscription>
            responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSubscriptionMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns a list of subscriptions for an incident.
     * </pre>
     */
    public void listSubscriptions(
        com.google.irm.service.v1alpha2.api.ListSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.ListSubscriptionsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListSubscriptionsMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes an existing subscription.
     * </pre>
     */
    public void deleteSubscription(
        com.google.irm.service.v1alpha2.api.DeleteSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteSubscriptionMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a role assignment on an existing incident. Normally, the user field
     * will be set when assigning a role to oneself, and the next field will be
     * set when proposing another user as the assignee. Setting the next field
     * directly to a user other than oneself is equivalent to proposing and
     * force-assigning the role to the user.
     * </pre>
     */
    public void createIncidentRoleAssignment(
        com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
            responseObserver) {
      asyncUnimplementedUnaryCall(getCreateIncidentRoleAssignmentMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes an existing role assignment.
     * </pre>
     */
    public void deleteIncidentRoleAssignment(
        com.google.irm.service.v1alpha2.api.DeleteIncidentRoleAssignmentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteIncidentRoleAssignmentMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists role assignments that are part of an incident.
     * </pre>
     */
    public void listIncidentRoleAssignments(
        com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListIncidentRoleAssignmentsMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Starts a role handover. The proposed assignee will receive an email
     * notifying them of the assignment. This will fail if a role handover is
     * already pending.
     * </pre>
     */
    public void requestIncidentRoleHandover(
        com.google.irm.service.v1alpha2.api.RequestIncidentRoleHandoverRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
            responseObserver) {
      asyncUnimplementedUnaryCall(getRequestIncidentRoleHandoverMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Confirms a role handover. This will fail if the 'proposed_assignee' field
     * of the IncidentRoleAssignment is not equal to the 'new_assignee' field of
     * the request. If the caller is not the new_assignee,
     * ForceIncidentRoleHandover should be used instead.
     * </pre>
     */
    public void confirmIncidentRoleHandover(
        com.google.irm.service.v1alpha2.api.ConfirmIncidentRoleHandoverRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
            responseObserver) {
      asyncUnimplementedUnaryCall(getConfirmIncidentRoleHandoverMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Forces a role handover. This will fail if the 'proposed_assignee' field of
     * the IncidentRoleAssignment is not equal to the 'new_assignee' field of the
     * request. If the caller is the new_assignee, ConfirmIncidentRoleHandover
     * should be used instead.
     * </pre>
     */
    public void forceIncidentRoleHandover(
        com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
            responseObserver) {
      asyncUnimplementedUnaryCall(getForceIncidentRoleHandoverMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Cancels a role handover. This will fail if the 'proposed_assignee' field of
     * the IncidentRoleAssignment is not equal to the 'new_assignee' field of the
     * request.
     * </pre>
     */
    public void cancelIncidentRoleHandover(
        com.google.irm.service.v1alpha2.api.CancelIncidentRoleHandoverRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
            responseObserver) {
      asyncUnimplementedUnaryCall(getCancelIncidentRoleHandoverMethodHelper(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getCreateIncidentMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.CreateIncidentRequest,
                      com.google.irm.service.v1alpha2.api.Incident>(
                      this, METHODID_CREATE_INCIDENT)))
          .addMethod(
              getGetIncidentMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.GetIncidentRequest,
                      com.google.irm.service.v1alpha2.api.Incident>(this, METHODID_GET_INCIDENT)))
          .addMethod(
              getSearchIncidentsMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.SearchIncidentsRequest,
                      com.google.irm.service.v1alpha2.api.SearchIncidentsResponse>(
                      this, METHODID_SEARCH_INCIDENTS)))
          .addMethod(
              getUpdateIncidentMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.UpdateIncidentRequest,
                      com.google.irm.service.v1alpha2.api.Incident>(
                      this, METHODID_UPDATE_INCIDENT)))
          .addMethod(
              getSearchSimilarIncidentsMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsRequest,
                      com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsResponse>(
                      this, METHODID_SEARCH_SIMILAR_INCIDENTS)))
          .addMethod(
              getCreateAnnotationMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.CreateAnnotationRequest,
                      com.google.irm.service.v1alpha2.api.Annotation>(
                      this, METHODID_CREATE_ANNOTATION)))
          .addMethod(
              getListAnnotationsMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.ListAnnotationsRequest,
                      com.google.irm.service.v1alpha2.api.ListAnnotationsResponse>(
                      this, METHODID_LIST_ANNOTATIONS)))
          .addMethod(
              getCreateTagMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.CreateTagRequest,
                      com.google.irm.service.v1alpha2.api.Tag>(this, METHODID_CREATE_TAG)))
          .addMethod(
              getDeleteTagMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.DeleteTagRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_TAG)))
          .addMethod(
              getListTagsMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.ListTagsRequest,
                      com.google.irm.service.v1alpha2.api.ListTagsResponse>(
                      this, METHODID_LIST_TAGS)))
          .addMethod(
              getCreateSignalMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.CreateSignalRequest,
                      com.google.irm.service.v1alpha2.api.Signal>(this, METHODID_CREATE_SIGNAL)))
          .addMethod(
              getSearchSignalsMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.SearchSignalsRequest,
                      com.google.irm.service.v1alpha2.api.SearchSignalsResponse>(
                      this, METHODID_SEARCH_SIGNALS)))
          .addMethod(
              getLookupSignalMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.LookupSignalRequest,
                      com.google.irm.service.v1alpha2.api.Signal>(this, METHODID_LOOKUP_SIGNAL)))
          .addMethod(
              getGetSignalMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.GetSignalRequest,
                      com.google.irm.service.v1alpha2.api.Signal>(this, METHODID_GET_SIGNAL)))
          .addMethod(
              getUpdateSignalMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.UpdateSignalRequest,
                      com.google.irm.service.v1alpha2.api.Signal>(this, METHODID_UPDATE_SIGNAL)))
          .addMethod(
              getEscalateIncidentMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.EscalateIncidentRequest,
                      com.google.irm.service.v1alpha2.api.EscalateIncidentResponse>(
                      this, METHODID_ESCALATE_INCIDENT)))
          .addMethod(
              getCreateArtifactMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.CreateArtifactRequest,
                      com.google.irm.service.v1alpha2.api.Artifact>(
                      this, METHODID_CREATE_ARTIFACT)))
          .addMethod(
              getListArtifactsMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.ListArtifactsRequest,
                      com.google.irm.service.v1alpha2.api.ListArtifactsResponse>(
                      this, METHODID_LIST_ARTIFACTS)))
          .addMethod(
              getUpdateArtifactMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.UpdateArtifactRequest,
                      com.google.irm.service.v1alpha2.api.Artifact>(
                      this, METHODID_UPDATE_ARTIFACT)))
          .addMethod(
              getDeleteArtifactMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.DeleteArtifactRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_ARTIFACT)))
          .addMethod(
              getSendShiftHandoffMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.SendShiftHandoffRequest,
                      com.google.irm.service.v1alpha2.api.SendShiftHandoffResponse>(
                      this, METHODID_SEND_SHIFT_HANDOFF)))
          .addMethod(
              getCreateSubscriptionMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.CreateSubscriptionRequest,
                      com.google.irm.service.v1alpha2.api.Subscription>(
                      this, METHODID_CREATE_SUBSCRIPTION)))
          .addMethod(
              getUpdateSubscriptionMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.UpdateSubscriptionRequest,
                      com.google.irm.service.v1alpha2.api.Subscription>(
                      this, METHODID_UPDATE_SUBSCRIPTION)))
          .addMethod(
              getListSubscriptionsMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.ListSubscriptionsRequest,
                      com.google.irm.service.v1alpha2.api.ListSubscriptionsResponse>(
                      this, METHODID_LIST_SUBSCRIPTIONS)))
          .addMethod(
              getDeleteSubscriptionMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.DeleteSubscriptionRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_SUBSCRIPTION)))
          .addMethod(
              getCreateIncidentRoleAssignmentMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest,
                      com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>(
                      this, METHODID_CREATE_INCIDENT_ROLE_ASSIGNMENT)))
          .addMethod(
              getDeleteIncidentRoleAssignmentMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.DeleteIncidentRoleAssignmentRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_INCIDENT_ROLE_ASSIGNMENT)))
          .addMethod(
              getListIncidentRoleAssignmentsMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsRequest,
                      com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsResponse>(
                      this, METHODID_LIST_INCIDENT_ROLE_ASSIGNMENTS)))
          .addMethod(
              getRequestIncidentRoleHandoverMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.RequestIncidentRoleHandoverRequest,
                      com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>(
                      this, METHODID_REQUEST_INCIDENT_ROLE_HANDOVER)))
          .addMethod(
              getConfirmIncidentRoleHandoverMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.ConfirmIncidentRoleHandoverRequest,
                      com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>(
                      this, METHODID_CONFIRM_INCIDENT_ROLE_HANDOVER)))
          .addMethod(
              getForceIncidentRoleHandoverMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest,
                      com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>(
                      this, METHODID_FORCE_INCIDENT_ROLE_HANDOVER)))
          .addMethod(
              getCancelIncidentRoleHandoverMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.CancelIncidentRoleHandoverRequest,
                      com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>(
                      this, METHODID_CANCEL_INCIDENT_ROLE_HANDOVER)))
          .build();
    }
  }

  /**
   *
   *
   * <pre>
   * The Incident API for Incident Response &amp; Management.
   * </pre>
   */
  public static final class IncidentServiceStub
      extends io.grpc.stub.AbstractStub<IncidentServiceStub> {
    private IncidentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IncidentServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IncidentServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IncidentServiceStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Creates a new incident.
     * </pre>
     */
    public void createIncident(
        com.google.irm.service.v1alpha2.api.CreateIncidentRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Incident>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateIncidentMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns an incident by name.
     * </pre>
     */
    public void getIncident(
        com.google.irm.service.v1alpha2.api.GetIncidentRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Incident>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetIncidentMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns a list of incidents.
     * Incidents are ordered by start time, with the most recent incidents first.
     * </pre>
     */
    public void searchIncidents(
        com.google.irm.service.v1alpha2.api.SearchIncidentsRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.SearchIncidentsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchIncidentsMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates an existing incident.
     * </pre>
     */
    public void updateIncident(
        com.google.irm.service.v1alpha2.api.UpdateIncidentRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Incident>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateIncidentMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns a list of incidents that are "similar" to the specified incident
     * or signal. This functionality is provided on a best-effort basis and the
     * definition of "similar" is subject to change.
     * </pre>
     */
    public void searchSimilarIncidents(
        com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchSimilarIncidentsMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates an annotation on an existing incident. Only 'text/plain' and
     * 'text/markdown' annotations can be created via this method.
     * </pre>
     */
    public void createAnnotation(
        com.google.irm.service.v1alpha2.api.CreateAnnotationRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Annotation>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAnnotationMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists annotations that are part of an incident. No assumptions should be
     * made on the content-type of the annotation returned.
     * </pre>
     */
    public void listAnnotations(
        com.google.irm.service.v1alpha2.api.ListAnnotationsRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.ListAnnotationsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAnnotationsMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a tag on an existing incident.
     * </pre>
     */
    public void createTag(
        com.google.irm.service.v1alpha2.api.CreateTagRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Tag> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTagMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes an existing tag.
     * </pre>
     */
    public void deleteTag(
        com.google.irm.service.v1alpha2.api.DeleteTagRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteTagMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists tags that are part of an incident.
     * </pre>
     */
    public void listTags(
        com.google.irm.service.v1alpha2.api.ListTagsRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.ListTagsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListTagsMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new signal.
     * </pre>
     */
    public void createSignal(
        com.google.irm.service.v1alpha2.api.CreateSignalRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Signal> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSignalMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists signals that are part of an incident.
     * Signals are returned in reverse chronological order.
     * </pre>
     */
    public void searchSignals(
        com.google.irm.service.v1alpha2.api.SearchSignalsRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.SearchSignalsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchSignalsMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Finds a signal by other unique IDs.
     * </pre>
     */
    public void lookupSignal(
        com.google.irm.service.v1alpha2.api.LookupSignalRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Signal> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLookupSignalMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns a signal by name.
     * </pre>
     */
    public void getSignal(
        com.google.irm.service.v1alpha2.api.GetSignalRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Signal> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSignalMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates an existing signal (for example, to assign/unassign it to an
     * incident).
     * </pre>
     */
    public void updateSignal(
        com.google.irm.service.v1alpha2.api.UpdateSignalRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Signal> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSignalMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Escalates an incident.
     * </pre>
     */
    public void escalateIncident(
        com.google.irm.service.v1alpha2.api.EscalateIncidentRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.EscalateIncidentResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEscalateIncidentMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new artifact.
     * </pre>
     */
    public void createArtifact(
        com.google.irm.service.v1alpha2.api.CreateArtifactRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Artifact>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateArtifactMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns a list of artifacts for an incident.
     * </pre>
     */
    public void listArtifacts(
        com.google.irm.service.v1alpha2.api.ListArtifactsRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.ListArtifactsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListArtifactsMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates an existing artifact.
     * </pre>
     */
    public void updateArtifact(
        com.google.irm.service.v1alpha2.api.UpdateArtifactRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Artifact>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateArtifactMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes an existing artifact.
     * </pre>
     */
    public void deleteArtifact(
        com.google.irm.service.v1alpha2.api.DeleteArtifactRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteArtifactMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Sends a summary of the shift for oncall handoff.
     * </pre>
     */
    public void sendShiftHandoff(
        com.google.irm.service.v1alpha2.api.SendShiftHandoffRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.SendShiftHandoffResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendShiftHandoffMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new subscription.
     * This will fail if:
     *    a. there are too many (50) subscriptions in the incident already
     *    b. a subscription using the given channel already exists
     * </pre>
     */
    public void createSubscription(
        com.google.irm.service.v1alpha2.api.CreateSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Subscription>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSubscriptionMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a subscription.
     * </pre>
     */
    public void updateSubscription(
        com.google.irm.service.v1alpha2.api.UpdateSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Subscription>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSubscriptionMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns a list of subscriptions for an incident.
     * </pre>
     */
    public void listSubscriptions(
        com.google.irm.service.v1alpha2.api.ListSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.ListSubscriptionsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSubscriptionsMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes an existing subscription.
     * </pre>
     */
    public void deleteSubscription(
        com.google.irm.service.v1alpha2.api.DeleteSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteSubscriptionMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a role assignment on an existing incident. Normally, the user field
     * will be set when assigning a role to oneself, and the next field will be
     * set when proposing another user as the assignee. Setting the next field
     * directly to a user other than oneself is equivalent to proposing and
     * force-assigning the role to the user.
     * </pre>
     */
    public void createIncidentRoleAssignment(
        com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateIncidentRoleAssignmentMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes an existing role assignment.
     * </pre>
     */
    public void deleteIncidentRoleAssignment(
        com.google.irm.service.v1alpha2.api.DeleteIncidentRoleAssignmentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteIncidentRoleAssignmentMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists role assignments that are part of an incident.
     * </pre>
     */
    public void listIncidentRoleAssignments(
        com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListIncidentRoleAssignmentsMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Starts a role handover. The proposed assignee will receive an email
     * notifying them of the assignment. This will fail if a role handover is
     * already pending.
     * </pre>
     */
    public void requestIncidentRoleHandover(
        com.google.irm.service.v1alpha2.api.RequestIncidentRoleHandoverRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRequestIncidentRoleHandoverMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Confirms a role handover. This will fail if the 'proposed_assignee' field
     * of the IncidentRoleAssignment is not equal to the 'new_assignee' field of
     * the request. If the caller is not the new_assignee,
     * ForceIncidentRoleHandover should be used instead.
     * </pre>
     */
    public void confirmIncidentRoleHandover(
        com.google.irm.service.v1alpha2.api.ConfirmIncidentRoleHandoverRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConfirmIncidentRoleHandoverMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Forces a role handover. This will fail if the 'proposed_assignee' field of
     * the IncidentRoleAssignment is not equal to the 'new_assignee' field of the
     * request. If the caller is the new_assignee, ConfirmIncidentRoleHandover
     * should be used instead.
     * </pre>
     */
    public void forceIncidentRoleHandover(
        com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getForceIncidentRoleHandoverMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Cancels a role handover. This will fail if the 'proposed_assignee' field of
     * the IncidentRoleAssignment is not equal to the 'new_assignee' field of the
     * request.
     * </pre>
     */
    public void cancelIncidentRoleHandover(
        com.google.irm.service.v1alpha2.api.CancelIncidentRoleHandoverRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelIncidentRoleHandoverMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   *
   *
   * <pre>
   * The Incident API for Incident Response &amp; Management.
   * </pre>
   */
  public static final class IncidentServiceBlockingStub
      extends io.grpc.stub.AbstractStub<IncidentServiceBlockingStub> {
    private IncidentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IncidentServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IncidentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IncidentServiceBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Creates a new incident.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.Incident createIncident(
        com.google.irm.service.v1alpha2.api.CreateIncidentRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateIncidentMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Returns an incident by name.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.Incident getIncident(
        com.google.irm.service.v1alpha2.api.GetIncidentRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetIncidentMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Returns a list of incidents.
     * Incidents are ordered by start time, with the most recent incidents first.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.SearchIncidentsResponse searchIncidents(
        com.google.irm.service.v1alpha2.api.SearchIncidentsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchIncidentsMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates an existing incident.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.Incident updateIncident(
        com.google.irm.service.v1alpha2.api.UpdateIncidentRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateIncidentMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Returns a list of incidents that are "similar" to the specified incident
     * or signal. This functionality is provided on a best-effort basis and the
     * definition of "similar" is subject to change.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsResponse
        searchSimilarIncidents(
            com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchSimilarIncidentsMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates an annotation on an existing incident. Only 'text/plain' and
     * 'text/markdown' annotations can be created via this method.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.Annotation createAnnotation(
        com.google.irm.service.v1alpha2.api.CreateAnnotationRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateAnnotationMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists annotations that are part of an incident. No assumptions should be
     * made on the content-type of the annotation returned.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.ListAnnotationsResponse listAnnotations(
        com.google.irm.service.v1alpha2.api.ListAnnotationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAnnotationsMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a tag on an existing incident.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.Tag createTag(
        com.google.irm.service.v1alpha2.api.CreateTagRequest request) {
      return blockingUnaryCall(getChannel(), getCreateTagMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes an existing tag.
     * </pre>
     */
    public com.google.protobuf.Empty deleteTag(
        com.google.irm.service.v1alpha2.api.DeleteTagRequest request) {
      return blockingUnaryCall(getChannel(), getDeleteTagMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists tags that are part of an incident.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.ListTagsResponse listTags(
        com.google.irm.service.v1alpha2.api.ListTagsRequest request) {
      return blockingUnaryCall(getChannel(), getListTagsMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new signal.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.Signal createSignal(
        com.google.irm.service.v1alpha2.api.CreateSignalRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateSignalMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists signals that are part of an incident.
     * Signals are returned in reverse chronological order.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.SearchSignalsResponse searchSignals(
        com.google.irm.service.v1alpha2.api.SearchSignalsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchSignalsMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Finds a signal by other unique IDs.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.Signal lookupSignal(
        com.google.irm.service.v1alpha2.api.LookupSignalRequest request) {
      return blockingUnaryCall(
          getChannel(), getLookupSignalMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Returns a signal by name.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.Signal getSignal(
        com.google.irm.service.v1alpha2.api.GetSignalRequest request) {
      return blockingUnaryCall(getChannel(), getGetSignalMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates an existing signal (for example, to assign/unassign it to an
     * incident).
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.Signal updateSignal(
        com.google.irm.service.v1alpha2.api.UpdateSignalRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSignalMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Escalates an incident.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.EscalateIncidentResponse escalateIncident(
        com.google.irm.service.v1alpha2.api.EscalateIncidentRequest request) {
      return blockingUnaryCall(
          getChannel(), getEscalateIncidentMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new artifact.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.Artifact createArtifact(
        com.google.irm.service.v1alpha2.api.CreateArtifactRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateArtifactMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Returns a list of artifacts for an incident.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.ListArtifactsResponse listArtifacts(
        com.google.irm.service.v1alpha2.api.ListArtifactsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListArtifactsMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates an existing artifact.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.Artifact updateArtifact(
        com.google.irm.service.v1alpha2.api.UpdateArtifactRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateArtifactMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes an existing artifact.
     * </pre>
     */
    public com.google.protobuf.Empty deleteArtifact(
        com.google.irm.service.v1alpha2.api.DeleteArtifactRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteArtifactMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Sends a summary of the shift for oncall handoff.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.SendShiftHandoffResponse sendShiftHandoff(
        com.google.irm.service.v1alpha2.api.SendShiftHandoffRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendShiftHandoffMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new subscription.
     * This will fail if:
     *    a. there are too many (50) subscriptions in the incident already
     *    b. a subscription using the given channel already exists
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.Subscription createSubscription(
        com.google.irm.service.v1alpha2.api.CreateSubscriptionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateSubscriptionMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a subscription.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.Subscription updateSubscription(
        com.google.irm.service.v1alpha2.api.UpdateSubscriptionRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSubscriptionMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Returns a list of subscriptions for an incident.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.ListSubscriptionsResponse listSubscriptions(
        com.google.irm.service.v1alpha2.api.ListSubscriptionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListSubscriptionsMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes an existing subscription.
     * </pre>
     */
    public com.google.protobuf.Empty deleteSubscription(
        com.google.irm.service.v1alpha2.api.DeleteSubscriptionRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteSubscriptionMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a role assignment on an existing incident. Normally, the user field
     * will be set when assigning a role to oneself, and the next field will be
     * set when proposing another user as the assignee. Setting the next field
     * directly to a user other than oneself is equivalent to proposing and
     * force-assigning the role to the user.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.IncidentRoleAssignment createIncidentRoleAssignment(
        com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateIncidentRoleAssignmentMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes an existing role assignment.
     * </pre>
     */
    public com.google.protobuf.Empty deleteIncidentRoleAssignment(
        com.google.irm.service.v1alpha2.api.DeleteIncidentRoleAssignmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteIncidentRoleAssignmentMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists role assignments that are part of an incident.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsResponse
        listIncidentRoleAssignments(
            com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListIncidentRoleAssignmentsMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Starts a role handover. The proposed assignee will receive an email
     * notifying them of the assignment. This will fail if a role handover is
     * already pending.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.IncidentRoleAssignment requestIncidentRoleHandover(
        com.google.irm.service.v1alpha2.api.RequestIncidentRoleHandoverRequest request) {
      return blockingUnaryCall(
          getChannel(), getRequestIncidentRoleHandoverMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Confirms a role handover. This will fail if the 'proposed_assignee' field
     * of the IncidentRoleAssignment is not equal to the 'new_assignee' field of
     * the request. If the caller is not the new_assignee,
     * ForceIncidentRoleHandover should be used instead.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.IncidentRoleAssignment confirmIncidentRoleHandover(
        com.google.irm.service.v1alpha2.api.ConfirmIncidentRoleHandoverRequest request) {
      return blockingUnaryCall(
          getChannel(), getConfirmIncidentRoleHandoverMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Forces a role handover. This will fail if the 'proposed_assignee' field of
     * the IncidentRoleAssignment is not equal to the 'new_assignee' field of the
     * request. If the caller is the new_assignee, ConfirmIncidentRoleHandover
     * should be used instead.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.IncidentRoleAssignment forceIncidentRoleHandover(
        com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest request) {
      return blockingUnaryCall(
          getChannel(), getForceIncidentRoleHandoverMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Cancels a role handover. This will fail if the 'proposed_assignee' field of
     * the IncidentRoleAssignment is not equal to the 'new_assignee' field of the
     * request.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.IncidentRoleAssignment cancelIncidentRoleHandover(
        com.google.irm.service.v1alpha2.api.CancelIncidentRoleHandoverRequest request) {
      return blockingUnaryCall(
          getChannel(), getCancelIncidentRoleHandoverMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   *
   *
   * <pre>
   * The Incident API for Incident Response &amp; Management.
   * </pre>
   */
  public static final class IncidentServiceFutureStub
      extends io.grpc.stub.AbstractStub<IncidentServiceFutureStub> {
    private IncidentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IncidentServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IncidentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IncidentServiceFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Creates a new incident.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.Incident>
        createIncident(com.google.irm.service.v1alpha2.api.CreateIncidentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateIncidentMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Returns an incident by name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.Incident>
        getIncident(com.google.irm.service.v1alpha2.api.GetIncidentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetIncidentMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Returns a list of incidents.
     * Incidents are ordered by start time, with the most recent incidents first.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.SearchIncidentsResponse>
        searchIncidents(com.google.irm.service.v1alpha2.api.SearchIncidentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchIncidentsMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Updates an existing incident.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.Incident>
        updateIncident(com.google.irm.service.v1alpha2.api.UpdateIncidentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateIncidentMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Returns a list of incidents that are "similar" to the specified incident
     * or signal. This functionality is provided on a best-effort basis and the
     * definition of "similar" is subject to change.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsResponse>
        searchSimilarIncidents(
            com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchSimilarIncidentsMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates an annotation on an existing incident. Only 'text/plain' and
     * 'text/markdown' annotations can be created via this method.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.Annotation>
        createAnnotation(com.google.irm.service.v1alpha2.api.CreateAnnotationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAnnotationMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists annotations that are part of an incident. No assumptions should be
     * made on the content-type of the annotation returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.ListAnnotationsResponse>
        listAnnotations(com.google.irm.service.v1alpha2.api.ListAnnotationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAnnotationsMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a tag on an existing incident.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.Tag>
        createTag(com.google.irm.service.v1alpha2.api.CreateTagRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTagMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes an existing tag.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTag(
        com.google.irm.service.v1alpha2.api.DeleteTagRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteTagMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists tags that are part of an incident.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.ListTagsResponse>
        listTags(com.google.irm.service.v1alpha2.api.ListTagsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListTagsMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new signal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.Signal>
        createSignal(com.google.irm.service.v1alpha2.api.CreateSignalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSignalMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists signals that are part of an incident.
     * Signals are returned in reverse chronological order.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.SearchSignalsResponse>
        searchSignals(com.google.irm.service.v1alpha2.api.SearchSignalsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchSignalsMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Finds a signal by other unique IDs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.Signal>
        lookupSignal(com.google.irm.service.v1alpha2.api.LookupSignalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLookupSignalMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Returns a signal by name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.Signal>
        getSignal(com.google.irm.service.v1alpha2.api.GetSignalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSignalMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Updates an existing signal (for example, to assign/unassign it to an
     * incident).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.Signal>
        updateSignal(com.google.irm.service.v1alpha2.api.UpdateSignalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSignalMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Escalates an incident.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.EscalateIncidentResponse>
        escalateIncident(com.google.irm.service.v1alpha2.api.EscalateIncidentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEscalateIncidentMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new artifact.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.Artifact>
        createArtifact(com.google.irm.service.v1alpha2.api.CreateArtifactRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateArtifactMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Returns a list of artifacts for an incident.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.ListArtifactsResponse>
        listArtifacts(com.google.irm.service.v1alpha2.api.ListArtifactsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListArtifactsMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Updates an existing artifact.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.Artifact>
        updateArtifact(com.google.irm.service.v1alpha2.api.UpdateArtifactRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateArtifactMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes an existing artifact.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteArtifact(com.google.irm.service.v1alpha2.api.DeleteArtifactRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteArtifactMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Sends a summary of the shift for oncall handoff.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.SendShiftHandoffResponse>
        sendShiftHandoff(com.google.irm.service.v1alpha2.api.SendShiftHandoffRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendShiftHandoffMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new subscription.
     * This will fail if:
     *    a. there are too many (50) subscriptions in the incident already
     *    b. a subscription using the given channel already exists
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.Subscription>
        createSubscription(com.google.irm.service.v1alpha2.api.CreateSubscriptionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSubscriptionMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a subscription.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.Subscription>
        updateSubscription(com.google.irm.service.v1alpha2.api.UpdateSubscriptionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSubscriptionMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Returns a list of subscriptions for an incident.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.ListSubscriptionsResponse>
        listSubscriptions(com.google.irm.service.v1alpha2.api.ListSubscriptionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListSubscriptionsMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes an existing subscription.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteSubscription(com.google.irm.service.v1alpha2.api.DeleteSubscriptionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteSubscriptionMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a role assignment on an existing incident. Normally, the user field
     * will be set when assigning a role to oneself, and the next field will be
     * set when proposing another user as the assignee. Setting the next field
     * directly to a user other than oneself is equivalent to proposing and
     * force-assigning the role to the user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
        createIncidentRoleAssignment(
            com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateIncidentRoleAssignmentMethodHelper(), getCallOptions()),
          request);
    }

    /**
     *
     *
     * <pre>
     * Deletes an existing role assignment.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteIncidentRoleAssignment(
            com.google.irm.service.v1alpha2.api.DeleteIncidentRoleAssignmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteIncidentRoleAssignmentMethodHelper(), getCallOptions()),
          request);
    }

    /**
     *
     *
     * <pre>
     * Lists role assignments that are part of an incident.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsResponse>
        listIncidentRoleAssignments(
            com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListIncidentRoleAssignmentsMethodHelper(), getCallOptions()),
          request);
    }

    /**
     *
     *
     * <pre>
     * Starts a role handover. The proposed assignee will receive an email
     * notifying them of the assignment. This will fail if a role handover is
     * already pending.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
        requestIncidentRoleHandover(
            com.google.irm.service.v1alpha2.api.RequestIncidentRoleHandoverRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRequestIncidentRoleHandoverMethodHelper(), getCallOptions()),
          request);
    }

    /**
     *
     *
     * <pre>
     * Confirms a role handover. This will fail if the 'proposed_assignee' field
     * of the IncidentRoleAssignment is not equal to the 'new_assignee' field of
     * the request. If the caller is not the new_assignee,
     * ForceIncidentRoleHandover should be used instead.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
        confirmIncidentRoleHandover(
            com.google.irm.service.v1alpha2.api.ConfirmIncidentRoleHandoverRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConfirmIncidentRoleHandoverMethodHelper(), getCallOptions()),
          request);
    }

    /**
     *
     *
     * <pre>
     * Forces a role handover. This will fail if the 'proposed_assignee' field of
     * the IncidentRoleAssignment is not equal to the 'new_assignee' field of the
     * request. If the caller is the new_assignee, ConfirmIncidentRoleHandover
     * should be used instead.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
        forceIncidentRoleHandover(
            com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getForceIncidentRoleHandoverMethodHelper(), getCallOptions()),
          request);
    }

    /**
     *
     *
     * <pre>
     * Cancels a role handover. This will fail if the 'proposed_assignee' field of
     * the IncidentRoleAssignment is not equal to the 'new_assignee' field of the
     * request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
        cancelIncidentRoleHandover(
            com.google.irm.service.v1alpha2.api.CancelIncidentRoleHandoverRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelIncidentRoleHandoverMethodHelper(), getCallOptions()),
          request);
    }
  }

  private static final int METHODID_CREATE_INCIDENT = 0;
  private static final int METHODID_GET_INCIDENT = 1;
  private static final int METHODID_SEARCH_INCIDENTS = 2;
  private static final int METHODID_UPDATE_INCIDENT = 3;
  private static final int METHODID_SEARCH_SIMILAR_INCIDENTS = 4;
  private static final int METHODID_CREATE_ANNOTATION = 5;
  private static final int METHODID_LIST_ANNOTATIONS = 6;
  private static final int METHODID_CREATE_TAG = 7;
  private static final int METHODID_DELETE_TAG = 8;
  private static final int METHODID_LIST_TAGS = 9;
  private static final int METHODID_CREATE_SIGNAL = 10;
  private static final int METHODID_SEARCH_SIGNALS = 11;
  private static final int METHODID_LOOKUP_SIGNAL = 12;
  private static final int METHODID_GET_SIGNAL = 13;
  private static final int METHODID_UPDATE_SIGNAL = 14;
  private static final int METHODID_ESCALATE_INCIDENT = 15;
  private static final int METHODID_CREATE_ARTIFACT = 16;
  private static final int METHODID_LIST_ARTIFACTS = 17;
  private static final int METHODID_UPDATE_ARTIFACT = 18;
  private static final int METHODID_DELETE_ARTIFACT = 19;
  private static final int METHODID_SEND_SHIFT_HANDOFF = 20;
  private static final int METHODID_CREATE_SUBSCRIPTION = 21;
  private static final int METHODID_UPDATE_SUBSCRIPTION = 22;
  private static final int METHODID_LIST_SUBSCRIPTIONS = 23;
  private static final int METHODID_DELETE_SUBSCRIPTION = 24;
  private static final int METHODID_CREATE_INCIDENT_ROLE_ASSIGNMENT = 25;
  private static final int METHODID_DELETE_INCIDENT_ROLE_ASSIGNMENT = 26;
  private static final int METHODID_LIST_INCIDENT_ROLE_ASSIGNMENTS = 27;
  private static final int METHODID_REQUEST_INCIDENT_ROLE_HANDOVER = 28;
  private static final int METHODID_CONFIRM_INCIDENT_ROLE_HANDOVER = 29;
  private static final int METHODID_FORCE_INCIDENT_ROLE_HANDOVER = 30;
  private static final int METHODID_CANCEL_INCIDENT_ROLE_HANDOVER = 31;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IncidentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IncidentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_INCIDENT:
          serviceImpl.createIncident(
              (com.google.irm.service.v1alpha2.api.CreateIncidentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Incident>)
                  responseObserver);
          break;
        case METHODID_GET_INCIDENT:
          serviceImpl.getIncident(
              (com.google.irm.service.v1alpha2.api.GetIncidentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Incident>)
                  responseObserver);
          break;
        case METHODID_SEARCH_INCIDENTS:
          serviceImpl.searchIncidents(
              (com.google.irm.service.v1alpha2.api.SearchIncidentsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.irm.service.v1alpha2.api.SearchIncidentsResponse>)
                  responseObserver);
          break;
        case METHODID_UPDATE_INCIDENT:
          serviceImpl.updateIncident(
              (com.google.irm.service.v1alpha2.api.UpdateIncidentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Incident>)
                  responseObserver);
          break;
        case METHODID_SEARCH_SIMILAR_INCIDENTS:
          serviceImpl.searchSimilarIncidents(
              (com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsResponse>)
                  responseObserver);
          break;
        case METHODID_CREATE_ANNOTATION:
          serviceImpl.createAnnotation(
              (com.google.irm.service.v1alpha2.api.CreateAnnotationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Annotation>)
                  responseObserver);
          break;
        case METHODID_LIST_ANNOTATIONS:
          serviceImpl.listAnnotations(
              (com.google.irm.service.v1alpha2.api.ListAnnotationsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.irm.service.v1alpha2.api.ListAnnotationsResponse>)
                  responseObserver);
          break;
        case METHODID_CREATE_TAG:
          serviceImpl.createTag(
              (com.google.irm.service.v1alpha2.api.CreateTagRequest) request,
              (io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Tag>)
                  responseObserver);
          break;
        case METHODID_DELETE_TAG:
          serviceImpl.deleteTag(
              (com.google.irm.service.v1alpha2.api.DeleteTagRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_TAGS:
          serviceImpl.listTags(
              (com.google.irm.service.v1alpha2.api.ListTagsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.ListTagsResponse>)
                  responseObserver);
          break;
        case METHODID_CREATE_SIGNAL:
          serviceImpl.createSignal(
              (com.google.irm.service.v1alpha2.api.CreateSignalRequest) request,
              (io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Signal>)
                  responseObserver);
          break;
        case METHODID_SEARCH_SIGNALS:
          serviceImpl.searchSignals(
              (com.google.irm.service.v1alpha2.api.SearchSignalsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.irm.service.v1alpha2.api.SearchSignalsResponse>)
                  responseObserver);
          break;
        case METHODID_LOOKUP_SIGNAL:
          serviceImpl.lookupSignal(
              (com.google.irm.service.v1alpha2.api.LookupSignalRequest) request,
              (io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Signal>)
                  responseObserver);
          break;
        case METHODID_GET_SIGNAL:
          serviceImpl.getSignal(
              (com.google.irm.service.v1alpha2.api.GetSignalRequest) request,
              (io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Signal>)
                  responseObserver);
          break;
        case METHODID_UPDATE_SIGNAL:
          serviceImpl.updateSignal(
              (com.google.irm.service.v1alpha2.api.UpdateSignalRequest) request,
              (io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Signal>)
                  responseObserver);
          break;
        case METHODID_ESCALATE_INCIDENT:
          serviceImpl.escalateIncident(
              (com.google.irm.service.v1alpha2.api.EscalateIncidentRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.irm.service.v1alpha2.api.EscalateIncidentResponse>)
                  responseObserver);
          break;
        case METHODID_CREATE_ARTIFACT:
          serviceImpl.createArtifact(
              (com.google.irm.service.v1alpha2.api.CreateArtifactRequest) request,
              (io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Artifact>)
                  responseObserver);
          break;
        case METHODID_LIST_ARTIFACTS:
          serviceImpl.listArtifacts(
              (com.google.irm.service.v1alpha2.api.ListArtifactsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.irm.service.v1alpha2.api.ListArtifactsResponse>)
                  responseObserver);
          break;
        case METHODID_UPDATE_ARTIFACT:
          serviceImpl.updateArtifact(
              (com.google.irm.service.v1alpha2.api.UpdateArtifactRequest) request,
              (io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Artifact>)
                  responseObserver);
          break;
        case METHODID_DELETE_ARTIFACT:
          serviceImpl.deleteArtifact(
              (com.google.irm.service.v1alpha2.api.DeleteArtifactRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SEND_SHIFT_HANDOFF:
          serviceImpl.sendShiftHandoff(
              (com.google.irm.service.v1alpha2.api.SendShiftHandoffRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.irm.service.v1alpha2.api.SendShiftHandoffResponse>)
                  responseObserver);
          break;
        case METHODID_CREATE_SUBSCRIPTION:
          serviceImpl.createSubscription(
              (com.google.irm.service.v1alpha2.api.CreateSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Subscription>)
                  responseObserver);
          break;
        case METHODID_UPDATE_SUBSCRIPTION:
          serviceImpl.updateSubscription(
              (com.google.irm.service.v1alpha2.api.UpdateSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.Subscription>)
                  responseObserver);
          break;
        case METHODID_LIST_SUBSCRIPTIONS:
          serviceImpl.listSubscriptions(
              (com.google.irm.service.v1alpha2.api.ListSubscriptionsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.irm.service.v1alpha2.api.ListSubscriptionsResponse>)
                  responseObserver);
          break;
        case METHODID_DELETE_SUBSCRIPTION:
          serviceImpl.deleteSubscription(
              (com.google.irm.service.v1alpha2.api.DeleteSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_INCIDENT_ROLE_ASSIGNMENT:
          serviceImpl.createIncidentRoleAssignment(
              (com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>)
                  responseObserver);
          break;
        case METHODID_DELETE_INCIDENT_ROLE_ASSIGNMENT:
          serviceImpl.deleteIncidentRoleAssignment(
              (com.google.irm.service.v1alpha2.api.DeleteIncidentRoleAssignmentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_INCIDENT_ROLE_ASSIGNMENTS:
          serviceImpl.listIncidentRoleAssignments(
              (com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsResponse>)
                  responseObserver);
          break;
        case METHODID_REQUEST_INCIDENT_ROLE_HANDOVER:
          serviceImpl.requestIncidentRoleHandover(
              (com.google.irm.service.v1alpha2.api.RequestIncidentRoleHandoverRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>)
                  responseObserver);
          break;
        case METHODID_CONFIRM_INCIDENT_ROLE_HANDOVER:
          serviceImpl.confirmIncidentRoleHandover(
              (com.google.irm.service.v1alpha2.api.ConfirmIncidentRoleHandoverRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>)
                  responseObserver);
          break;
        case METHODID_FORCE_INCIDENT_ROLE_HANDOVER:
          serviceImpl.forceIncidentRoleHandover(
              (com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>)
                  responseObserver);
          break;
        case METHODID_CANCEL_INCIDENT_ROLE_HANDOVER:
          serviceImpl.cancelIncidentRoleHandover(
              (com.google.irm.service.v1alpha2.api.CancelIncidentRoleHandoverRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>)
                  responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private abstract static class IncidentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IncidentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.irm.service.v1alpha2.api.IncidentsService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IncidentService");
    }
  }

  private static final class IncidentServiceFileDescriptorSupplier
      extends IncidentServiceBaseDescriptorSupplier {
    IncidentServiceFileDescriptorSupplier() {}
  }

  private static final class IncidentServiceMethodDescriptorSupplier
      extends IncidentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IncidentServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (IncidentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new IncidentServiceFileDescriptorSupplier())
                      .addMethod(getCreateIncidentMethodHelper())
                      .addMethod(getGetIncidentMethodHelper())
                      .addMethod(getSearchIncidentsMethodHelper())
                      .addMethod(getUpdateIncidentMethodHelper())
                      .addMethod(getSearchSimilarIncidentsMethodHelper())
                      .addMethod(getCreateAnnotationMethodHelper())
                      .addMethod(getListAnnotationsMethodHelper())
                      .addMethod(getCreateTagMethodHelper())
                      .addMethod(getDeleteTagMethodHelper())
                      .addMethod(getListTagsMethodHelper())
                      .addMethod(getCreateSignalMethodHelper())
                      .addMethod(getSearchSignalsMethodHelper())
                      .addMethod(getLookupSignalMethodHelper())
                      .addMethod(getGetSignalMethodHelper())
                      .addMethod(getUpdateSignalMethodHelper())
                      .addMethod(getEscalateIncidentMethodHelper())
                      .addMethod(getCreateArtifactMethodHelper())
                      .addMethod(getListArtifactsMethodHelper())
                      .addMethod(getUpdateArtifactMethodHelper())
                      .addMethod(getDeleteArtifactMethodHelper())
                      .addMethod(getSendShiftHandoffMethodHelper())
                      .addMethod(getCreateSubscriptionMethodHelper())
                      .addMethod(getUpdateSubscriptionMethodHelper())
                      .addMethod(getListSubscriptionsMethodHelper())
                      .addMethod(getDeleteSubscriptionMethodHelper())
                      .addMethod(getCreateIncidentRoleAssignmentMethodHelper())
                      .addMethod(getDeleteIncidentRoleAssignmentMethodHelper())
                      .addMethod(getListIncidentRoleAssignmentsMethodHelper())
                      .addMethod(getRequestIncidentRoleHandoverMethodHelper())
                      .addMethod(getConfirmIncidentRoleHandoverMethodHelper())
                      .addMethod(getForceIncidentRoleHandoverMethodHelper())
                      .addMethod(getCancelIncidentRoleHandoverMethodHelper())
                      .build();
        }
      }
    }
    return result;
  }
}
