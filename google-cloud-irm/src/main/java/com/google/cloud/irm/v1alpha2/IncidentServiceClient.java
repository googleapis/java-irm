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

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.irm.v1alpha2.stub.IncidentServiceStub;
import com.google.cloud.irm.v1alpha2.stub.IncidentServiceStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.irm.service.v1alpha2.api.Annotation;
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
import com.google.irm.service.v1alpha2.api.EscalateIncidentRequest;
import com.google.irm.service.v1alpha2.api.EscalateIncidentResponse;
import com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest;
import com.google.irm.service.v1alpha2.api.GetIncidentRequest;
import com.google.irm.service.v1alpha2.api.GetSignalRequest;
import com.google.irm.service.v1alpha2.api.Incident;
import com.google.irm.service.v1alpha2.api.IncidentName;
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
import com.google.irm.service.v1alpha2.api.ProjectName;
import com.google.irm.service.v1alpha2.api.RequestIncidentRoleHandoverRequest;
import com.google.irm.service.v1alpha2.api.RoleAssignmentName;
import com.google.irm.service.v1alpha2.api.SearchIncidentsRequest;
import com.google.irm.service.v1alpha2.api.SearchIncidentsResponse;
import com.google.irm.service.v1alpha2.api.SearchSignalsRequest;
import com.google.irm.service.v1alpha2.api.SearchSignalsResponse;
import com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsRequest;
import com.google.irm.service.v1alpha2.api.SearchSimilarIncidentsResponse;
import com.google.irm.service.v1alpha2.api.SendShiftHandoffRequest;
import com.google.irm.service.v1alpha2.api.SendShiftHandoffResponse;
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
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: The Incident API for Incident Response &amp; Management.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
 *   Incident incident = Incident.newBuilder().build();
 *   ProjectName parent = ProjectName.of("[PROJECT]");
 *   Incident response = incidentServiceClient.createIncident(incident, parent);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the incidentServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of IncidentServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * IncidentServiceSettings incidentServiceSettings =
 *     IncidentServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * IncidentServiceClient incidentServiceClient =
 *     IncidentServiceClient.create(incidentServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * IncidentServiceSettings incidentServiceSettings =
 *     IncidentServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * IncidentServiceClient incidentServiceClient =
 *     IncidentServiceClient.create(incidentServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class IncidentServiceClient implements BackgroundResource {
  private final IncidentServiceSettings settings;
  private final IncidentServiceStub stub;

  /** Constructs an instance of IncidentServiceClient with default settings. */
  public static final IncidentServiceClient create() throws IOException {
    return create(IncidentServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of IncidentServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final IncidentServiceClient create(IncidentServiceSettings settings)
      throws IOException {
    return new IncidentServiceClient(settings);
  }

  /**
   * Constructs an instance of IncidentServiceClient, using the given stub for making calls. This is
   * for advanced usage - prefer to use IncidentServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final IncidentServiceClient create(IncidentServiceStub stub) {
    return new IncidentServiceClient(stub);
  }

  /**
   * Constructs an instance of IncidentServiceClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected IncidentServiceClient(IncidentServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((IncidentServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected IncidentServiceClient(IncidentServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final IncidentServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public IncidentServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   Incident incident = Incident.newBuilder().build();
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   Incident response = incidentServiceClient.createIncident(incident, parent);
   * }
   * </code></pre>
   *
   * @param incident The incident to create.
   * @param parent The resource name of the hosting Stackdriver project which the incident belongs
   *     to. The name is of the form `projects/{project_id_or_number}` .
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Incident createIncident(Incident incident, ProjectName parent) {

    CreateIncidentRequest request =
        CreateIncidentRequest.newBuilder()
            .setIncident(incident)
            .setParent(parent == null ? null : parent.toString())
            .build();
    return createIncident(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   Incident incident = Incident.newBuilder().build();
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   Incident response = incidentServiceClient.createIncident(incident, parent.toString());
   * }
   * </code></pre>
   *
   * @param incident The incident to create.
   * @param parent The resource name of the hosting Stackdriver project which the incident belongs
   *     to. The name is of the form `projects/{project_id_or_number}` .
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Incident createIncident(Incident incident, String parent) {

    CreateIncidentRequest request =
        CreateIncidentRequest.newBuilder().setIncident(incident).setParent(parent).build();
    return createIncident(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   Incident incident = Incident.newBuilder().build();
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   CreateIncidentRequest request = CreateIncidentRequest.newBuilder()
   *     .setIncident(incident)
   *     .setParent(parent.toString())
   *     .build();
   *   Incident response = incidentServiceClient.createIncident(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Incident createIncident(CreateIncidentRequest request) {
    return createIncidentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   Incident incident = Incident.newBuilder().build();
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   CreateIncidentRequest request = CreateIncidentRequest.newBuilder()
   *     .setIncident(incident)
   *     .setParent(parent.toString())
   *     .build();
   *   ApiFuture&lt;Incident&gt; future = incidentServiceClient.createIncidentCallable().futureCall(request);
   *   // Do something
   *   Incident response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateIncidentRequest, Incident> createIncidentCallable() {
    return stub.createIncidentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns an incident by name.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName name = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   Incident response = incidentServiceClient.getIncident(name);
   * }
   * </code></pre>
   *
   * @param name Resource name of the incident, for example,
   *     "projects/{project_id}/incidents/{incident_id}".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Incident getIncident(IncidentName name) {

    GetIncidentRequest request =
        GetIncidentRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getIncident(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns an incident by name.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName name = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   Incident response = incidentServiceClient.getIncident(name.toString());
   * }
   * </code></pre>
   *
   * @param name Resource name of the incident, for example,
   *     "projects/{project_id}/incidents/{incident_id}".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Incident getIncident(String name) {

    GetIncidentRequest request = GetIncidentRequest.newBuilder().setName(name).build();
    return getIncident(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns an incident by name.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName name = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   GetIncidentRequest request = GetIncidentRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   Incident response = incidentServiceClient.getIncident(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Incident getIncident(GetIncidentRequest request) {
    return getIncidentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns an incident by name.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName name = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   GetIncidentRequest request = GetIncidentRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;Incident&gt; future = incidentServiceClient.getIncidentCallable().futureCall(request);
   *   // Do something
   *   Incident response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetIncidentRequest, Incident> getIncidentCallable() {
    return stub.getIncidentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a list of incidents. Incidents are ordered by start time, with the most recent
   * incidents first.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   String query = "";
   *   String timeZone = "";
   *   for (Incident element : incidentServiceClient.searchIncidents(parent, query, timeZone).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent The resource name of the hosting Stackdriver project which requested incidents
   *     belong to.
   * @param query An expression that defines which incidents to return.
   *     <p>Search atoms can be used to match certain specific fields. Otherwise, plain text will
   *     match text fields in the incident.
   *     <p>Search atoms: &#42; `start` - (timestamp) The time the incident started. &#42; `stage` -
   *     The stage of the incident, one of detected, triaged, mitigated, resolved, documented, or
   *     duplicate (which correspond to values in the Incident.Stage enum). These are ordered, so
   *     `stage&lt;resolved` is equivalent to `stage:detected OR stage:triaged OR stage:mitigated`.
   *     &#42; `severity` - (Incident.Severity) The severity of the incident. + Supports matching on
   *     a specific severity (for example, `severity:major`) or on a range (for example,
   *     `severity&gt;medium`, `severity&lt;=minor`, etc.).
   *     <p>Timestamp formats: &#42; yyyy-MM-dd - an absolute date, treated as a calendar-day-wide
   *     window. In other words, the "&lt;" operator will match dates before that date, the "&gt;"
   *     operator will match dates after that date, and the ":" or "=" operators will match the
   *     entire day. &#42; Nd (for example, 7d) - a relative number of days ago, treated as a moment
   *     in time (as opposed to a day-wide span). A multiple of 24 hours ago (as opposed to calendar
   *     days). In the case of daylight savings time, it will apply the current timezone to both
   *     ends of the range. Note that exact matching (for example, `start:7d`) is unlikely to be
   *     useful because that would only match incidents created precisely at a particular instant in
   *     time.
   *     <p>Examples:
   *     <p>&#42; `foo` - matches incidents containing the word "foo" &#42; `"foo bar"` - matches
   *     incidents containing the phrase "foo bar" &#42; `foo bar` or `foo AND bar` - matches
   *     incidents containing the words "foo" and "bar" &#42; `foo -bar` or `foo AND NOT bar` -
   *     matches incidents containing the word "foo" but not the word "bar" &#42; `foo OR bar` -
   *     matches incidents containing the word "foo" or the word "bar" &#42; `start&gt;2018-11-28` -
   *     matches incidents which started after November 11, 2018. &#42; `start&lt;=2018-11-28` -
   *     matches incidents which started on or before November 11, 2018. &#42; `start:2018-11-28` -
   *     matches incidents which started on November 11, 2018. &#42; `start&gt;7d` - matches
   *     incidents which started after the point in time 7&#42;24 hours ago &#42; `start&gt;180d` -
   *     similar to 7d, but likely to cross the daylight savings time boundary, so the end time will
   *     be 1 hour different from "now." &#42; `foo AND start&gt;90d AND stage&lt;resolved` -
   *     unresolved incidents from the past 90 days containing the word "foo"
   * @param timeZone The time zone name. It should be an IANA TZ name, such as
   *     "America/Los_Angeles". For more information, see
   *     https://en.wikipedia.org/wiki/List_of_tz_database_time_zones. If no time zone is specified,
   *     the default is UTC.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchIncidentsPagedResponse searchIncidents(
      ProjectName parent, String query, String timeZone) {
    SearchIncidentsRequest request =
        SearchIncidentsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setQuery(query)
            .setTimeZone(timeZone)
            .build();
    return searchIncidents(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a list of incidents. Incidents are ordered by start time, with the most recent
   * incidents first.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   String query = "";
   *   String timeZone = "";
   *   for (Incident element : incidentServiceClient.searchIncidents(parent.toString(), query, timeZone).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent The resource name of the hosting Stackdriver project which requested incidents
   *     belong to.
   * @param query An expression that defines which incidents to return.
   *     <p>Search atoms can be used to match certain specific fields. Otherwise, plain text will
   *     match text fields in the incident.
   *     <p>Search atoms: &#42; `start` - (timestamp) The time the incident started. &#42; `stage` -
   *     The stage of the incident, one of detected, triaged, mitigated, resolved, documented, or
   *     duplicate (which correspond to values in the Incident.Stage enum). These are ordered, so
   *     `stage&lt;resolved` is equivalent to `stage:detected OR stage:triaged OR stage:mitigated`.
   *     &#42; `severity` - (Incident.Severity) The severity of the incident. + Supports matching on
   *     a specific severity (for example, `severity:major`) or on a range (for example,
   *     `severity&gt;medium`, `severity&lt;=minor`, etc.).
   *     <p>Timestamp formats: &#42; yyyy-MM-dd - an absolute date, treated as a calendar-day-wide
   *     window. In other words, the "&lt;" operator will match dates before that date, the "&gt;"
   *     operator will match dates after that date, and the ":" or "=" operators will match the
   *     entire day. &#42; Nd (for example, 7d) - a relative number of days ago, treated as a moment
   *     in time (as opposed to a day-wide span). A multiple of 24 hours ago (as opposed to calendar
   *     days). In the case of daylight savings time, it will apply the current timezone to both
   *     ends of the range. Note that exact matching (for example, `start:7d`) is unlikely to be
   *     useful because that would only match incidents created precisely at a particular instant in
   *     time.
   *     <p>Examples:
   *     <p>&#42; `foo` - matches incidents containing the word "foo" &#42; `"foo bar"` - matches
   *     incidents containing the phrase "foo bar" &#42; `foo bar` or `foo AND bar` - matches
   *     incidents containing the words "foo" and "bar" &#42; `foo -bar` or `foo AND NOT bar` -
   *     matches incidents containing the word "foo" but not the word "bar" &#42; `foo OR bar` -
   *     matches incidents containing the word "foo" or the word "bar" &#42; `start&gt;2018-11-28` -
   *     matches incidents which started after November 11, 2018. &#42; `start&lt;=2018-11-28` -
   *     matches incidents which started on or before November 11, 2018. &#42; `start:2018-11-28` -
   *     matches incidents which started on November 11, 2018. &#42; `start&gt;7d` - matches
   *     incidents which started after the point in time 7&#42;24 hours ago &#42; `start&gt;180d` -
   *     similar to 7d, but likely to cross the daylight savings time boundary, so the end time will
   *     be 1 hour different from "now." &#42; `foo AND start&gt;90d AND stage&lt;resolved` -
   *     unresolved incidents from the past 90 days containing the word "foo"
   * @param timeZone The time zone name. It should be an IANA TZ name, such as
   *     "America/Los_Angeles". For more information, see
   *     https://en.wikipedia.org/wiki/List_of_tz_database_time_zones. If no time zone is specified,
   *     the default is UTC.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchIncidentsPagedResponse searchIncidents(
      String parent, String query, String timeZone) {
    SearchIncidentsRequest request =
        SearchIncidentsRequest.newBuilder()
            .setParent(parent)
            .setQuery(query)
            .setTimeZone(timeZone)
            .build();
    return searchIncidents(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a list of incidents. Incidents are ordered by start time, with the most recent
   * incidents first.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   SearchIncidentsRequest request = SearchIncidentsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   for (Incident element : incidentServiceClient.searchIncidents(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchIncidentsPagedResponse searchIncidents(SearchIncidentsRequest request) {
    return searchIncidentsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a list of incidents. Incidents are ordered by start time, with the most recent
   * incidents first.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   SearchIncidentsRequest request = SearchIncidentsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   ApiFuture&lt;SearchIncidentsPagedResponse&gt; future = incidentServiceClient.searchIncidentsPagedCallable().futureCall(request);
   *   // Do something
   *   for (Incident element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<SearchIncidentsRequest, SearchIncidentsPagedResponse>
      searchIncidentsPagedCallable() {
    return stub.searchIncidentsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a list of incidents. Incidents are ordered by start time, with the most recent
   * incidents first.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   SearchIncidentsRequest request = SearchIncidentsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   while (true) {
   *     SearchIncidentsResponse response = incidentServiceClient.searchIncidentsCallable().call(request);
   *     for (Incident element : response.getIncidentsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<SearchIncidentsRequest, SearchIncidentsResponse>
      searchIncidentsCallable() {
    return stub.searchIncidentsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an existing incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   Incident incident = Incident.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Incident response = incidentServiceClient.updateIncident(incident, updateMask);
   * }
   * </code></pre>
   *
   * @param incident The incident to update with the new values.
   * @param updateMask List of fields that should be updated.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Incident updateIncident(Incident incident, FieldMask updateMask) {

    UpdateIncidentRequest request =
        UpdateIncidentRequest.newBuilder().setIncident(incident).setUpdateMask(updateMask).build();
    return updateIncident(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an existing incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   Incident incident = Incident.newBuilder().build();
   *   UpdateIncidentRequest request = UpdateIncidentRequest.newBuilder()
   *     .setIncident(incident)
   *     .build();
   *   Incident response = incidentServiceClient.updateIncident(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Incident updateIncident(UpdateIncidentRequest request) {
    return updateIncidentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an existing incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   Incident incident = Incident.newBuilder().build();
   *   UpdateIncidentRequest request = UpdateIncidentRequest.newBuilder()
   *     .setIncident(incident)
   *     .build();
   *   ApiFuture&lt;Incident&gt; future = incidentServiceClient.updateIncidentCallable().futureCall(request);
   *   // Do something
   *   Incident response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UpdateIncidentRequest, Incident> updateIncidentCallable() {
    return stub.updateIncidentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a list of incidents that are "similar" to the specified incident or signal. This
   * functionality is provided on a best-effort basis and the definition of "similar" is subject to
   * change.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   String formattedName = IncidentName.format("[PROJECT]", "[INCIDENT]");
   *   for (SearchSimilarIncidentsResponse.Result element : incidentServiceClient.searchSimilarIncidents(formattedName).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param name Resource name of the incident or signal, for example,
   *     "projects/{project_id}/incidents/{incident_id}".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchSimilarIncidentsPagedResponse searchSimilarIncidents(String name) {
    SearchSimilarIncidentsRequest request =
        SearchSimilarIncidentsRequest.newBuilder().setName(name).build();
    return searchSimilarIncidents(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a list of incidents that are "similar" to the specified incident or signal. This
   * functionality is provided on a best-effort basis and the definition of "similar" is subject to
   * change.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   String formattedName = IncidentName.format("[PROJECT]", "[INCIDENT]");
   *   SearchSimilarIncidentsRequest request = SearchSimilarIncidentsRequest.newBuilder()
   *     .setName(formattedName)
   *     .build();
   *   for (SearchSimilarIncidentsResponse.Result element : incidentServiceClient.searchSimilarIncidents(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchSimilarIncidentsPagedResponse searchSimilarIncidents(
      SearchSimilarIncidentsRequest request) {
    return searchSimilarIncidentsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a list of incidents that are "similar" to the specified incident or signal. This
   * functionality is provided on a best-effort basis and the definition of "similar" is subject to
   * change.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   String formattedName = IncidentName.format("[PROJECT]", "[INCIDENT]");
   *   SearchSimilarIncidentsRequest request = SearchSimilarIncidentsRequest.newBuilder()
   *     .setName(formattedName)
   *     .build();
   *   ApiFuture&lt;SearchSimilarIncidentsPagedResponse&gt; future = incidentServiceClient.searchSimilarIncidentsPagedCallable().futureCall(request);
   *   // Do something
   *   for (SearchSimilarIncidentsResponse.Result element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<SearchSimilarIncidentsRequest, SearchSimilarIncidentsPagedResponse>
      searchSimilarIncidentsPagedCallable() {
    return stub.searchSimilarIncidentsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a list of incidents that are "similar" to the specified incident or signal. This
   * functionality is provided on a best-effort basis and the definition of "similar" is subject to
   * change.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   String formattedName = IncidentName.format("[PROJECT]", "[INCIDENT]");
   *   SearchSimilarIncidentsRequest request = SearchSimilarIncidentsRequest.newBuilder()
   *     .setName(formattedName)
   *     .build();
   *   while (true) {
   *     SearchSimilarIncidentsResponse response = incidentServiceClient.searchSimilarIncidentsCallable().call(request);
   *     for (SearchSimilarIncidentsResponse.Result element : response.getResultsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<SearchSimilarIncidentsRequest, SearchSimilarIncidentsResponse>
      searchSimilarIncidentsCallable() {
    return stub.searchSimilarIncidentsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an annotation on an existing incident. Only 'text/plain' and 'text/markdown'
   * annotations can be created via this method.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   Annotation annotation = Annotation.newBuilder().build();
   *   Annotation response = incidentServiceClient.createAnnotation(parent, annotation);
   * }
   * </code></pre>
   *
   * @param parent Resource name of the incident, for example,
   *     "projects/{project_id}/incidents/{incident_id}".
   * @param annotation Only annotation.content is an input argument.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Annotation createAnnotation(IncidentName parent, Annotation annotation) {

    CreateAnnotationRequest request =
        CreateAnnotationRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setAnnotation(annotation)
            .build();
    return createAnnotation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an annotation on an existing incident. Only 'text/plain' and 'text/markdown'
   * annotations can be created via this method.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   Annotation annotation = Annotation.newBuilder().build();
   *   Annotation response = incidentServiceClient.createAnnotation(parent.toString(), annotation);
   * }
   * </code></pre>
   *
   * @param parent Resource name of the incident, for example,
   *     "projects/{project_id}/incidents/{incident_id}".
   * @param annotation Only annotation.content is an input argument.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Annotation createAnnotation(String parent, Annotation annotation) {

    CreateAnnotationRequest request =
        CreateAnnotationRequest.newBuilder().setParent(parent).setAnnotation(annotation).build();
    return createAnnotation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an annotation on an existing incident. Only 'text/plain' and 'text/markdown'
   * annotations can be created via this method.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   Annotation annotation = Annotation.newBuilder().build();
   *   CreateAnnotationRequest request = CreateAnnotationRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setAnnotation(annotation)
   *     .build();
   *   Annotation response = incidentServiceClient.createAnnotation(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Annotation createAnnotation(CreateAnnotationRequest request) {
    return createAnnotationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an annotation on an existing incident. Only 'text/plain' and 'text/markdown'
   * annotations can be created via this method.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   Annotation annotation = Annotation.newBuilder().build();
   *   CreateAnnotationRequest request = CreateAnnotationRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setAnnotation(annotation)
   *     .build();
   *   ApiFuture&lt;Annotation&gt; future = incidentServiceClient.createAnnotationCallable().futureCall(request);
   *   // Do something
   *   Annotation response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateAnnotationRequest, Annotation> createAnnotationCallable() {
    return stub.createAnnotationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists annotations that are part of an incident. No assumptions should be made on the
   * content-type of the annotation returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   for (Annotation element : incidentServiceClient.listAnnotations(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Resource name of the incident, for example,
   *     "projects/{project_id}/incidents/{incident_id}".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAnnotationsPagedResponse listAnnotations(IncidentName parent) {
    ListAnnotationsRequest request =
        ListAnnotationsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listAnnotations(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists annotations that are part of an incident. No assumptions should be made on the
   * content-type of the annotation returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   for (Annotation element : incidentServiceClient.listAnnotations(parent.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Resource name of the incident, for example,
   *     "projects/{project_id}/incidents/{incident_id}".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAnnotationsPagedResponse listAnnotations(String parent) {
    ListAnnotationsRequest request = ListAnnotationsRequest.newBuilder().setParent(parent).build();
    return listAnnotations(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists annotations that are part of an incident. No assumptions should be made on the
   * content-type of the annotation returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   ListAnnotationsRequest request = ListAnnotationsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   for (Annotation element : incidentServiceClient.listAnnotations(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAnnotationsPagedResponse listAnnotations(ListAnnotationsRequest request) {
    return listAnnotationsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists annotations that are part of an incident. No assumptions should be made on the
   * content-type of the annotation returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   ListAnnotationsRequest request = ListAnnotationsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   ApiFuture&lt;ListAnnotationsPagedResponse&gt; future = incidentServiceClient.listAnnotationsPagedCallable().futureCall(request);
   *   // Do something
   *   for (Annotation element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListAnnotationsRequest, ListAnnotationsPagedResponse>
      listAnnotationsPagedCallable() {
    return stub.listAnnotationsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists annotations that are part of an incident. No assumptions should be made on the
   * content-type of the annotation returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   ListAnnotationsRequest request = ListAnnotationsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   while (true) {
   *     ListAnnotationsResponse response = incidentServiceClient.listAnnotationsCallable().call(request);
   *     for (Annotation element : response.getAnnotationsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListAnnotationsRequest, ListAnnotationsResponse>
      listAnnotationsCallable() {
    return stub.listAnnotationsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a tag on an existing incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   Tag tag = Tag.newBuilder().build();
   *   Tag response = incidentServiceClient.createTag(parent, tag);
   * }
   * </code></pre>
   *
   * @param parent Resource name of the incident, for example,
   *     "projects/{project_id}/incidents/{incident_id}".
   * @param tag Tag to create. Only tag.display_name is an input argument.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Tag createTag(IncidentName parent, Tag tag) {

    CreateTagRequest request =
        CreateTagRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setTag(tag)
            .build();
    return createTag(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a tag on an existing incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   Tag tag = Tag.newBuilder().build();
   *   Tag response = incidentServiceClient.createTag(parent.toString(), tag);
   * }
   * </code></pre>
   *
   * @param parent Resource name of the incident, for example,
   *     "projects/{project_id}/incidents/{incident_id}".
   * @param tag Tag to create. Only tag.display_name is an input argument.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Tag createTag(String parent, Tag tag) {

    CreateTagRequest request = CreateTagRequest.newBuilder().setParent(parent).setTag(tag).build();
    return createTag(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a tag on an existing incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   Tag tag = Tag.newBuilder().build();
   *   CreateTagRequest request = CreateTagRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setTag(tag)
   *     .build();
   *   Tag response = incidentServiceClient.createTag(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Tag createTag(CreateTagRequest request) {
    return createTagCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a tag on an existing incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   Tag tag = Tag.newBuilder().build();
   *   CreateTagRequest request = CreateTagRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setTag(tag)
   *     .build();
   *   ApiFuture&lt;Tag&gt; future = incidentServiceClient.createTagCallable().futureCall(request);
   *   // Do something
   *   Tag response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateTagRequest, Tag> createTagCallable() {
    return stub.createTagCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an existing tag.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   TagName name = TagName.of("[PROJECT]", "[INCIDENT]", "[TAG]");
   *   incidentServiceClient.deleteTag(name);
   * }
   * </code></pre>
   *
   * @param name Resource name of the tag.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteTag(TagName name) {

    DeleteTagRequest request =
        DeleteTagRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    deleteTag(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an existing tag.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   TagName name = TagName.of("[PROJECT]", "[INCIDENT]", "[TAG]");
   *   incidentServiceClient.deleteTag(name.toString());
   * }
   * </code></pre>
   *
   * @param name Resource name of the tag.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteTag(String name) {

    DeleteTagRequest request = DeleteTagRequest.newBuilder().setName(name).build();
    deleteTag(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an existing tag.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   TagName name = TagName.of("[PROJECT]", "[INCIDENT]", "[TAG]");
   *   DeleteTagRequest request = DeleteTagRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   incidentServiceClient.deleteTag(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteTag(DeleteTagRequest request) {
    deleteTagCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an existing tag.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   TagName name = TagName.of("[PROJECT]", "[INCIDENT]", "[TAG]");
   *   DeleteTagRequest request = DeleteTagRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;Void&gt; future = incidentServiceClient.deleteTagCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteTagRequest, Empty> deleteTagCallable() {
    return stub.deleteTagCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists tags that are part of an incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   for (Tag element : incidentServiceClient.listTags(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Resource name of the incident, for example,
   *     "projects/{project_id}/incidents/{incident_id}".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListTagsPagedResponse listTags(IncidentName parent) {
    ListTagsRequest request =
        ListTagsRequest.newBuilder().setParent(parent == null ? null : parent.toString()).build();
    return listTags(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists tags that are part of an incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   for (Tag element : incidentServiceClient.listTags(parent.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Resource name of the incident, for example,
   *     "projects/{project_id}/incidents/{incident_id}".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListTagsPagedResponse listTags(String parent) {
    ListTagsRequest request = ListTagsRequest.newBuilder().setParent(parent).build();
    return listTags(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists tags that are part of an incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   ListTagsRequest request = ListTagsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   for (Tag element : incidentServiceClient.listTags(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListTagsPagedResponse listTags(ListTagsRequest request) {
    return listTagsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists tags that are part of an incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   ListTagsRequest request = ListTagsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   ApiFuture&lt;ListTagsPagedResponse&gt; future = incidentServiceClient.listTagsPagedCallable().futureCall(request);
   *   // Do something
   *   for (Tag element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListTagsRequest, ListTagsPagedResponse> listTagsPagedCallable() {
    return stub.listTagsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists tags that are part of an incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   ListTagsRequest request = ListTagsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   while (true) {
   *     ListTagsResponse response = incidentServiceClient.listTagsCallable().call(request);
   *     for (Tag element : response.getTagsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListTagsRequest, ListTagsResponse> listTagsCallable() {
    return stub.listTagsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new signal.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   Signal signal = Signal.newBuilder().build();
   *   Signal response = incidentServiceClient.createSignal(parent, signal);
   * }
   * </code></pre>
   *
   * @param parent The resource name of the hosting Stackdriver project which requested signal
   *     belongs to.
   * @param signal The signal to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Signal createSignal(ProjectName parent, Signal signal) {

    CreateSignalRequest request =
        CreateSignalRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setSignal(signal)
            .build();
    return createSignal(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new signal.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   Signal signal = Signal.newBuilder().build();
   *   Signal response = incidentServiceClient.createSignal(parent.toString(), signal);
   * }
   * </code></pre>
   *
   * @param parent The resource name of the hosting Stackdriver project which requested signal
   *     belongs to.
   * @param signal The signal to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Signal createSignal(String parent, Signal signal) {

    CreateSignalRequest request =
        CreateSignalRequest.newBuilder().setParent(parent).setSignal(signal).build();
    return createSignal(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new signal.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   Signal signal = Signal.newBuilder().build();
   *   CreateSignalRequest request = CreateSignalRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setSignal(signal)
   *     .build();
   *   Signal response = incidentServiceClient.createSignal(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Signal createSignal(CreateSignalRequest request) {
    return createSignalCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new signal.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   Signal signal = Signal.newBuilder().build();
   *   CreateSignalRequest request = CreateSignalRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setSignal(signal)
   *     .build();
   *   ApiFuture&lt;Signal&gt; future = incidentServiceClient.createSignalCallable().futureCall(request);
   *   // Do something
   *   Signal response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateSignalRequest, Signal> createSignalCallable() {
    return stub.createSignalCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists signals that are part of an incident. Signals are returned in reverse chronological
   * order.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   String query = "";
   *   for (Signal element : incidentServiceClient.searchSignals(parent, query).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent The resource name of the hosting Stackdriver project which requested incidents
   *     belong to.
   * @param query An expression that defines which signals to return.
   *     <p>Search atoms can be used to match certain specific fields. Otherwise, plain text will
   *     match text fields in the signal.
   *     <p>Search atoms:
   *     <p>&#42; `start` - (timestamp) The time the signal was created. &#42; `title` - The title
   *     of the signal. &#42; `signal_state` - `open` or `closed`. State of the signal. (e.g.,
   *     `signal_state:open`)
   *     <p>Timestamp formats:
   *     <p>&#42; yyyy-MM-dd - an absolute date, treated as a calendar-day-wide window. In other
   *     words, the "&lt;" operator will match dates before that date, the "&gt;" operator will
   *     match dates after that date, and the ":" operator will match the entire day. &#42;
   *     yyyy-MM-ddTHH:mm - Same as above, but with minute resolution. &#42; yyyy-MM-ddTHH:mm:ss -
   *     Same as above, but with second resolution. &#42; Nd (e.g. 7d) - a relative number of days
   *     ago, treated as a moment in time (as opposed to a day-wide span) a multiple of 24 hours ago
   *     (as opposed to calendar days). In the case of daylight savings time, it will apply the
   *     current timezone to both ends of the range. Note that exact matching (e.g. `start:7d`) is
   *     unlikely to be useful because that would only match signals created precisely at a
   *     particular instant in time.
   *     <p>The absolute timestamp formats (everything starting with a year) can optionally be
   *     followed with a UTC offset in +/-hh:mm format. Also, the 'T' separating dates and times can
   *     optionally be replaced with a space. Note that any timestamp containing a space or colon
   *     will need to be quoted.
   *     <p>Examples:
   *     <p>&#42; `foo` - matches signals containing the word "foo" &#42; `"foo bar"` - matches
   *     signals containing the phrase "foo bar" &#42; `foo bar` or `foo AND bar` - matches signals
   *     containing the words "foo" and "bar" &#42; `foo -bar` or `foo AND NOT bar` - matches
   *     signals containing the word "foo" but not the word "bar" &#42; `foo OR bar` - matches
   *     signals containing the word "foo" or the word "bar" &#42; `start&gt;2018-11-28` - matches
   *     signals which started after November 11, 2018. &#42; `start&lt;=2018-11-28` - matches
   *     signals which started on or before November 11, 2018. &#42; `start:2018-11-28` - matches
   *     signals which started on November 11, 2018. &#42; `start&gt;"2018-11-28 01:02:03+04:00"` -
   *     matches signals which started after November 11, 2018 at 1:02:03 AM according to the UTC+04
   *     time zone. &#42; `start&gt;7d` - matches signals which started after the point in time
   *     7&#42;24 hours ago &#42; `start&gt;180d` - similar to 7d, but likely to cross the daylight
   *     savings time boundary, so the end time will be 1 hour different from "now." &#42; `foo AND
   *     start&gt;90d AND stage&lt;resolved` - unresolved signals from the past 90 days containing
   *     the word "foo"
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchSignalsPagedResponse searchSignals(ProjectName parent, String query) {
    SearchSignalsRequest request =
        SearchSignalsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setQuery(query)
            .build();
    return searchSignals(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists signals that are part of an incident. Signals are returned in reverse chronological
   * order.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   String query = "";
   *   for (Signal element : incidentServiceClient.searchSignals(parent.toString(), query).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent The resource name of the hosting Stackdriver project which requested incidents
   *     belong to.
   * @param query An expression that defines which signals to return.
   *     <p>Search atoms can be used to match certain specific fields. Otherwise, plain text will
   *     match text fields in the signal.
   *     <p>Search atoms:
   *     <p>&#42; `start` - (timestamp) The time the signal was created. &#42; `title` - The title
   *     of the signal. &#42; `signal_state` - `open` or `closed`. State of the signal. (e.g.,
   *     `signal_state:open`)
   *     <p>Timestamp formats:
   *     <p>&#42; yyyy-MM-dd - an absolute date, treated as a calendar-day-wide window. In other
   *     words, the "&lt;" operator will match dates before that date, the "&gt;" operator will
   *     match dates after that date, and the ":" operator will match the entire day. &#42;
   *     yyyy-MM-ddTHH:mm - Same as above, but with minute resolution. &#42; yyyy-MM-ddTHH:mm:ss -
   *     Same as above, but with second resolution. &#42; Nd (e.g. 7d) - a relative number of days
   *     ago, treated as a moment in time (as opposed to a day-wide span) a multiple of 24 hours ago
   *     (as opposed to calendar days). In the case of daylight savings time, it will apply the
   *     current timezone to both ends of the range. Note that exact matching (e.g. `start:7d`) is
   *     unlikely to be useful because that would only match signals created precisely at a
   *     particular instant in time.
   *     <p>The absolute timestamp formats (everything starting with a year) can optionally be
   *     followed with a UTC offset in +/-hh:mm format. Also, the 'T' separating dates and times can
   *     optionally be replaced with a space. Note that any timestamp containing a space or colon
   *     will need to be quoted.
   *     <p>Examples:
   *     <p>&#42; `foo` - matches signals containing the word "foo" &#42; `"foo bar"` - matches
   *     signals containing the phrase "foo bar" &#42; `foo bar` or `foo AND bar` - matches signals
   *     containing the words "foo" and "bar" &#42; `foo -bar` or `foo AND NOT bar` - matches
   *     signals containing the word "foo" but not the word "bar" &#42; `foo OR bar` - matches
   *     signals containing the word "foo" or the word "bar" &#42; `start&gt;2018-11-28` - matches
   *     signals which started after November 11, 2018. &#42; `start&lt;=2018-11-28` - matches
   *     signals which started on or before November 11, 2018. &#42; `start:2018-11-28` - matches
   *     signals which started on November 11, 2018. &#42; `start&gt;"2018-11-28 01:02:03+04:00"` -
   *     matches signals which started after November 11, 2018 at 1:02:03 AM according to the UTC+04
   *     time zone. &#42; `start&gt;7d` - matches signals which started after the point in time
   *     7&#42;24 hours ago &#42; `start&gt;180d` - similar to 7d, but likely to cross the daylight
   *     savings time boundary, so the end time will be 1 hour different from "now." &#42; `foo AND
   *     start&gt;90d AND stage&lt;resolved` - unresolved signals from the past 90 days containing
   *     the word "foo"
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchSignalsPagedResponse searchSignals(String parent, String query) {
    SearchSignalsRequest request =
        SearchSignalsRequest.newBuilder().setParent(parent).setQuery(query).build();
    return searchSignals(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists signals that are part of an incident. Signals are returned in reverse chronological
   * order.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   SearchSignalsRequest request = SearchSignalsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   for (Signal element : incidentServiceClient.searchSignals(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchSignalsPagedResponse searchSignals(SearchSignalsRequest request) {
    return searchSignalsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists signals that are part of an incident. Signals are returned in reverse chronological
   * order.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   SearchSignalsRequest request = SearchSignalsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   ApiFuture&lt;SearchSignalsPagedResponse&gt; future = incidentServiceClient.searchSignalsPagedCallable().futureCall(request);
   *   // Do something
   *   for (Signal element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<SearchSignalsRequest, SearchSignalsPagedResponse>
      searchSignalsPagedCallable() {
    return stub.searchSignalsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists signals that are part of an incident. Signals are returned in reverse chronological
   * order.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   SearchSignalsRequest request = SearchSignalsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   while (true) {
   *     SearchSignalsResponse response = incidentServiceClient.searchSignalsCallable().call(request);
   *     for (Signal element : response.getSignalsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<SearchSignalsRequest, SearchSignalsResponse> searchSignalsCallable() {
    return stub.searchSignalsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a signal by name.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   SignalName name = SignalName.of("[PROJECT]", "[SIGNAL]");
   *   Signal response = incidentServiceClient.getSignal(name);
   * }
   * </code></pre>
   *
   * @param name Resource name of the Signal resource, for example,
   *     "projects/{project_id}/signals/{signal_id}".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Signal getSignal(SignalName name) {

    GetSignalRequest request =
        GetSignalRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getSignal(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a signal by name.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   SignalName name = SignalName.of("[PROJECT]", "[SIGNAL]");
   *   Signal response = incidentServiceClient.getSignal(name.toString());
   * }
   * </code></pre>
   *
   * @param name Resource name of the Signal resource, for example,
   *     "projects/{project_id}/signals/{signal_id}".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Signal getSignal(String name) {

    GetSignalRequest request = GetSignalRequest.newBuilder().setName(name).build();
    return getSignal(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a signal by name.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   SignalName name = SignalName.of("[PROJECT]", "[SIGNAL]");
   *   GetSignalRequest request = GetSignalRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   Signal response = incidentServiceClient.getSignal(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Signal getSignal(GetSignalRequest request) {
    return getSignalCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a signal by name.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   SignalName name = SignalName.of("[PROJECT]", "[SIGNAL]");
   *   GetSignalRequest request = GetSignalRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;Signal&gt; future = incidentServiceClient.getSignalCallable().futureCall(request);
   *   // Do something
   *   Signal response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetSignalRequest, Signal> getSignalCallable() {
    return stub.getSignalCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Finds a signal by other unique IDs.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   LookupSignalRequest request = LookupSignalRequest.newBuilder().build();
   *   Signal response = incidentServiceClient.lookupSignal(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Signal lookupSignal(LookupSignalRequest request) {
    return lookupSignalCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Finds a signal by other unique IDs.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   LookupSignalRequest request = LookupSignalRequest.newBuilder().build();
   *   ApiFuture&lt;Signal&gt; future = incidentServiceClient.lookupSignalCallable().futureCall(request);
   *   // Do something
   *   Signal response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<LookupSignalRequest, Signal> lookupSignalCallable() {
    return stub.lookupSignalCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an existing signal (for example, to assign/unassign it to an incident).
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   Signal signal = Signal.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Signal response = incidentServiceClient.updateSignal(signal, updateMask);
   * }
   * </code></pre>
   *
   * @param signal The signal to update with the new values.
   * @param updateMask List of fields that should be updated.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Signal updateSignal(Signal signal, FieldMask updateMask) {

    UpdateSignalRequest request =
        UpdateSignalRequest.newBuilder().setSignal(signal).setUpdateMask(updateMask).build();
    return updateSignal(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an existing signal (for example, to assign/unassign it to an incident).
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   Signal signal = Signal.newBuilder().build();
   *   UpdateSignalRequest request = UpdateSignalRequest.newBuilder()
   *     .setSignal(signal)
   *     .build();
   *   Signal response = incidentServiceClient.updateSignal(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Signal updateSignal(UpdateSignalRequest request) {
    return updateSignalCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an existing signal (for example, to assign/unassign it to an incident).
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   Signal signal = Signal.newBuilder().build();
   *   UpdateSignalRequest request = UpdateSignalRequest.newBuilder()
   *     .setSignal(signal)
   *     .build();
   *   ApiFuture&lt;Signal&gt; future = incidentServiceClient.updateSignalCallable().futureCall(request);
   *   // Do something
   *   Signal response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UpdateSignalRequest, Signal> updateSignalCallable() {
    return stub.updateSignalCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Escalates an incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   Incident incident = Incident.newBuilder().build();
   *   EscalateIncidentRequest request = EscalateIncidentRequest.newBuilder()
   *     .setIncident(incident)
   *     .build();
   *   EscalateIncidentResponse response = incidentServiceClient.escalateIncident(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final EscalateIncidentResponse escalateIncident(EscalateIncidentRequest request) {
    return escalateIncidentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Escalates an incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   Incident incident = Incident.newBuilder().build();
   *   EscalateIncidentRequest request = EscalateIncidentRequest.newBuilder()
   *     .setIncident(incident)
   *     .build();
   *   ApiFuture&lt;EscalateIncidentResponse&gt; future = incidentServiceClient.escalateIncidentCallable().futureCall(request);
   *   // Do something
   *   EscalateIncidentResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<EscalateIncidentRequest, EscalateIncidentResponse>
      escalateIncidentCallable() {
    return stub.escalateIncidentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new artifact.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   Artifact artifact = Artifact.newBuilder().build();
   *   Artifact response = incidentServiceClient.createArtifact(parent, artifact);
   * }
   * </code></pre>
   *
   * @param parent Resource name of the incident, for example,
   *     "projects/{project_id}/incidents/{incident_id}".
   * @param artifact The artifact to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Artifact createArtifact(IncidentName parent, Artifact artifact) {

    CreateArtifactRequest request =
        CreateArtifactRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setArtifact(artifact)
            .build();
    return createArtifact(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new artifact.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   Artifact artifact = Artifact.newBuilder().build();
   *   Artifact response = incidentServiceClient.createArtifact(parent.toString(), artifact);
   * }
   * </code></pre>
   *
   * @param parent Resource name of the incident, for example,
   *     "projects/{project_id}/incidents/{incident_id}".
   * @param artifact The artifact to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Artifact createArtifact(String parent, Artifact artifact) {

    CreateArtifactRequest request =
        CreateArtifactRequest.newBuilder().setParent(parent).setArtifact(artifact).build();
    return createArtifact(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new artifact.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   Artifact artifact = Artifact.newBuilder().build();
   *   CreateArtifactRequest request = CreateArtifactRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setArtifact(artifact)
   *     .build();
   *   Artifact response = incidentServiceClient.createArtifact(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Artifact createArtifact(CreateArtifactRequest request) {
    return createArtifactCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new artifact.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   Artifact artifact = Artifact.newBuilder().build();
   *   CreateArtifactRequest request = CreateArtifactRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setArtifact(artifact)
   *     .build();
   *   ApiFuture&lt;Artifact&gt; future = incidentServiceClient.createArtifactCallable().futureCall(request);
   *   // Do something
   *   Artifact response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateArtifactRequest, Artifact> createArtifactCallable() {
    return stub.createArtifactCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a list of artifacts for an incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   for (Artifact element : incidentServiceClient.listArtifacts(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Resource name of the incident, for example,
   *     "projects/{project_id}/incidents/{incident_id}".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListArtifactsPagedResponse listArtifacts(IncidentName parent) {
    ListArtifactsRequest request =
        ListArtifactsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listArtifacts(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a list of artifacts for an incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   for (Artifact element : incidentServiceClient.listArtifacts(parent.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Resource name of the incident, for example,
   *     "projects/{project_id}/incidents/{incident_id}".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListArtifactsPagedResponse listArtifacts(String parent) {
    ListArtifactsRequest request = ListArtifactsRequest.newBuilder().setParent(parent).build();
    return listArtifacts(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a list of artifacts for an incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   ListArtifactsRequest request = ListArtifactsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   for (Artifact element : incidentServiceClient.listArtifacts(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListArtifactsPagedResponse listArtifacts(ListArtifactsRequest request) {
    return listArtifactsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a list of artifacts for an incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   ListArtifactsRequest request = ListArtifactsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   ApiFuture&lt;ListArtifactsPagedResponse&gt; future = incidentServiceClient.listArtifactsPagedCallable().futureCall(request);
   *   // Do something
   *   for (Artifact element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListArtifactsRequest, ListArtifactsPagedResponse>
      listArtifactsPagedCallable() {
    return stub.listArtifactsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a list of artifacts for an incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   ListArtifactsRequest request = ListArtifactsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   while (true) {
   *     ListArtifactsResponse response = incidentServiceClient.listArtifactsCallable().call(request);
   *     for (Artifact element : response.getArtifactsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListArtifactsRequest, ListArtifactsResponse> listArtifactsCallable() {
    return stub.listArtifactsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an existing artifact.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   Artifact artifact = Artifact.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Artifact response = incidentServiceClient.updateArtifact(artifact, updateMask);
   * }
   * </code></pre>
   *
   * @param artifact The artifact to update with the new values.
   * @param updateMask List of fields that should be updated.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Artifact updateArtifact(Artifact artifact, FieldMask updateMask) {

    UpdateArtifactRequest request =
        UpdateArtifactRequest.newBuilder().setArtifact(artifact).setUpdateMask(updateMask).build();
    return updateArtifact(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an existing artifact.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   Artifact artifact = Artifact.newBuilder().build();
   *   UpdateArtifactRequest request = UpdateArtifactRequest.newBuilder()
   *     .setArtifact(artifact)
   *     .build();
   *   Artifact response = incidentServiceClient.updateArtifact(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Artifact updateArtifact(UpdateArtifactRequest request) {
    return updateArtifactCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an existing artifact.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   Artifact artifact = Artifact.newBuilder().build();
   *   UpdateArtifactRequest request = UpdateArtifactRequest.newBuilder()
   *     .setArtifact(artifact)
   *     .build();
   *   ApiFuture&lt;Artifact&gt; future = incidentServiceClient.updateArtifactCallable().futureCall(request);
   *   // Do something
   *   Artifact response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UpdateArtifactRequest, Artifact> updateArtifactCallable() {
    return stub.updateArtifactCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an existing artifact.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   ArtifactName name = ArtifactName.of("[PROJECT]", "[INCIDENT]", "[ARTIFACT]");
   *   incidentServiceClient.deleteArtifact(name);
   * }
   * </code></pre>
   *
   * @param name Resource name of the artifact.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteArtifact(ArtifactName name) {

    DeleteArtifactRequest request =
        DeleteArtifactRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    deleteArtifact(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an existing artifact.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   ArtifactName name = ArtifactName.of("[PROJECT]", "[INCIDENT]", "[ARTIFACT]");
   *   incidentServiceClient.deleteArtifact(name.toString());
   * }
   * </code></pre>
   *
   * @param name Resource name of the artifact.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteArtifact(String name) {

    DeleteArtifactRequest request = DeleteArtifactRequest.newBuilder().setName(name).build();
    deleteArtifact(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an existing artifact.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   ArtifactName name = ArtifactName.of("[PROJECT]", "[INCIDENT]", "[ARTIFACT]");
   *   DeleteArtifactRequest request = DeleteArtifactRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   incidentServiceClient.deleteArtifact(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteArtifact(DeleteArtifactRequest request) {
    deleteArtifactCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an existing artifact.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   ArtifactName name = ArtifactName.of("[PROJECT]", "[INCIDENT]", "[ARTIFACT]");
   *   DeleteArtifactRequest request = DeleteArtifactRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;Void&gt; future = incidentServiceClient.deleteArtifactCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteArtifactRequest, Empty> deleteArtifactCallable() {
    return stub.deleteArtifactCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sends a summary of the shift for oncall handoff.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   List&lt;String&gt; recipients = new ArrayList&lt;&gt;();
   *   String subject = "";
   *   SendShiftHandoffRequest request = SendShiftHandoffRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .addAllRecipients(recipients)
   *     .setSubject(subject)
   *     .build();
   *   SendShiftHandoffResponse response = incidentServiceClient.sendShiftHandoff(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SendShiftHandoffResponse sendShiftHandoff(SendShiftHandoffRequest request) {
    return sendShiftHandoffCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sends a summary of the shift for oncall handoff.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   List&lt;String&gt; recipients = new ArrayList&lt;&gt;();
   *   String subject = "";
   *   SendShiftHandoffRequest request = SendShiftHandoffRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .addAllRecipients(recipients)
   *     .setSubject(subject)
   *     .build();
   *   ApiFuture&lt;SendShiftHandoffResponse&gt; future = incidentServiceClient.sendShiftHandoffCallable().futureCall(request);
   *   // Do something
   *   SendShiftHandoffResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<SendShiftHandoffRequest, SendShiftHandoffResponse>
      sendShiftHandoffCallable() {
    return stub.sendShiftHandoffCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new subscription. This will fail if: a. there are too many (50) subscriptions in the
   * incident already b. a subscription using the given channel already exists
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   Subscription subscription = Subscription.newBuilder().build();
   *   Subscription response = incidentServiceClient.createSubscription(parent, subscription);
   * }
   * </code></pre>
   *
   * @param parent Resource name of the incident, for example,
   *     "projects/{project_id}/incidents/{incident_id}".
   * @param subscription The subscription to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Subscription createSubscription(IncidentName parent, Subscription subscription) {

    CreateSubscriptionRequest request =
        CreateSubscriptionRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setSubscription(subscription)
            .build();
    return createSubscription(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new subscription. This will fail if: a. there are too many (50) subscriptions in the
   * incident already b. a subscription using the given channel already exists
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   Subscription subscription = Subscription.newBuilder().build();
   *   Subscription response = incidentServiceClient.createSubscription(parent.toString(), subscription);
   * }
   * </code></pre>
   *
   * @param parent Resource name of the incident, for example,
   *     "projects/{project_id}/incidents/{incident_id}".
   * @param subscription The subscription to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Subscription createSubscription(String parent, Subscription subscription) {

    CreateSubscriptionRequest request =
        CreateSubscriptionRequest.newBuilder()
            .setParent(parent)
            .setSubscription(subscription)
            .build();
    return createSubscription(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new subscription. This will fail if: a. there are too many (50) subscriptions in the
   * incident already b. a subscription using the given channel already exists
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   Subscription subscription = Subscription.newBuilder().build();
   *   CreateSubscriptionRequest request = CreateSubscriptionRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setSubscription(subscription)
   *     .build();
   *   Subscription response = incidentServiceClient.createSubscription(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Subscription createSubscription(CreateSubscriptionRequest request) {
    return createSubscriptionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new subscription. This will fail if: a. there are too many (50) subscriptions in the
   * incident already b. a subscription using the given channel already exists
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   Subscription subscription = Subscription.newBuilder().build();
   *   CreateSubscriptionRequest request = CreateSubscriptionRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setSubscription(subscription)
   *     .build();
   *   ApiFuture&lt;Subscription&gt; future = incidentServiceClient.createSubscriptionCallable().futureCall(request);
   *   // Do something
   *   Subscription response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateSubscriptionRequest, Subscription> createSubscriptionCallable() {
    return stub.createSubscriptionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a subscription.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   Subscription subscription = Subscription.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Subscription response = incidentServiceClient.updateSubscription(subscription, updateMask);
   * }
   * </code></pre>
   *
   * @param subscription The subscription to update, with new values.
   * @param updateMask List of fields that should be updated.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Subscription updateSubscription(Subscription subscription, FieldMask updateMask) {

    UpdateSubscriptionRequest request =
        UpdateSubscriptionRequest.newBuilder()
            .setSubscription(subscription)
            .setUpdateMask(updateMask)
            .build();
    return updateSubscription(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a subscription.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   Subscription subscription = Subscription.newBuilder().build();
   *   UpdateSubscriptionRequest request = UpdateSubscriptionRequest.newBuilder()
   *     .setSubscription(subscription)
   *     .build();
   *   Subscription response = incidentServiceClient.updateSubscription(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Subscription updateSubscription(UpdateSubscriptionRequest request) {
    return updateSubscriptionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a subscription.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   Subscription subscription = Subscription.newBuilder().build();
   *   UpdateSubscriptionRequest request = UpdateSubscriptionRequest.newBuilder()
   *     .setSubscription(subscription)
   *     .build();
   *   ApiFuture&lt;Subscription&gt; future = incidentServiceClient.updateSubscriptionCallable().futureCall(request);
   *   // Do something
   *   Subscription response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UpdateSubscriptionRequest, Subscription> updateSubscriptionCallable() {
    return stub.updateSubscriptionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a list of subscriptions for an incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   for (Subscription element : incidentServiceClient.listSubscriptions(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Resource name of the incident, for example,
   *     "projects/{project_id}/incidents/{incident_id}".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSubscriptionsPagedResponse listSubscriptions(IncidentName parent) {
    ListSubscriptionsRequest request =
        ListSubscriptionsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listSubscriptions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a list of subscriptions for an incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   for (Subscription element : incidentServiceClient.listSubscriptions(parent.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Resource name of the incident, for example,
   *     "projects/{project_id}/incidents/{incident_id}".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSubscriptionsPagedResponse listSubscriptions(String parent) {
    ListSubscriptionsRequest request =
        ListSubscriptionsRequest.newBuilder().setParent(parent).build();
    return listSubscriptions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a list of subscriptions for an incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   ListSubscriptionsRequest request = ListSubscriptionsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   for (Subscription element : incidentServiceClient.listSubscriptions(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSubscriptionsPagedResponse listSubscriptions(ListSubscriptionsRequest request) {
    return listSubscriptionsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a list of subscriptions for an incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   ListSubscriptionsRequest request = ListSubscriptionsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   ApiFuture&lt;ListSubscriptionsPagedResponse&gt; future = incidentServiceClient.listSubscriptionsPagedCallable().futureCall(request);
   *   // Do something
   *   for (Subscription element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListSubscriptionsRequest, ListSubscriptionsPagedResponse>
      listSubscriptionsPagedCallable() {
    return stub.listSubscriptionsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a list of subscriptions for an incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   ListSubscriptionsRequest request = ListSubscriptionsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   while (true) {
   *     ListSubscriptionsResponse response = incidentServiceClient.listSubscriptionsCallable().call(request);
   *     for (Subscription element : response.getSubscriptionsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListSubscriptionsRequest, ListSubscriptionsResponse>
      listSubscriptionsCallable() {
    return stub.listSubscriptionsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an existing subscription.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   SubscriptionName name = SubscriptionName.of("[PROJECT]", "[INCIDENT]", "[SUBSCRIPTION]");
   *   incidentServiceClient.deleteSubscription(name);
   * }
   * </code></pre>
   *
   * @param name Resource name of the subscription.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteSubscription(SubscriptionName name) {

    DeleteSubscriptionRequest request =
        DeleteSubscriptionRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    deleteSubscription(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an existing subscription.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   SubscriptionName name = SubscriptionName.of("[PROJECT]", "[INCIDENT]", "[SUBSCRIPTION]");
   *   incidentServiceClient.deleteSubscription(name.toString());
   * }
   * </code></pre>
   *
   * @param name Resource name of the subscription.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteSubscription(String name) {

    DeleteSubscriptionRequest request =
        DeleteSubscriptionRequest.newBuilder().setName(name).build();
    deleteSubscription(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an existing subscription.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   SubscriptionName name = SubscriptionName.of("[PROJECT]", "[INCIDENT]", "[SUBSCRIPTION]");
   *   DeleteSubscriptionRequest request = DeleteSubscriptionRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   incidentServiceClient.deleteSubscription(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteSubscription(DeleteSubscriptionRequest request) {
    deleteSubscriptionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an existing subscription.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   SubscriptionName name = SubscriptionName.of("[PROJECT]", "[INCIDENT]", "[SUBSCRIPTION]");
   *   DeleteSubscriptionRequest request = DeleteSubscriptionRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;Void&gt; future = incidentServiceClient.deleteSubscriptionCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteSubscriptionRequest, Empty> deleteSubscriptionCallable() {
    return stub.deleteSubscriptionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a role assignment on an existing incident. Normally, the user field will be set when
   * assigning a role to oneself, and the next field will be set when proposing another user as the
   * assignee. Setting the next field directly to a user other than oneself is equivalent to
   * proposing and force-assigning the role to the user.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   IncidentRoleAssignment incidentRoleAssignment = IncidentRoleAssignment.newBuilder().build();
   *   IncidentRoleAssignment response = incidentServiceClient.createIncidentRoleAssignment(parent, incidentRoleAssignment);
   * }
   * </code></pre>
   *
   * @param parent Resource name of the incident, for example,
   *     "projects/{project_id}/incidents/{incident_id}".
   * @param incidentRoleAssignment Role assignment to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final IncidentRoleAssignment createIncidentRoleAssignment(
      IncidentName parent, IncidentRoleAssignment incidentRoleAssignment) {

    CreateIncidentRoleAssignmentRequest request =
        CreateIncidentRoleAssignmentRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setIncidentRoleAssignment(incidentRoleAssignment)
            .build();
    return createIncidentRoleAssignment(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a role assignment on an existing incident. Normally, the user field will be set when
   * assigning a role to oneself, and the next field will be set when proposing another user as the
   * assignee. Setting the next field directly to a user other than oneself is equivalent to
   * proposing and force-assigning the role to the user.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   IncidentRoleAssignment incidentRoleAssignment = IncidentRoleAssignment.newBuilder().build();
   *   IncidentRoleAssignment response = incidentServiceClient.createIncidentRoleAssignment(parent.toString(), incidentRoleAssignment);
   * }
   * </code></pre>
   *
   * @param parent Resource name of the incident, for example,
   *     "projects/{project_id}/incidents/{incident_id}".
   * @param incidentRoleAssignment Role assignment to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final IncidentRoleAssignment createIncidentRoleAssignment(
      String parent, IncidentRoleAssignment incidentRoleAssignment) {

    CreateIncidentRoleAssignmentRequest request =
        CreateIncidentRoleAssignmentRequest.newBuilder()
            .setParent(parent)
            .setIncidentRoleAssignment(incidentRoleAssignment)
            .build();
    return createIncidentRoleAssignment(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a role assignment on an existing incident. Normally, the user field will be set when
   * assigning a role to oneself, and the next field will be set when proposing another user as the
   * assignee. Setting the next field directly to a user other than oneself is equivalent to
   * proposing and force-assigning the role to the user.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   IncidentRoleAssignment incidentRoleAssignment = IncidentRoleAssignment.newBuilder().build();
   *   CreateIncidentRoleAssignmentRequest request = CreateIncidentRoleAssignmentRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setIncidentRoleAssignment(incidentRoleAssignment)
   *     .build();
   *   IncidentRoleAssignment response = incidentServiceClient.createIncidentRoleAssignment(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final IncidentRoleAssignment createIncidentRoleAssignment(
      CreateIncidentRoleAssignmentRequest request) {
    return createIncidentRoleAssignmentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a role assignment on an existing incident. Normally, the user field will be set when
   * assigning a role to oneself, and the next field will be set when proposing another user as the
   * assignee. Setting the next field directly to a user other than oneself is equivalent to
   * proposing and force-assigning the role to the user.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   IncidentRoleAssignment incidentRoleAssignment = IncidentRoleAssignment.newBuilder().build();
   *   CreateIncidentRoleAssignmentRequest request = CreateIncidentRoleAssignmentRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setIncidentRoleAssignment(incidentRoleAssignment)
   *     .build();
   *   ApiFuture&lt;IncidentRoleAssignment&gt; future = incidentServiceClient.createIncidentRoleAssignmentCallable().futureCall(request);
   *   // Do something
   *   IncidentRoleAssignment response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateIncidentRoleAssignmentRequest, IncidentRoleAssignment>
      createIncidentRoleAssignmentCallable() {
    return stub.createIncidentRoleAssignmentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an existing role assignment.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   RoleAssignmentName name = RoleAssignmentName.of("[PROJECT]", "[INCIDENT]", "[ROLE_ASSIGNMENT]");
   *   incidentServiceClient.deleteIncidentRoleAssignment(name);
   * }
   * </code></pre>
   *
   * @param name Resource name of the role assignment.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteIncidentRoleAssignment(RoleAssignmentName name) {

    DeleteIncidentRoleAssignmentRequest request =
        DeleteIncidentRoleAssignmentRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    deleteIncidentRoleAssignment(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an existing role assignment.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   RoleAssignmentName name = RoleAssignmentName.of("[PROJECT]", "[INCIDENT]", "[ROLE_ASSIGNMENT]");
   *   incidentServiceClient.deleteIncidentRoleAssignment(name.toString());
   * }
   * </code></pre>
   *
   * @param name Resource name of the role assignment.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteIncidentRoleAssignment(String name) {

    DeleteIncidentRoleAssignmentRequest request =
        DeleteIncidentRoleAssignmentRequest.newBuilder().setName(name).build();
    deleteIncidentRoleAssignment(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an existing role assignment.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   RoleAssignmentName name = RoleAssignmentName.of("[PROJECT]", "[INCIDENT]", "[ROLE_ASSIGNMENT]");
   *   DeleteIncidentRoleAssignmentRequest request = DeleteIncidentRoleAssignmentRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   incidentServiceClient.deleteIncidentRoleAssignment(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteIncidentRoleAssignment(DeleteIncidentRoleAssignmentRequest request) {
    deleteIncidentRoleAssignmentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an existing role assignment.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   RoleAssignmentName name = RoleAssignmentName.of("[PROJECT]", "[INCIDENT]", "[ROLE_ASSIGNMENT]");
   *   DeleteIncidentRoleAssignmentRequest request = DeleteIncidentRoleAssignmentRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;Void&gt; future = incidentServiceClient.deleteIncidentRoleAssignmentCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteIncidentRoleAssignmentRequest, Empty>
      deleteIncidentRoleAssignmentCallable() {
    return stub.deleteIncidentRoleAssignmentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists role assignments that are part of an incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   for (IncidentRoleAssignment element : incidentServiceClient.listIncidentRoleAssignments(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Resource name of the incident, for example,
   *     "projects/{project_id}/incidents/{incident_id}".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListIncidentRoleAssignmentsPagedResponse listIncidentRoleAssignments(
      IncidentName parent) {
    ListIncidentRoleAssignmentsRequest request =
        ListIncidentRoleAssignmentsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listIncidentRoleAssignments(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists role assignments that are part of an incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   for (IncidentRoleAssignment element : incidentServiceClient.listIncidentRoleAssignments(parent.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Resource name of the incident, for example,
   *     "projects/{project_id}/incidents/{incident_id}".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListIncidentRoleAssignmentsPagedResponse listIncidentRoleAssignments(String parent) {
    ListIncidentRoleAssignmentsRequest request =
        ListIncidentRoleAssignmentsRequest.newBuilder().setParent(parent).build();
    return listIncidentRoleAssignments(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists role assignments that are part of an incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   ListIncidentRoleAssignmentsRequest request = ListIncidentRoleAssignmentsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   for (IncidentRoleAssignment element : incidentServiceClient.listIncidentRoleAssignments(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListIncidentRoleAssignmentsPagedResponse listIncidentRoleAssignments(
      ListIncidentRoleAssignmentsRequest request) {
    return listIncidentRoleAssignmentsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists role assignments that are part of an incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   ListIncidentRoleAssignmentsRequest request = ListIncidentRoleAssignmentsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   ApiFuture&lt;ListIncidentRoleAssignmentsPagedResponse&gt; future = incidentServiceClient.listIncidentRoleAssignmentsPagedCallable().futureCall(request);
   *   // Do something
   *   for (IncidentRoleAssignment element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<
          ListIncidentRoleAssignmentsRequest, ListIncidentRoleAssignmentsPagedResponse>
      listIncidentRoleAssignmentsPagedCallable() {
    return stub.listIncidentRoleAssignmentsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists role assignments that are part of an incident.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   IncidentName parent = IncidentName.of("[PROJECT]", "[INCIDENT]");
   *   ListIncidentRoleAssignmentsRequest request = ListIncidentRoleAssignmentsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   while (true) {
   *     ListIncidentRoleAssignmentsResponse response = incidentServiceClient.listIncidentRoleAssignmentsCallable().call(request);
   *     for (IncidentRoleAssignment element : response.getIncidentRoleAssignmentsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<
          ListIncidentRoleAssignmentsRequest, ListIncidentRoleAssignmentsResponse>
      listIncidentRoleAssignmentsCallable() {
    return stub.listIncidentRoleAssignmentsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Starts a role handover. The proposed assignee will receive an email notifying them of the
   * assignment. This will fail if a role handover is already pending.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   RoleAssignmentName name = RoleAssignmentName.of("[PROJECT]", "[INCIDENT]", "[ROLE_ASSIGNMENT]");
   *   User newAssignee = User.newBuilder().build();
   *   IncidentRoleAssignment response = incidentServiceClient.requestIncidentRoleHandover(name, newAssignee);
   * }
   * </code></pre>
   *
   * @param name Resource name of the role assignment.
   * @param newAssignee The proposed assignee.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final IncidentRoleAssignment requestIncidentRoleHandover(
      RoleAssignmentName name, User newAssignee) {

    RequestIncidentRoleHandoverRequest request =
        RequestIncidentRoleHandoverRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setNewAssignee(newAssignee)
            .build();
    return requestIncidentRoleHandover(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Starts a role handover. The proposed assignee will receive an email notifying them of the
   * assignment. This will fail if a role handover is already pending.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   RoleAssignmentName name = RoleAssignmentName.of("[PROJECT]", "[INCIDENT]", "[ROLE_ASSIGNMENT]");
   *   User newAssignee = User.newBuilder().build();
   *   IncidentRoleAssignment response = incidentServiceClient.requestIncidentRoleHandover(name.toString(), newAssignee);
   * }
   * </code></pre>
   *
   * @param name Resource name of the role assignment.
   * @param newAssignee The proposed assignee.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final IncidentRoleAssignment requestIncidentRoleHandover(String name, User newAssignee) {

    RequestIncidentRoleHandoverRequest request =
        RequestIncidentRoleHandoverRequest.newBuilder()
            .setName(name)
            .setNewAssignee(newAssignee)
            .build();
    return requestIncidentRoleHandover(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Starts a role handover. The proposed assignee will receive an email notifying them of the
   * assignment. This will fail if a role handover is already pending.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   RoleAssignmentName name = RoleAssignmentName.of("[PROJECT]", "[INCIDENT]", "[ROLE_ASSIGNMENT]");
   *   User newAssignee = User.newBuilder().build();
   *   RequestIncidentRoleHandoverRequest request = RequestIncidentRoleHandoverRequest.newBuilder()
   *     .setName(name.toString())
   *     .setNewAssignee(newAssignee)
   *     .build();
   *   IncidentRoleAssignment response = incidentServiceClient.requestIncidentRoleHandover(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final IncidentRoleAssignment requestIncidentRoleHandover(
      RequestIncidentRoleHandoverRequest request) {
    return requestIncidentRoleHandoverCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Starts a role handover. The proposed assignee will receive an email notifying them of the
   * assignment. This will fail if a role handover is already pending.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   RoleAssignmentName name = RoleAssignmentName.of("[PROJECT]", "[INCIDENT]", "[ROLE_ASSIGNMENT]");
   *   User newAssignee = User.newBuilder().build();
   *   RequestIncidentRoleHandoverRequest request = RequestIncidentRoleHandoverRequest.newBuilder()
   *     .setName(name.toString())
   *     .setNewAssignee(newAssignee)
   *     .build();
   *   ApiFuture&lt;IncidentRoleAssignment&gt; future = incidentServiceClient.requestIncidentRoleHandoverCallable().futureCall(request);
   *   // Do something
   *   IncidentRoleAssignment response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<RequestIncidentRoleHandoverRequest, IncidentRoleAssignment>
      requestIncidentRoleHandoverCallable() {
    return stub.requestIncidentRoleHandoverCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Confirms a role handover. This will fail if the 'proposed_assignee' field of the
   * IncidentRoleAssignment is not equal to the 'new_assignee' field of the request. If the caller
   * is not the new_assignee, ForceIncidentRoleHandover should be used instead.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   RoleAssignmentName name = RoleAssignmentName.of("[PROJECT]", "[INCIDENT]", "[ROLE_ASSIGNMENT]");
   *   User newAssignee = User.newBuilder().build();
   *   IncidentRoleAssignment response = incidentServiceClient.confirmIncidentRoleHandover(name, newAssignee);
   * }
   * </code></pre>
   *
   * @param name Resource name of the role assignment.
   * @param newAssignee The proposed assignee, who will now be the assignee. This should be the
   *     current user; otherwise ForceRoleHandover should be called.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final IncidentRoleAssignment confirmIncidentRoleHandover(
      RoleAssignmentName name, User newAssignee) {

    ConfirmIncidentRoleHandoverRequest request =
        ConfirmIncidentRoleHandoverRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setNewAssignee(newAssignee)
            .build();
    return confirmIncidentRoleHandover(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Confirms a role handover. This will fail if the 'proposed_assignee' field of the
   * IncidentRoleAssignment is not equal to the 'new_assignee' field of the request. If the caller
   * is not the new_assignee, ForceIncidentRoleHandover should be used instead.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   RoleAssignmentName name = RoleAssignmentName.of("[PROJECT]", "[INCIDENT]", "[ROLE_ASSIGNMENT]");
   *   User newAssignee = User.newBuilder().build();
   *   IncidentRoleAssignment response = incidentServiceClient.confirmIncidentRoleHandover(name.toString(), newAssignee);
   * }
   * </code></pre>
   *
   * @param name Resource name of the role assignment.
   * @param newAssignee The proposed assignee, who will now be the assignee. This should be the
   *     current user; otherwise ForceRoleHandover should be called.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final IncidentRoleAssignment confirmIncidentRoleHandover(String name, User newAssignee) {

    ConfirmIncidentRoleHandoverRequest request =
        ConfirmIncidentRoleHandoverRequest.newBuilder()
            .setName(name)
            .setNewAssignee(newAssignee)
            .build();
    return confirmIncidentRoleHandover(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Confirms a role handover. This will fail if the 'proposed_assignee' field of the
   * IncidentRoleAssignment is not equal to the 'new_assignee' field of the request. If the caller
   * is not the new_assignee, ForceIncidentRoleHandover should be used instead.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   RoleAssignmentName name = RoleAssignmentName.of("[PROJECT]", "[INCIDENT]", "[ROLE_ASSIGNMENT]");
   *   User newAssignee = User.newBuilder().build();
   *   ConfirmIncidentRoleHandoverRequest request = ConfirmIncidentRoleHandoverRequest.newBuilder()
   *     .setName(name.toString())
   *     .setNewAssignee(newAssignee)
   *     .build();
   *   IncidentRoleAssignment response = incidentServiceClient.confirmIncidentRoleHandover(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final IncidentRoleAssignment confirmIncidentRoleHandover(
      ConfirmIncidentRoleHandoverRequest request) {
    return confirmIncidentRoleHandoverCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Confirms a role handover. This will fail if the 'proposed_assignee' field of the
   * IncidentRoleAssignment is not equal to the 'new_assignee' field of the request. If the caller
   * is not the new_assignee, ForceIncidentRoleHandover should be used instead.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   RoleAssignmentName name = RoleAssignmentName.of("[PROJECT]", "[INCIDENT]", "[ROLE_ASSIGNMENT]");
   *   User newAssignee = User.newBuilder().build();
   *   ConfirmIncidentRoleHandoverRequest request = ConfirmIncidentRoleHandoverRequest.newBuilder()
   *     .setName(name.toString())
   *     .setNewAssignee(newAssignee)
   *     .build();
   *   ApiFuture&lt;IncidentRoleAssignment&gt; future = incidentServiceClient.confirmIncidentRoleHandoverCallable().futureCall(request);
   *   // Do something
   *   IncidentRoleAssignment response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<ConfirmIncidentRoleHandoverRequest, IncidentRoleAssignment>
      confirmIncidentRoleHandoverCallable() {
    return stub.confirmIncidentRoleHandoverCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Forces a role handover. This will fail if the 'proposed_assignee' field of the
   * IncidentRoleAssignment is not equal to the 'new_assignee' field of the request. If the caller
   * is the new_assignee, ConfirmIncidentRoleHandover should be used instead.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   RoleAssignmentName name = RoleAssignmentName.of("[PROJECT]", "[INCIDENT]", "[ROLE_ASSIGNMENT]");
   *   User newAssignee = User.newBuilder().build();
   *   IncidentRoleAssignment response = incidentServiceClient.forceIncidentRoleHandover(name, newAssignee);
   * }
   * </code></pre>
   *
   * @param name Resource name of the role assignment.
   * @param newAssignee The proposed assignee, who will now be the assignee. This should not be the
   *     current user; otherwise ConfirmRoleHandover should be called.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final IncidentRoleAssignment forceIncidentRoleHandover(
      RoleAssignmentName name, User newAssignee) {

    ForceIncidentRoleHandoverRequest request =
        ForceIncidentRoleHandoverRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setNewAssignee(newAssignee)
            .build();
    return forceIncidentRoleHandover(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Forces a role handover. This will fail if the 'proposed_assignee' field of the
   * IncidentRoleAssignment is not equal to the 'new_assignee' field of the request. If the caller
   * is the new_assignee, ConfirmIncidentRoleHandover should be used instead.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   RoleAssignmentName name = RoleAssignmentName.of("[PROJECT]", "[INCIDENT]", "[ROLE_ASSIGNMENT]");
   *   User newAssignee = User.newBuilder().build();
   *   IncidentRoleAssignment response = incidentServiceClient.forceIncidentRoleHandover(name.toString(), newAssignee);
   * }
   * </code></pre>
   *
   * @param name Resource name of the role assignment.
   * @param newAssignee The proposed assignee, who will now be the assignee. This should not be the
   *     current user; otherwise ConfirmRoleHandover should be called.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final IncidentRoleAssignment forceIncidentRoleHandover(String name, User newAssignee) {

    ForceIncidentRoleHandoverRequest request =
        ForceIncidentRoleHandoverRequest.newBuilder()
            .setName(name)
            .setNewAssignee(newAssignee)
            .build();
    return forceIncidentRoleHandover(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Forces a role handover. This will fail if the 'proposed_assignee' field of the
   * IncidentRoleAssignment is not equal to the 'new_assignee' field of the request. If the caller
   * is the new_assignee, ConfirmIncidentRoleHandover should be used instead.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   RoleAssignmentName name = RoleAssignmentName.of("[PROJECT]", "[INCIDENT]", "[ROLE_ASSIGNMENT]");
   *   User newAssignee = User.newBuilder().build();
   *   ForceIncidentRoleHandoverRequest request = ForceIncidentRoleHandoverRequest.newBuilder()
   *     .setName(name.toString())
   *     .setNewAssignee(newAssignee)
   *     .build();
   *   IncidentRoleAssignment response = incidentServiceClient.forceIncidentRoleHandover(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final IncidentRoleAssignment forceIncidentRoleHandover(
      ForceIncidentRoleHandoverRequest request) {
    return forceIncidentRoleHandoverCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Forces a role handover. This will fail if the 'proposed_assignee' field of the
   * IncidentRoleAssignment is not equal to the 'new_assignee' field of the request. If the caller
   * is the new_assignee, ConfirmIncidentRoleHandover should be used instead.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   RoleAssignmentName name = RoleAssignmentName.of("[PROJECT]", "[INCIDENT]", "[ROLE_ASSIGNMENT]");
   *   User newAssignee = User.newBuilder().build();
   *   ForceIncidentRoleHandoverRequest request = ForceIncidentRoleHandoverRequest.newBuilder()
   *     .setName(name.toString())
   *     .setNewAssignee(newAssignee)
   *     .build();
   *   ApiFuture&lt;IncidentRoleAssignment&gt; future = incidentServiceClient.forceIncidentRoleHandoverCallable().futureCall(request);
   *   // Do something
   *   IncidentRoleAssignment response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<ForceIncidentRoleHandoverRequest, IncidentRoleAssignment>
      forceIncidentRoleHandoverCallable() {
    return stub.forceIncidentRoleHandoverCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Cancels a role handover. This will fail if the 'proposed_assignee' field of the
   * IncidentRoleAssignment is not equal to the 'new_assignee' field of the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   RoleAssignmentName name = RoleAssignmentName.of("[PROJECT]", "[INCIDENT]", "[ROLE_ASSIGNMENT]");
   *   User newAssignee = User.newBuilder().build();
   *   IncidentRoleAssignment response = incidentServiceClient.cancelIncidentRoleHandover(name, newAssignee);
   * }
   * </code></pre>
   *
   * @param name Resource name of the role assignment.
   * @param newAssignee Person who was proposed as the next assignee (i.e.
   *     IncidentRoleAssignment.proposed_assignee) and whose proposal is being cancelled.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final IncidentRoleAssignment cancelIncidentRoleHandover(
      RoleAssignmentName name, User newAssignee) {

    CancelIncidentRoleHandoverRequest request =
        CancelIncidentRoleHandoverRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setNewAssignee(newAssignee)
            .build();
    return cancelIncidentRoleHandover(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Cancels a role handover. This will fail if the 'proposed_assignee' field of the
   * IncidentRoleAssignment is not equal to the 'new_assignee' field of the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   RoleAssignmentName name = RoleAssignmentName.of("[PROJECT]", "[INCIDENT]", "[ROLE_ASSIGNMENT]");
   *   User newAssignee = User.newBuilder().build();
   *   IncidentRoleAssignment response = incidentServiceClient.cancelIncidentRoleHandover(name.toString(), newAssignee);
   * }
   * </code></pre>
   *
   * @param name Resource name of the role assignment.
   * @param newAssignee Person who was proposed as the next assignee (i.e.
   *     IncidentRoleAssignment.proposed_assignee) and whose proposal is being cancelled.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final IncidentRoleAssignment cancelIncidentRoleHandover(String name, User newAssignee) {

    CancelIncidentRoleHandoverRequest request =
        CancelIncidentRoleHandoverRequest.newBuilder()
            .setName(name)
            .setNewAssignee(newAssignee)
            .build();
    return cancelIncidentRoleHandover(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Cancels a role handover. This will fail if the 'proposed_assignee' field of the
   * IncidentRoleAssignment is not equal to the 'new_assignee' field of the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   RoleAssignmentName name = RoleAssignmentName.of("[PROJECT]", "[INCIDENT]", "[ROLE_ASSIGNMENT]");
   *   User newAssignee = User.newBuilder().build();
   *   CancelIncidentRoleHandoverRequest request = CancelIncidentRoleHandoverRequest.newBuilder()
   *     .setName(name.toString())
   *     .setNewAssignee(newAssignee)
   *     .build();
   *   IncidentRoleAssignment response = incidentServiceClient.cancelIncidentRoleHandover(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final IncidentRoleAssignment cancelIncidentRoleHandover(
      CancelIncidentRoleHandoverRequest request) {
    return cancelIncidentRoleHandoverCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Cancels a role handover. This will fail if the 'proposed_assignee' field of the
   * IncidentRoleAssignment is not equal to the 'new_assignee' field of the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
   *   RoleAssignmentName name = RoleAssignmentName.of("[PROJECT]", "[INCIDENT]", "[ROLE_ASSIGNMENT]");
   *   User newAssignee = User.newBuilder().build();
   *   CancelIncidentRoleHandoverRequest request = CancelIncidentRoleHandoverRequest.newBuilder()
   *     .setName(name.toString())
   *     .setNewAssignee(newAssignee)
   *     .build();
   *   ApiFuture&lt;IncidentRoleAssignment&gt; future = incidentServiceClient.cancelIncidentRoleHandoverCallable().futureCall(request);
   *   // Do something
   *   IncidentRoleAssignment response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CancelIncidentRoleHandoverRequest, IncidentRoleAssignment>
      cancelIncidentRoleHandoverCallable() {
    return stub.cancelIncidentRoleHandoverCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class SearchIncidentsPagedResponse
      extends AbstractPagedListResponse<
          SearchIncidentsRequest,
          SearchIncidentsResponse,
          Incident,
          SearchIncidentsPage,
          SearchIncidentsFixedSizeCollection> {

    public static ApiFuture<SearchIncidentsPagedResponse> createAsync(
        PageContext<SearchIncidentsRequest, SearchIncidentsResponse, Incident> context,
        ApiFuture<SearchIncidentsResponse> futureResponse) {
      ApiFuture<SearchIncidentsPage> futurePage =
          SearchIncidentsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<SearchIncidentsPage, SearchIncidentsPagedResponse>() {
            @Override
            public SearchIncidentsPagedResponse apply(SearchIncidentsPage input) {
              return new SearchIncidentsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private SearchIncidentsPagedResponse(SearchIncidentsPage page) {
      super(page, SearchIncidentsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class SearchIncidentsPage
      extends AbstractPage<
          SearchIncidentsRequest, SearchIncidentsResponse, Incident, SearchIncidentsPage> {

    private SearchIncidentsPage(
        PageContext<SearchIncidentsRequest, SearchIncidentsResponse, Incident> context,
        SearchIncidentsResponse response) {
      super(context, response);
    }

    private static SearchIncidentsPage createEmptyPage() {
      return new SearchIncidentsPage(null, null);
    }

    @Override
    protected SearchIncidentsPage createPage(
        PageContext<SearchIncidentsRequest, SearchIncidentsResponse, Incident> context,
        SearchIncidentsResponse response) {
      return new SearchIncidentsPage(context, response);
    }

    @Override
    public ApiFuture<SearchIncidentsPage> createPageAsync(
        PageContext<SearchIncidentsRequest, SearchIncidentsResponse, Incident> context,
        ApiFuture<SearchIncidentsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class SearchIncidentsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          SearchIncidentsRequest,
          SearchIncidentsResponse,
          Incident,
          SearchIncidentsPage,
          SearchIncidentsFixedSizeCollection> {

    private SearchIncidentsFixedSizeCollection(
        List<SearchIncidentsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static SearchIncidentsFixedSizeCollection createEmptyCollection() {
      return new SearchIncidentsFixedSizeCollection(null, 0);
    }

    @Override
    protected SearchIncidentsFixedSizeCollection createCollection(
        List<SearchIncidentsPage> pages, int collectionSize) {
      return new SearchIncidentsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class SearchSimilarIncidentsPagedResponse
      extends AbstractPagedListResponse<
          SearchSimilarIncidentsRequest,
          SearchSimilarIncidentsResponse,
          SearchSimilarIncidentsResponse.Result,
          SearchSimilarIncidentsPage,
          SearchSimilarIncidentsFixedSizeCollection> {

    public static ApiFuture<SearchSimilarIncidentsPagedResponse> createAsync(
        PageContext<
                SearchSimilarIncidentsRequest,
                SearchSimilarIncidentsResponse,
                SearchSimilarIncidentsResponse.Result>
            context,
        ApiFuture<SearchSimilarIncidentsResponse> futureResponse) {
      ApiFuture<SearchSimilarIncidentsPage> futurePage =
          SearchSimilarIncidentsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<SearchSimilarIncidentsPage, SearchSimilarIncidentsPagedResponse>() {
            @Override
            public SearchSimilarIncidentsPagedResponse apply(SearchSimilarIncidentsPage input) {
              return new SearchSimilarIncidentsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private SearchSimilarIncidentsPagedResponse(SearchSimilarIncidentsPage page) {
      super(page, SearchSimilarIncidentsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class SearchSimilarIncidentsPage
      extends AbstractPage<
          SearchSimilarIncidentsRequest,
          SearchSimilarIncidentsResponse,
          SearchSimilarIncidentsResponse.Result,
          SearchSimilarIncidentsPage> {

    private SearchSimilarIncidentsPage(
        PageContext<
                SearchSimilarIncidentsRequest,
                SearchSimilarIncidentsResponse,
                SearchSimilarIncidentsResponse.Result>
            context,
        SearchSimilarIncidentsResponse response) {
      super(context, response);
    }

    private static SearchSimilarIncidentsPage createEmptyPage() {
      return new SearchSimilarIncidentsPage(null, null);
    }

    @Override
    protected SearchSimilarIncidentsPage createPage(
        PageContext<
                SearchSimilarIncidentsRequest,
                SearchSimilarIncidentsResponse,
                SearchSimilarIncidentsResponse.Result>
            context,
        SearchSimilarIncidentsResponse response) {
      return new SearchSimilarIncidentsPage(context, response);
    }

    @Override
    public ApiFuture<SearchSimilarIncidentsPage> createPageAsync(
        PageContext<
                SearchSimilarIncidentsRequest,
                SearchSimilarIncidentsResponse,
                SearchSimilarIncidentsResponse.Result>
            context,
        ApiFuture<SearchSimilarIncidentsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class SearchSimilarIncidentsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          SearchSimilarIncidentsRequest,
          SearchSimilarIncidentsResponse,
          SearchSimilarIncidentsResponse.Result,
          SearchSimilarIncidentsPage,
          SearchSimilarIncidentsFixedSizeCollection> {

    private SearchSimilarIncidentsFixedSizeCollection(
        List<SearchSimilarIncidentsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static SearchSimilarIncidentsFixedSizeCollection createEmptyCollection() {
      return new SearchSimilarIncidentsFixedSizeCollection(null, 0);
    }

    @Override
    protected SearchSimilarIncidentsFixedSizeCollection createCollection(
        List<SearchSimilarIncidentsPage> pages, int collectionSize) {
      return new SearchSimilarIncidentsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListAnnotationsPagedResponse
      extends AbstractPagedListResponse<
          ListAnnotationsRequest,
          ListAnnotationsResponse,
          Annotation,
          ListAnnotationsPage,
          ListAnnotationsFixedSizeCollection> {

    public static ApiFuture<ListAnnotationsPagedResponse> createAsync(
        PageContext<ListAnnotationsRequest, ListAnnotationsResponse, Annotation> context,
        ApiFuture<ListAnnotationsResponse> futureResponse) {
      ApiFuture<ListAnnotationsPage> futurePage =
          ListAnnotationsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListAnnotationsPage, ListAnnotationsPagedResponse>() {
            @Override
            public ListAnnotationsPagedResponse apply(ListAnnotationsPage input) {
              return new ListAnnotationsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListAnnotationsPagedResponse(ListAnnotationsPage page) {
      super(page, ListAnnotationsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListAnnotationsPage
      extends AbstractPage<
          ListAnnotationsRequest, ListAnnotationsResponse, Annotation, ListAnnotationsPage> {

    private ListAnnotationsPage(
        PageContext<ListAnnotationsRequest, ListAnnotationsResponse, Annotation> context,
        ListAnnotationsResponse response) {
      super(context, response);
    }

    private static ListAnnotationsPage createEmptyPage() {
      return new ListAnnotationsPage(null, null);
    }

    @Override
    protected ListAnnotationsPage createPage(
        PageContext<ListAnnotationsRequest, ListAnnotationsResponse, Annotation> context,
        ListAnnotationsResponse response) {
      return new ListAnnotationsPage(context, response);
    }

    @Override
    public ApiFuture<ListAnnotationsPage> createPageAsync(
        PageContext<ListAnnotationsRequest, ListAnnotationsResponse, Annotation> context,
        ApiFuture<ListAnnotationsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListAnnotationsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListAnnotationsRequest,
          ListAnnotationsResponse,
          Annotation,
          ListAnnotationsPage,
          ListAnnotationsFixedSizeCollection> {

    private ListAnnotationsFixedSizeCollection(
        List<ListAnnotationsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListAnnotationsFixedSizeCollection createEmptyCollection() {
      return new ListAnnotationsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListAnnotationsFixedSizeCollection createCollection(
        List<ListAnnotationsPage> pages, int collectionSize) {
      return new ListAnnotationsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListTagsPagedResponse
      extends AbstractPagedListResponse<
          ListTagsRequest, ListTagsResponse, Tag, ListTagsPage, ListTagsFixedSizeCollection> {

    public static ApiFuture<ListTagsPagedResponse> createAsync(
        PageContext<ListTagsRequest, ListTagsResponse, Tag> context,
        ApiFuture<ListTagsResponse> futureResponse) {
      ApiFuture<ListTagsPage> futurePage =
          ListTagsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListTagsPage, ListTagsPagedResponse>() {
            @Override
            public ListTagsPagedResponse apply(ListTagsPage input) {
              return new ListTagsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListTagsPagedResponse(ListTagsPage page) {
      super(page, ListTagsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListTagsPage
      extends AbstractPage<ListTagsRequest, ListTagsResponse, Tag, ListTagsPage> {

    private ListTagsPage(
        PageContext<ListTagsRequest, ListTagsResponse, Tag> context, ListTagsResponse response) {
      super(context, response);
    }

    private static ListTagsPage createEmptyPage() {
      return new ListTagsPage(null, null);
    }

    @Override
    protected ListTagsPage createPage(
        PageContext<ListTagsRequest, ListTagsResponse, Tag> context, ListTagsResponse response) {
      return new ListTagsPage(context, response);
    }

    @Override
    public ApiFuture<ListTagsPage> createPageAsync(
        PageContext<ListTagsRequest, ListTagsResponse, Tag> context,
        ApiFuture<ListTagsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListTagsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListTagsRequest, ListTagsResponse, Tag, ListTagsPage, ListTagsFixedSizeCollection> {

    private ListTagsFixedSizeCollection(List<ListTagsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListTagsFixedSizeCollection createEmptyCollection() {
      return new ListTagsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListTagsFixedSizeCollection createCollection(
        List<ListTagsPage> pages, int collectionSize) {
      return new ListTagsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class SearchSignalsPagedResponse
      extends AbstractPagedListResponse<
          SearchSignalsRequest,
          SearchSignalsResponse,
          Signal,
          SearchSignalsPage,
          SearchSignalsFixedSizeCollection> {

    public static ApiFuture<SearchSignalsPagedResponse> createAsync(
        PageContext<SearchSignalsRequest, SearchSignalsResponse, Signal> context,
        ApiFuture<SearchSignalsResponse> futureResponse) {
      ApiFuture<SearchSignalsPage> futurePage =
          SearchSignalsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<SearchSignalsPage, SearchSignalsPagedResponse>() {
            @Override
            public SearchSignalsPagedResponse apply(SearchSignalsPage input) {
              return new SearchSignalsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private SearchSignalsPagedResponse(SearchSignalsPage page) {
      super(page, SearchSignalsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class SearchSignalsPage
      extends AbstractPage<SearchSignalsRequest, SearchSignalsResponse, Signal, SearchSignalsPage> {

    private SearchSignalsPage(
        PageContext<SearchSignalsRequest, SearchSignalsResponse, Signal> context,
        SearchSignalsResponse response) {
      super(context, response);
    }

    private static SearchSignalsPage createEmptyPage() {
      return new SearchSignalsPage(null, null);
    }

    @Override
    protected SearchSignalsPage createPage(
        PageContext<SearchSignalsRequest, SearchSignalsResponse, Signal> context,
        SearchSignalsResponse response) {
      return new SearchSignalsPage(context, response);
    }

    @Override
    public ApiFuture<SearchSignalsPage> createPageAsync(
        PageContext<SearchSignalsRequest, SearchSignalsResponse, Signal> context,
        ApiFuture<SearchSignalsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class SearchSignalsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          SearchSignalsRequest,
          SearchSignalsResponse,
          Signal,
          SearchSignalsPage,
          SearchSignalsFixedSizeCollection> {

    private SearchSignalsFixedSizeCollection(List<SearchSignalsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static SearchSignalsFixedSizeCollection createEmptyCollection() {
      return new SearchSignalsFixedSizeCollection(null, 0);
    }

    @Override
    protected SearchSignalsFixedSizeCollection createCollection(
        List<SearchSignalsPage> pages, int collectionSize) {
      return new SearchSignalsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListArtifactsPagedResponse
      extends AbstractPagedListResponse<
          ListArtifactsRequest,
          ListArtifactsResponse,
          Artifact,
          ListArtifactsPage,
          ListArtifactsFixedSizeCollection> {

    public static ApiFuture<ListArtifactsPagedResponse> createAsync(
        PageContext<ListArtifactsRequest, ListArtifactsResponse, Artifact> context,
        ApiFuture<ListArtifactsResponse> futureResponse) {
      ApiFuture<ListArtifactsPage> futurePage =
          ListArtifactsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListArtifactsPage, ListArtifactsPagedResponse>() {
            @Override
            public ListArtifactsPagedResponse apply(ListArtifactsPage input) {
              return new ListArtifactsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListArtifactsPagedResponse(ListArtifactsPage page) {
      super(page, ListArtifactsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListArtifactsPage
      extends AbstractPage<
          ListArtifactsRequest, ListArtifactsResponse, Artifact, ListArtifactsPage> {

    private ListArtifactsPage(
        PageContext<ListArtifactsRequest, ListArtifactsResponse, Artifact> context,
        ListArtifactsResponse response) {
      super(context, response);
    }

    private static ListArtifactsPage createEmptyPage() {
      return new ListArtifactsPage(null, null);
    }

    @Override
    protected ListArtifactsPage createPage(
        PageContext<ListArtifactsRequest, ListArtifactsResponse, Artifact> context,
        ListArtifactsResponse response) {
      return new ListArtifactsPage(context, response);
    }

    @Override
    public ApiFuture<ListArtifactsPage> createPageAsync(
        PageContext<ListArtifactsRequest, ListArtifactsResponse, Artifact> context,
        ApiFuture<ListArtifactsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListArtifactsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListArtifactsRequest,
          ListArtifactsResponse,
          Artifact,
          ListArtifactsPage,
          ListArtifactsFixedSizeCollection> {

    private ListArtifactsFixedSizeCollection(List<ListArtifactsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListArtifactsFixedSizeCollection createEmptyCollection() {
      return new ListArtifactsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListArtifactsFixedSizeCollection createCollection(
        List<ListArtifactsPage> pages, int collectionSize) {
      return new ListArtifactsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListSubscriptionsPagedResponse
      extends AbstractPagedListResponse<
          ListSubscriptionsRequest,
          ListSubscriptionsResponse,
          Subscription,
          ListSubscriptionsPage,
          ListSubscriptionsFixedSizeCollection> {

    public static ApiFuture<ListSubscriptionsPagedResponse> createAsync(
        PageContext<ListSubscriptionsRequest, ListSubscriptionsResponse, Subscription> context,
        ApiFuture<ListSubscriptionsResponse> futureResponse) {
      ApiFuture<ListSubscriptionsPage> futurePage =
          ListSubscriptionsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListSubscriptionsPage, ListSubscriptionsPagedResponse>() {
            @Override
            public ListSubscriptionsPagedResponse apply(ListSubscriptionsPage input) {
              return new ListSubscriptionsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListSubscriptionsPagedResponse(ListSubscriptionsPage page) {
      super(page, ListSubscriptionsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListSubscriptionsPage
      extends AbstractPage<
          ListSubscriptionsRequest,
          ListSubscriptionsResponse,
          Subscription,
          ListSubscriptionsPage> {

    private ListSubscriptionsPage(
        PageContext<ListSubscriptionsRequest, ListSubscriptionsResponse, Subscription> context,
        ListSubscriptionsResponse response) {
      super(context, response);
    }

    private static ListSubscriptionsPage createEmptyPage() {
      return new ListSubscriptionsPage(null, null);
    }

    @Override
    protected ListSubscriptionsPage createPage(
        PageContext<ListSubscriptionsRequest, ListSubscriptionsResponse, Subscription> context,
        ListSubscriptionsResponse response) {
      return new ListSubscriptionsPage(context, response);
    }

    @Override
    public ApiFuture<ListSubscriptionsPage> createPageAsync(
        PageContext<ListSubscriptionsRequest, ListSubscriptionsResponse, Subscription> context,
        ApiFuture<ListSubscriptionsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListSubscriptionsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListSubscriptionsRequest,
          ListSubscriptionsResponse,
          Subscription,
          ListSubscriptionsPage,
          ListSubscriptionsFixedSizeCollection> {

    private ListSubscriptionsFixedSizeCollection(
        List<ListSubscriptionsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListSubscriptionsFixedSizeCollection createEmptyCollection() {
      return new ListSubscriptionsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListSubscriptionsFixedSizeCollection createCollection(
        List<ListSubscriptionsPage> pages, int collectionSize) {
      return new ListSubscriptionsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListIncidentRoleAssignmentsPagedResponse
      extends AbstractPagedListResponse<
          ListIncidentRoleAssignmentsRequest,
          ListIncidentRoleAssignmentsResponse,
          IncidentRoleAssignment,
          ListIncidentRoleAssignmentsPage,
          ListIncidentRoleAssignmentsFixedSizeCollection> {

    public static ApiFuture<ListIncidentRoleAssignmentsPagedResponse> createAsync(
        PageContext<
                ListIncidentRoleAssignmentsRequest,
                ListIncidentRoleAssignmentsResponse,
                IncidentRoleAssignment>
            context,
        ApiFuture<ListIncidentRoleAssignmentsResponse> futureResponse) {
      ApiFuture<ListIncidentRoleAssignmentsPage> futurePage =
          ListIncidentRoleAssignmentsPage.createEmptyPage()
              .createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<
              ListIncidentRoleAssignmentsPage, ListIncidentRoleAssignmentsPagedResponse>() {
            @Override
            public ListIncidentRoleAssignmentsPagedResponse apply(
                ListIncidentRoleAssignmentsPage input) {
              return new ListIncidentRoleAssignmentsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListIncidentRoleAssignmentsPagedResponse(ListIncidentRoleAssignmentsPage page) {
      super(page, ListIncidentRoleAssignmentsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListIncidentRoleAssignmentsPage
      extends AbstractPage<
          ListIncidentRoleAssignmentsRequest,
          ListIncidentRoleAssignmentsResponse,
          IncidentRoleAssignment,
          ListIncidentRoleAssignmentsPage> {

    private ListIncidentRoleAssignmentsPage(
        PageContext<
                ListIncidentRoleAssignmentsRequest,
                ListIncidentRoleAssignmentsResponse,
                IncidentRoleAssignment>
            context,
        ListIncidentRoleAssignmentsResponse response) {
      super(context, response);
    }

    private static ListIncidentRoleAssignmentsPage createEmptyPage() {
      return new ListIncidentRoleAssignmentsPage(null, null);
    }

    @Override
    protected ListIncidentRoleAssignmentsPage createPage(
        PageContext<
                ListIncidentRoleAssignmentsRequest,
                ListIncidentRoleAssignmentsResponse,
                IncidentRoleAssignment>
            context,
        ListIncidentRoleAssignmentsResponse response) {
      return new ListIncidentRoleAssignmentsPage(context, response);
    }

    @Override
    public ApiFuture<ListIncidentRoleAssignmentsPage> createPageAsync(
        PageContext<
                ListIncidentRoleAssignmentsRequest,
                ListIncidentRoleAssignmentsResponse,
                IncidentRoleAssignment>
            context,
        ApiFuture<ListIncidentRoleAssignmentsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListIncidentRoleAssignmentsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListIncidentRoleAssignmentsRequest,
          ListIncidentRoleAssignmentsResponse,
          IncidentRoleAssignment,
          ListIncidentRoleAssignmentsPage,
          ListIncidentRoleAssignmentsFixedSizeCollection> {

    private ListIncidentRoleAssignmentsFixedSizeCollection(
        List<ListIncidentRoleAssignmentsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListIncidentRoleAssignmentsFixedSizeCollection createEmptyCollection() {
      return new ListIncidentRoleAssignmentsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListIncidentRoleAssignmentsFixedSizeCollection createCollection(
        List<ListIncidentRoleAssignmentsPage> pages, int collectionSize) {
      return new ListIncidentRoleAssignmentsFixedSizeCollection(pages, collectionSize);
    }
  }
}
