/*
 * Copyright 2005 Andrew Bruno <aeb@qnot.org> 
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at 
 *
 *     http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.marklogic.shell;

public class ShellException extends Exception {
    private static final long serialVersionUID = 556118563737220879L;

    public ShellException() {
    }

    public ShellException(String message) {
        super(message);
    }

    public ShellException(Throwable cause) {
        super(cause);
    }

    public ShellException(String message, Throwable cause) {
        super(message, cause);
    }
}
