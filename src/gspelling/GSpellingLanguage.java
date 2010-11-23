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

/**
 * Avaliable languages.
 * 
 * @author Otávio Scherer Garcia
 */
public enum GSpellingLanguage {

    DANISH("da"),

    GERMAN("de"),

    ENGLISH("en"),

    SPANISH("es"),

    FINNISH("fi"),

    FRENCH("fr"),

    ITALIAN("it"),

    DUTCH("nl"),

    POLISH("pl"),

    PORTUGUESE("pt"),

    SWEDISH("sv");

    private final String code;

    private GSpellingLanguage(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }
}
