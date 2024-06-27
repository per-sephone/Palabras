package com.palabras.Palabras.model;

import jakarta.persistence.Entity;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document("translations")
@Entity
@Getter
@Setter
public class Translation implements Serializable {

    @jakarta.persistence.Id
    @Id
    private long id;
    private String fromLanguage;
    private String toLanguage;
    private String prompt;
    private String translation;
}
