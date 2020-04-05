package es.dados.service.components.utilTest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import es.dados.service.components.util.UtilFibo;

@SpringBootTest
public class UtilFiboTest {
	
	@Autowired
	@Qualifier("utilFibo")
	private UtilFibo utilFibo;

	@Test
	public void calculaTercerNumeroFibbonacci() {
		long esperado = 2;
		
		long obtenido = utilFibo.calcularFibonacci(3);
		
		assertThat(esperado == obtenido).isTrue();
	}
	

	@Test
	public void calculaNumerosFibbonacci() {
		long[] serie = {1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597};
		
		for(int posicion = 0; posicion < serie.length; posicion++) {
			if (posicion > 1) {
				long obtenido = utilFibo.calcularFibonacci(posicion + 1);
				long esperado = serie[posicion];
				assertThat(esperado == obtenido).isTrue();
			}
		}
		
	}

	
}
