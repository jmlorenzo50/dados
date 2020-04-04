package es.dados.tirada.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.dados.api.dto.Tirada;
import es.dados.tirada.service.services.TiradaSrv;
import lombok.extern.slf4j.Slf4j;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@Slf4j
public class TiradaControl {
	
	private final static Integer NUMERO_DADOS = 3;
	
	private final static Integer NUMERO_CARAS = 6;
	
	@Autowired
	@Qualifier("tiradaSrv")
	private TiradaSrv tiradaSrv;
	
	@GetMapping("/tirada/3d6")
	public Tirada tirada() {
		log.info("Se solicita tirar y esperar {} dados de {} caras",
				                                       NUMERO_DADOS, 
				                                       NUMERO_CARAS);
		
		log.debug("Se va a proceder con el lanzamiento del dado");
		List<Integer> valores = tiradaSrv.tiradaD6(NUMERO_DADOS);
		
		Tirada respuesta = new Tirada();
		respuesta.setStatus(HttpStatus.OK.value());
		respuesta.setNumeroCaras(NUMERO_CARAS);
		respuesta.setNumeroDados(NUMERO_DADOS);
		respuesta.setValores(valores);
		return respuesta;
	}


}
