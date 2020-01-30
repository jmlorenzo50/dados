package es.dados.service.components.util;

import org.springframework.stereotype.Component;

@Component("utilRandom")
public class UtilRandomImpl implements UtilRandom {
	
	@Override
	public int crear(int menor, int mayor) {
		Double valor = Math.random() * (1 + mayor - menor) + menor;
		return valor.intValue();
	}

}
