package es.dados.common.dto;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class RespuestaHttp {
	
	protected HttpStatus status;
	
	protected String descripcion;
	
}
