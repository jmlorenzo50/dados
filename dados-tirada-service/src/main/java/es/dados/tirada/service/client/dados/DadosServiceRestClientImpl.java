package es.dados.tirada.service.client.dados;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplate;

import es.dados.api.dto.Valor;
import lombok.extern.slf4j.Slf4j;

@Component("dadosServiceRestClient")
@Slf4j
public class DadosServiceRestClientImpl implements DadosServiceRestClient {

    @Value("${application.endpoints.get-dados.url}")
    private String urlGetDados;

    private final RestTemplate restTemplate;
    
    public DadosServiceRestClientImpl(RestTemplate restTemplate) {
    	this.restTemplate = restTemplate;
	}
    
	@Override
	public Valor dado6() {
        Map<String, Object> params = new HashMap<>();
        UriTemplate uriTemplate = new UriTemplate(urlGetDados);
        String url = uriTemplate.expand(params).normalize().toASCIIString();
        log.debug("URL dado6 = {}", url);
        
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
       
        HttpEntity httpEntity = new HttpEntity(headers);
        
        ResponseEntity<Valor> response = restTemplate.exchange(url, HttpMethod.GET,
                httpEntity,
                new ParameterizedTypeReference<Valor>() {
                });
        Valor retorno = null;
        if (response != null) {
        	retorno = response.getBody();
        }
		return retorno;
	}

}
