package br.com.cast.recomendafilme.client;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.cast.recomendafilme.dto.FilmeDTO;

@Component
public class RecomendaFilmeClient {
	
	private static final String KEY = "5770f373";
	private static final String API_URL = "http://www.omdbapi.com/?t={titulo}&apikey={key}";
	
	private RestTemplate restTemplate;
	
	private RecomendaFilmeClient(RestTemplateBuilder builder) {
		this.restTemplate = builder.build();
	}
	
	public FilmeDTO buscaPorTitulo(String titulo) {
		FilmeDTO filmeDTO = this.restTemplate.getForObject(API_URL,
					FilmeDTO.class, titulo, KEY);
		System.out.println(filmeDTO.getYear());
		return filmeDTO;
	}

}
