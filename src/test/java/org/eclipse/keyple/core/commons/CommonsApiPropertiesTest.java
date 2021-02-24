/* **************************************************************************************
 * Copyright (c) 2021 Calypso Networks Association https://www.calypsonet-asso.org/
 *
 * See the NOTICE file(s) distributed with this work for additional information
 * regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License 2.0 which is available at http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 ************************************************************************************** */
package org.eclipse.keyple.core.commons;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.keyple.core.common.CommonsApiProperties;
import org.junit.Test;

public class CommonsApiPropertiesTest {

  @Test
  public void versionIsCorrectlyWritten() {
    assertThat(CommonsApiProperties.VERSION).matches("\\d+(\\.\\d+)+");
  }
}
