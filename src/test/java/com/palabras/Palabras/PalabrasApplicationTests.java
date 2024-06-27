package com.palabras.Palabras;

import com.palabras.Palabras.app.PalabrasApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(classes = PalabrasApplication.class)
class PalabrasApplicationTests {
	@Autowired
	private PalabrasApplication application;

	@Test
	void contextLoads() {
		assertThat(application).isNotNull();
	}

}
