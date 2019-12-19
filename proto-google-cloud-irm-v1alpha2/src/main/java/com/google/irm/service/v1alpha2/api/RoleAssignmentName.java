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

/** AUTO-GENERATED DOCUMENTATION AND CLASS */
@javax.annotation.Generated("by GAPIC protoc plugin")
public class RoleAssignmentName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/incidents/{incident}/roleAssignments/{role_assignment}");

  private volatile Map<String, String> fieldValuesMap;

  private final String project;
  private final String incident;
  private final String roleAssignment;

  public String getProject() {
    return project;
  }

  public String getIncident() {
    return incident;
  }

  public String getRoleAssignment() {
    return roleAssignment;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private RoleAssignmentName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    incident = Preconditions.checkNotNull(builder.getIncident());
    roleAssignment = Preconditions.checkNotNull(builder.getRoleAssignment());
  }

  public static RoleAssignmentName of(String project, String incident, String roleAssignment) {
    return newBuilder()
        .setProject(project)
        .setIncident(incident)
        .setRoleAssignment(roleAssignment)
        .build();
  }

  public static String format(String project, String incident, String roleAssignment) {
    return newBuilder()
        .setProject(project)
        .setIncident(incident)
        .setRoleAssignment(roleAssignment)
        .build()
        .toString();
  }

  public static RoleAssignmentName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(
            formattedString, "RoleAssignmentName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("incident"), matchMap.get("role_assignment"));
  }

  public static List<RoleAssignmentName> parseList(List<String> formattedStrings) {
    List<RoleAssignmentName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<RoleAssignmentName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (RoleAssignmentName value : values) {
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
          fieldMapBuilder.put("roleAssignment", roleAssignment);
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
    return PATH_TEMPLATE.instantiate(
        "project", project, "incident", incident, "role_assignment", roleAssignment);
  }

  /** Builder for RoleAssignmentName. */
  public static class Builder {

    private String project;
    private String incident;
    private String roleAssignment;

    public String getProject() {
      return project;
    }

    public String getIncident() {
      return incident;
    }

    public String getRoleAssignment() {
      return roleAssignment;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setIncident(String incident) {
      this.incident = incident;
      return this;
    }

    public Builder setRoleAssignment(String roleAssignment) {
      this.roleAssignment = roleAssignment;
      return this;
    }

    private Builder() {}

    private Builder(RoleAssignmentName roleAssignmentName) {
      project = roleAssignmentName.project;
      incident = roleAssignmentName.incident;
      roleAssignment = roleAssignmentName.roleAssignment;
    }

    public RoleAssignmentName build() {
      return new RoleAssignmentName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RoleAssignmentName) {
      RoleAssignmentName that = (RoleAssignmentName) o;
      return (this.project.equals(that.project))
          && (this.incident.equals(that.incident))
          && (this.roleAssignment.equals(that.roleAssignment));
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
    h *= 1000003;
    h ^= roleAssignment.hashCode();
    return h;
  }
}
