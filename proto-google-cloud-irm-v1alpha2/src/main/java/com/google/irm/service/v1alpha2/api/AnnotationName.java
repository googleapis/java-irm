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
public class AnnotationName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/incidents/{incident}/annotations/{annotation}");

  private volatile Map<String, String> fieldValuesMap;

  private final String project;
  private final String incident;
  private final String annotation;

  public String getProject() {
    return project;
  }

  public String getIncident() {
    return incident;
  }

  public String getAnnotation() {
    return annotation;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private AnnotationName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    incident = Preconditions.checkNotNull(builder.getIncident());
    annotation = Preconditions.checkNotNull(builder.getAnnotation());
  }

  public static AnnotationName of(String project, String incident, String annotation) {
    return newBuilder().setProject(project).setIncident(incident).setAnnotation(annotation).build();
  }

  public static String format(String project, String incident, String annotation) {
    return newBuilder()
        .setProject(project)
        .setIncident(incident)
        .setAnnotation(annotation)
        .build()
        .toString();
  }

  public static AnnotationName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(
            formattedString, "AnnotationName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("incident"), matchMap.get("annotation"));
  }

  public static List<AnnotationName> parseList(List<String> formattedStrings) {
    List<AnnotationName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AnnotationName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (AnnotationName value : values) {
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
          fieldMapBuilder.put("annotation", annotation);
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
        "project", project, "incident", incident, "annotation", annotation);
  }

  /** Builder for AnnotationName. */
  public static class Builder {

    private String project;
    private String incident;
    private String annotation;

    public String getProject() {
      return project;
    }

    public String getIncident() {
      return incident;
    }

    public String getAnnotation() {
      return annotation;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setIncident(String incident) {
      this.incident = incident;
      return this;
    }

    public Builder setAnnotation(String annotation) {
      this.annotation = annotation;
      return this;
    }

    private Builder() {}

    private Builder(AnnotationName annotationName) {
      project = annotationName.project;
      incident = annotationName.incident;
      annotation = annotationName.annotation;
    }

    public AnnotationName build() {
      return new AnnotationName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AnnotationName) {
      AnnotationName that = (AnnotationName) o;
      return (this.project.equals(that.project))
          && (this.incident.equals(that.incident))
          && (this.annotation.equals(that.annotation));
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
    h ^= annotation.hashCode();
    return h;
  }
}
