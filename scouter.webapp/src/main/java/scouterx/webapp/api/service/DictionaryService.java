/*
 *  Copyright 2015 the original author or authors.
 *  @https://github.com/scouter-project/scouter
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package scouterx.webapp.api.service;

import scouterx.client.net.INetReader;
import scouterx.webapp.api.consumer.DictionaryConsumer;
import scouterx.webapp.api.request.DictionaryRequest;

import javax.validation.Valid;
import javax.ws.rs.BeanParam;

/**
 * @author Gun Lee (gunlee01@gmail.com) on 2017. 8. 27.
 */
public class DictionaryService {
    private final DictionaryConsumer dictionaryConsumer;

    public DictionaryService() {
        this.dictionaryConsumer = new DictionaryConsumer();
    }

    public void retrieveTextFromDictionary(@Valid @BeanParam DictionaryRequest dictionaryRequest, INetReader reader) {
        dictionaryConsumer.retrieveText(dictionaryRequest, reader);
    }
}
