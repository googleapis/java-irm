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

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** AUTO-GENERATED DOCUMENTATION AND CLASS */
@javax.annotation.Generated("by GAPIC protoc plugin")
public class IncidentRoleAssignmentName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project_id_or_number}/incidents/{incident_id}/role_assignments/{role_id}");

  private volatile Map<String, String> fieldValuesMap;

  private final String projectIdOrNumber;
  private final String incidentId;
  private final String roleId;

  public String getProjectIdOrNumber() {
    return projectIdOrNumber;
  }

  public String getIncidentId() {
    return incidentId;
  }

  public String getRoleId() {
    return roleId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private IncidentRoleAssignmentName(Builder builder) {
    projectIdOrNumber = Preconditions.checkNotNull(builder.getProjectIdOrNumber());
    incidentId = Preconditions.checkNotNull(builder.getIncidentId());
    roleId = Preconditions.checkNotNull(builder.getRoleId());
  }

  public static IncidentRoleAssignmentName of(
      String projectIdOrNumber, String incidentId, String roleId) {
    return newBuilder()
        .setProjectIdOrNumber(projectIdOrNumber)
        .setIncidentId(incidentId)
        .setRoleId(roleId)
        .build();
  }

  public static String format(String projectIdOrNumber, String incidentId, String roleId) {
    return newBuilder()
        .setProjectIdOrNumber(projectIdOrNumber)
        .setIncidentId(incidentId)
        .setRoleId(roleId)
        .build()
        .toString();
  }

  public static IncidentRoleAssignmentName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(
            formattedString,
            "IncidentRoleAssignmentName.parse: formattedString not in valid format");
    return of(
        matchMap.get("project_id_or_number"), matchMap.get("incident_id"), matchMap.get("role_id"));
  }

  public static List<IncidentRoleAssignmentName> parseList(List<String> formattedStrings) {
    List<IncidentRoleAssignmentName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<IncidentRoleAssignmentName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (IncidentRoleAssignmentName value : values) {
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
          fieldMapBuilder.put("projectIdOrNumber", projectIdOrNumber);
          fieldMapBuilder.put("incidentId", incidentId);
          fieldMapBuilder.put("roleId", roleId);
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
        "project_id_or_number", projectIdOrNumber, "incident_id", incidentId, "role_id", roleId);
  }

  /** Builder for IncidentRoleAssignmentName. */
  public static class Builder {

    private String projectIdOrNumber;
    private String incidentId;
    private String roleId;

    public String getProjectIdOrNumber() {
      return projectIdOrNumber;
    }

    public String getIncidentId() {
      return incidentId;
    }

    public String getRoleId() {
      return roleId;
    }

    public Builder setProjectIdOrNumber(String projectIdOrNumber) {
      this.projectIdOrNumber = projectIdOrNumber;
      return this;
    }

    public Builder setIncidentId(String incidentId) {
      this.incidentId = incidentId;
      return this;
    }

    public Builder setRoleId(String roleId) {
      this.roleId = roleId;
      return this;
    }

    private Builder() {}

    private Builder(IncidentRoleAssignmentName incidentRoleAssignmentName) {
      projectIdOrNumber = incidentRoleAssignmentName.projectIdOrNumber;
      incidentId = incidentRoleAssignmentName.incidentId;
      roleId = incidentRoleAssignmentName.roleId;
    }

    public IncidentRoleAssignmentName build() {
      return new IncidentRoleAssignmentName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IncidentRoleAssignmentName) {
      IncidentRoleAssignmentName that = (IncidentRoleAssignmentName) o;
      return (this.projectIdOrNumber.equals(that.projectIdOrNumber))
          && (this.incidentId.equals(that.incidentId))
          && (this.roleId.equals(that.roleId));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= projectIdOrNumber.hashCode();
    h *= 1000003;
    h ^= incidentId.hashCode();
    h *= 1000003;
    h ^= roleId.hashCode();
    return h;
  }
}
