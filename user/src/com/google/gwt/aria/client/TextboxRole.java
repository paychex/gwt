/*
 * Copyright 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.gwt.aria.client;
/////////////////////////////////////////////////////////
// This is auto-generated code.  Do not manually edit! //
/////////////////////////////////////////////////////////

import com.google.gwt.dom.client.Element;

/**
 * A type that represents the <a href="http://www.w3.org/TR/wai-aria/roles#textbox">textbox</a>
 * role in the ARIA specification.
 *
 * @see Role
 * @see Roles
 */
public interface TextboxRole extends InputRole {
  String getAriaActivedescendantProperty(Element element);

  String getAriaAutocompleteProperty(Element element);

  String getAriaMultilineProperty(Element element);

  String getAriaReadonlyProperty(Element element);

  String getAriaRequiredProperty(Element element);

  void removeAriaActivedescendantProperty(Element element);

  void removeAriaAutocompleteProperty(Element element);

  void removeAriaMultilineProperty(Element element);

  void removeAriaReadonlyProperty(Element element);

  void removeAriaRequiredProperty(Element element);

  void setAriaActivedescendantProperty(Element element, IdReference value);

  void setAriaAutocompleteProperty(Element element, AutocompleteValue value);

  void setAriaMultilineProperty(Element element, boolean value);

  void setAriaReadonlyProperty(Element element, boolean value);

  void setAriaRequiredProperty(Element element, boolean value);
}
