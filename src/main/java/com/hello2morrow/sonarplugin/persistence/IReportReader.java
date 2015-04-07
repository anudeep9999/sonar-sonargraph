/*
 * Sonar Sonargraph Plugin
 * Copyright (C) 2009, 2010, 2011 hello2morrow GmbH
 * mailto: info AT hello2morrow DOT com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hello2morrow.sonarplugin.persistence;

import com.hello2morrow.sonarplugin.xsd.ReportContext;
import com.hello2morrow.sonarplugin.xsd.XsdAttributeRoot;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.config.Settings;
import org.sonar.api.resources.Project;

public interface IReportReader {

  /**
   * Process the Sonargraph report
   * 
   * @param project
   * @param moduleFileSystem
   * @param settings
   */
  void readSonargraphReport(Project project, FileSystem moduleFileSystem, Settings settings);

  /**
   * @return the complete unmarshalled XML report
   */
  ReportContext getReport();

  /**
   * Return the relevant part for this project of the Sonargraph XML report
   * @param project
   * @return the part of the project
   */
  XsdAttributeRoot retrieveBuildUnit(Project project);

  boolean hasSonargraphReport(FileSystem fileSystem, Settings settings);

}
