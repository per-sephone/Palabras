package com.palabras.Palabras.controller;

import com.palabras.Palabras.model.Translation;
import com.palabras.Palabras.service.TranslationService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Value("${spring.application.name}")
    String appName;

    TranslationService service;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("appName", appName);
        return "index";
    }

    @PostMapping("/translate")
    public ResponseEntity<String> translate(String fromLanguage, String toLanguage, String prompt) {
        Translation translation = service.translate(fromLanguage, toLanguage, prompt);
        return ResponseEntity.status(HttpStatus.CREATED).body(translation.getTranslation());
    }

    @GetMapping("/history")
    public ResponseEntity<List<Translation>> getTranslations() {
        return ResponseEntity.status(HttpStatus.OK).body(service.getAllTranslations());
    }
}
