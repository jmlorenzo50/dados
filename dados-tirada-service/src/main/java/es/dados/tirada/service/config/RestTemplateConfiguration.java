package es.dados.tirada.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {

    @Bean
    public RestTemplate restTemplateOkHttp() {
        //RestTemplate restTemplate = new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    	RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }
}
