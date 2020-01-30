package es.dados.service.components.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("utilWait")
public class UtilWaitImpl implements UtilWait {
	
	private final static int MILISEGUNDOS = 1000;
	
	public final static int TIEMPO_MINIMO = 1;
	
	public Logger logger = LoggerFactory.getLogger(UtilWaitImpl.class);

	@Override
	public void espera(int segundos) {
		logger.info("Se inicia la espera activa de %s", segundos);
		try {
			if (segundos >= TIEMPO_MINIMO) {
				Thread.sleep(segundos * MILISEGUNDOS);
			}
         } catch (Exception e) {
        	 logger.error(e.getMessage());
         }
	}

}
