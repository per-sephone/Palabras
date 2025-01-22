package com.palabras.Palabras.repository;

import com.palabras.Palabras.model.Translation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class TranslationRepository {
    private final MongoTemplate mongoTemplate;

    public Translation insert(Translation translation){
        return mongoTemplate.insert(translation);
    }

    public List<Translation> findAll() {
        return mongoTemplate.findAll(Translation.class);
    }
}
