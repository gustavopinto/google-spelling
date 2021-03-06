/*
 * Copyright (C) 2010 Otávio Scherer Garcia
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gspelling;

import java.util.Collections;
import java.util.List;

/**
 * TODO improve docs
 * 
 * @author Otávio Scherer Garcia
 */
public class Word {

    private String value;

    private List<Word> suggestions;

    public Word(String value) {
        this.value = value;
        this.suggestions = Collections.emptyList();
    }

    public Word(String value, List<Word> suggestions) {
        this.value = value;
        this.suggestions = Collections.unmodifiableList(suggestions);
    }

    
    public String getValue() {
        return value;
    }

    public List<Word> getSuggestions() {
        return suggestions;
    }

    @Override
    public String toString() {
        return value + (suggestions.isEmpty() ? "" : "=" + suggestions);
    }

}
