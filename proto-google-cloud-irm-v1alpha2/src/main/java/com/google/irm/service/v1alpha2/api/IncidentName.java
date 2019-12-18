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

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class IncidentName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/incidents/{incident}");

  private volatile Map<String, String> fieldValuesMap;

  private final String project;
  private final String incident;

  public String getProject() {
    return project;
  }

  public String getIncident() {
    return incident;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private IncidentName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    incident = Preconditions.checkNotNull(builder.getIncident());
  }

  public static IncidentName of(String project, String incident) {
    return newBuilder().setProject(project).setIncident(incident).build();
  }

  public static String format(String project, String incident) {
    return newBuilder().setProject(project).setIncident(incident).build().toString();
  }

  public static IncidentName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(
            formattedString, "IncidentName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("incident"));
  }

  public static List<IncidentName> parseList(List<String> formattedStrings) {
    List<IncidentName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<IncidentName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (IncidentName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("project", project);
          fieldMapBuilder.put("incident", incident);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "incident", incident);
  }

  /** Builder for IncidentName. */
  public static class Builder {

    private String project;
    private String incident;

    public String getProject() {
      return project;
    }

    public String getIncident() {
      return incident;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setIncident(String incident) {
      this.incident = incident;
      return this;
    }

    private Builder() {}

    private Builder(IncidentName incidentName) {
      project = incidentName.project;
      incident = incidentName.incident;
    }

    public IncidentName build() {
      return new IncidentName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IncidentName) {
      IncidentName that = (IncidentName) o;
      return (this.project.equals(that.project)) && (this.incident.equals(that.incident));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= incident.hashCode();
    return h;
  }
}
