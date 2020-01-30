package es.dados.service.servicesTest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import es.dados.service.services.ValorSrv;

@SpringBootTest
public class ValorSrvTest {

	private final static Integer VECES = 100;
	
	@Autowired
	@Qualifier("valorSrv")
	private ValorSrv valorSrv;
	
	@Test
	public void solo() {
		int menor = 1;
		int mayor = 1;
		for (int i = 0; i < VECES; i++) {
			int valor = valorSrv.obtenValor(menor, mayor);
			assertThat(valor <= mayor).isTrue();
			assertThat(valor >= menor).isTrue();
		}
	}
	
	@Test
	public void dado6() {
		int menor = 1;
		int mayor = 6;
		
		for (int i = 0; i < VECES; i++) {
			int valor = valorSrv.obtenValor(menor, mayor);
			assertThat(valor <= mayor).isTrue();
			assertThat(valor >= menor).isTrue();
		}
		
	}


	@Test
	public void moneda() {
		int menor = 1;
		int mayor = 2;
		
		for (int i = 0; i < VECES; i++) {
			int valor = valorSrv.obtenValor(menor, mayor);
			assertThat(valor <= mayor).isTrue();
			assertThat(valor >= menor).isTrue();
		}
		
	}

}
