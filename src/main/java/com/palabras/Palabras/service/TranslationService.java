package com.palabras.Palabras.service;
import com.palabras.Palabras.model.Translation;
import com.palabras.Palabras.repository.TranslationRepository;

import java.util.List;

public class TranslationService {

    TranslationRepository repository;
    public Translation translate(String fromLanguage, String toLanguage, String prompt) {
        String translatedText = "translated"; //integrate Google API here
        Translation translation = new Translation(fromLanguage, toLanguage, prompt, translatedText);
        return repository.insert(translation);
    }

    public List<Translation> getAllTranslations() {
    return repository.findAll();
    }
}
