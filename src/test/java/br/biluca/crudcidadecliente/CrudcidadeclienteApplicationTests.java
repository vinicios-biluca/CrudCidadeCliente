package br.biluca.crudcidadecliente;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CrudCidadeClienteApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CrudcidadeclienteApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	private String getRootUrl() {
		return "";
	}

	@Test
	void contextLoads() {
	}

}
