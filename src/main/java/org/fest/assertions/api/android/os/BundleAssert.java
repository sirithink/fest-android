// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.os;

import android.os.Bundle;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link Bundle} instances. */
public class BundleAssert extends AbstractAssert<BundleAssert, Bundle> {
  public BundleAssert(Bundle actual) {
    super(actual, BundleAssert.class);
  }

  public BundleAssert hasKey(String key) {
    isNotNull();
    assertThat(actual.containsKey(key)) //
        .overridingErrorMessage("Expected to contain key <%s> but did not.") //
        .isTrue();
    return this;
  }

  public BundleAssert isEmpty() {
    isNotNull();
    assertThat(actual.isEmpty()) //
        .overridingErrorMessage("Expected to be empty but was not.") //
        .isTrue();
    return this;
  }

  public BundleAssert isNotEmpty() {
    isNotNull();
    assertThat(actual.isEmpty()) //
        .overridingErrorMessage("Expected to not be empty but was.") //
        .isFalse();
    return this;
  }

  public BundleAssert hasSize(int size) {
    isNotNull();
    int actualSize = actual.size();
    assertThat(actualSize) //
        .overridingErrorMessage("Expected size <%s> but was <%s>.", size, actualSize) //
        .isEqualTo(size);
    return this;
  }
}