/*
 Copyright 2017, Perihelios LLC

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
*/
package com.perihelios.util.slogger;

import java.io.PrintStream;

public class Logger {
    public static final String DEFAULT_FORMAT = "";

    public void debug(String message) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void info(String message) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void warn(String message) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void error(String message) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static void setPrintStream(PrintStream printStream) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static void setFormat(String format) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static Logger getLogger(Class<?> logger) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
