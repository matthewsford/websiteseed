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
package us.matthewford.websiteseed.guice;

import com.google.api.server.spi.guice.GuiceSystemServiceServletModule;

import us.matthewford.websiteseed.endpoints.Greetings;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Matthew Ford
 */
public class MyGuiceSystemServiceServletModule extends GuiceSystemServiceServletModule {

  @Override
  protected void configureServlets() {
    super.configureServlets();

    Set<Class<?>> serviceClasses = new HashSet<Class<?>>();
    serviceClasses.add(Greetings.class);
    this.serveGuiceSystemServiceServlet("/_ah/spi/*", serviceClasses);
  }
}
