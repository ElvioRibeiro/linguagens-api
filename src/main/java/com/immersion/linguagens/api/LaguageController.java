package com.immersion.linguagens.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaguageController {

    @Autowired
    private LanguageRepository repository;

    @GetMapping("/languages")
    public List<Language> gLanguages(){
        List<Language> lang = repository.findAll();
        return lang;
    }

    @PostMapping("/languages")
    public Language pLanguages(@RequestBody Language language){
        Language savedLanguage = repository.save(language);
        return savedLanguage;
    }
    
}
