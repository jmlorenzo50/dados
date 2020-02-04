package es.dados.tirada.service.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.dados.api.dto.Tirada;
import es.dados.tirada.service.services.TiradaSrv;

@RestController
public class TiradaControl {
	
	public Logger logger = LoggerFactory.getLogger(TiradaControl.class);
	
	@Autowired
	@Qualifier("tiradaSrv")
	private TiradaSrv tiradaSrv;
	
	@GetMapping("/tirada/3d6")
	public Tirada tirada() {
		logger.info("Se solicita tirar y esperar un dado de 6");
		
		logger.debug("Se va a proceder con el lanzamiento del dado");
		//Integer valor = valorSrv.obtenValor(1, 6);
		List<Integer> valores = null;
		//logger.debug("Se solicita ha obtenido %i", valores);
		
		
		Tirada respuesta = new Tirada();
		respuesta.setStatus(HttpStatus.OK.value());
		respuesta.setNumeroCaras(6);
		respuesta.setNumeroDados(3);
		respuesta.setValores(valores);
		return respuesta;
	}


}
