/* **************************************************************************************
 * Copyright (c) 2021 Calypso Networks Association https://calypsonet.org/
 *
 * See the NOTICE file(s) distributed with this work for additional information
 * regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the terms of the
 * MIT License which is available at https://opensource.org/licenses/MIT
 *
 * SPDX-License-Identifier: MIT
 ************************************************************************************** */
package org.eclipse.keyple.core.common;

/**
 * Generic type for a Keyple card extension.
 *
 * @since 2.0.0
 */
public interface KeypleCardExtension {

  /**
   * Gets the Reader API version used at compile time
   *
   * @return A not empty String.
   * @since 2.0.0
   */
  String getReaderApiVersion();

  /**
   * Gets the Card API version used at compile time
   *
   * @return A not empty String.
   * @since 2.0.0
   */
  String getCardApiVersion();

  /**
   * Gets the Common API version used at compile time
   *
   * @return A not empty String.
   * @since 2.0.0
   */
  String getCommonApiVersion();
}
