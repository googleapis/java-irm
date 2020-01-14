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
package com.google.cloud.irm.v1alpha2.stub;

import static com.google.cloud.irm.v1alpha2.IncidentServiceClient.ListAnnotationsPagedResponse;
import static com.google.cloud.irm.v1alpha2.IncidentServiceClient.ListArtifactsPagedResponse;
import static com.google.cloud.irm.v1alpha2.IncidentServiceClient.ListIncidentRoleAssignmentsPagedResponse;
import static com.google.cloud.irm.v1alpha2.IncidentServiceClient.ListSubscriptionsPagedResponse;
import static com.google.cloud.irm.v1alpha2.IncidentServiceClient.ListTagsPagedResponse;
import static com.google.cloud.irm.v1alpha2.IncidentServiceClient.SearchIncidentsPagedResponse;
import static com.google.cloud.irm.v1alpha2.IncidentServiceClient.SearchSignalsPagedResponse;
import static com.google.cloud.irm.v1alpha2.IncidentServiceClient.SearchSimilarIncidentsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
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
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link IncidentServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (irm.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of createIncident to 30 seconds:
 *
 * <pre>
 * <code>
 * IncidentServiceStubSettings.Builder incidentServiceSettingsBuilder =
 *     IncidentServiceStubSettings.newBuilder();
 * incidentServiceSettingsBuilder.createIncidentSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * IncidentServiceStubSettings incidentServiceSettings = incidentServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class IncidentServiceStubSettings extends StubSettings<IncidentServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<CreateIncidentRequest, Incident> createIncidentSettings;
  private final UnaryCallSettings<GetIncidentRequest, Incident> getIncidentSettings;
  private final PagedCallSettings<
          SearchIncidentsRequest, SearchIncidentsResponse, SearchIncidentsPagedResponse>
      searchIncidentsSettings;
  private final UnaryCallSettings<UpdateIncidentRequest, Incident> updateIncidentSettings;
  private final PagedCallSettings<
          SearchSimilarIncidentsRequest,
          SearchSimilarIncidentsResponse,
          SearchSimilarIncidentsPagedResponse>
      searchSimilarIncidentsSettings;
  private final UnaryCallSettings<CreateAnnotationRequest, Annotation> createAnnotationSettings;
  private final PagedCallSettings<
          ListAnnotationsRequest, ListAnnotationsResponse, ListAnnotationsPagedResponse>
      listAnnotationsSettings;
  private final UnaryCallSettings<CreateTagRequest, Tag> createTagSettings;
  private final UnaryCallSettings<DeleteTagRequest, Empty> deleteTagSettings;
  private final PagedCallSettings<ListTagsRequest, ListTagsResponse, ListTagsPagedResponse>
      listTagsSettings;
  private final UnaryCallSettings<CreateSignalRequest, Signal> createSignalSettings;
  private final PagedCallSettings<
          SearchSignalsRequest, SearchSignalsResponse, SearchSignalsPagedResponse>
      searchSignalsSettings;
  private final UnaryCallSettings<GetSignalRequest, Signal> getSignalSettings;
  private final UnaryCallSettings<LookupSignalRequest, Signal> lookupSignalSettings;
  private final UnaryCallSettings<UpdateSignalRequest, Signal> updateSignalSettings;
  private final UnaryCallSettings<EscalateIncidentRequest, EscalateIncidentResponse>
      escalateIncidentSettings;
  private final UnaryCallSettings<CreateArtifactRequest, Artifact> createArtifactSettings;
  private final PagedCallSettings<
          ListArtifactsRequest, ListArtifactsResponse, ListArtifactsPagedResponse>
      listArtifactsSettings;
  private final UnaryCallSettings<UpdateArtifactRequest, Artifact> updateArtifactSettings;
  private final UnaryCallSettings<DeleteArtifactRequest, Empty> deleteArtifactSettings;
  private final UnaryCallSettings<SendShiftHandoffRequest, SendShiftHandoffResponse>
      sendShiftHandoffSettings;
  private final UnaryCallSettings<CreateSubscriptionRequest, Subscription>
      createSubscriptionSettings;
  private final UnaryCallSettings<UpdateSubscriptionRequest, Subscription>
      updateSubscriptionSettings;
  private final PagedCallSettings<
          ListSubscriptionsRequest, ListSubscriptionsResponse, ListSubscriptionsPagedResponse>
      listSubscriptionsSettings;
  private final UnaryCallSettings<DeleteSubscriptionRequest, Empty> deleteSubscriptionSettings;
  private final UnaryCallSettings<CreateIncidentRoleAssignmentRequest, IncidentRoleAssignment>
      createIncidentRoleAssignmentSettings;
  private final UnaryCallSettings<DeleteIncidentRoleAssignmentRequest, Empty>
      deleteIncidentRoleAssignmentSettings;
  private final PagedCallSettings<
          ListIncidentRoleAssignmentsRequest,
          ListIncidentRoleAssignmentsResponse,
          ListIncidentRoleAssignmentsPagedResponse>
      listIncidentRoleAssignmentsSettings;
  private final UnaryCallSettings<RequestIncidentRoleHandoverRequest, IncidentRoleAssignment>
      requestIncidentRoleHandoverSettings;
  private final UnaryCallSettings<ConfirmIncidentRoleHandoverRequest, IncidentRoleAssignment>
      confirmIncidentRoleHandoverSettings;
  private final UnaryCallSettings<ForceIncidentRoleHandoverRequest, IncidentRoleAssignment>
      forceIncidentRoleHandoverSettings;
  private final UnaryCallSettings<CancelIncidentRoleHandoverRequest, IncidentRoleAssignment>
      cancelIncidentRoleHandoverSettings;

  /** Returns the object with the settings used for calls to createIncident. */
  public UnaryCallSettings<CreateIncidentRequest, Incident> createIncidentSettings() {
    return createIncidentSettings;
  }

  /** Returns the object with the settings used for calls to getIncident. */
  public UnaryCallSettings<GetIncidentRequest, Incident> getIncidentSettings() {
    return getIncidentSettings;
  }

  /** Returns the object with the settings used for calls to searchIncidents. */
  public PagedCallSettings<
          SearchIncidentsRequest, SearchIncidentsResponse, SearchIncidentsPagedResponse>
      searchIncidentsSettings() {
    return searchIncidentsSettings;
  }

  /** Returns the object with the settings used for calls to updateIncident. */
  public UnaryCallSettings<UpdateIncidentRequest, Incident> updateIncidentSettings() {
    return updateIncidentSettings;
  }

  /** Returns the object with the settings used for calls to searchSimilarIncidents. */
  public PagedCallSettings<
          SearchSimilarIncidentsRequest,
          SearchSimilarIncidentsResponse,
          SearchSimilarIncidentsPagedResponse>
      searchSimilarIncidentsSettings() {
    return searchSimilarIncidentsSettings;
  }

  /** Returns the object with the settings used for calls to createAnnotation. */
  public UnaryCallSettings<CreateAnnotationRequest, Annotation> createAnnotationSettings() {
    return createAnnotationSettings;
  }

  /** Returns the object with the settings used for calls to listAnnotations. */
  public PagedCallSettings<
          ListAnnotationsRequest, ListAnnotationsResponse, ListAnnotationsPagedResponse>
      listAnnotationsSettings() {
    return listAnnotationsSettings;
  }

  /** Returns the object with the settings used for calls to createTag. */
  public UnaryCallSettings<CreateTagRequest, Tag> createTagSettings() {
    return createTagSettings;
  }

  /** Returns the object with the settings used for calls to deleteTag. */
  public UnaryCallSettings<DeleteTagRequest, Empty> deleteTagSettings() {
    return deleteTagSettings;
  }

  /** Returns the object with the settings used for calls to listTags. */
  public PagedCallSettings<ListTagsRequest, ListTagsResponse, ListTagsPagedResponse>
      listTagsSettings() {
    return listTagsSettings;
  }

  /** Returns the object with the settings used for calls to createSignal. */
  public UnaryCallSettings<CreateSignalRequest, Signal> createSignalSettings() {
    return createSignalSettings;
  }

  /** Returns the object with the settings used for calls to searchSignals. */
  public PagedCallSettings<SearchSignalsRequest, SearchSignalsResponse, SearchSignalsPagedResponse>
      searchSignalsSettings() {
    return searchSignalsSettings;
  }

  /** Returns the object with the settings used for calls to getSignal. */
  public UnaryCallSettings<GetSignalRequest, Signal> getSignalSettings() {
    return getSignalSettings;
  }

  /** Returns the object with the settings used for calls to lookupSignal. */
  public UnaryCallSettings<LookupSignalRequest, Signal> lookupSignalSettings() {
    return lookupSignalSettings;
  }

  /** Returns the object with the settings used for calls to updateSignal. */
  public UnaryCallSettings<UpdateSignalRequest, Signal> updateSignalSettings() {
    return updateSignalSettings;
  }

  /** Returns the object with the settings used for calls to escalateIncident. */
  public UnaryCallSettings<EscalateIncidentRequest, EscalateIncidentResponse>
      escalateIncidentSettings() {
    return escalateIncidentSettings;
  }

  /** Returns the object with the settings used for calls to createArtifact. */
  public UnaryCallSettings<CreateArtifactRequest, Artifact> createArtifactSettings() {
    return createArtifactSettings;
  }

  /** Returns the object with the settings used for calls to listArtifacts. */
  public PagedCallSettings<ListArtifactsRequest, ListArtifactsResponse, ListArtifactsPagedResponse>
      listArtifactsSettings() {
    return listArtifactsSettings;
  }

  /** Returns the object with the settings used for calls to updateArtifact. */
  public UnaryCallSettings<UpdateArtifactRequest, Artifact> updateArtifactSettings() {
    return updateArtifactSettings;
  }

  /** Returns the object with the settings used for calls to deleteArtifact. */
  public UnaryCallSettings<DeleteArtifactRequest, Empty> deleteArtifactSettings() {
    return deleteArtifactSettings;
  }

  /** Returns the object with the settings used for calls to sendShiftHandoff. */
  public UnaryCallSettings<SendShiftHandoffRequest, SendShiftHandoffResponse>
      sendShiftHandoffSettings() {
    return sendShiftHandoffSettings;
  }

  /** Returns the object with the settings used for calls to createSubscription. */
  public UnaryCallSettings<CreateSubscriptionRequest, Subscription> createSubscriptionSettings() {
    return createSubscriptionSettings;
  }

  /** Returns the object with the settings used for calls to updateSubscription. */
  public UnaryCallSettings<UpdateSubscriptionRequest, Subscription> updateSubscriptionSettings() {
    return updateSubscriptionSettings;
  }

  /** Returns the object with the settings used for calls to listSubscriptions. */
  public PagedCallSettings<
          ListSubscriptionsRequest, ListSubscriptionsResponse, ListSubscriptionsPagedResponse>
      listSubscriptionsSettings() {
    return listSubscriptionsSettings;
  }

  /** Returns the object with the settings used for calls to deleteSubscription. */
  public UnaryCallSettings<DeleteSubscriptionRequest, Empty> deleteSubscriptionSettings() {
    return deleteSubscriptionSettings;
  }

  /** Returns the object with the settings used for calls to createIncidentRoleAssignment. */
  public UnaryCallSettings<CreateIncidentRoleAssignmentRequest, IncidentRoleAssignment>
      createIncidentRoleAssignmentSettings() {
    return createIncidentRoleAssignmentSettings;
  }

  /** Returns the object with the settings used for calls to deleteIncidentRoleAssignment. */
  public UnaryCallSettings<DeleteIncidentRoleAssignmentRequest, Empty>
      deleteIncidentRoleAssignmentSettings() {
    return deleteIncidentRoleAssignmentSettings;
  }

  /** Returns the object with the settings used for calls to listIncidentRoleAssignments. */
  public PagedCallSettings<
          ListIncidentRoleAssignmentsRequest,
          ListIncidentRoleAssignmentsResponse,
          ListIncidentRoleAssignmentsPagedResponse>
      listIncidentRoleAssignmentsSettings() {
    return listIncidentRoleAssignmentsSettings;
  }

  /** Returns the object with the settings used for calls to requestIncidentRoleHandover. */
  public UnaryCallSettings<RequestIncidentRoleHandoverRequest, IncidentRoleAssignment>
      requestIncidentRoleHandoverSettings() {
    return requestIncidentRoleHandoverSettings;
  }

  /** Returns the object with the settings used for calls to confirmIncidentRoleHandover. */
  public UnaryCallSettings<ConfirmIncidentRoleHandoverRequest, IncidentRoleAssignment>
      confirmIncidentRoleHandoverSettings() {
    return confirmIncidentRoleHandoverSettings;
  }

  /** Returns the object with the settings used for calls to forceIncidentRoleHandover. */
  public UnaryCallSettings<ForceIncidentRoleHandoverRequest, IncidentRoleAssignment>
      forceIncidentRoleHandoverSettings() {
    return forceIncidentRoleHandoverSettings;
  }

  /** Returns the object with the settings used for calls to cancelIncidentRoleHandover. */
  public UnaryCallSettings<CancelIncidentRoleHandoverRequest, IncidentRoleAssignment>
      cancelIncidentRoleHandoverSettings() {
    return cancelIncidentRoleHandoverSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public IncidentServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcIncidentServiceStub.create(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportChannelProvider().getTransportName());
    }
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "irm.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(IncidentServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected IncidentServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    createIncidentSettings = settingsBuilder.createIncidentSettings().build();
    getIncidentSettings = settingsBuilder.getIncidentSettings().build();
    searchIncidentsSettings = settingsBuilder.searchIncidentsSettings().build();
    updateIncidentSettings = settingsBuilder.updateIncidentSettings().build();
    searchSimilarIncidentsSettings = settingsBuilder.searchSimilarIncidentsSettings().build();
    createAnnotationSettings = settingsBuilder.createAnnotationSettings().build();
    listAnnotationsSettings = settingsBuilder.listAnnotationsSettings().build();
    createTagSettings = settingsBuilder.createTagSettings().build();
    deleteTagSettings = settingsBuilder.deleteTagSettings().build();
    listTagsSettings = settingsBuilder.listTagsSettings().build();
    createSignalSettings = settingsBuilder.createSignalSettings().build();
    searchSignalsSettings = settingsBuilder.searchSignalsSettings().build();
    getSignalSettings = settingsBuilder.getSignalSettings().build();
    lookupSignalSettings = settingsBuilder.lookupSignalSettings().build();
    updateSignalSettings = settingsBuilder.updateSignalSettings().build();
    escalateIncidentSettings = settingsBuilder.escalateIncidentSettings().build();
    createArtifactSettings = settingsBuilder.createArtifactSettings().build();
    listArtifactsSettings = settingsBuilder.listArtifactsSettings().build();
    updateArtifactSettings = settingsBuilder.updateArtifactSettings().build();
    deleteArtifactSettings = settingsBuilder.deleteArtifactSettings().build();
    sendShiftHandoffSettings = settingsBuilder.sendShiftHandoffSettings().build();
    createSubscriptionSettings = settingsBuilder.createSubscriptionSettings().build();
    updateSubscriptionSettings = settingsBuilder.updateSubscriptionSettings().build();
    listSubscriptionsSettings = settingsBuilder.listSubscriptionsSettings().build();
    deleteSubscriptionSettings = settingsBuilder.deleteSubscriptionSettings().build();
    createIncidentRoleAssignmentSettings =
        settingsBuilder.createIncidentRoleAssignmentSettings().build();
    deleteIncidentRoleAssignmentSettings =
        settingsBuilder.deleteIncidentRoleAssignmentSettings().build();
    listIncidentRoleAssignmentsSettings =
        settingsBuilder.listIncidentRoleAssignmentsSettings().build();
    requestIncidentRoleHandoverSettings =
        settingsBuilder.requestIncidentRoleHandoverSettings().build();
    confirmIncidentRoleHandoverSettings =
        settingsBuilder.confirmIncidentRoleHandoverSettings().build();
    forceIncidentRoleHandoverSettings = settingsBuilder.forceIncidentRoleHandoverSettings().build();
    cancelIncidentRoleHandoverSettings =
        settingsBuilder.cancelIncidentRoleHandoverSettings().build();
  }

  private static final PagedListDescriptor<
          SearchIncidentsRequest, SearchIncidentsResponse, Incident>
      SEARCH_INCIDENTS_PAGE_STR_DESC =
          new PagedListDescriptor<SearchIncidentsRequest, SearchIncidentsResponse, Incident>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public SearchIncidentsRequest injectToken(
                SearchIncidentsRequest payload, String token) {
              return SearchIncidentsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public SearchIncidentsRequest injectPageSize(
                SearchIncidentsRequest payload, int pageSize) {
              return SearchIncidentsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(SearchIncidentsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(SearchIncidentsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Incident> extractResources(SearchIncidentsResponse payload) {
              return payload.getIncidentsList() != null
                  ? payload.getIncidentsList()
                  : ImmutableList.<Incident>of();
            }
          };

  private static final PagedListDescriptor<
          SearchSimilarIncidentsRequest,
          SearchSimilarIncidentsResponse,
          SearchSimilarIncidentsResponse.Result>
      SEARCH_SIMILAR_INCIDENTS_PAGE_STR_DESC =
          new PagedListDescriptor<
              SearchSimilarIncidentsRequest,
              SearchSimilarIncidentsResponse,
              SearchSimilarIncidentsResponse.Result>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public SearchSimilarIncidentsRequest injectToken(
                SearchSimilarIncidentsRequest payload, String token) {
              return SearchSimilarIncidentsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public SearchSimilarIncidentsRequest injectPageSize(
                SearchSimilarIncidentsRequest payload, int pageSize) {
              return SearchSimilarIncidentsRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(SearchSimilarIncidentsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(SearchSimilarIncidentsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<SearchSimilarIncidentsResponse.Result> extractResources(
                SearchSimilarIncidentsResponse payload) {
              return payload.getResultsList() != null
                  ? payload.getResultsList()
                  : ImmutableList.<SearchSimilarIncidentsResponse.Result>of();
            }
          };

  private static final PagedListDescriptor<
          ListAnnotationsRequest, ListAnnotationsResponse, Annotation>
      LIST_ANNOTATIONS_PAGE_STR_DESC =
          new PagedListDescriptor<ListAnnotationsRequest, ListAnnotationsResponse, Annotation>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListAnnotationsRequest injectToken(
                ListAnnotationsRequest payload, String token) {
              return ListAnnotationsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListAnnotationsRequest injectPageSize(
                ListAnnotationsRequest payload, int pageSize) {
              return ListAnnotationsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListAnnotationsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListAnnotationsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Annotation> extractResources(ListAnnotationsResponse payload) {
              return payload.getAnnotationsList() != null
                  ? payload.getAnnotationsList()
                  : ImmutableList.<Annotation>of();
            }
          };

  private static final PagedListDescriptor<ListTagsRequest, ListTagsResponse, Tag>
      LIST_TAGS_PAGE_STR_DESC =
          new PagedListDescriptor<ListTagsRequest, ListTagsResponse, Tag>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListTagsRequest injectToken(ListTagsRequest payload, String token) {
              return ListTagsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListTagsRequest injectPageSize(ListTagsRequest payload, int pageSize) {
              return ListTagsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListTagsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListTagsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Tag> extractResources(ListTagsResponse payload) {
              return payload.getTagsList() != null
                  ? payload.getTagsList()
                  : ImmutableList.<Tag>of();
            }
          };

  private static final PagedListDescriptor<SearchSignalsRequest, SearchSignalsResponse, Signal>
      SEARCH_SIGNALS_PAGE_STR_DESC =
          new PagedListDescriptor<SearchSignalsRequest, SearchSignalsResponse, Signal>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public SearchSignalsRequest injectToken(SearchSignalsRequest payload, String token) {
              return SearchSignalsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public SearchSignalsRequest injectPageSize(SearchSignalsRequest payload, int pageSize) {
              return SearchSignalsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(SearchSignalsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(SearchSignalsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Signal> extractResources(SearchSignalsResponse payload) {
              return payload.getSignalsList() != null
                  ? payload.getSignalsList()
                  : ImmutableList.<Signal>of();
            }
          };

  private static final PagedListDescriptor<ListArtifactsRequest, ListArtifactsResponse, Artifact>
      LIST_ARTIFACTS_PAGE_STR_DESC =
          new PagedListDescriptor<ListArtifactsRequest, ListArtifactsResponse, Artifact>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListArtifactsRequest injectToken(ListArtifactsRequest payload, String token) {
              return ListArtifactsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListArtifactsRequest injectPageSize(ListArtifactsRequest payload, int pageSize) {
              return ListArtifactsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListArtifactsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListArtifactsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Artifact> extractResources(ListArtifactsResponse payload) {
              return payload.getArtifactsList() != null
                  ? payload.getArtifactsList()
                  : ImmutableList.<Artifact>of();
            }
          };

  private static final PagedListDescriptor<
          ListSubscriptionsRequest, ListSubscriptionsResponse, Subscription>
      LIST_SUBSCRIPTIONS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListSubscriptionsRequest, ListSubscriptionsResponse, Subscription>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListSubscriptionsRequest injectToken(
                ListSubscriptionsRequest payload, String token) {
              return ListSubscriptionsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListSubscriptionsRequest injectPageSize(
                ListSubscriptionsRequest payload, int pageSize) {
              return ListSubscriptionsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListSubscriptionsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListSubscriptionsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Subscription> extractResources(ListSubscriptionsResponse payload) {
              return payload.getSubscriptionsList() != null
                  ? payload.getSubscriptionsList()
                  : ImmutableList.<Subscription>of();
            }
          };

  private static final PagedListDescriptor<
          ListIncidentRoleAssignmentsRequest,
          ListIncidentRoleAssignmentsResponse,
          IncidentRoleAssignment>
      LIST_INCIDENT_ROLE_ASSIGNMENTS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListIncidentRoleAssignmentsRequest,
              ListIncidentRoleAssignmentsResponse,
              IncidentRoleAssignment>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListIncidentRoleAssignmentsRequest injectToken(
                ListIncidentRoleAssignmentsRequest payload, String token) {
              return ListIncidentRoleAssignmentsRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListIncidentRoleAssignmentsRequest injectPageSize(
                ListIncidentRoleAssignmentsRequest payload, int pageSize) {
              return ListIncidentRoleAssignmentsRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListIncidentRoleAssignmentsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListIncidentRoleAssignmentsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<IncidentRoleAssignment> extractResources(
                ListIncidentRoleAssignmentsResponse payload) {
              return payload.getIncidentRoleAssignmentsList() != null
                  ? payload.getIncidentRoleAssignmentsList()
                  : ImmutableList.<IncidentRoleAssignment>of();
            }
          };

  private static final PagedListResponseFactory<
          SearchIncidentsRequest, SearchIncidentsResponse, SearchIncidentsPagedResponse>
      SEARCH_INCIDENTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              SearchIncidentsRequest, SearchIncidentsResponse, SearchIncidentsPagedResponse>() {
            @Override
            public ApiFuture<SearchIncidentsPagedResponse> getFuturePagedResponse(
                UnaryCallable<SearchIncidentsRequest, SearchIncidentsResponse> callable,
                SearchIncidentsRequest request,
                ApiCallContext context,
                ApiFuture<SearchIncidentsResponse> futureResponse) {
              PageContext<SearchIncidentsRequest, SearchIncidentsResponse, Incident> pageContext =
                  PageContext.create(callable, SEARCH_INCIDENTS_PAGE_STR_DESC, request, context);
              return SearchIncidentsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          SearchSimilarIncidentsRequest,
          SearchSimilarIncidentsResponse,
          SearchSimilarIncidentsPagedResponse>
      SEARCH_SIMILAR_INCIDENTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              SearchSimilarIncidentsRequest,
              SearchSimilarIncidentsResponse,
              SearchSimilarIncidentsPagedResponse>() {
            @Override
            public ApiFuture<SearchSimilarIncidentsPagedResponse> getFuturePagedResponse(
                UnaryCallable<SearchSimilarIncidentsRequest, SearchSimilarIncidentsResponse>
                    callable,
                SearchSimilarIncidentsRequest request,
                ApiCallContext context,
                ApiFuture<SearchSimilarIncidentsResponse> futureResponse) {
              PageContext<
                      SearchSimilarIncidentsRequest,
                      SearchSimilarIncidentsResponse,
                      SearchSimilarIncidentsResponse.Result>
                  pageContext =
                      PageContext.create(
                          callable, SEARCH_SIMILAR_INCIDENTS_PAGE_STR_DESC, request, context);
              return SearchSimilarIncidentsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListAnnotationsRequest, ListAnnotationsResponse, ListAnnotationsPagedResponse>
      LIST_ANNOTATIONS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListAnnotationsRequest, ListAnnotationsResponse, ListAnnotationsPagedResponse>() {
            @Override
            public ApiFuture<ListAnnotationsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListAnnotationsRequest, ListAnnotationsResponse> callable,
                ListAnnotationsRequest request,
                ApiCallContext context,
                ApiFuture<ListAnnotationsResponse> futureResponse) {
              PageContext<ListAnnotationsRequest, ListAnnotationsResponse, Annotation> pageContext =
                  PageContext.create(callable, LIST_ANNOTATIONS_PAGE_STR_DESC, request, context);
              return ListAnnotationsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListTagsRequest, ListTagsResponse, ListTagsPagedResponse>
      LIST_TAGS_PAGE_STR_FACT =
          new PagedListResponseFactory<ListTagsRequest, ListTagsResponse, ListTagsPagedResponse>() {
            @Override
            public ApiFuture<ListTagsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListTagsRequest, ListTagsResponse> callable,
                ListTagsRequest request,
                ApiCallContext context,
                ApiFuture<ListTagsResponse> futureResponse) {
              PageContext<ListTagsRequest, ListTagsResponse, Tag> pageContext =
                  PageContext.create(callable, LIST_TAGS_PAGE_STR_DESC, request, context);
              return ListTagsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          SearchSignalsRequest, SearchSignalsResponse, SearchSignalsPagedResponse>
      SEARCH_SIGNALS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              SearchSignalsRequest, SearchSignalsResponse, SearchSignalsPagedResponse>() {
            @Override
            public ApiFuture<SearchSignalsPagedResponse> getFuturePagedResponse(
                UnaryCallable<SearchSignalsRequest, SearchSignalsResponse> callable,
                SearchSignalsRequest request,
                ApiCallContext context,
                ApiFuture<SearchSignalsResponse> futureResponse) {
              PageContext<SearchSignalsRequest, SearchSignalsResponse, Signal> pageContext =
                  PageContext.create(callable, SEARCH_SIGNALS_PAGE_STR_DESC, request, context);
              return SearchSignalsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListArtifactsRequest, ListArtifactsResponse, ListArtifactsPagedResponse>
      LIST_ARTIFACTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListArtifactsRequest, ListArtifactsResponse, ListArtifactsPagedResponse>() {
            @Override
            public ApiFuture<ListArtifactsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListArtifactsRequest, ListArtifactsResponse> callable,
                ListArtifactsRequest request,
                ApiCallContext context,
                ApiFuture<ListArtifactsResponse> futureResponse) {
              PageContext<ListArtifactsRequest, ListArtifactsResponse, Artifact> pageContext =
                  PageContext.create(callable, LIST_ARTIFACTS_PAGE_STR_DESC, request, context);
              return ListArtifactsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListSubscriptionsRequest, ListSubscriptionsResponse, ListSubscriptionsPagedResponse>
      LIST_SUBSCRIPTIONS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListSubscriptionsRequest,
              ListSubscriptionsResponse,
              ListSubscriptionsPagedResponse>() {
            @Override
            public ApiFuture<ListSubscriptionsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListSubscriptionsRequest, ListSubscriptionsResponse> callable,
                ListSubscriptionsRequest request,
                ApiCallContext context,
                ApiFuture<ListSubscriptionsResponse> futureResponse) {
              PageContext<ListSubscriptionsRequest, ListSubscriptionsResponse, Subscription>
                  pageContext =
                      PageContext.create(
                          callable, LIST_SUBSCRIPTIONS_PAGE_STR_DESC, request, context);
              return ListSubscriptionsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListIncidentRoleAssignmentsRequest,
          ListIncidentRoleAssignmentsResponse,
          ListIncidentRoleAssignmentsPagedResponse>
      LIST_INCIDENT_ROLE_ASSIGNMENTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListIncidentRoleAssignmentsRequest,
              ListIncidentRoleAssignmentsResponse,
              ListIncidentRoleAssignmentsPagedResponse>() {
            @Override
            public ApiFuture<ListIncidentRoleAssignmentsPagedResponse> getFuturePagedResponse(
                UnaryCallable<
                        ListIncidentRoleAssignmentsRequest, ListIncidentRoleAssignmentsResponse>
                    callable,
                ListIncidentRoleAssignmentsRequest request,
                ApiCallContext context,
                ApiFuture<ListIncidentRoleAssignmentsResponse> futureResponse) {
              PageContext<
                      ListIncidentRoleAssignmentsRequest,
                      ListIncidentRoleAssignmentsResponse,
                      IncidentRoleAssignment>
                  pageContext =
                      PageContext.create(
                          callable, LIST_INCIDENT_ROLE_ASSIGNMENTS_PAGE_STR_DESC, request, context);
              return ListIncidentRoleAssignmentsPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  /** Builder for IncidentServiceStubSettings. */
  public static class Builder extends StubSettings.Builder<IncidentServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<CreateIncidentRequest, Incident> createIncidentSettings;
    private final UnaryCallSettings.Builder<GetIncidentRequest, Incident> getIncidentSettings;
    private final PagedCallSettings.Builder<
            SearchIncidentsRequest, SearchIncidentsResponse, SearchIncidentsPagedResponse>
        searchIncidentsSettings;
    private final UnaryCallSettings.Builder<UpdateIncidentRequest, Incident> updateIncidentSettings;
    private final PagedCallSettings.Builder<
            SearchSimilarIncidentsRequest,
            SearchSimilarIncidentsResponse,
            SearchSimilarIncidentsPagedResponse>
        searchSimilarIncidentsSettings;
    private final UnaryCallSettings.Builder<CreateAnnotationRequest, Annotation>
        createAnnotationSettings;
    private final PagedCallSettings.Builder<
            ListAnnotationsRequest, ListAnnotationsResponse, ListAnnotationsPagedResponse>
        listAnnotationsSettings;
    private final UnaryCallSettings.Builder<CreateTagRequest, Tag> createTagSettings;
    private final UnaryCallSettings.Builder<DeleteTagRequest, Empty> deleteTagSettings;
    private final PagedCallSettings.Builder<
            ListTagsRequest, ListTagsResponse, ListTagsPagedResponse>
        listTagsSettings;
    private final UnaryCallSettings.Builder<CreateSignalRequest, Signal> createSignalSettings;
    private final PagedCallSettings.Builder<
            SearchSignalsRequest, SearchSignalsResponse, SearchSignalsPagedResponse>
        searchSignalsSettings;
    private final UnaryCallSettings.Builder<GetSignalRequest, Signal> getSignalSettings;
    private final UnaryCallSettings.Builder<LookupSignalRequest, Signal> lookupSignalSettings;
    private final UnaryCallSettings.Builder<UpdateSignalRequest, Signal> updateSignalSettings;
    private final UnaryCallSettings.Builder<EscalateIncidentRequest, EscalateIncidentResponse>
        escalateIncidentSettings;
    private final UnaryCallSettings.Builder<CreateArtifactRequest, Artifact> createArtifactSettings;
    private final PagedCallSettings.Builder<
            ListArtifactsRequest, ListArtifactsResponse, ListArtifactsPagedResponse>
        listArtifactsSettings;
    private final UnaryCallSettings.Builder<UpdateArtifactRequest, Artifact> updateArtifactSettings;
    private final UnaryCallSettings.Builder<DeleteArtifactRequest, Empty> deleteArtifactSettings;
    private final UnaryCallSettings.Builder<SendShiftHandoffRequest, SendShiftHandoffResponse>
        sendShiftHandoffSettings;
    private final UnaryCallSettings.Builder<CreateSubscriptionRequest, Subscription>
        createSubscriptionSettings;
    private final UnaryCallSettings.Builder<UpdateSubscriptionRequest, Subscription>
        updateSubscriptionSettings;
    private final PagedCallSettings.Builder<
            ListSubscriptionsRequest, ListSubscriptionsResponse, ListSubscriptionsPagedResponse>
        listSubscriptionsSettings;
    private final UnaryCallSettings.Builder<DeleteSubscriptionRequest, Empty>
        deleteSubscriptionSettings;
    private final UnaryCallSettings.Builder<
            CreateIncidentRoleAssignmentRequest, IncidentRoleAssignment>
        createIncidentRoleAssignmentSettings;
    private final UnaryCallSettings.Builder<DeleteIncidentRoleAssignmentRequest, Empty>
        deleteIncidentRoleAssignmentSettings;
    private final PagedCallSettings.Builder<
            ListIncidentRoleAssignmentsRequest,
            ListIncidentRoleAssignmentsResponse,
            ListIncidentRoleAssignmentsPagedResponse>
        listIncidentRoleAssignmentsSettings;
    private final UnaryCallSettings.Builder<
            RequestIncidentRoleHandoverRequest, IncidentRoleAssignment>
        requestIncidentRoleHandoverSettings;
    private final UnaryCallSettings.Builder<
            ConfirmIncidentRoleHandoverRequest, IncidentRoleAssignment>
        confirmIncidentRoleHandoverSettings;
    private final UnaryCallSettings.Builder<
            ForceIncidentRoleHandoverRequest, IncidentRoleAssignment>
        forceIncidentRoleHandoverSettings;
    private final UnaryCallSettings.Builder<
            CancelIncidentRoleHandoverRequest, IncidentRoleAssignment>
        cancelIncidentRoleHandoverSettings;

    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "idempotent",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put("non_idempotent", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(20000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(20000L))
              .setTotalTimeout(Duration.ofMillis(600000L))
              .build();
      definitions.put("default", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      createIncidentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getIncidentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      searchIncidentsSettings = PagedCallSettings.newBuilder(SEARCH_INCIDENTS_PAGE_STR_FACT);

      updateIncidentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      searchSimilarIncidentsSettings =
          PagedCallSettings.newBuilder(SEARCH_SIMILAR_INCIDENTS_PAGE_STR_FACT);

      createAnnotationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listAnnotationsSettings = PagedCallSettings.newBuilder(LIST_ANNOTATIONS_PAGE_STR_FACT);

      createTagSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteTagSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listTagsSettings = PagedCallSettings.newBuilder(LIST_TAGS_PAGE_STR_FACT);

      createSignalSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      searchSignalsSettings = PagedCallSettings.newBuilder(SEARCH_SIGNALS_PAGE_STR_FACT);

      getSignalSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      lookupSignalSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      updateSignalSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      escalateIncidentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      createArtifactSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listArtifactsSettings = PagedCallSettings.newBuilder(LIST_ARTIFACTS_PAGE_STR_FACT);

      updateArtifactSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteArtifactSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      sendShiftHandoffSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      createSubscriptionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      updateSubscriptionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listSubscriptionsSettings = PagedCallSettings.newBuilder(LIST_SUBSCRIPTIONS_PAGE_STR_FACT);

      deleteSubscriptionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      createIncidentRoleAssignmentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteIncidentRoleAssignmentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listIncidentRoleAssignmentsSettings =
          PagedCallSettings.newBuilder(LIST_INCIDENT_ROLE_ASSIGNMENTS_PAGE_STR_FACT);

      requestIncidentRoleHandoverSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      confirmIncidentRoleHandoverSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      forceIncidentRoleHandoverSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      cancelIncidentRoleHandoverSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createIncidentSettings,
              getIncidentSettings,
              searchIncidentsSettings,
              updateIncidentSettings,
              searchSimilarIncidentsSettings,
              createAnnotationSettings,
              listAnnotationsSettings,
              createTagSettings,
              deleteTagSettings,
              listTagsSettings,
              createSignalSettings,
              searchSignalsSettings,
              getSignalSettings,
              lookupSignalSettings,
              updateSignalSettings,
              escalateIncidentSettings,
              createArtifactSettings,
              listArtifactsSettings,
              updateArtifactSettings,
              deleteArtifactSettings,
              sendShiftHandoffSettings,
              createSubscriptionSettings,
              updateSubscriptionSettings,
              listSubscriptionsSettings,
              deleteSubscriptionSettings,
              createIncidentRoleAssignmentSettings,
              deleteIncidentRoleAssignmentSettings,
              listIncidentRoleAssignmentsSettings,
              requestIncidentRoleHandoverSettings,
              confirmIncidentRoleHandoverSettings,
              forceIncidentRoleHandoverSettings,
              cancelIncidentRoleHandoverSettings);

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder
          .createIncidentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getIncidentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .searchIncidentsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .updateIncidentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .searchSimilarIncidentsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .createAnnotationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listAnnotationsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .createTagSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteTagSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listTagsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .createSignalSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .searchSignalsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getSignalSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .lookupSignalSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .updateSignalSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .escalateIncidentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .createArtifactSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listArtifactsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .updateArtifactSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteArtifactSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .sendShiftHandoffSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .createSubscriptionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .updateSubscriptionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listSubscriptionsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteSubscriptionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .createIncidentRoleAssignmentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteIncidentRoleAssignmentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listIncidentRoleAssignmentsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .requestIncidentRoleHandoverSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .confirmIncidentRoleHandoverSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .forceIncidentRoleHandoverSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .cancelIncidentRoleHandoverSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    protected Builder(IncidentServiceStubSettings settings) {
      super(settings);

      createIncidentSettings = settings.createIncidentSettings.toBuilder();
      getIncidentSettings = settings.getIncidentSettings.toBuilder();
      searchIncidentsSettings = settings.searchIncidentsSettings.toBuilder();
      updateIncidentSettings = settings.updateIncidentSettings.toBuilder();
      searchSimilarIncidentsSettings = settings.searchSimilarIncidentsSettings.toBuilder();
      createAnnotationSettings = settings.createAnnotationSettings.toBuilder();
      listAnnotationsSettings = settings.listAnnotationsSettings.toBuilder();
      createTagSettings = settings.createTagSettings.toBuilder();
      deleteTagSettings = settings.deleteTagSettings.toBuilder();
      listTagsSettings = settings.listTagsSettings.toBuilder();
      createSignalSettings = settings.createSignalSettings.toBuilder();
      searchSignalsSettings = settings.searchSignalsSettings.toBuilder();
      getSignalSettings = settings.getSignalSettings.toBuilder();
      lookupSignalSettings = settings.lookupSignalSettings.toBuilder();
      updateSignalSettings = settings.updateSignalSettings.toBuilder();
      escalateIncidentSettings = settings.escalateIncidentSettings.toBuilder();
      createArtifactSettings = settings.createArtifactSettings.toBuilder();
      listArtifactsSettings = settings.listArtifactsSettings.toBuilder();
      updateArtifactSettings = settings.updateArtifactSettings.toBuilder();
      deleteArtifactSettings = settings.deleteArtifactSettings.toBuilder();
      sendShiftHandoffSettings = settings.sendShiftHandoffSettings.toBuilder();
      createSubscriptionSettings = settings.createSubscriptionSettings.toBuilder();
      updateSubscriptionSettings = settings.updateSubscriptionSettings.toBuilder();
      listSubscriptionsSettings = settings.listSubscriptionsSettings.toBuilder();
      deleteSubscriptionSettings = settings.deleteSubscriptionSettings.toBuilder();
      createIncidentRoleAssignmentSettings =
          settings.createIncidentRoleAssignmentSettings.toBuilder();
      deleteIncidentRoleAssignmentSettings =
          settings.deleteIncidentRoleAssignmentSettings.toBuilder();
      listIncidentRoleAssignmentsSettings =
          settings.listIncidentRoleAssignmentsSettings.toBuilder();
      requestIncidentRoleHandoverSettings =
          settings.requestIncidentRoleHandoverSettings.toBuilder();
      confirmIncidentRoleHandoverSettings =
          settings.confirmIncidentRoleHandoverSettings.toBuilder();
      forceIncidentRoleHandoverSettings = settings.forceIncidentRoleHandoverSettings.toBuilder();
      cancelIncidentRoleHandoverSettings = settings.cancelIncidentRoleHandoverSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createIncidentSettings,
              getIncidentSettings,
              searchIncidentsSettings,
              updateIncidentSettings,
              searchSimilarIncidentsSettings,
              createAnnotationSettings,
              listAnnotationsSettings,
              createTagSettings,
              deleteTagSettings,
              listTagsSettings,
              createSignalSettings,
              searchSignalsSettings,
              getSignalSettings,
              lookupSignalSettings,
              updateSignalSettings,
              escalateIncidentSettings,
              createArtifactSettings,
              listArtifactsSettings,
              updateArtifactSettings,
              deleteArtifactSettings,
              sendShiftHandoffSettings,
              createSubscriptionSettings,
              updateSubscriptionSettings,
              listSubscriptionsSettings,
              deleteSubscriptionSettings,
              createIncidentRoleAssignmentSettings,
              deleteIncidentRoleAssignmentSettings,
              listIncidentRoleAssignmentsSettings,
              requestIncidentRoleHandoverSettings,
              confirmIncidentRoleHandoverSettings,
              forceIncidentRoleHandoverSettings,
              cancelIncidentRoleHandoverSettings);
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to createIncident. */
    public UnaryCallSettings.Builder<CreateIncidentRequest, Incident> createIncidentSettings() {
      return createIncidentSettings;
    }

    /** Returns the builder for the settings used for calls to getIncident. */
    public UnaryCallSettings.Builder<GetIncidentRequest, Incident> getIncidentSettings() {
      return getIncidentSettings;
    }

    /** Returns the builder for the settings used for calls to searchIncidents. */
    public PagedCallSettings.Builder<
            SearchIncidentsRequest, SearchIncidentsResponse, SearchIncidentsPagedResponse>
        searchIncidentsSettings() {
      return searchIncidentsSettings;
    }

    /** Returns the builder for the settings used for calls to updateIncident. */
    public UnaryCallSettings.Builder<UpdateIncidentRequest, Incident> updateIncidentSettings() {
      return updateIncidentSettings;
    }

    /** Returns the builder for the settings used for calls to searchSimilarIncidents. */
    public PagedCallSettings.Builder<
            SearchSimilarIncidentsRequest,
            SearchSimilarIncidentsResponse,
            SearchSimilarIncidentsPagedResponse>
        searchSimilarIncidentsSettings() {
      return searchSimilarIncidentsSettings;
    }

    /** Returns the builder for the settings used for calls to createAnnotation. */
    public UnaryCallSettings.Builder<CreateAnnotationRequest, Annotation>
        createAnnotationSettings() {
      return createAnnotationSettings;
    }

    /** Returns the builder for the settings used for calls to listAnnotations. */
    public PagedCallSettings.Builder<
            ListAnnotationsRequest, ListAnnotationsResponse, ListAnnotationsPagedResponse>
        listAnnotationsSettings() {
      return listAnnotationsSettings;
    }

    /** Returns the builder for the settings used for calls to createTag. */
    public UnaryCallSettings.Builder<CreateTagRequest, Tag> createTagSettings() {
      return createTagSettings;
    }

    /** Returns the builder for the settings used for calls to deleteTag. */
    public UnaryCallSettings.Builder<DeleteTagRequest, Empty> deleteTagSettings() {
      return deleteTagSettings;
    }

    /** Returns the builder for the settings used for calls to listTags. */
    public PagedCallSettings.Builder<ListTagsRequest, ListTagsResponse, ListTagsPagedResponse>
        listTagsSettings() {
      return listTagsSettings;
    }

    /** Returns the builder for the settings used for calls to createSignal. */
    public UnaryCallSettings.Builder<CreateSignalRequest, Signal> createSignalSettings() {
      return createSignalSettings;
    }

    /** Returns the builder for the settings used for calls to searchSignals. */
    public PagedCallSettings.Builder<
            SearchSignalsRequest, SearchSignalsResponse, SearchSignalsPagedResponse>
        searchSignalsSettings() {
      return searchSignalsSettings;
    }

    /** Returns the builder for the settings used for calls to getSignal. */
    public UnaryCallSettings.Builder<GetSignalRequest, Signal> getSignalSettings() {
      return getSignalSettings;
    }

    /** Returns the builder for the settings used for calls to lookupSignal. */
    public UnaryCallSettings.Builder<LookupSignalRequest, Signal> lookupSignalSettings() {
      return lookupSignalSettings;
    }

    /** Returns the builder for the settings used for calls to updateSignal. */
    public UnaryCallSettings.Builder<UpdateSignalRequest, Signal> updateSignalSettings() {
      return updateSignalSettings;
    }

    /** Returns the builder for the settings used for calls to escalateIncident. */
    public UnaryCallSettings.Builder<EscalateIncidentRequest, EscalateIncidentResponse>
        escalateIncidentSettings() {
      return escalateIncidentSettings;
    }

    /** Returns the builder for the settings used for calls to createArtifact. */
    public UnaryCallSettings.Builder<CreateArtifactRequest, Artifact> createArtifactSettings() {
      return createArtifactSettings;
    }

    /** Returns the builder for the settings used for calls to listArtifacts. */
    public PagedCallSettings.Builder<
            ListArtifactsRequest, ListArtifactsResponse, ListArtifactsPagedResponse>
        listArtifactsSettings() {
      return listArtifactsSettings;
    }

    /** Returns the builder for the settings used for calls to updateArtifact. */
    public UnaryCallSettings.Builder<UpdateArtifactRequest, Artifact> updateArtifactSettings() {
      return updateArtifactSettings;
    }

    /** Returns the builder for the settings used for calls to deleteArtifact. */
    public UnaryCallSettings.Builder<DeleteArtifactRequest, Empty> deleteArtifactSettings() {
      return deleteArtifactSettings;
    }

    /** Returns the builder for the settings used for calls to sendShiftHandoff. */
    public UnaryCallSettings.Builder<SendShiftHandoffRequest, SendShiftHandoffResponse>
        sendShiftHandoffSettings() {
      return sendShiftHandoffSettings;
    }

    /** Returns the builder for the settings used for calls to createSubscription. */
    public UnaryCallSettings.Builder<CreateSubscriptionRequest, Subscription>
        createSubscriptionSettings() {
      return createSubscriptionSettings;
    }

    /** Returns the builder for the settings used for calls to updateSubscription. */
    public UnaryCallSettings.Builder<UpdateSubscriptionRequest, Subscription>
        updateSubscriptionSettings() {
      return updateSubscriptionSettings;
    }

    /** Returns the builder for the settings used for calls to listSubscriptions. */
    public PagedCallSettings.Builder<
            ListSubscriptionsRequest, ListSubscriptionsResponse, ListSubscriptionsPagedResponse>
        listSubscriptionsSettings() {
      return listSubscriptionsSettings;
    }

    /** Returns the builder for the settings used for calls to deleteSubscription. */
    public UnaryCallSettings.Builder<DeleteSubscriptionRequest, Empty>
        deleteSubscriptionSettings() {
      return deleteSubscriptionSettings;
    }

    /** Returns the builder for the settings used for calls to createIncidentRoleAssignment. */
    public UnaryCallSettings.Builder<CreateIncidentRoleAssignmentRequest, IncidentRoleAssignment>
        createIncidentRoleAssignmentSettings() {
      return createIncidentRoleAssignmentSettings;
    }

    /** Returns the builder for the settings used for calls to deleteIncidentRoleAssignment. */
    public UnaryCallSettings.Builder<DeleteIncidentRoleAssignmentRequest, Empty>
        deleteIncidentRoleAssignmentSettings() {
      return deleteIncidentRoleAssignmentSettings;
    }

    /** Returns the builder for the settings used for calls to listIncidentRoleAssignments. */
    public PagedCallSettings.Builder<
            ListIncidentRoleAssignmentsRequest,
            ListIncidentRoleAssignmentsResponse,
            ListIncidentRoleAssignmentsPagedResponse>
        listIncidentRoleAssignmentsSettings() {
      return listIncidentRoleAssignmentsSettings;
    }

    /** Returns the builder for the settings used for calls to requestIncidentRoleHandover. */
    public UnaryCallSettings.Builder<RequestIncidentRoleHandoverRequest, IncidentRoleAssignment>
        requestIncidentRoleHandoverSettings() {
      return requestIncidentRoleHandoverSettings;
    }

    /** Returns the builder for the settings used for calls to confirmIncidentRoleHandover. */
    public UnaryCallSettings.Builder<ConfirmIncidentRoleHandoverRequest, IncidentRoleAssignment>
        confirmIncidentRoleHandoverSettings() {
      return confirmIncidentRoleHandoverSettings;
    }

    /** Returns the builder for the settings used for calls to forceIncidentRoleHandover. */
    public UnaryCallSettings.Builder<ForceIncidentRoleHandoverRequest, IncidentRoleAssignment>
        forceIncidentRoleHandoverSettings() {
      return forceIncidentRoleHandoverSettings;
    }

    /** Returns the builder for the settings used for calls to cancelIncidentRoleHandover. */
    public UnaryCallSettings.Builder<CancelIncidentRoleHandoverRequest, IncidentRoleAssignment>
        cancelIncidentRoleHandoverSettings() {
      return cancelIncidentRoleHandoverSettings;
    }

    @Override
    public IncidentServiceStubSettings build() throws IOException {
      return new IncidentServiceStubSettings(this);
    }
  }
}
