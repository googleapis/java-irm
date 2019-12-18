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
package com.google.cloud.irm.v1alpha2;

import com.google.api.core.BetaApi;
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
import com.google.irm.service.v1alpha2.api.IncidentServiceGrpc.IncidentServiceImplBase;
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
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@javax.annotation.Generated("by GAPIC")
@BetaApi
public class MockIncidentServiceImpl extends IncidentServiceImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockIncidentServiceImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<AbstractMessage> getRequests() {
    return requests;
  }

  public void addResponse(AbstractMessage response) {
    responses.add(response);
  }

  public void setResponses(List<AbstractMessage> responses) {
    this.responses = new LinkedList<Object>(responses);
  }

  public void addException(Exception exception) {
    responses.add(exception);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void createIncident(
      CreateIncidentRequest request, StreamObserver<Incident> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Incident) {
      requests.add(request);
      responseObserver.onNext((Incident) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void getIncident(GetIncidentRequest request, StreamObserver<Incident> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Incident) {
      requests.add(request);
      responseObserver.onNext((Incident) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void searchIncidents(
      SearchIncidentsRequest request, StreamObserver<SearchIncidentsResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof SearchIncidentsResponse) {
      requests.add(request);
      responseObserver.onNext((SearchIncidentsResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void updateIncident(
      UpdateIncidentRequest request, StreamObserver<Incident> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Incident) {
      requests.add(request);
      responseObserver.onNext((Incident) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void searchSimilarIncidents(
      SearchSimilarIncidentsRequest request,
      StreamObserver<SearchSimilarIncidentsResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof SearchSimilarIncidentsResponse) {
      requests.add(request);
      responseObserver.onNext((SearchSimilarIncidentsResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void createAnnotation(
      CreateAnnotationRequest request, StreamObserver<Annotation> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Annotation) {
      requests.add(request);
      responseObserver.onNext((Annotation) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void listAnnotations(
      ListAnnotationsRequest request, StreamObserver<ListAnnotationsResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof ListAnnotationsResponse) {
      requests.add(request);
      responseObserver.onNext((ListAnnotationsResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void createTag(CreateTagRequest request, StreamObserver<Tag> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Tag) {
      requests.add(request);
      responseObserver.onNext((Tag) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void deleteTag(DeleteTagRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext((Empty) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void listTags(ListTagsRequest request, StreamObserver<ListTagsResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof ListTagsResponse) {
      requests.add(request);
      responseObserver.onNext((ListTagsResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void createSignal(CreateSignalRequest request, StreamObserver<Signal> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Signal) {
      requests.add(request);
      responseObserver.onNext((Signal) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void searchSignals(
      SearchSignalsRequest request, StreamObserver<SearchSignalsResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof SearchSignalsResponse) {
      requests.add(request);
      responseObserver.onNext((SearchSignalsResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void lookupSignal(LookupSignalRequest request, StreamObserver<Signal> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Signal) {
      requests.add(request);
      responseObserver.onNext((Signal) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void getSignal(GetSignalRequest request, StreamObserver<Signal> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Signal) {
      requests.add(request);
      responseObserver.onNext((Signal) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void updateSignal(UpdateSignalRequest request, StreamObserver<Signal> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Signal) {
      requests.add(request);
      responseObserver.onNext((Signal) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void escalateIncident(
      EscalateIncidentRequest request, StreamObserver<EscalateIncidentResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof EscalateIncidentResponse) {
      requests.add(request);
      responseObserver.onNext((EscalateIncidentResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void createArtifact(
      CreateArtifactRequest request, StreamObserver<Artifact> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Artifact) {
      requests.add(request);
      responseObserver.onNext((Artifact) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void listArtifacts(
      ListArtifactsRequest request, StreamObserver<ListArtifactsResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof ListArtifactsResponse) {
      requests.add(request);
      responseObserver.onNext((ListArtifactsResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void updateArtifact(
      UpdateArtifactRequest request, StreamObserver<Artifact> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Artifact) {
      requests.add(request);
      responseObserver.onNext((Artifact) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void deleteArtifact(
      DeleteArtifactRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext((Empty) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void sendShiftHandoff(
      SendShiftHandoffRequest request, StreamObserver<SendShiftHandoffResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof SendShiftHandoffResponse) {
      requests.add(request);
      responseObserver.onNext((SendShiftHandoffResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void createSubscription(
      CreateSubscriptionRequest request, StreamObserver<Subscription> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Subscription) {
      requests.add(request);
      responseObserver.onNext((Subscription) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void updateSubscription(
      UpdateSubscriptionRequest request, StreamObserver<Subscription> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Subscription) {
      requests.add(request);
      responseObserver.onNext((Subscription) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void listSubscriptions(
      ListSubscriptionsRequest request,
      StreamObserver<ListSubscriptionsResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof ListSubscriptionsResponse) {
      requests.add(request);
      responseObserver.onNext((ListSubscriptionsResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void deleteSubscription(
      DeleteSubscriptionRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext((Empty) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void createIncidentRoleAssignment(
      CreateIncidentRoleAssignmentRequest request,
      StreamObserver<IncidentRoleAssignment> responseObserver) {
    Object response = responses.remove();
    if (response instanceof IncidentRoleAssignment) {
      requests.add(request);
      responseObserver.onNext((IncidentRoleAssignment) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void deleteIncidentRoleAssignment(
      DeleteIncidentRoleAssignmentRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext((Empty) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void listIncidentRoleAssignments(
      ListIncidentRoleAssignmentsRequest request,
      StreamObserver<ListIncidentRoleAssignmentsResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof ListIncidentRoleAssignmentsResponse) {
      requests.add(request);
      responseObserver.onNext((ListIncidentRoleAssignmentsResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void requestIncidentRoleHandover(
      RequestIncidentRoleHandoverRequest request,
      StreamObserver<IncidentRoleAssignment> responseObserver) {
    Object response = responses.remove();
    if (response instanceof IncidentRoleAssignment) {
      requests.add(request);
      responseObserver.onNext((IncidentRoleAssignment) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void confirmIncidentRoleHandover(
      ConfirmIncidentRoleHandoverRequest request,
      StreamObserver<IncidentRoleAssignment> responseObserver) {
    Object response = responses.remove();
    if (response instanceof IncidentRoleAssignment) {
      requests.add(request);
      responseObserver.onNext((IncidentRoleAssignment) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void forceIncidentRoleHandover(
      ForceIncidentRoleHandoverRequest request,
      StreamObserver<IncidentRoleAssignment> responseObserver) {
    Object response = responses.remove();
    if (response instanceof IncidentRoleAssignment) {
      requests.add(request);
      responseObserver.onNext((IncidentRoleAssignment) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void cancelIncidentRoleHandover(
      CancelIncidentRoleHandoverRequest request,
      StreamObserver<IncidentRoleAssignment> responseObserver) {
    Object response = responses.remove();
    if (response instanceof IncidentRoleAssignment) {
      requests.add(request);
      responseObserver.onNext((IncidentRoleAssignment) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }
}
