package es.dados.api.dto;

import java.util.List;

import es.dados.common.dto.RespuestaHttp;
import lombok.Data;

@Data
public class Tirada extends RespuestaHttp {

	private int numeroCaras;
	
	private int numeroDados;
	
	private List<Integer> valores;

}
