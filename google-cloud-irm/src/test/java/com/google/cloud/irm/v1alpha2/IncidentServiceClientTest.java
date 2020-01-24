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

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.common.collect.Lists;
import com.google.irm.service.v1alpha2.api.Annotation;
import com.google.irm.service.v1alpha2.api.AnnotationName;
import com.google.irm.service.v1alpha2.api.Artifact;
import com.google.irm.service.v1alpha2.api.ArtifactName;
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
import com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest;
import com.google.irm.service.v1alpha2.api.GetIncidentRequest;
import com.google.irm.service.v1alpha2.api.GetSignalRequest;
import com.google.irm.service.v1alpha2.api.Incident;
import com.google.irm.service.v1alpha2.api.IncidentName;
import com.google.irm.service.v1alpha2.api.IncidentRoleAssignment;
import com.google.irm.service.v1alpha2.api.IncidentRoleAssignmentName;
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
import com.google.irm.service.v1alpha2.api.ProjectName;
import com.google.irm.service.v1alpha2.api.RequestIncidentRoleHandoverRequest;
import com.google.irm.service.v1alpha2.api.SearchIncidentsRequest;
import com.google.irm.service.v1alpha2.api.SearchIncidentsResponse;
import com.google.irm.service.v1alpha2.api.SearchSignalsRequest;
import com.google.irm.service.v1alpha2.api.SearchSignalsResponse;
import com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsRequest;
import com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsResponse;
import com.google.irm.service.v1alpha2.api.Signal;
import com.google.irm.service.v1alpha2.api.SignalName;
import com.google.irm.service.v1alpha2.api.Subscription;
import com.google.irm.service.v1alpha2.api.SubscriptionName;
import com.google.irm.service.v1alpha2.api.Tag;
import com.google.irm.service.v1alpha2.api.TagName;
import com.google.irm.service.v1alpha2.api.UpdateArtifactRequest;
import com.google.irm.service.v1alpha2.api.UpdateIncidentRequest;
import com.google.irm.service.v1alpha2.api.UpdateSignalRequest;
import com.google.irm.service.v1alpha2.api.UpdateSubscriptionRequest;
import com.google.irm.service.v1alpha2.api.User;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class IncidentServiceClientTest {
  private static MockIncidentService mockIncidentService;
  private static MockServiceHelper serviceHelper;
  private IncidentServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockIncidentService = new MockIncidentService();
    serviceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockIncidentService));
    serviceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    serviceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    serviceHelper.reset();
    channelProvider = serviceHelper.createChannelProvider();
    IncidentServiceSettings settings =
        IncidentServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = IncidentServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void deleteArtifactTest() {
    Empty expectedResponse = Empty.newBuilder().build();
    mockIncidentService.addResponse(expectedResponse);

    ArtifactName name = ArtifactName.of("[PROJECT]", "[INCIDENT]", "[ARTIFACT]");

    client.deleteArtifact(name);

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteArtifactRequest actualRequest = (DeleteArtifactRequest) actualRequests.get(0);

    Assert.assertEquals(name, ArtifactName.parse(actualRequest.getName()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void deleteArtifactExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      ArtifactName name = ArtifactName.of("[PROJECT]", "[INCIDENT]", "[ARTIFACT]");

      client.deleteArtifact(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void requestIncidentRoleHandoverTest() {
    IncidentRoleAssignmentName name2 =
        IncidentRoleAssignmentName.of("[PROJECT_ID_OR_NUMBER]", "[INCIDENT_ID]", "[ROLE_ID]");
    String etag = "etag3123477";
    IncidentRoleAssignment expectedResponse =
        IncidentRoleAssignment.newBuilder().setName(name2.toString()).setEtag(etag).build();
    mockIncidentService.addResponse(expectedResponse);

    String name = "name3373707";
    User newAssignee = User.newBuilder().build();

    IncidentRoleAssignment actualResponse = client.requestIncidentRoleHandover(name, newAssignee);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RequestIncidentRoleHandoverRequest actualRequest =
        (RequestIncidentRoleHandoverRequest) actualRequests.get(0);

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertEquals(newAssignee, actualRequest.getNewAssignee());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void requestIncidentRoleHandoverExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      String name = "name3373707";
      User newAssignee = User.newBuilder().build();

      client.requestIncidentRoleHandover(name, newAssignee);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void confirmIncidentRoleHandoverTest() {
    IncidentRoleAssignmentName name2 =
        IncidentRoleAssignmentName.of("[PROJECT_ID_OR_NUMBER]", "[INCIDENT_ID]", "[ROLE_ID]");
    String etag = "etag3123477";
    IncidentRoleAssignment expectedResponse =
        IncidentRoleAssignment.newBuilder().setName(name2.toString()).setEtag(etag).build();
    mockIncidentService.addResponse(expectedResponse);

    IncidentRoleAssignmentName name =
        IncidentRoleAssignmentName.of("[PROJECT_ID_OR_NUMBER]", "[INCIDENT_ID]", "[ROLE_ID]");
    User newAssignee = User.newBuilder().build();

    IncidentRoleAssignment actualResponse = client.confirmIncidentRoleHandover(name, newAssignee);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ConfirmIncidentRoleHandoverRequest actualRequest =
        (ConfirmIncidentRoleHandoverRequest) actualRequests.get(0);

    Assert.assertEquals(name, IncidentRoleAssignmentName.parse(actualRequest.getName()));
    Assert.assertEquals(newAssignee, actualRequest.getNewAssignee());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void confirmIncidentRoleHandoverExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      IncidentRoleAssignmentName name =
          IncidentRoleAssignmentName.of("[PROJECT_ID_OR_NUMBER]", "[INCIDENT_ID]", "[ROLE_ID]");
      User newAssignee = User.newBuilder().build();

      client.confirmIncidentRoleHandover(name, newAssignee);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void forceIncidentRoleHandoverTest() {
    IncidentRoleAssignmentName name2 =
        IncidentRoleAssignmentName.of("[PROJECT_ID_OR_NUMBER]", "[INCIDENT_ID]", "[ROLE_ID]");
    String etag = "etag3123477";
    IncidentRoleAssignment expectedResponse =
        IncidentRoleAssignment.newBuilder().setName(name2.toString()).setEtag(etag).build();
    mockIncidentService.addResponse(expectedResponse);

    IncidentRoleAssignmentName name =
        IncidentRoleAssignmentName.of("[PROJECT_ID_OR_NUMBER]", "[INCIDENT_ID]", "[ROLE_ID]");
    User newAssignee = User.newBuilder().build();

    IncidentRoleAssignment actualResponse = client.forceIncidentRoleHandover(name, newAssignee);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ForceIncidentRoleHandoverRequest actualRequest =
        (ForceIncidentRoleHandoverRequest) actualRequests.get(0);

    Assert.assertEquals(name, IncidentRoleAssignmentName.parse(actualRequest.getName()));
    Assert.assertEquals(newAssignee, actualRequest.getNewAssignee());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void forceIncidentRoleHandoverExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      IncidentRoleAssignmentName name =
          IncidentRoleAssignmentName.of("[PROJECT_ID_OR_NUMBER]", "[INCIDENT_ID]", "[ROLE_ID]");
      User newAssignee = User.newBuilder().build();

      client.forceIncidentRoleHandover(name, newAssignee);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void createIncidentTest() {
    IncidentName name = IncidentName.of("[PROJECT]", "[INCIDENT]");
    String title = "title110371416";
    String etag = "etag3123477";
    String duplicateIncident = "duplicateIncident-316496506";
    Incident expectedResponse =
        Incident.newBuilder()
            .setName(name.toString())
            .setTitle(title)
            .setEtag(etag)
            .setDuplicateIncident(duplicateIncident)
            .build();
    mockIncidentService.addResponse(expectedResponse);

    Incident incident = Incident.newBuilder().build();
    ProjectName parent = ProjectName.of("[PROJECT]");

    Incident actualResponse = client.createIncident(incident, parent);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateIncidentRequest actualRequest = (CreateIncidentRequest) actualRequests.get(0);

    Assert.assertEquals(incident, actualRequest.getIncident());
    Assert.assertEquals(parent, ProjectName.parse(actualRequest.getParent()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void createIncidentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      Incident incident = Incident.newBuilder().build();
      ProjectName parent = ProjectName.of("[PROJECT]");

      client.createIncident(incident, parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getIncidentTest() {
    IncidentName name2 = IncidentName.of("[PROJECT]", "[INCIDENT]");
    String title = "title110371416";
    String etag = "etag3123477";
    String duplicateIncident = "duplicateIncident-316496506";
    Incident expectedResponse =
        Incident.newBuilder()
            .setName(name2.toString())
            .setTitle(title)
            .setEtag(etag)
            .setDuplicateIncident(duplicateIncident)
            .build();
    mockIncidentService.addResponse(expectedResponse);

    IncidentName name = IncidentName.of("[PROJECT]", "[INCIDENT]");

    Incident actualResponse = client.getIncident(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetIncidentRequest actualRequest = (GetIncidentRequest) actualRequests.get(0);

    Assert.assertEquals(name, IncidentName.parse(actualRequest.getName()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getIncidentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      IncidentName name = IncidentName.of("[PROJECT]", "[INCIDENT]");

      client.getIncident(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void searchIncidentsTest() {
    String nextPageToken = "";
    Incident incidentsElement = Incident.newBuilder().build();
    List<Incident> incidents = Arrays.asList(incidentsElement);
    SearchIncidentsResponse expectedResponse =
        SearchIncidentsResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllIncidents(incidents)
            .build();
    mockIncidentService.addResponse(expectedResponse);

    ProjectName parent = ProjectName.of("[PROJECT]");
    String query = "query107944136";
    String timeZone = "timeZone36848094";

    SearchIncidentsPagedResponse pagedListResponse =
        client.searchIncidents(parent, query, timeZone);

    List<Incident> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getIncidentsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SearchIncidentsRequest actualRequest = (SearchIncidentsRequest) actualRequests.get(0);

    Assert.assertEquals(parent, ProjectName.parse(actualRequest.getParent()));
    Assert.assertEquals(query, actualRequest.getQuery());
    Assert.assertEquals(timeZone, actualRequest.getTimeZone());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void searchIncidentsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      ProjectName parent = ProjectName.of("[PROJECT]");
      String query = "query107944136";
      String timeZone = "timeZone36848094";

      client.searchIncidents(parent, query, timeZone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateIncidentTest() {
    IncidentName name = IncidentName.of("[PROJECT]", "[INCIDENT]");
    String title = "title110371416";
    String etag = "etag3123477";
    String duplicateIncident = "duplicateIncident-316496506";
    Incident expectedResponse =
        Incident.newBuilder()
            .setName(name.toString())
            .setTitle(title)
            .setEtag(etag)
            .setDuplicateIncident(duplicateIncident)
            .build();
    mockIncidentService.addResponse(expectedResponse);

    Incident incident = Incident.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    Incident actualResponse = client.updateIncident(incident, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateIncidentRequest actualRequest = (UpdateIncidentRequest) actualRequests.get(0);

    Assert.assertEquals(incident, actualRequest.getIncident());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void updateIncidentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      Incident incident = Incident.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();

      client.updateIncident(incident, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void searchSimilarIncidentsTest() {
    String nextPageToken = "";
    SearchSimilarIncidentsResponse.Result resultsElement =
        SearchSimilarIncidentsResponse.Result.newBuilder().build();
    List<SearchSimilarIncidentsResponse.Result> results = Arrays.asList(resultsElement);
    SearchSimilarIncidentsResponse expectedResponse =
        SearchSimilarIncidentsResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllResults(results)
            .build();
    mockIncidentService.addResponse(expectedResponse);

    IncidentName name = IncidentName.of("[PROJECT]", "[INCIDENT]");

    SearchSimilarIncidentsPagedResponse pagedListResponse = client.searchSimilarIncidents(name);

    List<SearchSimilarIncidentsResponse.Result> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getResultsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SearchSimilarIncidentsRequest actualRequest =
        (SearchSimilarIncidentsRequest) actualRequests.get(0);

    Assert.assertEquals(name, IncidentName.parse(actualRequest.getName()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void searchSimilarIncidentsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      IncidentName name = IncidentName.of("[PROJECT]", "[INCIDENT]");

      client.searchSimilarIncidents(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void createAnnotationTest() {
    AnnotationName name = AnnotationName.of("[PROJECT]", "[INCIDENT]", "[ANNOTATION]");
    String content = "content951530617";
    String contentType = "contentType831846208";
    Annotation expectedResponse =
        Annotation.newBuilder()
            .setName(name.toString())
            .setContent(content)
            .setContentType(contentType)
            .build();
    mockIncidentService.addResponse(expectedResponse);

    IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
    Annotation annotation = Annotation.newBuilder().build();

    Annotation actualResponse = client.createAnnotation(parent, annotation);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateAnnotationRequest actualRequest = (CreateAnnotationRequest) actualRequests.get(0);

    Assert.assertEquals(parent, IncidentName.parse(actualRequest.getParent()));
    Assert.assertEquals(annotation, actualRequest.getAnnotation());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void createAnnotationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
      Annotation annotation = Annotation.newBuilder().build();

      client.createAnnotation(parent, annotation);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listAnnotationsTest() {
    String nextPageToken = "";
    Annotation annotationsElement = Annotation.newBuilder().build();
    List<Annotation> annotations = Arrays.asList(annotationsElement);
    ListAnnotationsResponse expectedResponse =
        ListAnnotationsResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllAnnotations(annotations)
            .build();
    mockIncidentService.addResponse(expectedResponse);

    IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");

    ListAnnotationsPagedResponse pagedListResponse = client.listAnnotations(parent);

    List<Annotation> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAnnotationsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAnnotationsRequest actualRequest = (ListAnnotationsRequest) actualRequests.get(0);

    Assert.assertEquals(parent, IncidentName.parse(actualRequest.getParent()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listAnnotationsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");

      client.listAnnotations(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void createTagTest() {
    TagName name = TagName.of("[PROJECT]", "[INCIDENT]", "[TAG]");
    String displayName = "displayName1615086568";
    Tag expectedResponse =
        Tag.newBuilder().setName(name.toString()).setDisplayName(displayName).build();
    mockIncidentService.addResponse(expectedResponse);

    IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
    Tag tag = Tag.newBuilder().build();

    Tag actualResponse = client.createTag(parent, tag);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateTagRequest actualRequest = (CreateTagRequest) actualRequests.get(0);

    Assert.assertEquals(parent, IncidentName.parse(actualRequest.getParent()));
    Assert.assertEquals(tag, actualRequest.getTag());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void createTagExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
      Tag tag = Tag.newBuilder().build();

      client.createTag(parent, tag);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteTagTest() {
    Empty expectedResponse = Empty.newBuilder().build();
    mockIncidentService.addResponse(expectedResponse);

    TagName name = TagName.of("[PROJECT]", "[INCIDENT]", "[TAG]");

    client.deleteTag(name);

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteTagRequest actualRequest = (DeleteTagRequest) actualRequests.get(0);

    Assert.assertEquals(name, TagName.parse(actualRequest.getName()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void deleteTagExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      TagName name = TagName.of("[PROJECT]", "[INCIDENT]", "[TAG]");

      client.deleteTag(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listTagsTest() {
    String nextPageToken = "";
    Tag tagsElement = Tag.newBuilder().build();
    List<Tag> tags = Arrays.asList(tagsElement);
    ListTagsResponse expectedResponse =
        ListTagsResponse.newBuilder().setNextPageToken(nextPageToken).addAllTags(tags).build();
    mockIncidentService.addResponse(expectedResponse);

    IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");

    ListTagsPagedResponse pagedListResponse = client.listTags(parent);

    List<Tag> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getTagsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListTagsRequest actualRequest = (ListTagsRequest) actualRequests.get(0);

    Assert.assertEquals(parent, IncidentName.parse(actualRequest.getParent()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listTagsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");

      client.listTags(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void createSignalTest() {
    SignalName name = SignalName.of("[PROJECT]", "[SIGNAL]");
    String etag = "etag3123477";
    String incident = "incident86983890";
    String title = "title110371416";
    String contentType = "contentType831846208";
    String content = "content951530617";
    Signal expectedResponse =
        Signal.newBuilder()
            .setName(name.toString())
            .setEtag(etag)
            .setIncident(incident)
            .setTitle(title)
            .setContentType(contentType)
            .setContent(content)
            .build();
    mockIncidentService.addResponse(expectedResponse);

    ProjectName parent = ProjectName.of("[PROJECT]");
    Signal signal = Signal.newBuilder().build();

    Signal actualResponse = client.createSignal(parent, signal);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateSignalRequest actualRequest = (CreateSignalRequest) actualRequests.get(0);

    Assert.assertEquals(parent, ProjectName.parse(actualRequest.getParent()));
    Assert.assertEquals(signal, actualRequest.getSignal());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void createSignalExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      ProjectName parent = ProjectName.of("[PROJECT]");
      Signal signal = Signal.newBuilder().build();

      client.createSignal(parent, signal);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void searchSignalsTest() {
    String nextPageToken = "";
    Signal signalsElement = Signal.newBuilder().build();
    List<Signal> signals = Arrays.asList(signalsElement);
    SearchSignalsResponse expectedResponse =
        SearchSignalsResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllSignals(signals)
            .build();
    mockIncidentService.addResponse(expectedResponse);

    ProjectName parent = ProjectName.of("[PROJECT]");
    String query = "query107944136";

    SearchSignalsPagedResponse pagedListResponse = client.searchSignals(parent, query);

    List<Signal> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getSignalsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SearchSignalsRequest actualRequest = (SearchSignalsRequest) actualRequests.get(0);

    Assert.assertEquals(parent, ProjectName.parse(actualRequest.getParent()));
    Assert.assertEquals(query, actualRequest.getQuery());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void searchSignalsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      ProjectName parent = ProjectName.of("[PROJECT]");
      String query = "query107944136";

      client.searchSignals(parent, query);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getSignalTest() {
    SignalName name2 = SignalName.of("[PROJECT]", "[SIGNAL]");
    String etag = "etag3123477";
    String incident = "incident86983890";
    String title = "title110371416";
    String contentType = "contentType831846208";
    String content = "content951530617";
    Signal expectedResponse =
        Signal.newBuilder()
            .setName(name2.toString())
            .setEtag(etag)
            .setIncident(incident)
            .setTitle(title)
            .setContentType(contentType)
            .setContent(content)
            .build();
    mockIncidentService.addResponse(expectedResponse);

    SignalName name = SignalName.of("[PROJECT]", "[SIGNAL]");

    Signal actualResponse = client.getSignal(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetSignalRequest actualRequest = (GetSignalRequest) actualRequests.get(0);

    Assert.assertEquals(name, SignalName.parse(actualRequest.getName()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getSignalExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      SignalName name = SignalName.of("[PROJECT]", "[SIGNAL]");

      client.getSignal(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateSignalTest() {
    SignalName name = SignalName.of("[PROJECT]", "[SIGNAL]");
    String etag = "etag3123477";
    String incident = "incident86983890";
    String title = "title110371416";
    String contentType = "contentType831846208";
    String content = "content951530617";
    Signal expectedResponse =
        Signal.newBuilder()
            .setName(name.toString())
            .setEtag(etag)
            .setIncident(incident)
            .setTitle(title)
            .setContentType(contentType)
            .setContent(content)
            .build();
    mockIncidentService.addResponse(expectedResponse);

    Signal signal = Signal.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    Signal actualResponse = client.updateSignal(signal, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateSignalRequest actualRequest = (UpdateSignalRequest) actualRequests.get(0);

    Assert.assertEquals(signal, actualRequest.getSignal());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void updateSignalExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      Signal signal = Signal.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();

      client.updateSignal(signal, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void createArtifactTest() {
    ArtifactName name = ArtifactName.of("[PROJECT]", "[INCIDENT]", "[ARTIFACT]");
    String displayName = "displayName1615086568";
    String etag = "etag3123477";
    String url = "url116079";
    Artifact expectedResponse =
        Artifact.newBuilder()
            .setName(name.toString())
            .setDisplayName(displayName)
            .setEtag(etag)
            .setUrl(url)
            .build();
    mockIncidentService.addResponse(expectedResponse);

    IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
    Artifact artifact = Artifact.newBuilder().build();

    Artifact actualResponse = client.createArtifact(parent, artifact);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateArtifactRequest actualRequest = (CreateArtifactRequest) actualRequests.get(0);

    Assert.assertEquals(parent, IncidentName.parse(actualRequest.getParent()));
    Assert.assertEquals(artifact, actualRequest.getArtifact());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void createArtifactExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
      Artifact artifact = Artifact.newBuilder().build();

      client.createArtifact(parent, artifact);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listArtifactsTest() {
    String nextPageToken = "";
    Artifact artifactsElement = Artifact.newBuilder().build();
    List<Artifact> artifacts = Arrays.asList(artifactsElement);
    ListArtifactsResponse expectedResponse =
        ListArtifactsResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllArtifacts(artifacts)
            .build();
    mockIncidentService.addResponse(expectedResponse);

    IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");

    ListArtifactsPagedResponse pagedListResponse = client.listArtifacts(parent);

    List<Artifact> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getArtifactsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListArtifactsRequest actualRequest = (ListArtifactsRequest) actualRequests.get(0);

    Assert.assertEquals(parent, IncidentName.parse(actualRequest.getParent()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listArtifactsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");

      client.listArtifacts(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateArtifactTest() {
    ArtifactName name = ArtifactName.of("[PROJECT]", "[INCIDENT]", "[ARTIFACT]");
    String displayName = "displayName1615086568";
    String etag = "etag3123477";
    String url = "url116079";
    Artifact expectedResponse =
        Artifact.newBuilder()
            .setName(name.toString())
            .setDisplayName(displayName)
            .setEtag(etag)
            .setUrl(url)
            .build();
    mockIncidentService.addResponse(expectedResponse);

    Artifact artifact = Artifact.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    Artifact actualResponse = client.updateArtifact(artifact, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateArtifactRequest actualRequest = (UpdateArtifactRequest) actualRequests.get(0);

    Assert.assertEquals(artifact, actualRequest.getArtifact());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void updateArtifactExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      Artifact artifact = Artifact.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();

      client.updateArtifact(artifact, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void createSubscriptionTest() {
    SubscriptionName name = SubscriptionName.of("[PROJECT]", "[INCIDENT]", "[SUBSCRIPTION]");
    String etag = "etag3123477";
    Subscription expectedResponse =
        Subscription.newBuilder().setName(name.toString()).setEtag(etag).build();
    mockIncidentService.addResponse(expectedResponse);

    IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
    Subscription subscription = Subscription.newBuilder().build();

    Subscription actualResponse = client.createSubscription(parent, subscription);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateSubscriptionRequest actualRequest = (CreateSubscriptionRequest) actualRequests.get(0);

    Assert.assertEquals(parent, IncidentName.parse(actualRequest.getParent()));
    Assert.assertEquals(subscription, actualRequest.getSubscription());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void createSubscriptionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
      Subscription subscription = Subscription.newBuilder().build();

      client.createSubscription(parent, subscription);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateSubscriptionTest() {
    SubscriptionName name = SubscriptionName.of("[PROJECT]", "[INCIDENT]", "[SUBSCRIPTION]");
    String etag = "etag3123477";
    Subscription expectedResponse =
        Subscription.newBuilder().setName(name.toString()).setEtag(etag).build();
    mockIncidentService.addResponse(expectedResponse);

    Subscription subscription = Subscription.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    Subscription actualResponse = client.updateSubscription(subscription, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateSubscriptionRequest actualRequest = (UpdateSubscriptionRequest) actualRequests.get(0);

    Assert.assertEquals(subscription, actualRequest.getSubscription());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void updateSubscriptionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      Subscription subscription = Subscription.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();

      client.updateSubscription(subscription, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listSubscriptionsTest() {
    String nextPageToken = "";
    Subscription subscriptionsElement = Subscription.newBuilder().build();
    List<Subscription> subscriptions = Arrays.asList(subscriptionsElement);
    ListSubscriptionsResponse expectedResponse =
        ListSubscriptionsResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllSubscriptions(subscriptions)
            .build();
    mockIncidentService.addResponse(expectedResponse);

    IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");

    ListSubscriptionsPagedResponse pagedListResponse = client.listSubscriptions(parent);

    List<Subscription> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getSubscriptionsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListSubscriptionsRequest actualRequest = (ListSubscriptionsRequest) actualRequests.get(0);

    Assert.assertEquals(parent, IncidentName.parse(actualRequest.getParent()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listSubscriptionsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");

      client.listSubscriptions(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteSubscriptionTest() {
    Empty expectedResponse = Empty.newBuilder().build();
    mockIncidentService.addResponse(expectedResponse);

    SubscriptionName name = SubscriptionName.of("[PROJECT]", "[INCIDENT]", "[SUBSCRIPTION]");

    client.deleteSubscription(name);

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteSubscriptionRequest actualRequest = (DeleteSubscriptionRequest) actualRequests.get(0);

    Assert.assertEquals(name, SubscriptionName.parse(actualRequest.getName()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void deleteSubscriptionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      SubscriptionName name = SubscriptionName.of("[PROJECT]", "[INCIDENT]", "[SUBSCRIPTION]");

      client.deleteSubscription(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void createIncidentRoleAssignmentTest() {
    IncidentRoleAssignmentName name =
        IncidentRoleAssignmentName.of("[PROJECT_ID_OR_NUMBER]", "[INCIDENT_ID]", "[ROLE_ID]");
    String etag = "etag3123477";
    IncidentRoleAssignment expectedResponse =
        IncidentRoleAssignment.newBuilder().setName(name.toString()).setEtag(etag).build();
    mockIncidentService.addResponse(expectedResponse);

    IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
    IncidentRoleAssignment incidentRoleAssignment = IncidentRoleAssignment.newBuilder().build();

    IncidentRoleAssignment actualResponse =
        client.createIncidentRoleAssignment(parent, incidentRoleAssignment);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateIncidentRoleAssignmentRequest actualRequest =
        (CreateIncidentRoleAssignmentRequest) actualRequests.get(0);

    Assert.assertEquals(parent, IncidentName.parse(actualRequest.getParent()));
    Assert.assertEquals(incidentRoleAssignment, actualRequest.getIncidentRoleAssignment());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void createIncidentRoleAssignmentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
      IncidentRoleAssignment incidentRoleAssignment = IncidentRoleAssignment.newBuilder().build();

      client.createIncidentRoleAssignment(parent, incidentRoleAssignment);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteIncidentRoleAssignmentTest() {
    Empty expectedResponse = Empty.newBuilder().build();
    mockIncidentService.addResponse(expectedResponse);

    IncidentName name = IncidentName.of("[PROJECT]", "[INCIDENT]");

    client.deleteIncidentRoleAssignment(name);

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteIncidentRoleAssignmentRequest actualRequest =
        (DeleteIncidentRoleAssignmentRequest) actualRequests.get(0);

    Assert.assertEquals(name, IncidentName.parse(actualRequest.getName()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void deleteIncidentRoleAssignmentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      IncidentName name = IncidentName.of("[PROJECT]", "[INCIDENT]");

      client.deleteIncidentRoleAssignment(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listIncidentRoleAssignmentsTest() {
    String nextPageToken = "";
    IncidentRoleAssignment incidentRoleAssignmentsElement =
        IncidentRoleAssignment.newBuilder().build();
    List<IncidentRoleAssignment> incidentRoleAssignments =
        Arrays.asList(incidentRoleAssignmentsElement);
    ListIncidentRoleAssignmentsResponse expectedResponse =
        ListIncidentRoleAssignmentsResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllIncidentRoleAssignments(incidentRoleAssignments)
            .build();
    mockIncidentService.addResponse(expectedResponse);

    IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");

    ListIncidentRoleAssignmentsPagedResponse pagedListResponse =
        client.listIncidentRoleAssignments(parent);

    List<IncidentRoleAssignment> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getIncidentRoleAssignmentsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListIncidentRoleAssignmentsRequest actualRequest =
        (ListIncidentRoleAssignmentsRequest) actualRequests.get(0);

    Assert.assertEquals(parent, IncidentName.parse(actualRequest.getParent()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listIncidentRoleAssignmentsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");

      client.listIncidentRoleAssignments(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void cancelIncidentRoleHandoverTest() {
    IncidentRoleAssignmentName name2 =
        IncidentRoleAssignmentName.of("[PROJECT_ID_OR_NUMBER]", "[INCIDENT_ID]", "[ROLE_ID]");
    String etag = "etag3123477";
    IncidentRoleAssignment expectedResponse =
        IncidentRoleAssignment.newBuilder().setName(name2.toString()).setEtag(etag).build();
    mockIncidentService.addResponse(expectedResponse);

    IncidentRoleAssignmentName name =
        IncidentRoleAssignmentName.of("[PROJECT_ID_OR_NUMBER]", "[INCIDENT_ID]", "[ROLE_ID]");
    User newAssignee = User.newBuilder().build();

    IncidentRoleAssignment actualResponse = client.cancelIncidentRoleHandover(name, newAssignee);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIncidentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CancelIncidentRoleHandoverRequest actualRequest =
        (CancelIncidentRoleHandoverRequest) actualRequests.get(0);

    Assert.assertEquals(name, IncidentRoleAssignmentName.parse(actualRequest.getName()));
    Assert.assertEquals(newAssignee, actualRequest.getNewAssignee());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void cancelIncidentRoleHandoverExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockIncidentService.addException(exception);

    try {
      IncidentRoleAssignmentName name =
          IncidentRoleAssignmentName.of("[PROJECT_ID_OR_NUMBER]", "[INCIDENT_ID]", "[ROLE_ID]");
      User newAssignee = User.newBuilder().build();

      client.cancelIncidentRoleHandover(name, newAssignee);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
