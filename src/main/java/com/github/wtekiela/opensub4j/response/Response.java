/**
 * Copyright (c) 2017 Wojciech Tekiela
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.github.wtekiela.opensub4j.response;

public class Response {

    @OpenSubtitlesApiSpec(fieldName = "status")
    private ResponseStatus status;

    @OpenSubtitlesApiSpec(fieldName = "seconds")
    private double seconds;

    public ResponseStatus getStatus() {
        return status;
    }

    public double getSeconds() {
        return seconds;
    }

}