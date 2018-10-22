package br.com.cast.recomendafilme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cast.recomendafilme.dto.ResultFilmeDTO;
import br.com.cast.recomendafilme.service.FilmeService;

@RestController
@RequestMapping(path="/")
public class RecomendaFilmeController {
	
	@Autowired
	private FilmeService service;
	
	
	@RequestMapping(path="{titulo}", method=RequestMethod.GET)
	public ResultFilmeDTO buscarPorTitulo(@PathVariable("titulo") String titulo) {
		return service.buscarPorTitulo(titulo);
	}
	
}
