package es.dados.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import es.dados.service.components.util.UtilFibo;
import es.dados.service.components.util.UtilRandom;
import es.dados.service.components.util.UtilWait;

@Service("valorSrv")
public class ValorSrvImpl implements ValorSrv{
	
	@Autowired
	@Qualifier("utilRandom")
	private UtilRandom utilRandom;

	@Autowired
	@Qualifier("utilWait")
	private UtilWait utilWait;
	
	@Autowired
	@Qualifier("utilFibo")
	private UtilFibo utilFibo;

	@Override
	public Integer obtenValor(int menor, int mayor) {
		return utilRandom.crear(menor, mayor);
	}

	@Override
	public void espera(int segundos) {
		long numero = 8 * segundos;	
		utilFibo.calcularFibonacci(numero);
		// utilWait.espera(segundos);
	}

}
