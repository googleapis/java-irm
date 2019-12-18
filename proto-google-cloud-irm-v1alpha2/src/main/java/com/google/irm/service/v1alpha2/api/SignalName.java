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
public class SignalName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/signals/{signal}");

  private volatile Map<String, String> fieldValuesMap;

  private final String project;
  private final String signal;

  public String getProject() {
    return project;
  }

  public String getSignal() {
    return signal;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private SignalName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    signal = Preconditions.checkNotNull(builder.getSignal());
  }

  public static SignalName of(String project, String signal) {
    return newBuilder().setProject(project).setSignal(signal).build();
  }

  public static String format(String project, String signal) {
    return newBuilder().setProject(project).setSignal(signal).build().toString();
  }

  public static SignalName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(
            formattedString, "SignalName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("signal"));
  }

  public static List<SignalName> parseList(List<String> formattedStrings) {
    List<SignalName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<SignalName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (SignalName value : values) {
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
          fieldMapBuilder.put("signal", signal);
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
    return PATH_TEMPLATE.instantiate("project", project, "signal", signal);
  }

  /** Builder for SignalName. */
  public static class Builder {

    private String project;
    private String signal;

    public String getProject() {
      return project;
    }

    public String getSignal() {
      return signal;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setSignal(String signal) {
      this.signal = signal;
      return this;
    }

    private Builder() {}

    private Builder(SignalName signalName) {
      project = signalName.project;
      signal = signalName.signal;
    }

    public SignalName build() {
      return new SignalName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SignalName) {
      SignalName that = (SignalName) o;
      return (this.project.equals(that.project)) && (this.signal.equals(that.signal));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= signal.hashCode();
    return h;
  }
}
