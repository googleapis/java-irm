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
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/irm/v1alpha2/incidents_service.proto")
public final class IncidentServiceGrpc {

  private IncidentServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.irm.v1alpha2.IncidentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateIncidentRequest,
          com.google.irm.service.v1alpha2.api.Incident>
      getCreateIncidentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateIncident",
      requestType = com.google.irm.service.v1alpha2.api.CreateIncidentRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.Incident.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateIncidentRequest,
          com.google.irm.service.v1alpha2.api.Incident>
      getCreateIncidentMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateIncident"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.GetIncidentRequest,
          com.google.irm.service.v1alpha2.api.Incident>
      getGetIncidentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIncident",
      requestType = com.google.irm.service.v1alpha2.api.GetIncidentRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.Incident.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.GetIncidentRequest,
          com.google.irm.service.v1alpha2.api.Incident>
      getGetIncidentMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIncident"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.SearchIncidentsRequest,
          com.google.irm.service.v1alpha2.api.SearchIncidentsResponse>
      getSearchIncidentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchIncidents",
      requestType = com.google.irm.service.v1alpha2.api.SearchIncidentsRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.SearchIncidentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.SearchIncidentsRequest,
          com.google.irm.service.v1alpha2.api.SearchIncidentsResponse>
      getSearchIncidentsMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchIncidents"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.UpdateIncidentRequest,
          com.google.irm.service.v1alpha2.api.Incident>
      getUpdateIncidentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateIncident",
      requestType = com.google.irm.service.v1alpha2.api.UpdateIncidentRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.Incident.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.UpdateIncidentRequest,
          com.google.irm.service.v1alpha2.api.Incident>
      getUpdateIncidentMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateIncident"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsRequest,
          com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsResponse>
      getSearchSimilarIncidentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchSimilarIncidents",
      requestType = com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsRequest,
          com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsResponse>
      getSearchSimilarIncidentsMethod() {
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
                          generateFullMethodName(SERVICE_NAME, "SearchSimilarIncidents"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateAnnotationRequest,
          com.google.irm.service.v1alpha2.api.Annotation>
      getCreateAnnotationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAnnotation",
      requestType = com.google.irm.service.v1alpha2.api.CreateAnnotationRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.Annotation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateAnnotationRequest,
          com.google.irm.service.v1alpha2.api.Annotation>
      getCreateAnnotationMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAnnotation"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListAnnotationsRequest,
          com.google.irm.service.v1alpha2.api.ListAnnotationsResponse>
      getListAnnotationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAnnotations",
      requestType = com.google.irm.service.v1alpha2.api.ListAnnotationsRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.ListAnnotationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListAnnotationsRequest,
          com.google.irm.service.v1alpha2.api.ListAnnotationsResponse>
      getListAnnotationsMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAnnotations"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateTagRequest,
          com.google.irm.service.v1alpha2.api.Tag>
      getCreateTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTag",
      requestType = com.google.irm.service.v1alpha2.api.CreateTagRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.Tag.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateTagRequest,
          com.google.irm.service.v1alpha2.api.Tag>
      getCreateTagMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTag"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.DeleteTagRequest, com.google.protobuf.Empty>
      getDeleteTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTag",
      requestType = com.google.irm.service.v1alpha2.api.DeleteTagRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.DeleteTagRequest, com.google.protobuf.Empty>
      getDeleteTagMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTag"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListTagsRequest,
          com.google.irm.service.v1alpha2.api.ListTagsResponse>
      getListTagsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTags",
      requestType = com.google.irm.service.v1alpha2.api.ListTagsRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.ListTagsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListTagsRequest,
          com.google.irm.service.v1alpha2.api.ListTagsResponse>
      getListTagsMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTags"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateSignalRequest,
          com.google.irm.service.v1alpha2.api.Signal>
      getCreateSignalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSignal",
      requestType = com.google.irm.service.v1alpha2.api.CreateSignalRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.Signal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateSignalRequest,
          com.google.irm.service.v1alpha2.api.Signal>
      getCreateSignalMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSignal"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.SearchSignalsRequest,
          com.google.irm.service.v1alpha2.api.SearchSignalsResponse>
      getSearchSignalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchSignals",
      requestType = com.google.irm.service.v1alpha2.api.SearchSignalsRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.SearchSignalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.SearchSignalsRequest,
          com.google.irm.service.v1alpha2.api.SearchSignalsResponse>
      getSearchSignalsMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchSignals"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.LookupSignalRequest,
          com.google.irm.service.v1alpha2.api.Signal>
      getLookupSignalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LookupSignal",
      requestType = com.google.irm.service.v1alpha2.api.LookupSignalRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.Signal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.LookupSignalRequest,
          com.google.irm.service.v1alpha2.api.Signal>
      getLookupSignalMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LookupSignal"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.GetSignalRequest,
          com.google.irm.service.v1alpha2.api.Signal>
      getGetSignalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSignal",
      requestType = com.google.irm.service.v1alpha2.api.GetSignalRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.Signal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.GetSignalRequest,
          com.google.irm.service.v1alpha2.api.Signal>
      getGetSignalMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSignal"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.UpdateSignalRequest,
          com.google.irm.service.v1alpha2.api.Signal>
      getUpdateSignalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSignal",
      requestType = com.google.irm.service.v1alpha2.api.UpdateSignalRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.Signal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.UpdateSignalRequest,
          com.google.irm.service.v1alpha2.api.Signal>
      getUpdateSignalMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSignal"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.EscalateIncidentRequest,
          com.google.irm.service.v1alpha2.api.EscalateIncidentResponse>
      getEscalateIncidentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EscalateIncident",
      requestType = com.google.irm.service.v1alpha2.api.EscalateIncidentRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.EscalateIncidentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.EscalateIncidentRequest,
          com.google.irm.service.v1alpha2.api.EscalateIncidentResponse>
      getEscalateIncidentMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EscalateIncident"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateArtifactRequest,
          com.google.irm.service.v1alpha2.api.Artifact>
      getCreateArtifactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateArtifact",
      requestType = com.google.irm.service.v1alpha2.api.CreateArtifactRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.Artifact.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateArtifactRequest,
          com.google.irm.service.v1alpha2.api.Artifact>
      getCreateArtifactMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateArtifact"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListArtifactsRequest,
          com.google.irm.service.v1alpha2.api.ListArtifactsResponse>
      getListArtifactsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListArtifacts",
      requestType = com.google.irm.service.v1alpha2.api.ListArtifactsRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.ListArtifactsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListArtifactsRequest,
          com.google.irm.service.v1alpha2.api.ListArtifactsResponse>
      getListArtifactsMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListArtifacts"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.UpdateArtifactRequest,
          com.google.irm.service.v1alpha2.api.Artifact>
      getUpdateArtifactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateArtifact",
      requestType = com.google.irm.service.v1alpha2.api.UpdateArtifactRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.Artifact.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.UpdateArtifactRequest,
          com.google.irm.service.v1alpha2.api.Artifact>
      getUpdateArtifactMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateArtifact"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.DeleteArtifactRequest, com.google.protobuf.Empty>
      getDeleteArtifactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteArtifact",
      requestType = com.google.irm.service.v1alpha2.api.DeleteArtifactRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.DeleteArtifactRequest, com.google.protobuf.Empty>
      getDeleteArtifactMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteArtifact"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.SendShiftHandoffRequest,
          com.google.irm.service.v1alpha2.api.SendShiftHandoffResponse>
      getSendShiftHandoffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendShiftHandoff",
      requestType = com.google.irm.service.v1alpha2.api.SendShiftHandoffRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.SendShiftHandoffResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.SendShiftHandoffRequest,
          com.google.irm.service.v1alpha2.api.SendShiftHandoffResponse>
      getSendShiftHandoffMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendShiftHandoff"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateSubscriptionRequest,
          com.google.irm.service.v1alpha2.api.Subscription>
      getCreateSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSubscription",
      requestType = com.google.irm.service.v1alpha2.api.CreateSubscriptionRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.Subscription.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateSubscriptionRequest,
          com.google.irm.service.v1alpha2.api.Subscription>
      getCreateSubscriptionMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSubscription"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.UpdateSubscriptionRequest,
          com.google.irm.service.v1alpha2.api.Subscription>
      getUpdateSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSubscription",
      requestType = com.google.irm.service.v1alpha2.api.UpdateSubscriptionRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.Subscription.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.UpdateSubscriptionRequest,
          com.google.irm.service.v1alpha2.api.Subscription>
      getUpdateSubscriptionMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSubscription"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListSubscriptionsRequest,
          com.google.irm.service.v1alpha2.api.ListSubscriptionsResponse>
      getListSubscriptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSubscriptions",
      requestType = com.google.irm.service.v1alpha2.api.ListSubscriptionsRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.ListSubscriptionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListSubscriptionsRequest,
          com.google.irm.service.v1alpha2.api.ListSubscriptionsResponse>
      getListSubscriptionsMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSubscriptions"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.DeleteSubscriptionRequest, com.google.protobuf.Empty>
      getDeleteSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSubscription",
      requestType = com.google.irm.service.v1alpha2.api.DeleteSubscriptionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.DeleteSubscriptionRequest, com.google.protobuf.Empty>
      getDeleteSubscriptionMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSubscription"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      getCreateIncidentRoleAssignmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateIncidentRoleAssignment",
      requestType = com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.IncidentRoleAssignment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      getCreateIncidentRoleAssignmentMethod() {
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
                          generateFullMethodName(SERVICE_NAME, "CreateIncidentRoleAssignment"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.DeleteIncidentRoleAssignmentRequest,
          com.google.protobuf.Empty>
      getDeleteIncidentRoleAssignmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteIncidentRoleAssignment",
      requestType = com.google.irm.service.v1alpha2.api.DeleteIncidentRoleAssignmentRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.DeleteIncidentRoleAssignmentRequest,
          com.google.protobuf.Empty>
      getDeleteIncidentRoleAssignmentMethod() {
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
                          generateFullMethodName(SERVICE_NAME, "DeleteIncidentRoleAssignment"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsRequest,
          com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsResponse>
      getListIncidentRoleAssignmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListIncidentRoleAssignments",
      requestType = com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsRequest,
          com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsResponse>
      getListIncidentRoleAssignmentsMethod() {
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
                          generateFullMethodName(SERVICE_NAME, "ListIncidentRoleAssignments"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.RequestIncidentRoleHandoverRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      getRequestIncidentRoleHandoverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestIncidentRoleHandover",
      requestType = com.google.irm.service.v1alpha2.api.RequestIncidentRoleHandoverRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.IncidentRoleAssignment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.RequestIncidentRoleHandoverRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      getRequestIncidentRoleHandoverMethod() {
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
                          generateFullMethodName(SERVICE_NAME, "RequestIncidentRoleHandover"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ConfirmIncidentRoleHandoverRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      getConfirmIncidentRoleHandoverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmIncidentRoleHandover",
      requestType = com.google.irm.service.v1alpha2.api.ConfirmIncidentRoleHandoverRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.IncidentRoleAssignment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ConfirmIncidentRoleHandoverRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      getConfirmIncidentRoleHandoverMethod() {
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
                          generateFullMethodName(SERVICE_NAME, "ConfirmIncidentRoleHandover"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      getForceIncidentRoleHandoverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ForceIncidentRoleHandover",
      requestType = com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.IncidentRoleAssignment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      getForceIncidentRoleHandoverMethod() {
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
                          generateFullMethodName(SERVICE_NAME, "ForceIncidentRoleHandover"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CancelIncidentRoleHandoverRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      getCancelIncidentRoleHandoverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelIncidentRoleHandover",
      requestType = com.google.irm.service.v1alpha2.api.CancelIncidentRoleHandoverRequest.class,
      responseType = com.google.irm.service.v1alpha2.api.IncidentRoleAssignment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.irm.service.v1alpha2.api.CancelIncidentRoleHandoverRequest,
          com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
      getCancelIncidentRoleHandoverMethod() {
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
                          generateFullMethodName(SERVICE_NAME, "CancelIncidentRoleHandover"))
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
      asyncUnimplementedUnaryCall(getCreateIncidentMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getGetIncidentMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getSearchIncidentsMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getUpdateIncidentMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getSearchSimilarIncidentsMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getCreateAnnotationMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getListAnnotationsMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getCreateTagMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getDeleteTagMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getListTagsMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getCreateSignalMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists signals that are part of an incident.
     * Signals are returned in reverse chronological order.
     * Note that search should not be relied on for critical functionality.  It
     * has lower availability guarantees and might fail to return valid results.
     * Returned results might include stale or extraneous entries.
     * </pre>
     */
    public void searchSignals(
        com.google.irm.service.v1alpha2.api.SearchSignalsRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.SearchSignalsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getSearchSignalsMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getLookupSignalMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getGetSignalMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getUpdateSignalMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getEscalateIncidentMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getCreateArtifactMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getListArtifactsMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getUpdateArtifactMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getDeleteArtifactMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getSendShiftHandoffMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getCreateSubscriptionMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getUpdateSubscriptionMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getListSubscriptionsMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getDeleteSubscriptionMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getCreateIncidentRoleAssignmentMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getDeleteIncidentRoleAssignmentMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getListIncidentRoleAssignmentsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Starts a role handover. The proposed assignee will receive an email
     * notifying them of the assignment. This will fail if a role handover is
     * already pending.
     * Handover to an oncall ladder is not permitted. Use
     * CreateIncidentRoleAssignment instead.
     * </pre>
     */
    public void requestIncidentRoleHandover(
        com.google.irm.service.v1alpha2.api.RequestIncidentRoleHandoverRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
            responseObserver) {
      asyncUnimplementedUnaryCall(getRequestIncidentRoleHandoverMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getConfirmIncidentRoleHandoverMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getForceIncidentRoleHandoverMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getCancelIncidentRoleHandoverMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getCreateIncidentMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.CreateIncidentRequest,
                      com.google.irm.service.v1alpha2.api.Incident>(
                      this, METHODID_CREATE_INCIDENT)))
          .addMethod(
              getGetIncidentMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.GetIncidentRequest,
                      com.google.irm.service.v1alpha2.api.Incident>(this, METHODID_GET_INCIDENT)))
          .addMethod(
              getSearchIncidentsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.SearchIncidentsRequest,
                      com.google.irm.service.v1alpha2.api.SearchIncidentsResponse>(
                      this, METHODID_SEARCH_INCIDENTS)))
          .addMethod(
              getUpdateIncidentMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.UpdateIncidentRequest,
                      com.google.irm.service.v1alpha2.api.Incident>(
                      this, METHODID_UPDATE_INCIDENT)))
          .addMethod(
              getSearchSimilarIncidentsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsRequest,
                      com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsResponse>(
                      this, METHODID_SEARCH_SIMILAR_INCIDENTS)))
          .addMethod(
              getCreateAnnotationMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.CreateAnnotationRequest,
                      com.google.irm.service.v1alpha2.api.Annotation>(
                      this, METHODID_CREATE_ANNOTATION)))
          .addMethod(
              getListAnnotationsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.ListAnnotationsRequest,
                      com.google.irm.service.v1alpha2.api.ListAnnotationsResponse>(
                      this, METHODID_LIST_ANNOTATIONS)))
          .addMethod(
              getCreateTagMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.CreateTagRequest,
                      com.google.irm.service.v1alpha2.api.Tag>(this, METHODID_CREATE_TAG)))
          .addMethod(
              getDeleteTagMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.DeleteTagRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_TAG)))
          .addMethod(
              getListTagsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.ListTagsRequest,
                      com.google.irm.service.v1alpha2.api.ListTagsResponse>(
                      this, METHODID_LIST_TAGS)))
          .addMethod(
              getCreateSignalMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.CreateSignalRequest,
                      com.google.irm.service.v1alpha2.api.Signal>(this, METHODID_CREATE_SIGNAL)))
          .addMethod(
              getSearchSignalsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.SearchSignalsRequest,
                      com.google.irm.service.v1alpha2.api.SearchSignalsResponse>(
                      this, METHODID_SEARCH_SIGNALS)))
          .addMethod(
              getLookupSignalMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.LookupSignalRequest,
                      com.google.irm.service.v1alpha2.api.Signal>(this, METHODID_LOOKUP_SIGNAL)))
          .addMethod(
              getGetSignalMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.GetSignalRequest,
                      com.google.irm.service.v1alpha2.api.Signal>(this, METHODID_GET_SIGNAL)))
          .addMethod(
              getUpdateSignalMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.UpdateSignalRequest,
                      com.google.irm.service.v1alpha2.api.Signal>(this, METHODID_UPDATE_SIGNAL)))
          .addMethod(
              getEscalateIncidentMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.EscalateIncidentRequest,
                      com.google.irm.service.v1alpha2.api.EscalateIncidentResponse>(
                      this, METHODID_ESCALATE_INCIDENT)))
          .addMethod(
              getCreateArtifactMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.CreateArtifactRequest,
                      com.google.irm.service.v1alpha2.api.Artifact>(
                      this, METHODID_CREATE_ARTIFACT)))
          .addMethod(
              getListArtifactsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.ListArtifactsRequest,
                      com.google.irm.service.v1alpha2.api.ListArtifactsResponse>(
                      this, METHODID_LIST_ARTIFACTS)))
          .addMethod(
              getUpdateArtifactMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.UpdateArtifactRequest,
                      com.google.irm.service.v1alpha2.api.Artifact>(
                      this, METHODID_UPDATE_ARTIFACT)))
          .addMethod(
              getDeleteArtifactMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.DeleteArtifactRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_ARTIFACT)))
          .addMethod(
              getSendShiftHandoffMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.SendShiftHandoffRequest,
                      com.google.irm.service.v1alpha2.api.SendShiftHandoffResponse>(
                      this, METHODID_SEND_SHIFT_HANDOFF)))
          .addMethod(
              getCreateSubscriptionMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.CreateSubscriptionRequest,
                      com.google.irm.service.v1alpha2.api.Subscription>(
                      this, METHODID_CREATE_SUBSCRIPTION)))
          .addMethod(
              getUpdateSubscriptionMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.UpdateSubscriptionRequest,
                      com.google.irm.service.v1alpha2.api.Subscription>(
                      this, METHODID_UPDATE_SUBSCRIPTION)))
          .addMethod(
              getListSubscriptionsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.ListSubscriptionsRequest,
                      com.google.irm.service.v1alpha2.api.ListSubscriptionsResponse>(
                      this, METHODID_LIST_SUBSCRIPTIONS)))
          .addMethod(
              getDeleteSubscriptionMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.DeleteSubscriptionRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_SUBSCRIPTION)))
          .addMethod(
              getCreateIncidentRoleAssignmentMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest,
                      com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>(
                      this, METHODID_CREATE_INCIDENT_ROLE_ASSIGNMENT)))
          .addMethod(
              getDeleteIncidentRoleAssignmentMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.DeleteIncidentRoleAssignmentRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_INCIDENT_ROLE_ASSIGNMENT)))
          .addMethod(
              getListIncidentRoleAssignmentsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsRequest,
                      com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsResponse>(
                      this, METHODID_LIST_INCIDENT_ROLE_ASSIGNMENTS)))
          .addMethod(
              getRequestIncidentRoleHandoverMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.RequestIncidentRoleHandoverRequest,
                      com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>(
                      this, METHODID_REQUEST_INCIDENT_ROLE_HANDOVER)))
          .addMethod(
              getConfirmIncidentRoleHandoverMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.ConfirmIncidentRoleHandoverRequest,
                      com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>(
                      this, METHODID_CONFIRM_INCIDENT_ROLE_HANDOVER)))
          .addMethod(
              getForceIncidentRoleHandoverMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest,
                      com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>(
                      this, METHODID_FORCE_INCIDENT_ROLE_HANDOVER)))
          .addMethod(
              getCancelIncidentRoleHandoverMethod(),
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
          getChannel().newCall(getCreateIncidentMethod(), getCallOptions()),
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
          getChannel().newCall(getGetIncidentMethod(), getCallOptions()),
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
          getChannel().newCall(getSearchIncidentsMethod(), getCallOptions()),
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
          getChannel().newCall(getUpdateIncidentMethod(), getCallOptions()),
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
          getChannel().newCall(getSearchSimilarIncidentsMethod(), getCallOptions()),
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
          getChannel().newCall(getCreateAnnotationMethod(), getCallOptions()),
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
          getChannel().newCall(getListAnnotationsMethod(), getCallOptions()),
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
          getChannel().newCall(getCreateTagMethod(), getCallOptions()), request, responseObserver);
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
          getChannel().newCall(getDeleteTagMethod(), getCallOptions()), request, responseObserver);
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
          getChannel().newCall(getListTagsMethod(), getCallOptions()), request, responseObserver);
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
          getChannel().newCall(getCreateSignalMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists signals that are part of an incident.
     * Signals are returned in reverse chronological order.
     * Note that search should not be relied on for critical functionality.  It
     * has lower availability guarantees and might fail to return valid results.
     * Returned results might include stale or extraneous entries.
     * </pre>
     */
    public void searchSignals(
        com.google.irm.service.v1alpha2.api.SearchSignalsRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.SearchSignalsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchSignalsMethod(), getCallOptions()),
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
          getChannel().newCall(getLookupSignalMethod(), getCallOptions()),
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
          getChannel().newCall(getGetSignalMethod(), getCallOptions()), request, responseObserver);
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
          getChannel().newCall(getUpdateSignalMethod(), getCallOptions()),
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
          getChannel().newCall(getEscalateIncidentMethod(), getCallOptions()),
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
          getChannel().newCall(getCreateArtifactMethod(), getCallOptions()),
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
          getChannel().newCall(getListArtifactsMethod(), getCallOptions()),
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
          getChannel().newCall(getUpdateArtifactMethod(), getCallOptions()),
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
          getChannel().newCall(getDeleteArtifactMethod(), getCallOptions()),
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
          getChannel().newCall(getSendShiftHandoffMethod(), getCallOptions()),
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
          getChannel().newCall(getCreateSubscriptionMethod(), getCallOptions()),
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
          getChannel().newCall(getUpdateSubscriptionMethod(), getCallOptions()),
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
          getChannel().newCall(getListSubscriptionsMethod(), getCallOptions()),
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
          getChannel().newCall(getDeleteSubscriptionMethod(), getCallOptions()),
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
          getChannel().newCall(getCreateIncidentRoleAssignmentMethod(), getCallOptions()),
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
          getChannel().newCall(getDeleteIncidentRoleAssignmentMethod(), getCallOptions()),
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
          getChannel().newCall(getListIncidentRoleAssignmentsMethod(), getCallOptions()),
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
     * Handover to an oncall ladder is not permitted. Use
     * CreateIncidentRoleAssignment instead.
     * </pre>
     */
    public void requestIncidentRoleHandover(
        com.google.irm.service.v1alpha2.api.RequestIncidentRoleHandoverRequest request,
        io.grpc.stub.StreamObserver<com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRequestIncidentRoleHandoverMethod(), getCallOptions()),
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
          getChannel().newCall(getConfirmIncidentRoleHandoverMethod(), getCallOptions()),
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
          getChannel().newCall(getForceIncidentRoleHandoverMethod(), getCallOptions()),
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
          getChannel().newCall(getCancelIncidentRoleHandoverMethod(), getCallOptions()),
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
      return blockingUnaryCall(getChannel(), getCreateIncidentMethod(), getCallOptions(), request);
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
      return blockingUnaryCall(getChannel(), getGetIncidentMethod(), getCallOptions(), request);
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
      return blockingUnaryCall(getChannel(), getSearchIncidentsMethod(), getCallOptions(), request);
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
      return blockingUnaryCall(getChannel(), getUpdateIncidentMethod(), getCallOptions(), request);
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
          getChannel(), getSearchSimilarIncidentsMethod(), getCallOptions(), request);
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
          getChannel(), getCreateAnnotationMethod(), getCallOptions(), request);
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
      return blockingUnaryCall(getChannel(), getListAnnotationsMethod(), getCallOptions(), request);
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
      return blockingUnaryCall(getChannel(), getCreateTagMethod(), getCallOptions(), request);
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
      return blockingUnaryCall(getChannel(), getDeleteTagMethod(), getCallOptions(), request);
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
      return blockingUnaryCall(getChannel(), getListTagsMethod(), getCallOptions(), request);
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
      return blockingUnaryCall(getChannel(), getCreateSignalMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists signals that are part of an incident.
     * Signals are returned in reverse chronological order.
     * Note that search should not be relied on for critical functionality.  It
     * has lower availability guarantees and might fail to return valid results.
     * Returned results might include stale or extraneous entries.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.SearchSignalsResponse searchSignals(
        com.google.irm.service.v1alpha2.api.SearchSignalsRequest request) {
      return blockingUnaryCall(getChannel(), getSearchSignalsMethod(), getCallOptions(), request);
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
      return blockingUnaryCall(getChannel(), getLookupSignalMethod(), getCallOptions(), request);
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
      return blockingUnaryCall(getChannel(), getGetSignalMethod(), getCallOptions(), request);
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
      return blockingUnaryCall(getChannel(), getUpdateSignalMethod(), getCallOptions(), request);
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
          getChannel(), getEscalateIncidentMethod(), getCallOptions(), request);
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
      return blockingUnaryCall(getChannel(), getCreateArtifactMethod(), getCallOptions(), request);
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
      return blockingUnaryCall(getChannel(), getListArtifactsMethod(), getCallOptions(), request);
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
      return blockingUnaryCall(getChannel(), getUpdateArtifactMethod(), getCallOptions(), request);
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
      return blockingUnaryCall(getChannel(), getDeleteArtifactMethod(), getCallOptions(), request);
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
          getChannel(), getSendShiftHandoffMethod(), getCallOptions(), request);
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
          getChannel(), getCreateSubscriptionMethod(), getCallOptions(), request);
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
          getChannel(), getUpdateSubscriptionMethod(), getCallOptions(), request);
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
          getChannel(), getListSubscriptionsMethod(), getCallOptions(), request);
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
          getChannel(), getDeleteSubscriptionMethod(), getCallOptions(), request);
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
          getChannel(), getCreateIncidentRoleAssignmentMethod(), getCallOptions(), request);
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
          getChannel(), getDeleteIncidentRoleAssignmentMethod(), getCallOptions(), request);
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
          getChannel(), getListIncidentRoleAssignmentsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Starts a role handover. The proposed assignee will receive an email
     * notifying them of the assignment. This will fail if a role handover is
     * already pending.
     * Handover to an oncall ladder is not permitted. Use
     * CreateIncidentRoleAssignment instead.
     * </pre>
     */
    public com.google.irm.service.v1alpha2.api.IncidentRoleAssignment requestIncidentRoleHandover(
        com.google.irm.service.v1alpha2.api.RequestIncidentRoleHandoverRequest request) {
      return blockingUnaryCall(
          getChannel(), getRequestIncidentRoleHandoverMethod(), getCallOptions(), request);
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
          getChannel(), getConfirmIncidentRoleHandoverMethod(), getCallOptions(), request);
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
          getChannel(), getForceIncidentRoleHandoverMethod(), getCallOptions(), request);
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
          getChannel(), getCancelIncidentRoleHandoverMethod(), getCallOptions(), request);
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
          getChannel().newCall(getCreateIncidentMethod(), getCallOptions()), request);
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
          getChannel().newCall(getGetIncidentMethod(), getCallOptions()), request);
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
          getChannel().newCall(getSearchIncidentsMethod(), getCallOptions()), request);
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
          getChannel().newCall(getUpdateIncidentMethod(), getCallOptions()), request);
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
          getChannel().newCall(getSearchSimilarIncidentsMethod(), getCallOptions()), request);
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
          getChannel().newCall(getCreateAnnotationMethod(), getCallOptions()), request);
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
          getChannel().newCall(getListAnnotationsMethod(), getCallOptions()), request);
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
      return futureUnaryCall(getChannel().newCall(getCreateTagMethod(), getCallOptions()), request);
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
      return futureUnaryCall(getChannel().newCall(getDeleteTagMethod(), getCallOptions()), request);
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
      return futureUnaryCall(getChannel().newCall(getListTagsMethod(), getCallOptions()), request);
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
          getChannel().newCall(getCreateSignalMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists signals that are part of an incident.
     * Signals are returned in reverse chronological order.
     * Note that search should not be relied on for critical functionality.  It
     * has lower availability guarantees and might fail to return valid results.
     * Returned results might include stale or extraneous entries.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.SearchSignalsResponse>
        searchSignals(com.google.irm.service.v1alpha2.api.SearchSignalsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchSignalsMethod(), getCallOptions()), request);
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
          getChannel().newCall(getLookupSignalMethod(), getCallOptions()), request);
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
      return futureUnaryCall(getChannel().newCall(getGetSignalMethod(), getCallOptions()), request);
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
          getChannel().newCall(getUpdateSignalMethod(), getCallOptions()), request);
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
          getChannel().newCall(getEscalateIncidentMethod(), getCallOptions()), request);
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
          getChannel().newCall(getCreateArtifactMethod(), getCallOptions()), request);
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
          getChannel().newCall(getListArtifactsMethod(), getCallOptions()), request);
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
          getChannel().newCall(getUpdateArtifactMethod(), getCallOptions()), request);
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
          getChannel().newCall(getDeleteArtifactMethod(), getCallOptions()), request);
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
          getChannel().newCall(getSendShiftHandoffMethod(), getCallOptions()), request);
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
          getChannel().newCall(getCreateSubscriptionMethod(), getCallOptions()), request);
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
          getChannel().newCall(getUpdateSubscriptionMethod(), getCallOptions()), request);
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
          getChannel().newCall(getListSubscriptionsMethod(), getCallOptions()), request);
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
          getChannel().newCall(getDeleteSubscriptionMethod(), getCallOptions()), request);
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
          getChannel().newCall(getCreateIncidentRoleAssignmentMethod(), getCallOptions()), request);
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
          getChannel().newCall(getDeleteIncidentRoleAssignmentMethod(), getCallOptions()), request);
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
          getChannel().newCall(getListIncidentRoleAssignmentsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Starts a role handover. The proposed assignee will receive an email
     * notifying them of the assignment. This will fail if a role handover is
     * already pending.
     * Handover to an oncall ladder is not permitted. Use
     * CreateIncidentRoleAssignment instead.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.irm.service.v1alpha2.api.IncidentRoleAssignment>
        requestIncidentRoleHandover(
            com.google.irm.service.v1alpha2.api.RequestIncidentRoleHandoverRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRequestIncidentRoleHandoverMethod(), getCallOptions()), request);
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
          getChannel().newCall(getConfirmIncidentRoleHandoverMethod(), getCallOptions()), request);
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
          getChannel().newCall(getForceIncidentRoleHandoverMethod(), getCallOptions()), request);
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
          getChannel().newCall(getCancelIncidentRoleHandoverMethod(), getCallOptions()), request);
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
                      .addMethod(getCreateIncidentMethod())
                      .addMethod(getGetIncidentMethod())
                      .addMethod(getSearchIncidentsMethod())
                      .addMethod(getUpdateIncidentMethod())
                      .addMethod(getSearchSimilarIncidentsMethod())
                      .addMethod(getCreateAnnotationMethod())
                      .addMethod(getListAnnotationsMethod())
                      .addMethod(getCreateTagMethod())
                      .addMethod(getDeleteTagMethod())
                      .addMethod(getListTagsMethod())
                      .addMethod(getCreateSignalMethod())
                      .addMethod(getSearchSignalsMethod())
                      .addMethod(getLookupSignalMethod())
                      .addMethod(getGetSignalMethod())
                      .addMethod(getUpdateSignalMethod())
                      .addMethod(getEscalateIncidentMethod())
                      .addMethod(getCreateArtifactMethod())
                      .addMethod(getListArtifactsMethod())
                      .addMethod(getUpdateArtifactMethod())
                      .addMethod(getDeleteArtifactMethod())
                      .addMethod(getSendShiftHandoffMethod())
                      .addMethod(getCreateSubscriptionMethod())
                      .addMethod(getUpdateSubscriptionMethod())
                      .addMethod(getListSubscriptionsMethod())
                      .addMethod(getDeleteSubscriptionMethod())
                      .addMethod(getCreateIncidentRoleAssignmentMethod())
                      .addMethod(getDeleteIncidentRoleAssignmentMethod())
                      .addMethod(getListIncidentRoleAssignmentsMethod())
                      .addMethod(getRequestIncidentRoleHandoverMethod())
                      .addMethod(getConfirmIncidentRoleHandoverMethod())
                      .addMethod(getForceIncidentRoleHandoverMethod())
                      .addMethod(getCancelIncidentRoleHandoverMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
