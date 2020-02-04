package es.dados.tirada.service.services;

import java.util.List;

public interface TiradaSrv {
	
	/**
	 * Realiza una tirada con los número de dados de 6 caras indicados
	 * @param numeroDeDados Es el número de dados a lanzar
	 * @return Listado de resultados
	 */
	public List<Integer> tiradaD6(int numeroDeDados);
	

}
