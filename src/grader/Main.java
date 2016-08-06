/*
 * Copyright 2016 Try.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package grader;

import java.sql.SQLException;

/**
 *
 * @author Try
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        StringProcessor sp = new StringProcessor();
        String a = "Budi adalah manusia";
        String b = "Budi adalah makhluk";
        sp.compareSentence(a, b);
    }
}
