/**
 * Copyright 2017 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.watson.developer_cloud.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * Helper class used by java code generated by the SDK codegen tool.
 */
public class StringHelper {

    /**
     * Returns an InputStream that can be used to read the bytes of the specified String.
     * @param s the String that will back the InputStream
     * @return an InputStream to read the specified String
     */
    static public InputStream toInputStream(String s) {
        // TODO - check to see if we need to be concerned with the encoding of the string!
        return new ByteArrayInputStream(s.getBytes());
    }
}
