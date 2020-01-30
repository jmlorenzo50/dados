package es.dados.service.services;

public interface ValorSrv {
	
	/**
	 * Obtiene un valor entero comprendido entre los límites establecidos
	 * Antes de responder esperará el valor en segundos
	 * @param menor Límite inferior incluyendo el valor indicado
	 * @param mayor Límite superior incluyendo el valor indicado
	 * @return El valor obtenido al azar entre los límites indicados
	 */
	public Integer obtenValor(int menor, int mayor);
	
	/**
	 * Espera los segundos indicados sin hacer nada
	 * @param segundos Que espera el proceso
	 */
	public void espera(int segundos);

}
