package br.com.cast.recomendafilme.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.cast.recomendafilme.client.RecomendaFilmeClient;
import br.com.cast.recomendafilme.dto.FilmeDTO;
import br.com.cast.recomendafilme.dto.ResultFilmeDTO;
import br.com.cast.recomendafilme.entity.Filme;
import br.com.cast.recomendafilme.repository.FilmeRespository;

@Service
public class FilmeService {
	
	@Autowired
	private FilmeRespository respository;
	
	@Autowired
	private RecomendaFilmeClient rfc;

	
	@Transactional
	public ResultFilmeDTO buscarPorTitulo(String titulo) {
		ResultFilmeDTO resultFilmeDTO = new ResultFilmeDTO();
		Filme filme = respository.buscarPorTitulo(titulo);
		if(filme == null) {
			FilmeDTO dto = rfc.buscaPorTitulo(titulo);
			filme = new Filme();
			System.out.println(dto);
			filme.setImdbid(dto.getImdbid());
			filme.setTitle(dto.getTitle());
			filme.setType(dto.getType());
			filme.setYear(dto.getYear());
			filme.setPoster(dto.getPoster());
			filme.setValue(dto.getRatings().get(0).getValue());
			filme.setSource(dto.getRatings().get(0).getSource());
			
			resultFilmeDTO.setImdbid(filme.getImdbid());
			resultFilmeDTO.setPoster(filme.getPoster());
			resultFilmeDTO.setTitle(filme.getTitle());
			resultFilmeDTO.setType(filme.getType());
			resultFilmeDTO.setYear(filme.getYear());
			resultFilmeDTO.setValue(filme.getValue());
			resultFilmeDTO.setSource(filme.getSource());
			
			respository.inserir(filme);
			
		
		} else {
			
			resultFilmeDTO.setImdbid(filme.getImdbid());
			resultFilmeDTO.setPoster(filme.getPoster());
			resultFilmeDTO.setTitle(filme.getTitle());
			resultFilmeDTO.setType(filme.getType());
			resultFilmeDTO.setYear(filme.getYear());
			resultFilmeDTO.setValue(filme.getValue());
			resultFilmeDTO.setSource(filme.getSource());
			
			
			
		}
		
		return resultFilmeDTO;
		
		
	}
}
