package es.dados.service.components.util;

import org.springframework.stereotype.Component;

@Component("utilFibo")
public class UtilFiboImpl implements UtilFibo{

	@Override
	public long calcularFibonacci(long numero) {
		long retorno = 1;
		if (numero > 2) {
			retorno = calcularFibonacci(numero -1) + calcularFibonacci(numero -2);
		}
		return retorno;
	}
	
}
