package com.palabras.Palabras.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document("translations")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Translation implements Serializable {
    private String fromLanguage;
    private String toLanguage;
    private String prompt;
    private String translation;
}
