// Copyright 2016 Twitter. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.twitter.heron.scheduler.mesos;

import com.twitter.heron.spi.common.Config;

public final class MesosContext {
  public static final String SCHEDULER_WORKING_DIRECTORY =
      "heron.scheduler.mesos.scheduler.working.directory";

  public static final String HERON_MESOS_MASTER_URI = "heron.mesos.master.uri";

  public static final String HERON_MESOS_NATIVE_LIBRARY_PATH = "heron.mesos.native.library.path";

  private MesosContext() {
  }

  public static String getSchedulerWorkingDirectory(Config config) {
    return config.getStringValue(SCHEDULER_WORKING_DIRECTORY);
  }

  public static String getHeronMesosMasterUri(Config config) {
    return config.getStringValue(HERON_MESOS_MASTER_URI);
  }

  public static String getHeronMesosNativeLibraryPath(Config config) {
    return config.getStringValue(HERON_MESOS_NATIVE_LIBRARY_PATH);
  }
}
