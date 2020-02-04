package es.dados.tirada.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import es.dados.api.dto.Valor;

@Service("tiradaSrv")
public class TiradaSrvImpl implements TiradaSrv{
	
	@Autowired
	@Qualifier("dadosSrv")
	private DadosSrv dadosSrv;
	
	@Override
	public List<Integer> tiradaD6(int numeroDeDados) {
		boolean correcto = true;
		List<Integer> tiradas = new ArrayList<>();
		for (int nDado = 0; nDado < numeroDeDados; nDado++) {
			if (correcto) {
				Valor valor = dadosSrv.dado6();
				if (valor != null && valor.getStatus() == 200) {
					tiradas.add(valor.getValor());	
				} else {
					correcto = false;
					tiradas = null;
					nDado = numeroDeDados;
				}
			}
		}
		return tiradas;
	}

}
