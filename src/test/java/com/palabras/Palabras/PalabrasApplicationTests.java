package com.palabras.Palabras;

import com.palabras.Palabras.app.PalabrasApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(classes = PalabrasApplication.class)
class PalabrasApplicationTests {
	private PalabrasApplication application;

	@Test
	void contextLoads() {
		assertThat(application).isNotNull();
	}

}
