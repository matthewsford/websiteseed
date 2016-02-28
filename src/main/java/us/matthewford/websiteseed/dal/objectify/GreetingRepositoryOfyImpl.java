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
package us.matthewford.websiteseed.dal.objectify;

import static com.googlecode.objectify.ObjectifyService.ofy;

import us.matthewford.websiteseed.dal.GreetingRepository;
import us.matthewford.websiteseed.model.HelloGreeting;

import java.util.List;
import javax.inject.Singleton;

/**
 * @author Matthew Ford
 */
@Singleton
public class GreetingRepositoryOfyImpl implements GreetingRepository {
  private static final long serialVersionUID = -9144012188846800902L;

  @Override
  public HelloGreeting save(HelloGreeting greeting) {
    ofy().save().entity(greeting).now();
    return greeting;
  }

  @Override
  public HelloGreeting getById(Long id) {
    return ofy().load().type(HelloGreeting.class).id(id).now();
  }

  @Override
  public List<HelloGreeting> getAll() {
    return ofy().load().type(HelloGreeting.class).list();
  }
}
