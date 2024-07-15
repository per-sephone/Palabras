package com.palabras.Palabras.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableMongoRepositories("com.palabras.Palabras.model")
public class PalabrasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PalabrasApplication.class, args);
	}

}
