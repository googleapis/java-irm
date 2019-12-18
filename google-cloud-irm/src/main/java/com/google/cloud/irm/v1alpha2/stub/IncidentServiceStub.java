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
import com.google.api.gax.rpc.UnaryCallable;
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
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Stackdriver Incident Response & Management API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class IncidentServiceStub implements BackgroundResource {

  public UnaryCallable<CreateIncidentRequest, Incident> createIncidentCallable() {
    throw new UnsupportedOperationException("Not implemented: createIncidentCallable()");
  }

  public UnaryCallable<GetIncidentRequest, Incident> getIncidentCallable() {
    throw new UnsupportedOperationException("Not implemented: getIncidentCallable()");
  }

  public UnaryCallable<SearchIncidentsRequest, SearchIncidentsPagedResponse>
      searchIncidentsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: searchIncidentsPagedCallable()");
  }

  public UnaryCallable<SearchIncidentsRequest, SearchIncidentsResponse> searchIncidentsCallable() {
    throw new UnsupportedOperationException("Not implemented: searchIncidentsCallable()");
  }

  public UnaryCallable<UpdateIncidentRequest, Incident> updateIncidentCallable() {
    throw new UnsupportedOperationException("Not implemented: updateIncidentCallable()");
  }

  public UnaryCallable<SearchSimilarIncidentsRequest, SearchSimilarIncidentsPagedResponse>
      searchSimilarIncidentsPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: searchSimilarIncidentsPagedCallable()");
  }

  public UnaryCallable<SearchSimilarIncidentsRequest, SearchSimilarIncidentsResponse>
      searchSimilarIncidentsCallable() {
    throw new UnsupportedOperationException("Not implemented: searchSimilarIncidentsCallable()");
  }

  public UnaryCallable<CreateAnnotationRequest, Annotation> createAnnotationCallable() {
    throw new UnsupportedOperationException("Not implemented: createAnnotationCallable()");
  }

  public UnaryCallable<ListAnnotationsRequest, ListAnnotationsPagedResponse>
      listAnnotationsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listAnnotationsPagedCallable()");
  }

  public UnaryCallable<ListAnnotationsRequest, ListAnnotationsResponse> listAnnotationsCallable() {
    throw new UnsupportedOperationException("Not implemented: listAnnotationsCallable()");
  }

  public UnaryCallable<CreateTagRequest, Tag> createTagCallable() {
    throw new UnsupportedOperationException("Not implemented: createTagCallable()");
  }

  public UnaryCallable<DeleteTagRequest, Empty> deleteTagCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteTagCallable()");
  }

  public UnaryCallable<ListTagsRequest, ListTagsPagedResponse> listTagsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listTagsPagedCallable()");
  }

  public UnaryCallable<ListTagsRequest, ListTagsResponse> listTagsCallable() {
    throw new UnsupportedOperationException("Not implemented: listTagsCallable()");
  }

  public UnaryCallable<CreateSignalRequest, Signal> createSignalCallable() {
    throw new UnsupportedOperationException("Not implemented: createSignalCallable()");
  }

  public UnaryCallable<SearchSignalsRequest, SearchSignalsPagedResponse>
      searchSignalsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: searchSignalsPagedCallable()");
  }

  public UnaryCallable<SearchSignalsRequest, SearchSignalsResponse> searchSignalsCallable() {
    throw new UnsupportedOperationException("Not implemented: searchSignalsCallable()");
  }

  public UnaryCallable<GetSignalRequest, Signal> getSignalCallable() {
    throw new UnsupportedOperationException("Not implemented: getSignalCallable()");
  }

  public UnaryCallable<LookupSignalRequest, Signal> lookupSignalCallable() {
    throw new UnsupportedOperationException("Not implemented: lookupSignalCallable()");
  }

  public UnaryCallable<UpdateSignalRequest, Signal> updateSignalCallable() {
    throw new UnsupportedOperationException("Not implemented: updateSignalCallable()");
  }

  public UnaryCallable<EscalateIncidentRequest, EscalateIncidentResponse>
      escalateIncidentCallable() {
    throw new UnsupportedOperationException("Not implemented: escalateIncidentCallable()");
  }

  public UnaryCallable<CreateArtifactRequest, Artifact> createArtifactCallable() {
    throw new UnsupportedOperationException("Not implemented: createArtifactCallable()");
  }

  public UnaryCallable<ListArtifactsRequest, ListArtifactsPagedResponse>
      listArtifactsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listArtifactsPagedCallable()");
  }

  public UnaryCallable<ListArtifactsRequest, ListArtifactsResponse> listArtifactsCallable() {
    throw new UnsupportedOperationException("Not implemented: listArtifactsCallable()");
  }

  public UnaryCallable<UpdateArtifactRequest, Artifact> updateArtifactCallable() {
    throw new UnsupportedOperationException("Not implemented: updateArtifactCallable()");
  }

  public UnaryCallable<DeleteArtifactRequest, Empty> deleteArtifactCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteArtifactCallable()");
  }

  public UnaryCallable<SendShiftHandoffRequest, SendShiftHandoffResponse>
      sendShiftHandoffCallable() {
    throw new UnsupportedOperationException("Not implemented: sendShiftHandoffCallable()");
  }

  public UnaryCallable<CreateSubscriptionRequest, Subscription> createSubscriptionCallable() {
    throw new UnsupportedOperationException("Not implemented: createSubscriptionCallable()");
  }

  public UnaryCallable<UpdateSubscriptionRequest, Subscription> updateSubscriptionCallable() {
    throw new UnsupportedOperationException("Not implemented: updateSubscriptionCallable()");
  }

  public UnaryCallable<ListSubscriptionsRequest, ListSubscriptionsPagedResponse>
      listSubscriptionsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listSubscriptionsPagedCallable()");
  }

  public UnaryCallable<ListSubscriptionsRequest, ListSubscriptionsResponse>
      listSubscriptionsCallable() {
    throw new UnsupportedOperationException("Not implemented: listSubscriptionsCallable()");
  }

  public UnaryCallable<DeleteSubscriptionRequest, Empty> deleteSubscriptionCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteSubscriptionCallable()");
  }

  public UnaryCallable<CreateIncidentRoleAssignmentRequest, IncidentRoleAssignment>
      createIncidentRoleAssignmentCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createIncidentRoleAssignmentCallable()");
  }

  public UnaryCallable<DeleteIncidentRoleAssignmentRequest, Empty>
      deleteIncidentRoleAssignmentCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteIncidentRoleAssignmentCallable()");
  }

  public UnaryCallable<ListIncidentRoleAssignmentsRequest, ListIncidentRoleAssignmentsPagedResponse>
      listIncidentRoleAssignmentsPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listIncidentRoleAssignmentsPagedCallable()");
  }

  public UnaryCallable<ListIncidentRoleAssignmentsRequest, ListIncidentRoleAssignmentsResponse>
      listIncidentRoleAssignmentsCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listIncidentRoleAssignmentsCallable()");
  }

  public UnaryCallable<RequestIncidentRoleHandoverRequest, IncidentRoleAssignment>
      requestIncidentRoleHandoverCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: requestIncidentRoleHandoverCallable()");
  }

  public UnaryCallable<ConfirmIncidentRoleHandoverRequest, IncidentRoleAssignment>
      confirmIncidentRoleHandoverCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: confirmIncidentRoleHandoverCallable()");
  }

  public UnaryCallable<ForceIncidentRoleHandoverRequest, IncidentRoleAssignment>
      forceIncidentRoleHandoverCallable() {
    throw new UnsupportedOperationException("Not implemented: forceIncidentRoleHandoverCallable()");
  }

  public UnaryCallable<CancelIncidentRoleHandoverRequest, IncidentRoleAssignment>
      cancelIncidentRoleHandoverCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: cancelIncidentRoleHandoverCallable()");
  }

  @Override
  public abstract void close();
}
