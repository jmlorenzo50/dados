package es.dados.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DadosServiceApp {

	private static final Logger LOGGER = LoggerFactory.getLogger(DadosServiceApp.class.getName());
	
	public static void main(String[] args) {
		LOGGER.info("Starting...");
		SpringApplication.run(DadosServiceApp.class, args);
	}

}
