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
package com.google.cloud.irm.v1alpha2.stub;

import static com.google.cloud.irm.v1alpha2.IncidentServiceClient.ListAnnotationsPagedResponse;
import static com.google.cloud.irm.v1alpha2.IncidentServiceClient.ListArtifactsPagedResponse;
import static com.google.cloud.irm.v1alpha2.IncidentServiceClient.ListIncidentRoleAssignmentsPagedResponse;
import static com.google.cloud.irm.v1alpha2.IncidentServiceClient.ListSubscriptionsPagedResponse;
import static com.google.cloud.irm.v1alpha2.IncidentServiceClient.ListTagsPagedResponse;
import static com.google.cloud.irm.v1alpha2.IncidentServiceClient.SearchIncidentsPagedResponse;
import static com.google.cloud.irm.v1alpha2.IncidentServiceClient.SearchSignalsPagedResponse;
import static com.google.cloud.irm.v1alpha2.IncidentServiceClient.SearchSimilarIncidentsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
import com.google.irm.service.v1alpha2.api.Annotation;
import com.google.irm.service.v1alpha2.api.Artifact;
import com.google.irm.service.v1alpha2.api.CancelIncidentRoleHandoverRequest;
import com.google.irm.service.v1alpha2.api.ConfirmIncidentRoleHandoverRequest;
import com.google.irm.service.v1alpha2.api.CreateAnnotationRequest;
import com.google.irm.service.v1alpha2.api.CreateArtifactRequest;
import com.google.irm.service.v1alpha2.api.CreateIncidentRequest;
import com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest;
import com.google.irm.service.v1alpha2.api.CreateSignalRequest;
import com.google.irm.service.v1alpha2.api.CreateSubscriptionRequest;
import com.google.irm.service.v1alpha2.api.CreateTagRequest;
import com.google.irm.service.v1alpha2.api.DeleteArtifactRequest;
import com.google.irm.service.v1alpha2.api.DeleteIncidentRoleAssignmentRequest;
import com.google.irm.service.v1alpha2.api.DeleteSubscriptionRequest;
import com.google.irm.service.v1alpha2.api.DeleteTagRequest;
import com.google.irm.service.v1alpha2.api.EscalateIncidentRequest;
import com.google.irm.service.v1alpha2.api.EscalateIncidentResponse;
import com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest;
import com.google.irm.service.v1alpha2.api.GetIncidentRequest;
import com.google.irm.service.v1alpha2.api.GetSignalRequest;
import com.google.irm.service.v1alpha2.api.Incident;
import com.google.irm.service.v1alpha2.api.IncidentRoleAssignment;
import com.google.irm.service.v1alpha2.api.ListAnnotationsRequest;
import com.google.irm.service.v1alpha2.api.ListAnnotationsResponse;
import com.google.irm.service.v1alpha2.api.ListArtifactsRequest;
import com.google.irm.service.v1alpha2.api.ListArtifactsResponse;
import com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsRequest;
import com.google.irm.service.v1alpha2.api.ListIncidentRoleAssignmentsResponse;
import com.google.irm.service.v1alpha2.api.ListSubscriptionsRequest;
import com.google.irm.service.v1alpha2.api.ListSubscriptionsResponse;
import com.google.irm.service.v1alpha2.api.ListTagsRequest;
import com.google.irm.service.v1alpha2.api.ListTagsResponse;
import com.google.irm.service.v1alpha2.api.LookupSignalRequest;
import com.google.irm.service.v1alpha2.api.RequestIncidentRoleHandoverRequest;
import com.google.irm.service.v1alpha2.api.SearchIncidentsRequest;
import com.google.irm.service.v1alpha2.api.SearchIncidentsResponse;
import com.google.irm.service.v1alpha2.api.SearchSignalsRequest;
import com.google.irm.service.v1alpha2.api.SearchSignalsResponse;
import com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsRequest;
import com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsResponse;
import com.google.irm.service.v1alpha2.api.SendShiftHandoffRequest;
import com.google.irm.service.v1alpha2.api.SendShiftHandoffResponse;
import com.google.irm.service.v1alpha2.api.Signal;
import com.google.irm.service.v1alpha2.api.Subscription;
import com.google.irm.service.v1alpha2.api.Tag;
import com.google.irm.service.v1alpha2.api.UpdateArtifactRequest;
import com.google.irm.service.v1alpha2.api.UpdateIncidentRequest;
import com.google.irm.service.v1alpha2.api.UpdateSignalRequest;
import com.google.irm.service.v1alpha2.api.UpdateSubscriptionRequest;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for Stackdriver Incident Response & Management API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class GrpcIncidentServiceStub extends IncidentServiceStub {

  private static final MethodDescriptor<CreateIncidentRequest, Incident>
      createIncidentMethodDescriptor =
          MethodDescriptor.<CreateIncidentRequest, Incident>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.irm.v1alpha2.IncidentService/CreateIncident")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateIncidentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Incident.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<GetIncidentRequest, Incident> getIncidentMethodDescriptor =
      MethodDescriptor.<GetIncidentRequest, Incident>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.irm.v1alpha2.IncidentService/GetIncident")
          .setRequestMarshaller(ProtoUtils.marshaller(GetIncidentRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Incident.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<SearchIncidentsRequest, SearchIncidentsResponse>
      searchIncidentsMethodDescriptor =
          MethodDescriptor.<SearchIncidentsRequest, SearchIncidentsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.irm.v1alpha2.IncidentService/SearchIncidents")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(SearchIncidentsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(SearchIncidentsResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<UpdateIncidentRequest, Incident>
      updateIncidentMethodDescriptor =
          MethodDescriptor.<UpdateIncidentRequest, Incident>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.irm.v1alpha2.IncidentService/UpdateIncident")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateIncidentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Incident.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<
          SearchSimilarIncidentsRequest, SearchSimilarIncidentsResponse>
      searchSimilarIncidentsMethodDescriptor =
          MethodDescriptor
              .<SearchSimilarIncidentsRequest, SearchSimilarIncidentsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.irm.v1alpha2.IncidentService/SearchSimilarIncidents")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(SearchSimilarIncidentsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(SearchSimilarIncidentsResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<CreateAnnotationRequest, Annotation>
      createAnnotationMethodDescriptor =
          MethodDescriptor.<CreateAnnotationRequest, Annotation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.irm.v1alpha2.IncidentService/CreateAnnotation")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateAnnotationRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Annotation.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<ListAnnotationsRequest, ListAnnotationsResponse>
      listAnnotationsMethodDescriptor =
          MethodDescriptor.<ListAnnotationsRequest, ListAnnotationsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.irm.v1alpha2.IncidentService/ListAnnotations")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListAnnotationsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListAnnotationsResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<CreateTagRequest, Tag> createTagMethodDescriptor =
      MethodDescriptor.<CreateTagRequest, Tag>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.irm.v1alpha2.IncidentService/CreateTag")
          .setRequestMarshaller(ProtoUtils.marshaller(CreateTagRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Tag.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<DeleteTagRequest, Empty> deleteTagMethodDescriptor =
      MethodDescriptor.<DeleteTagRequest, Empty>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.irm.v1alpha2.IncidentService/DeleteTag")
          .setRequestMarshaller(ProtoUtils.marshaller(DeleteTagRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<ListTagsRequest, ListTagsResponse>
      listTagsMethodDescriptor =
          MethodDescriptor.<ListTagsRequest, ListTagsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.irm.v1alpha2.IncidentService/ListTags")
              .setRequestMarshaller(ProtoUtils.marshaller(ListTagsRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(ListTagsResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<CreateSignalRequest, Signal> createSignalMethodDescriptor =
      MethodDescriptor.<CreateSignalRequest, Signal>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.irm.v1alpha2.IncidentService/CreateSignal")
          .setRequestMarshaller(ProtoUtils.marshaller(CreateSignalRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Signal.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<SearchSignalsRequest, SearchSignalsResponse>
      searchSignalsMethodDescriptor =
          MethodDescriptor.<SearchSignalsRequest, SearchSignalsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.irm.v1alpha2.IncidentService/SearchSignals")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(SearchSignalsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(SearchSignalsResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<GetSignalRequest, Signal> getSignalMethodDescriptor =
      MethodDescriptor.<GetSignalRequest, Signal>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.irm.v1alpha2.IncidentService/GetSignal")
          .setRequestMarshaller(ProtoUtils.marshaller(GetSignalRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Signal.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<LookupSignalRequest, Signal> lookupSignalMethodDescriptor =
      MethodDescriptor.<LookupSignalRequest, Signal>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.irm.v1alpha2.IncidentService/LookupSignal")
          .setRequestMarshaller(ProtoUtils.marshaller(LookupSignalRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Signal.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<UpdateSignalRequest, Signal> updateSignalMethodDescriptor =
      MethodDescriptor.<UpdateSignalRequest, Signal>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.irm.v1alpha2.IncidentService/UpdateSignal")
          .setRequestMarshaller(ProtoUtils.marshaller(UpdateSignalRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Signal.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<EscalateIncidentRequest, EscalateIncidentResponse>
      escalateIncidentMethodDescriptor =
          MethodDescriptor.<EscalateIncidentRequest, EscalateIncidentResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.irm.v1alpha2.IncidentService/EscalateIncident")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(EscalateIncidentRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(EscalateIncidentResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<CreateArtifactRequest, Artifact>
      createArtifactMethodDescriptor =
          MethodDescriptor.<CreateArtifactRequest, Artifact>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.irm.v1alpha2.IncidentService/CreateArtifact")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateArtifactRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Artifact.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<ListArtifactsRequest, ListArtifactsResponse>
      listArtifactsMethodDescriptor =
          MethodDescriptor.<ListArtifactsRequest, ListArtifactsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.irm.v1alpha2.IncidentService/ListArtifacts")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListArtifactsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListArtifactsResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<UpdateArtifactRequest, Artifact>
      updateArtifactMethodDescriptor =
          MethodDescriptor.<UpdateArtifactRequest, Artifact>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.irm.v1alpha2.IncidentService/UpdateArtifact")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateArtifactRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Artifact.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<DeleteArtifactRequest, Empty>
      deleteArtifactMethodDescriptor =
          MethodDescriptor.<DeleteArtifactRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.irm.v1alpha2.IncidentService/DeleteArtifact")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteArtifactRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<SendShiftHandoffRequest, SendShiftHandoffResponse>
      sendShiftHandoffMethodDescriptor =
          MethodDescriptor.<SendShiftHandoffRequest, SendShiftHandoffResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.irm.v1alpha2.IncidentService/SendShiftHandoff")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(SendShiftHandoffRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(SendShiftHandoffResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<CreateSubscriptionRequest, Subscription>
      createSubscriptionMethodDescriptor =
          MethodDescriptor.<CreateSubscriptionRequest, Subscription>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.irm.v1alpha2.IncidentService/CreateSubscription")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Subscription.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<UpdateSubscriptionRequest, Subscription>
      updateSubscriptionMethodDescriptor =
          MethodDescriptor.<UpdateSubscriptionRequest, Subscription>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.irm.v1alpha2.IncidentService/UpdateSubscription")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Subscription.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<ListSubscriptionsRequest, ListSubscriptionsResponse>
      listSubscriptionsMethodDescriptor =
          MethodDescriptor.<ListSubscriptionsRequest, ListSubscriptionsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.irm.v1alpha2.IncidentService/ListSubscriptions")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListSubscriptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListSubscriptionsResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<DeleteSubscriptionRequest, Empty>
      deleteSubscriptionMethodDescriptor =
          MethodDescriptor.<DeleteSubscriptionRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.irm.v1alpha2.IncidentService/DeleteSubscription")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<CreateIncidentRoleAssignmentRequest, IncidentRoleAssignment>
      createIncidentRoleAssignmentMethodDescriptor =
          MethodDescriptor.<CreateIncidentRoleAssignmentRequest, IncidentRoleAssignment>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.irm.v1alpha2.IncidentService/CreateIncidentRoleAssignment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateIncidentRoleAssignmentRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(IncidentRoleAssignment.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<DeleteIncidentRoleAssignmentRequest, Empty>
      deleteIncidentRoleAssignmentMethodDescriptor =
          MethodDescriptor.<DeleteIncidentRoleAssignmentRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.irm.v1alpha2.IncidentService/DeleteIncidentRoleAssignment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteIncidentRoleAssignmentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<
          ListIncidentRoleAssignmentsRequest, ListIncidentRoleAssignmentsResponse>
      listIncidentRoleAssignmentsMethodDescriptor =
          MethodDescriptor
              .<ListIncidentRoleAssignmentsRequest, ListIncidentRoleAssignmentsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.irm.v1alpha2.IncidentService/ListIncidentRoleAssignments")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListIncidentRoleAssignmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListIncidentRoleAssignmentsResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<RequestIncidentRoleHandoverRequest, IncidentRoleAssignment>
      requestIncidentRoleHandoverMethodDescriptor =
          MethodDescriptor.<RequestIncidentRoleHandoverRequest, IncidentRoleAssignment>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.irm.v1alpha2.IncidentService/RequestIncidentRoleHandover")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(RequestIncidentRoleHandoverRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(IncidentRoleAssignment.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<ConfirmIncidentRoleHandoverRequest, IncidentRoleAssignment>
      confirmIncidentRoleHandoverMethodDescriptor =
          MethodDescriptor.<ConfirmIncidentRoleHandoverRequest, IncidentRoleAssignment>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.irm.v1alpha2.IncidentService/ConfirmIncidentRoleHandover")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ConfirmIncidentRoleHandoverRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(IncidentRoleAssignment.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<ForceIncidentRoleHandoverRequest, IncidentRoleAssignment>
      forceIncidentRoleHandoverMethodDescriptor =
          MethodDescriptor.<ForceIncidentRoleHandoverRequest, IncidentRoleAssignment>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.irm.v1alpha2.IncidentService/ForceIncidentRoleHandover")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ForceIncidentRoleHandoverRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(IncidentRoleAssignment.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<CancelIncidentRoleHandoverRequest, IncidentRoleAssignment>
      cancelIncidentRoleHandoverMethodDescriptor =
          MethodDescriptor.<CancelIncidentRoleHandoverRequest, IncidentRoleAssignment>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.irm.v1alpha2.IncidentService/CancelIncidentRoleHandover")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CancelIncidentRoleHandoverRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(IncidentRoleAssignment.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<CreateIncidentRequest, Incident> createIncidentCallable;
  private final UnaryCallable<GetIncidentRequest, Incident> getIncidentCallable;
  private final UnaryCallable<SearchIncidentsRequest, SearchIncidentsResponse>
      searchIncidentsCallable;
  private final UnaryCallable<SearchIncidentsRequest, SearchIncidentsPagedResponse>
      searchIncidentsPagedCallable;
  private final UnaryCallable<UpdateIncidentRequest, Incident> updateIncidentCallable;
  private final UnaryCallable<SearchSimilarIncidentsRequest, SearchSimilarIncidentsResponse>
      searchSimilarIncidentsCallable;
  private final UnaryCallable<SearchSimilarIncidentsRequest, SearchSimilarIncidentsPagedResponse>
      searchSimilarIncidentsPagedCallable;
  private final UnaryCallable<CreateAnnotationRequest, Annotation> createAnnotationCallable;
  private final UnaryCallable<ListAnnotationsRequest, ListAnnotationsResponse>
      listAnnotationsCallable;
  private final UnaryCallable<ListAnnotationsRequest, ListAnnotationsPagedResponse>
      listAnnotationsPagedCallable;
  private final UnaryCallable<CreateTagRequest, Tag> createTagCallable;
  private final UnaryCallable<DeleteTagRequest, Empty> deleteTagCallable;
  private final UnaryCallable<ListTagsRequest, ListTagsResponse> listTagsCallable;
  private final UnaryCallable<ListTagsRequest, ListTagsPagedResponse> listTagsPagedCallable;
  private final UnaryCallable<CreateSignalRequest, Signal> createSignalCallable;
  private final UnaryCallable<SearchSignalsRequest, SearchSignalsResponse> searchSignalsCallable;
  private final UnaryCallable<SearchSignalsRequest, SearchSignalsPagedResponse>
      searchSignalsPagedCallable;
  private final UnaryCallable<GetSignalRequest, Signal> getSignalCallable;
  private final UnaryCallable<LookupSignalRequest, Signal> lookupSignalCallable;
  private final UnaryCallable<UpdateSignalRequest, Signal> updateSignalCallable;
  private final UnaryCallable<EscalateIncidentRequest, EscalateIncidentResponse>
      escalateIncidentCallable;
  private final UnaryCallable<CreateArtifactRequest, Artifact> createArtifactCallable;
  private final UnaryCallable<ListArtifactsRequest, ListArtifactsResponse> listArtifactsCallable;
  private final UnaryCallable<ListArtifactsRequest, ListArtifactsPagedResponse>
      listArtifactsPagedCallable;
  private final UnaryCallable<UpdateArtifactRequest, Artifact> updateArtifactCallable;
  private final UnaryCallable<DeleteArtifactRequest, Empty> deleteArtifactCallable;
  private final UnaryCallable<SendShiftHandoffRequest, SendShiftHandoffResponse>
      sendShiftHandoffCallable;
  private final UnaryCallable<CreateSubscriptionRequest, Subscription> createSubscriptionCallable;
  private final UnaryCallable<UpdateSubscriptionRequest, Subscription> updateSubscriptionCallable;
  private final UnaryCallable<ListSubscriptionsRequest, ListSubscriptionsResponse>
      listSubscriptionsCallable;
  private final UnaryCallable<ListSubscriptionsRequest, ListSubscriptionsPagedResponse>
      listSubscriptionsPagedCallable;
  private final UnaryCallable<DeleteSubscriptionRequest, Empty> deleteSubscriptionCallable;
  private final UnaryCallable<CreateIncidentRoleAssignmentRequest, IncidentRoleAssignment>
      createIncidentRoleAssignmentCallable;
  private final UnaryCallable<DeleteIncidentRoleAssignmentRequest, Empty>
      deleteIncidentRoleAssignmentCallable;
  private final UnaryCallable<
          ListIncidentRoleAssignmentsRequest, ListIncidentRoleAssignmentsResponse>
      listIncidentRoleAssignmentsCallable;
  private final UnaryCallable<
          ListIncidentRoleAssignmentsRequest, ListIncidentRoleAssignmentsPagedResponse>
      listIncidentRoleAssignmentsPagedCallable;
  private final UnaryCallable<RequestIncidentRoleHandoverRequest, IncidentRoleAssignment>
      requestIncidentRoleHandoverCallable;
  private final UnaryCallable<ConfirmIncidentRoleHandoverRequest, IncidentRoleAssignment>
      confirmIncidentRoleHandoverCallable;
  private final UnaryCallable<ForceIncidentRoleHandoverRequest, IncidentRoleAssignment>
      forceIncidentRoleHandoverCallable;
  private final UnaryCallable<CancelIncidentRoleHandoverRequest, IncidentRoleAssignment>
      cancelIncidentRoleHandoverCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcIncidentServiceStub create(IncidentServiceStubSettings settings)
      throws IOException {
    return new GrpcIncidentServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcIncidentServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcIncidentServiceStub(
        IncidentServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcIncidentServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcIncidentServiceStub(
        IncidentServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcIncidentServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcIncidentServiceStub(
      IncidentServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcIncidentServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcIncidentServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcIncidentServiceStub(
      IncidentServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<CreateIncidentRequest, Incident> createIncidentTransportSettings =
        GrpcCallSettings.<CreateIncidentRequest, Incident>newBuilder()
            .setMethodDescriptor(createIncidentMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<CreateIncidentRequest>() {
                  @Override
                  public Map<String, String> extract(CreateIncidentRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<GetIncidentRequest, Incident> getIncidentTransportSettings =
        GrpcCallSettings.<GetIncidentRequest, Incident>newBuilder()
            .setMethodDescriptor(getIncidentMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetIncidentRequest>() {
                  @Override
                  public Map<String, String> extract(GetIncidentRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<SearchIncidentsRequest, SearchIncidentsResponse>
        searchIncidentsTransportSettings =
            GrpcCallSettings.<SearchIncidentsRequest, SearchIncidentsResponse>newBuilder()
                .setMethodDescriptor(searchIncidentsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<SearchIncidentsRequest>() {
                      @Override
                      public Map<String, String> extract(SearchIncidentsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("parent", String.valueOf(request.getParent()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<UpdateIncidentRequest, Incident> updateIncidentTransportSettings =
        GrpcCallSettings.<UpdateIncidentRequest, Incident>newBuilder()
            .setMethodDescriptor(updateIncidentMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<UpdateIncidentRequest>() {
                  @Override
                  public Map<String, String> extract(UpdateIncidentRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("incident.name", String.valueOf(request.getIncident().getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<SearchSimilarIncidentsRequest, SearchSimilarIncidentsResponse>
        searchSimilarIncidentsTransportSettings =
            GrpcCallSettings
                .<SearchSimilarIncidentsRequest, SearchSimilarIncidentsResponse>newBuilder()
                .setMethodDescriptor(searchSimilarIncidentsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<SearchSimilarIncidentsRequest>() {
                      @Override
                      public Map<String, String> extract(SearchSimilarIncidentsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("name", String.valueOf(request.getName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<CreateAnnotationRequest, Annotation> createAnnotationTransportSettings =
        GrpcCallSettings.<CreateAnnotationRequest, Annotation>newBuilder()
            .setMethodDescriptor(createAnnotationMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<CreateAnnotationRequest>() {
                  @Override
                  public Map<String, String> extract(CreateAnnotationRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<ListAnnotationsRequest, ListAnnotationsResponse>
        listAnnotationsTransportSettings =
            GrpcCallSettings.<ListAnnotationsRequest, ListAnnotationsResponse>newBuilder()
                .setMethodDescriptor(listAnnotationsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<ListAnnotationsRequest>() {
                      @Override
                      public Map<String, String> extract(ListAnnotationsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("parent", String.valueOf(request.getParent()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<CreateTagRequest, Tag> createTagTransportSettings =
        GrpcCallSettings.<CreateTagRequest, Tag>newBuilder()
            .setMethodDescriptor(createTagMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<CreateTagRequest>() {
                  @Override
                  public Map<String, String> extract(CreateTagRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<DeleteTagRequest, Empty> deleteTagTransportSettings =
        GrpcCallSettings.<DeleteTagRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteTagMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<DeleteTagRequest>() {
                  @Override
                  public Map<String, String> extract(DeleteTagRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<ListTagsRequest, ListTagsResponse> listTagsTransportSettings =
        GrpcCallSettings.<ListTagsRequest, ListTagsResponse>newBuilder()
            .setMethodDescriptor(listTagsMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<ListTagsRequest>() {
                  @Override
                  public Map<String, String> extract(ListTagsRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<CreateSignalRequest, Signal> createSignalTransportSettings =
        GrpcCallSettings.<CreateSignalRequest, Signal>newBuilder()
            .setMethodDescriptor(createSignalMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<CreateSignalRequest>() {
                  @Override
                  public Map<String, String> extract(CreateSignalRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<SearchSignalsRequest, SearchSignalsResponse> searchSignalsTransportSettings =
        GrpcCallSettings.<SearchSignalsRequest, SearchSignalsResponse>newBuilder()
            .setMethodDescriptor(searchSignalsMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<SearchSignalsRequest>() {
                  @Override
                  public Map<String, String> extract(SearchSignalsRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<GetSignalRequest, Signal> getSignalTransportSettings =
        GrpcCallSettings.<GetSignalRequest, Signal>newBuilder()
            .setMethodDescriptor(getSignalMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetSignalRequest>() {
                  @Override
                  public Map<String, String> extract(GetSignalRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<LookupSignalRequest, Signal> lookupSignalTransportSettings =
        GrpcCallSettings.<LookupSignalRequest, Signal>newBuilder()
            .setMethodDescriptor(lookupSignalMethodDescriptor)
            .build();
    GrpcCallSettings<UpdateSignalRequest, Signal> updateSignalTransportSettings =
        GrpcCallSettings.<UpdateSignalRequest, Signal>newBuilder()
            .setMethodDescriptor(updateSignalMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<UpdateSignalRequest>() {
                  @Override
                  public Map<String, String> extract(UpdateSignalRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("signal.name", String.valueOf(request.getSignal().getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<EscalateIncidentRequest, EscalateIncidentResponse>
        escalateIncidentTransportSettings =
            GrpcCallSettings.<EscalateIncidentRequest, EscalateIncidentResponse>newBuilder()
                .setMethodDescriptor(escalateIncidentMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<EscalateIncidentRequest>() {
                      @Override
                      public Map<String, String> extract(EscalateIncidentRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put(
                            "incident.name", String.valueOf(request.getIncident().getName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<CreateArtifactRequest, Artifact> createArtifactTransportSettings =
        GrpcCallSettings.<CreateArtifactRequest, Artifact>newBuilder()
            .setMethodDescriptor(createArtifactMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<CreateArtifactRequest>() {
                  @Override
                  public Map<String, String> extract(CreateArtifactRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<ListArtifactsRequest, ListArtifactsResponse> listArtifactsTransportSettings =
        GrpcCallSettings.<ListArtifactsRequest, ListArtifactsResponse>newBuilder()
            .setMethodDescriptor(listArtifactsMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<ListArtifactsRequest>() {
                  @Override
                  public Map<String, String> extract(ListArtifactsRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<UpdateArtifactRequest, Artifact> updateArtifactTransportSettings =
        GrpcCallSettings.<UpdateArtifactRequest, Artifact>newBuilder()
            .setMethodDescriptor(updateArtifactMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<UpdateArtifactRequest>() {
                  @Override
                  public Map<String, String> extract(UpdateArtifactRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("artifact.name", String.valueOf(request.getArtifact().getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<DeleteArtifactRequest, Empty> deleteArtifactTransportSettings =
        GrpcCallSettings.<DeleteArtifactRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteArtifactMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<DeleteArtifactRequest>() {
                  @Override
                  public Map<String, String> extract(DeleteArtifactRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<SendShiftHandoffRequest, SendShiftHandoffResponse>
        sendShiftHandoffTransportSettings =
            GrpcCallSettings.<SendShiftHandoffRequest, SendShiftHandoffResponse>newBuilder()
                .setMethodDescriptor(sendShiftHandoffMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<SendShiftHandoffRequest>() {
                      @Override
                      public Map<String, String> extract(SendShiftHandoffRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("parent", String.valueOf(request.getParent()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<CreateSubscriptionRequest, Subscription> createSubscriptionTransportSettings =
        GrpcCallSettings.<CreateSubscriptionRequest, Subscription>newBuilder()
            .setMethodDescriptor(createSubscriptionMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<CreateSubscriptionRequest>() {
                  @Override
                  public Map<String, String> extract(CreateSubscriptionRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<UpdateSubscriptionRequest, Subscription> updateSubscriptionTransportSettings =
        GrpcCallSettings.<UpdateSubscriptionRequest, Subscription>newBuilder()
            .setMethodDescriptor(updateSubscriptionMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<UpdateSubscriptionRequest>() {
                  @Override
                  public Map<String, String> extract(UpdateSubscriptionRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put(
                        "subscription.name", String.valueOf(request.getSubscription().getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<ListSubscriptionsRequest, ListSubscriptionsResponse>
        listSubscriptionsTransportSettings =
            GrpcCallSettings.<ListSubscriptionsRequest, ListSubscriptionsResponse>newBuilder()
                .setMethodDescriptor(listSubscriptionsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<ListSubscriptionsRequest>() {
                      @Override
                      public Map<String, String> extract(ListSubscriptionsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("parent", String.valueOf(request.getParent()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<DeleteSubscriptionRequest, Empty> deleteSubscriptionTransportSettings =
        GrpcCallSettings.<DeleteSubscriptionRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteSubscriptionMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<DeleteSubscriptionRequest>() {
                  @Override
                  public Map<String, String> extract(DeleteSubscriptionRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<CreateIncidentRoleAssignmentRequest, IncidentRoleAssignment>
        createIncidentRoleAssignmentTransportSettings =
            GrpcCallSettings
                .<CreateIncidentRoleAssignmentRequest, IncidentRoleAssignment>newBuilder()
                .setMethodDescriptor(createIncidentRoleAssignmentMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<CreateIncidentRoleAssignmentRequest>() {
                      @Override
                      public Map<String, String> extract(
                          CreateIncidentRoleAssignmentRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("parent", String.valueOf(request.getParent()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<DeleteIncidentRoleAssignmentRequest, Empty>
        deleteIncidentRoleAssignmentTransportSettings =
            GrpcCallSettings.<DeleteIncidentRoleAssignmentRequest, Empty>newBuilder()
                .setMethodDescriptor(deleteIncidentRoleAssignmentMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<DeleteIncidentRoleAssignmentRequest>() {
                      @Override
                      public Map<String, String> extract(
                          DeleteIncidentRoleAssignmentRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("name", String.valueOf(request.getName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<ListIncidentRoleAssignmentsRequest, ListIncidentRoleAssignmentsResponse>
        listIncidentRoleAssignmentsTransportSettings =
            GrpcCallSettings
                .<ListIncidentRoleAssignmentsRequest, ListIncidentRoleAssignmentsResponse>
                    newBuilder()
                .setMethodDescriptor(listIncidentRoleAssignmentsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<ListIncidentRoleAssignmentsRequest>() {
                      @Override
                      public Map<String, String> extract(
                          ListIncidentRoleAssignmentsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("parent", String.valueOf(request.getParent()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<RequestIncidentRoleHandoverRequest, IncidentRoleAssignment>
        requestIncidentRoleHandoverTransportSettings =
            GrpcCallSettings
                .<RequestIncidentRoleHandoverRequest, IncidentRoleAssignment>newBuilder()
                .setMethodDescriptor(requestIncidentRoleHandoverMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<RequestIncidentRoleHandoverRequest>() {
                      @Override
                      public Map<String, String> extract(
                          RequestIncidentRoleHandoverRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("name", String.valueOf(request.getName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<ConfirmIncidentRoleHandoverRequest, IncidentRoleAssignment>
        confirmIncidentRoleHandoverTransportSettings =
            GrpcCallSettings
                .<ConfirmIncidentRoleHandoverRequest, IncidentRoleAssignment>newBuilder()
                .setMethodDescriptor(confirmIncidentRoleHandoverMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<ConfirmIncidentRoleHandoverRequest>() {
                      @Override
                      public Map<String, String> extract(
                          ConfirmIncidentRoleHandoverRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("name", String.valueOf(request.getName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<ForceIncidentRoleHandoverRequest, IncidentRoleAssignment>
        forceIncidentRoleHandoverTransportSettings =
            GrpcCallSettings.<ForceIncidentRoleHandoverRequest, IncidentRoleAssignment>newBuilder()
                .setMethodDescriptor(forceIncidentRoleHandoverMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<ForceIncidentRoleHandoverRequest>() {
                      @Override
                      public Map<String, String> extract(ForceIncidentRoleHandoverRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("name", String.valueOf(request.getName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<CancelIncidentRoleHandoverRequest, IncidentRoleAssignment>
        cancelIncidentRoleHandoverTransportSettings =
            GrpcCallSettings.<CancelIncidentRoleHandoverRequest, IncidentRoleAssignment>newBuilder()
                .setMethodDescriptor(cancelIncidentRoleHandoverMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<CancelIncidentRoleHandoverRequest>() {
                      @Override
                      public Map<String, String> extract(
                          CancelIncidentRoleHandoverRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("name", String.valueOf(request.getName()));
                        return params.build();
                      }
                    })
                .build();

    this.createIncidentCallable =
        callableFactory.createUnaryCallable(
            createIncidentTransportSettings, settings.createIncidentSettings(), clientContext);
    this.getIncidentCallable =
        callableFactory.createUnaryCallable(
            getIncidentTransportSettings, settings.getIncidentSettings(), clientContext);
    this.searchIncidentsCallable =
        callableFactory.createUnaryCallable(
            searchIncidentsTransportSettings, settings.searchIncidentsSettings(), clientContext);
    this.searchIncidentsPagedCallable =
        callableFactory.createPagedCallable(
            searchIncidentsTransportSettings, settings.searchIncidentsSettings(), clientContext);
    this.updateIncidentCallable =
        callableFactory.createUnaryCallable(
            updateIncidentTransportSettings, settings.updateIncidentSettings(), clientContext);
    this.searchSimilarIncidentsCallable =
        callableFactory.createUnaryCallable(
            searchSimilarIncidentsTransportSettings,
            settings.searchSimilarIncidentsSettings(),
            clientContext);
    this.searchSimilarIncidentsPagedCallable =
        callableFactory.createPagedCallable(
            searchSimilarIncidentsTransportSettings,
            settings.searchSimilarIncidentsSettings(),
            clientContext);
    this.createAnnotationCallable =
        callableFactory.createUnaryCallable(
            createAnnotationTransportSettings, settings.createAnnotationSettings(), clientContext);
    this.listAnnotationsCallable =
        callableFactory.createUnaryCallable(
            listAnnotationsTransportSettings, settings.listAnnotationsSettings(), clientContext);
    this.listAnnotationsPagedCallable =
        callableFactory.createPagedCallable(
            listAnnotationsTransportSettings, settings.listAnnotationsSettings(), clientContext);
    this.createTagCallable =
        callableFactory.createUnaryCallable(
            createTagTransportSettings, settings.createTagSettings(), clientContext);
    this.deleteTagCallable =
        callableFactory.createUnaryCallable(
            deleteTagTransportSettings, settings.deleteTagSettings(), clientContext);
    this.listTagsCallable =
        callableFactory.createUnaryCallable(
            listTagsTransportSettings, settings.listTagsSettings(), clientContext);
    this.listTagsPagedCallable =
        callableFactory.createPagedCallable(
            listTagsTransportSettings, settings.listTagsSettings(), clientContext);
    this.createSignalCallable =
        callableFactory.createUnaryCallable(
            createSignalTransportSettings, settings.createSignalSettings(), clientContext);
    this.searchSignalsCallable =
        callableFactory.createUnaryCallable(
            searchSignalsTransportSettings, settings.searchSignalsSettings(), clientContext);
    this.searchSignalsPagedCallable =
        callableFactory.createPagedCallable(
            searchSignalsTransportSettings, settings.searchSignalsSettings(), clientContext);
    this.getSignalCallable =
        callableFactory.createUnaryCallable(
            getSignalTransportSettings, settings.getSignalSettings(), clientContext);
    this.lookupSignalCallable =
        callableFactory.createUnaryCallable(
            lookupSignalTransportSettings, settings.lookupSignalSettings(), clientContext);
    this.updateSignalCallable =
        callableFactory.createUnaryCallable(
            updateSignalTransportSettings, settings.updateSignalSettings(), clientContext);
    this.escalateIncidentCallable =
        callableFactory.createUnaryCallable(
            escalateIncidentTransportSettings, settings.escalateIncidentSettings(), clientContext);
    this.createArtifactCallable =
        callableFactory.createUnaryCallable(
            createArtifactTransportSettings, settings.createArtifactSettings(), clientContext);
    this.listArtifactsCallable =
        callableFactory.createUnaryCallable(
            listArtifactsTransportSettings, settings.listArtifactsSettings(), clientContext);
    this.listArtifactsPagedCallable =
        callableFactory.createPagedCallable(
            listArtifactsTransportSettings, settings.listArtifactsSettings(), clientContext);
    this.updateArtifactCallable =
        callableFactory.createUnaryCallable(
            updateArtifactTransportSettings, settings.updateArtifactSettings(), clientContext);
    this.deleteArtifactCallable =
        callableFactory.createUnaryCallable(
            deleteArtifactTransportSettings, settings.deleteArtifactSettings(), clientContext);
    this.sendShiftHandoffCallable =
        callableFactory.createUnaryCallable(
            sendShiftHandoffTransportSettings, settings.sendShiftHandoffSettings(), clientContext);
    this.createSubscriptionCallable =
        callableFactory.createUnaryCallable(
            createSubscriptionTransportSettings,
            settings.createSubscriptionSettings(),
            clientContext);
    this.updateSubscriptionCallable =
        callableFactory.createUnaryCallable(
            updateSubscriptionTransportSettings,
            settings.updateSubscriptionSettings(),
            clientContext);
    this.listSubscriptionsCallable =
        callableFactory.createUnaryCallable(
            listSubscriptionsTransportSettings,
            settings.listSubscriptionsSettings(),
            clientContext);
    this.listSubscriptionsPagedCallable =
        callableFactory.createPagedCallable(
            listSubscriptionsTransportSettings,
            settings.listSubscriptionsSettings(),
            clientContext);
    this.deleteSubscriptionCallable =
        callableFactory.createUnaryCallable(
            deleteSubscriptionTransportSettings,
            settings.deleteSubscriptionSettings(),
            clientContext);
    this.createIncidentRoleAssignmentCallable =
        callableFactory.createUnaryCallable(
            createIncidentRoleAssignmentTransportSettings,
            settings.createIncidentRoleAssignmentSettings(),
            clientContext);
    this.deleteIncidentRoleAssignmentCallable =
        callableFactory.createUnaryCallable(
            deleteIncidentRoleAssignmentTransportSettings,
            settings.deleteIncidentRoleAssignmentSettings(),
            clientContext);
    this.listIncidentRoleAssignmentsCallable =
        callableFactory.createUnaryCallable(
            listIncidentRoleAssignmentsTransportSettings,
            settings.listIncidentRoleAssignmentsSettings(),
            clientContext);
    this.listIncidentRoleAssignmentsPagedCallable =
        callableFactory.createPagedCallable(
            listIncidentRoleAssignmentsTransportSettings,
            settings.listIncidentRoleAssignmentsSettings(),
            clientContext);
    this.requestIncidentRoleHandoverCallable =
        callableFactory.createUnaryCallable(
            requestIncidentRoleHandoverTransportSettings,
            settings.requestIncidentRoleHandoverSettings(),
            clientContext);
    this.confirmIncidentRoleHandoverCallable =
        callableFactory.createUnaryCallable(
            confirmIncidentRoleHandoverTransportSettings,
            settings.confirmIncidentRoleHandoverSettings(),
            clientContext);
    this.forceIncidentRoleHandoverCallable =
        callableFactory.createUnaryCallable(
            forceIncidentRoleHandoverTransportSettings,
            settings.forceIncidentRoleHandoverSettings(),
            clientContext);
    this.cancelIncidentRoleHandoverCallable =
        callableFactory.createUnaryCallable(
            cancelIncidentRoleHandoverTransportSettings,
            settings.cancelIncidentRoleHandoverSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<CreateIncidentRequest, Incident> createIncidentCallable() {
    return createIncidentCallable;
  }

  public UnaryCallable<GetIncidentRequest, Incident> getIncidentCallable() {
    return getIncidentCallable;
  }

  public UnaryCallable<SearchIncidentsRequest, SearchIncidentsPagedResponse>
      searchIncidentsPagedCallable() {
    return searchIncidentsPagedCallable;
  }

  public UnaryCallable<SearchIncidentsRequest, SearchIncidentsResponse> searchIncidentsCallable() {
    return searchIncidentsCallable;
  }

  public UnaryCallable<UpdateIncidentRequest, Incident> updateIncidentCallable() {
    return updateIncidentCallable;
  }

  public UnaryCallable<SearchSimilarIncidentsRequest, SearchSimilarIncidentsPagedResponse>
      searchSimilarIncidentsPagedCallable() {
    return searchSimilarIncidentsPagedCallable;
  }

  public UnaryCallable<SearchSimilarIncidentsRequest, SearchSimilarIncidentsResponse>
      searchSimilarIncidentsCallable() {
    return searchSimilarIncidentsCallable;
  }

  public UnaryCallable<CreateAnnotationRequest, Annotation> createAnnotationCallable() {
    return createAnnotationCallable;
  }

  public UnaryCallable<ListAnnotationsRequest, ListAnnotationsPagedResponse>
      listAnnotationsPagedCallable() {
    return listAnnotationsPagedCallable;
  }

  public UnaryCallable<ListAnnotationsRequest, ListAnnotationsResponse> listAnnotationsCallable() {
    return listAnnotationsCallable;
  }

  public UnaryCallable<CreateTagRequest, Tag> createTagCallable() {
    return createTagCallable;
  }

  public UnaryCallable<DeleteTagRequest, Empty> deleteTagCallable() {
    return deleteTagCallable;
  }

  public UnaryCallable<ListTagsRequest, ListTagsPagedResponse> listTagsPagedCallable() {
    return listTagsPagedCallable;
  }

  public UnaryCallable<ListTagsRequest, ListTagsResponse> listTagsCallable() {
    return listTagsCallable;
  }

  public UnaryCallable<CreateSignalRequest, Signal> createSignalCallable() {
    return createSignalCallable;
  }

  public UnaryCallable<SearchSignalsRequest, SearchSignalsPagedResponse>
      searchSignalsPagedCallable() {
    return searchSignalsPagedCallable;
  }

  public UnaryCallable<SearchSignalsRequest, SearchSignalsResponse> searchSignalsCallable() {
    return searchSignalsCallable;
  }

  public UnaryCallable<GetSignalRequest, Signal> getSignalCallable() {
    return getSignalCallable;
  }

  public UnaryCallable<LookupSignalRequest, Signal> lookupSignalCallable() {
    return lookupSignalCallable;
  }

  public UnaryCallable<UpdateSignalRequest, Signal> updateSignalCallable() {
    return updateSignalCallable;
  }

  public UnaryCallable<EscalateIncidentRequest, EscalateIncidentResponse>
      escalateIncidentCallable() {
    return escalateIncidentCallable;
  }

  public UnaryCallable<CreateArtifactRequest, Artifact> createArtifactCallable() {
    return createArtifactCallable;
  }

  public UnaryCallable<ListArtifactsRequest, ListArtifactsPagedResponse>
      listArtifactsPagedCallable() {
    return listArtifactsPagedCallable;
  }

  public UnaryCallable<ListArtifactsRequest, ListArtifactsResponse> listArtifactsCallable() {
    return listArtifactsCallable;
  }

  public UnaryCallable<UpdateArtifactRequest, Artifact> updateArtifactCallable() {
    return updateArtifactCallable;
  }

  public UnaryCallable<DeleteArtifactRequest, Empty> deleteArtifactCallable() {
    return deleteArtifactCallable;
  }

  public UnaryCallable<SendShiftHandoffRequest, SendShiftHandoffResponse>
      sendShiftHandoffCallable() {
    return sendShiftHandoffCallable;
  }

  public UnaryCallable<CreateSubscriptionRequest, Subscription> createSubscriptionCallable() {
    return createSubscriptionCallable;
  }

  public UnaryCallable<UpdateSubscriptionRequest, Subscription> updateSubscriptionCallable() {
    return updateSubscriptionCallable;
  }

  public UnaryCallable<ListSubscriptionsRequest, ListSubscriptionsPagedResponse>
      listSubscriptionsPagedCallable() {
    return listSubscriptionsPagedCallable;
  }

  public UnaryCallable<ListSubscriptionsRequest, ListSubscriptionsResponse>
      listSubscriptionsCallable() {
    return listSubscriptionsCallable;
  }

  public UnaryCallable<DeleteSubscriptionRequest, Empty> deleteSubscriptionCallable() {
    return deleteSubscriptionCallable;
  }

  public UnaryCallable<CreateIncidentRoleAssignmentRequest, IncidentRoleAssignment>
      createIncidentRoleAssignmentCallable() {
    return createIncidentRoleAssignmentCallable;
  }

  public UnaryCallable<DeleteIncidentRoleAssignmentRequest, Empty>
      deleteIncidentRoleAssignmentCallable() {
    return deleteIncidentRoleAssignmentCallable;
  }

  public UnaryCallable<ListIncidentRoleAssignmentsRequest, ListIncidentRoleAssignmentsPagedResponse>
      listIncidentRoleAssignmentsPagedCallable() {
    return listIncidentRoleAssignmentsPagedCallable;
  }

  public UnaryCallable<ListIncidentRoleAssignmentsRequest, ListIncidentRoleAssignmentsResponse>
      listIncidentRoleAssignmentsCallable() {
    return listIncidentRoleAssignmentsCallable;
  }

  public UnaryCallable<RequestIncidentRoleHandoverRequest, IncidentRoleAssignment>
      requestIncidentRoleHandoverCallable() {
    return requestIncidentRoleHandoverCallable;
  }

  public UnaryCallable<ConfirmIncidentRoleHandoverRequest, IncidentRoleAssignment>
      confirmIncidentRoleHandoverCallable() {
    return confirmIncidentRoleHandoverCallable;
  }

  public UnaryCallable<ForceIncidentRoleHandoverRequest, IncidentRoleAssignment>
      forceIncidentRoleHandoverCallable() {
    return forceIncidentRoleHandoverCallable;
  }

  public UnaryCallable<CancelIncidentRoleHandoverRequest, IncidentRoleAssignment>
      cancelIncidentRoleHandoverCallable() {
    return cancelIncidentRoleHandoverCallable;
  }

  @Override
  public final void close() {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
