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
package com.google.cloud.irm.v1alpha2;

import static com.google.cloud.irm.v1alpha2.IncidentServiceClient.ListAnnotationsPagedResponse;
import static com.google.cloud.irm.v1alpha2.IncidentServiceClient.ListArtifactsPagedResponse;
import static com.google.cloud.irm.v1alpha2.IncidentServiceClient.ListIncidentRoleAssignmentsPagedResponse;
import static com.google.cloud.irm.v1alpha2.IncidentServiceClient.ListSubscriptionsPagedResponse;
import static com.google.cloud.irm.v1alpha2.IncidentServiceClient.ListTagsPagedResponse;
import static com.google.cloud.irm.v1alpha2.IncidentServiceClient.SearchIncidentsPagedResponse;
import static com.google.cloud.irm.v1alpha2.IncidentServiceClient.SearchSignalsPagedResponse;
import static com.google.cloud.irm.v1alpha2.IncidentServiceClient.SearchSimilarIncidentsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.irm.v1alpha2.stub.IncidentServiceStubSettings;
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

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link IncidentServiceClient}.
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
 * <p>For example, to set the total timeout of deleteArtifact to 30 seconds:
 *
 * <pre>
 * <code>
 * IncidentServiceSettings.Builder incidentServiceSettingsBuilder =
 *     IncidentServiceSettings.newBuilder();
 * incidentServiceSettingsBuilder
 *     .deleteArtifactSettings()
 *     .setRetrySettings(
 *         incidentServiceSettingsBuilder.deleteArtifactSettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * IncidentServiceSettings incidentServiceSettings = incidentServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class IncidentServiceSettings extends ClientSettings<IncidentServiceSettings> {
  /** Returns the object with the settings used for calls to deleteArtifact. */
  public UnaryCallSettings<DeleteArtifactRequest, Empty> deleteArtifactSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).deleteArtifactSettings();
  }

  /** Returns the object with the settings used for calls to requestIncidentRoleHandover. */
  public UnaryCallSettings<RequestIncidentRoleHandoverRequest, IncidentRoleAssignment>
      requestIncidentRoleHandoverSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).requestIncidentRoleHandoverSettings();
  }

  /** Returns the object with the settings used for calls to confirmIncidentRoleHandover. */
  public UnaryCallSettings<ConfirmIncidentRoleHandoverRequest, IncidentRoleAssignment>
      confirmIncidentRoleHandoverSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).confirmIncidentRoleHandoverSettings();
  }

  /** Returns the object with the settings used for calls to forceIncidentRoleHandover. */
  public UnaryCallSettings<ForceIncidentRoleHandoverRequest, IncidentRoleAssignment>
      forceIncidentRoleHandoverSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).forceIncidentRoleHandoverSettings();
  }

  /** Returns the object with the settings used for calls to createIncident. */
  public UnaryCallSettings<CreateIncidentRequest, Incident> createIncidentSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).createIncidentSettings();
  }

  /** Returns the object with the settings used for calls to getIncident. */
  public UnaryCallSettings<GetIncidentRequest, Incident> getIncidentSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).getIncidentSettings();
  }

  /** Returns the object with the settings used for calls to searchIncidents. */
  public PagedCallSettings<
          SearchIncidentsRequest, SearchIncidentsResponse, SearchIncidentsPagedResponse>
      searchIncidentsSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).searchIncidentsSettings();
  }

  /** Returns the object with the settings used for calls to updateIncident. */
  public UnaryCallSettings<UpdateIncidentRequest, Incident> updateIncidentSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).updateIncidentSettings();
  }

  /** Returns the object with the settings used for calls to searchSimilarIncidents. */
  public PagedCallSettings<
          SearchSimilarIncidentsRequest,
          SearchSimilarIncidentsResponse,
          SearchSimilarIncidentsPagedResponse>
      searchSimilarIncidentsSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).searchSimilarIncidentsSettings();
  }

  /** Returns the object with the settings used for calls to createAnnotation. */
  public UnaryCallSettings<CreateAnnotationRequest, Annotation> createAnnotationSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).createAnnotationSettings();
  }

  /** Returns the object with the settings used for calls to listAnnotations. */
  public PagedCallSettings<
          ListAnnotationsRequest, ListAnnotationsResponse, ListAnnotationsPagedResponse>
      listAnnotationsSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).listAnnotationsSettings();
  }

  /** Returns the object with the settings used for calls to createTag. */
  public UnaryCallSettings<CreateTagRequest, Tag> createTagSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).createTagSettings();
  }

  /** Returns the object with the settings used for calls to deleteTag. */
  public UnaryCallSettings<DeleteTagRequest, Empty> deleteTagSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).deleteTagSettings();
  }

  /** Returns the object with the settings used for calls to listTags. */
  public PagedCallSettings<ListTagsRequest, ListTagsResponse, ListTagsPagedResponse>
      listTagsSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).listTagsSettings();
  }

  /** Returns the object with the settings used for calls to createSignal. */
  public UnaryCallSettings<CreateSignalRequest, Signal> createSignalSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).createSignalSettings();
  }

  /** Returns the object with the settings used for calls to searchSignals. */
  public PagedCallSettings<SearchSignalsRequest, SearchSignalsResponse, SearchSignalsPagedResponse>
      searchSignalsSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).searchSignalsSettings();
  }

  /** Returns the object with the settings used for calls to lookupSignal. */
  public UnaryCallSettings<LookupSignalRequest, Signal> lookupSignalSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).lookupSignalSettings();
  }

  /** Returns the object with the settings used for calls to getSignal. */
  public UnaryCallSettings<GetSignalRequest, Signal> getSignalSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).getSignalSettings();
  }

  /** Returns the object with the settings used for calls to updateSignal. */
  public UnaryCallSettings<UpdateSignalRequest, Signal> updateSignalSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).updateSignalSettings();
  }

  /** Returns the object with the settings used for calls to escalateIncident. */
  public UnaryCallSettings<EscalateIncidentRequest, EscalateIncidentResponse>
      escalateIncidentSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).escalateIncidentSettings();
  }

  /** Returns the object with the settings used for calls to createArtifact. */
  public UnaryCallSettings<CreateArtifactRequest, Artifact> createArtifactSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).createArtifactSettings();
  }

  /** Returns the object with the settings used for calls to listArtifacts. */
  public PagedCallSettings<ListArtifactsRequest, ListArtifactsResponse, ListArtifactsPagedResponse>
      listArtifactsSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).listArtifactsSettings();
  }

  /** Returns the object with the settings used for calls to updateArtifact. */
  public UnaryCallSettings<UpdateArtifactRequest, Artifact> updateArtifactSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).updateArtifactSettings();
  }

  /** Returns the object with the settings used for calls to sendShiftHandoff. */
  public UnaryCallSettings<SendShiftHandoffRequest, SendShiftHandoffResponse>
      sendShiftHandoffSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).sendShiftHandoffSettings();
  }

  /** Returns the object with the settings used for calls to createSubscription. */
  public UnaryCallSettings<CreateSubscriptionRequest, Subscription> createSubscriptionSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).createSubscriptionSettings();
  }

  /** Returns the object with the settings used for calls to updateSubscription. */
  public UnaryCallSettings<UpdateSubscriptionRequest, Subscription> updateSubscriptionSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).updateSubscriptionSettings();
  }

  /** Returns the object with the settings used for calls to listSubscriptions. */
  public PagedCallSettings<
          ListSubscriptionsRequest, ListSubscriptionsResponse, ListSubscriptionsPagedResponse>
      listSubscriptionsSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).listSubscriptionsSettings();
  }

  /** Returns the object with the settings used for calls to deleteSubscription. */
  public UnaryCallSettings<DeleteSubscriptionRequest, Empty> deleteSubscriptionSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).deleteSubscriptionSettings();
  }

  /** Returns the object with the settings used for calls to createIncidentRoleAssignment. */
  public UnaryCallSettings<CreateIncidentRoleAssignmentRequest, IncidentRoleAssignment>
      createIncidentRoleAssignmentSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).createIncidentRoleAssignmentSettings();
  }

  /** Returns the object with the settings used for calls to deleteIncidentRoleAssignment. */
  public UnaryCallSettings<DeleteIncidentRoleAssignmentRequest, Empty>
      deleteIncidentRoleAssignmentSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).deleteIncidentRoleAssignmentSettings();
  }

  /** Returns the object with the settings used for calls to listIncidentRoleAssignments. */
  public PagedCallSettings<
          ListIncidentRoleAssignmentsRequest,
          ListIncidentRoleAssignmentsResponse,
          ListIncidentRoleAssignmentsPagedResponse>
      listIncidentRoleAssignmentsSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).listIncidentRoleAssignmentsSettings();
  }

  /** Returns the object with the settings used for calls to cancelIncidentRoleHandover. */
  public UnaryCallSettings<CancelIncidentRoleHandoverRequest, IncidentRoleAssignment>
      cancelIncidentRoleHandoverSettings() {
    return ((IncidentServiceStubSettings) getStubSettings()).cancelIncidentRoleHandoverSettings();
  }

  public static final IncidentServiceSettings create(IncidentServiceStubSettings stub)
      throws IOException {
    return new IncidentServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return IncidentServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return IncidentServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return IncidentServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return IncidentServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return IncidentServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return IncidentServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return IncidentServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected IncidentServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for IncidentServiceSettings. */
  public static class Builder extends ClientSettings.Builder<IncidentServiceSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(IncidentServiceStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(IncidentServiceStubSettings.newBuilder());
    }

    protected Builder(IncidentServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(IncidentServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public IncidentServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((IncidentServiceStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to deleteArtifact. */
    public UnaryCallSettings.Builder<DeleteArtifactRequest, Empty> deleteArtifactSettings() {
      return getStubSettingsBuilder().deleteArtifactSettings();
    }

    /** Returns the builder for the settings used for calls to requestIncidentRoleHandover. */
    public UnaryCallSettings.Builder<RequestIncidentRoleHandoverRequest, IncidentRoleAssignment>
        requestIncidentRoleHandoverSettings() {
      return getStubSettingsBuilder().requestIncidentRoleHandoverSettings();
    }

    /** Returns the builder for the settings used for calls to confirmIncidentRoleHandover. */
    public UnaryCallSettings.Builder<ConfirmIncidentRoleHandoverRequest, IncidentRoleAssignment>
        confirmIncidentRoleHandoverSettings() {
      return getStubSettingsBuilder().confirmIncidentRoleHandoverSettings();
    }

    /** Returns the builder for the settings used for calls to forceIncidentRoleHandover. */
    public UnaryCallSettings.Builder<ForceIncidentRoleHandoverRequest, IncidentRoleAssignment>
        forceIncidentRoleHandoverSettings() {
      return getStubSettingsBuilder().forceIncidentRoleHandoverSettings();
    }

    /** Returns the builder for the settings used for calls to createIncident. */
    public UnaryCallSettings.Builder<CreateIncidentRequest, Incident> createIncidentSettings() {
      return getStubSettingsBuilder().createIncidentSettings();
    }

    /** Returns the builder for the settings used for calls to getIncident. */
    public UnaryCallSettings.Builder<GetIncidentRequest, Incident> getIncidentSettings() {
      return getStubSettingsBuilder().getIncidentSettings();
    }

    /** Returns the builder for the settings used for calls to searchIncidents. */
    public PagedCallSettings.Builder<
            SearchIncidentsRequest, SearchIncidentsResponse, SearchIncidentsPagedResponse>
        searchIncidentsSettings() {
      return getStubSettingsBuilder().searchIncidentsSettings();
    }

    /** Returns the builder for the settings used for calls to updateIncident. */
    public UnaryCallSettings.Builder<UpdateIncidentRequest, Incident> updateIncidentSettings() {
      return getStubSettingsBuilder().updateIncidentSettings();
    }

    /** Returns the builder for the settings used for calls to searchSimilarIncidents. */
    public PagedCallSettings.Builder<
            SearchSimilarIncidentsRequest,
            SearchSimilarIncidentsResponse,
            SearchSimilarIncidentsPagedResponse>
        searchSimilarIncidentsSettings() {
      return getStubSettingsBuilder().searchSimilarIncidentsSettings();
    }

    /** Returns the builder for the settings used for calls to createAnnotation. */
    public UnaryCallSettings.Builder<CreateAnnotationRequest, Annotation>
        createAnnotationSettings() {
      return getStubSettingsBuilder().createAnnotationSettings();
    }

    /** Returns the builder for the settings used for calls to listAnnotations. */
    public PagedCallSettings.Builder<
            ListAnnotationsRequest, ListAnnotationsResponse, ListAnnotationsPagedResponse>
        listAnnotationsSettings() {
      return getStubSettingsBuilder().listAnnotationsSettings();
    }

    /** Returns the builder for the settings used for calls to createTag. */
    public UnaryCallSettings.Builder<CreateTagRequest, Tag> createTagSettings() {
      return getStubSettingsBuilder().createTagSettings();
    }

    /** Returns the builder for the settings used for calls to deleteTag. */
    public UnaryCallSettings.Builder<DeleteTagRequest, Empty> deleteTagSettings() {
      return getStubSettingsBuilder().deleteTagSettings();
    }

    /** Returns the builder for the settings used for calls to listTags. */
    public PagedCallSettings.Builder<ListTagsRequest, ListTagsResponse, ListTagsPagedResponse>
        listTagsSettings() {
      return getStubSettingsBuilder().listTagsSettings();
    }

    /** Returns the builder for the settings used for calls to createSignal. */
    public UnaryCallSettings.Builder<CreateSignalRequest, Signal> createSignalSettings() {
      return getStubSettingsBuilder().createSignalSettings();
    }

    /** Returns the builder for the settings used for calls to searchSignals. */
    public PagedCallSettings.Builder<
            SearchSignalsRequest, SearchSignalsResponse, SearchSignalsPagedResponse>
        searchSignalsSettings() {
      return getStubSettingsBuilder().searchSignalsSettings();
    }

    /** Returns the builder for the settings used for calls to lookupSignal. */
    public UnaryCallSettings.Builder<LookupSignalRequest, Signal> lookupSignalSettings() {
      return getStubSettingsBuilder().lookupSignalSettings();
    }

    /** Returns the builder for the settings used for calls to getSignal. */
    public UnaryCallSettings.Builder<GetSignalRequest, Signal> getSignalSettings() {
      return getStubSettingsBuilder().getSignalSettings();
    }

    /** Returns the builder for the settings used for calls to updateSignal. */
    public UnaryCallSettings.Builder<UpdateSignalRequest, Signal> updateSignalSettings() {
      return getStubSettingsBuilder().updateSignalSettings();
    }

    /** Returns the builder for the settings used for calls to escalateIncident. */
    public UnaryCallSettings.Builder<EscalateIncidentRequest, EscalateIncidentResponse>
        escalateIncidentSettings() {
      return getStubSettingsBuilder().escalateIncidentSettings();
    }

    /** Returns the builder for the settings used for calls to createArtifact. */
    public UnaryCallSettings.Builder<CreateArtifactRequest, Artifact> createArtifactSettings() {
      return getStubSettingsBuilder().createArtifactSettings();
    }

    /** Returns the builder for the settings used for calls to listArtifacts. */
    public PagedCallSettings.Builder<
            ListArtifactsRequest, ListArtifactsResponse, ListArtifactsPagedResponse>
        listArtifactsSettings() {
      return getStubSettingsBuilder().listArtifactsSettings();
    }

    /** Returns the builder for the settings used for calls to updateArtifact. */
    public UnaryCallSettings.Builder<UpdateArtifactRequest, Artifact> updateArtifactSettings() {
      return getStubSettingsBuilder().updateArtifactSettings();
    }

    /** Returns the builder for the settings used for calls to sendShiftHandoff. */
    public UnaryCallSettings.Builder<SendShiftHandoffRequest, SendShiftHandoffResponse>
        sendShiftHandoffSettings() {
      return getStubSettingsBuilder().sendShiftHandoffSettings();
    }

    /** Returns the builder for the settings used for calls to createSubscription. */
    public UnaryCallSettings.Builder<CreateSubscriptionRequest, Subscription>
        createSubscriptionSettings() {
      return getStubSettingsBuilder().createSubscriptionSettings();
    }

    /** Returns the builder for the settings used for calls to updateSubscription. */
    public UnaryCallSettings.Builder<UpdateSubscriptionRequest, Subscription>
        updateSubscriptionSettings() {
      return getStubSettingsBuilder().updateSubscriptionSettings();
    }

    /** Returns the builder for the settings used for calls to listSubscriptions. */
    public PagedCallSettings.Builder<
            ListSubscriptionsRequest, ListSubscriptionsResponse, ListSubscriptionsPagedResponse>
        listSubscriptionsSettings() {
      return getStubSettingsBuilder().listSubscriptionsSettings();
    }

    /** Returns the builder for the settings used for calls to deleteSubscription. */
    public UnaryCallSettings.Builder<DeleteSubscriptionRequest, Empty>
        deleteSubscriptionSettings() {
      return getStubSettingsBuilder().deleteSubscriptionSettings();
    }

    /** Returns the builder for the settings used for calls to createIncidentRoleAssignment. */
    public UnaryCallSettings.Builder<CreateIncidentRoleAssignmentRequest, IncidentRoleAssignment>
        createIncidentRoleAssignmentSettings() {
      return getStubSettingsBuilder().createIncidentRoleAssignmentSettings();
    }

    /** Returns the builder for the settings used for calls to deleteIncidentRoleAssignment. */
    public UnaryCallSettings.Builder<DeleteIncidentRoleAssignmentRequest, Empty>
        deleteIncidentRoleAssignmentSettings() {
      return getStubSettingsBuilder().deleteIncidentRoleAssignmentSettings();
    }

    /** Returns the builder for the settings used for calls to listIncidentRoleAssignments. */
    public PagedCallSettings.Builder<
            ListIncidentRoleAssignmentsRequest,
            ListIncidentRoleAssignmentsResponse,
            ListIncidentRoleAssignmentsPagedResponse>
        listIncidentRoleAssignmentsSettings() {
      return getStubSettingsBuilder().listIncidentRoleAssignmentsSettings();
    }

    /** Returns the builder for the settings used for calls to cancelIncidentRoleHandover. */
    public UnaryCallSettings.Builder<CancelIncidentRoleHandoverRequest, IncidentRoleAssignment>
        cancelIncidentRoleHandoverSettings() {
      return getStubSettingsBuilder().cancelIncidentRoleHandoverSettings();
    }

    @Override
    public IncidentServiceSettings build() throws IOException {
      return new IncidentServiceSettings(this);
    }
  }
}
