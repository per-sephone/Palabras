package com.palabras.Palabras.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("appName", appName);
        return "index";
    }
}
