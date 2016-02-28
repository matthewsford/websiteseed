/*
 * © Copyright 2016 Matthew Ford (http://www.matthewford.us/) and others.
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
 *
 * Contributors: Matthew Ford
 */
package us.matthewford.websiteseed.model;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

/**
 * @author Matthew Ford
 */
@Entity
public class HelloGreeting {

  @Id
  Long id;
  
  public String message;

  public HelloGreeting() {};

  public HelloGreeting(String message) {
    this.message = message;
  }

  public Long getId() {
    return id;
  }
  
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
