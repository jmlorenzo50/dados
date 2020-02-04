package es.dados.tirada.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import es.dados.api.dto.Valor;
import es.dados.tirada.service.client.dados.DadosServiceRestClient;

@Component("dadosSrv")
public class DadosSrvImpl implements DadosSrv {
	
	@Autowired
	@Qualifier("dadosServiceRestClient")
	private DadosServiceRestClient dadosServiceRestClient;

	@Override
	public Valor dado6() {
		return dadosServiceRestClient.dado6();
	}

}
