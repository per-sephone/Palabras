package com.palabras.Palabras.app;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.palabras.Palabras.model")
public class PalabrasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PalabrasApplication.class, args);
	}

}
