package br.com.cast.recomendafilme.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.cast.recomendafilme.entity.Filme;

@Repository
public class FilmeRespository {
	
	@PersistenceContext
	private EntityManager em;

	public Filme buscarPorTitulo(String titulo) {
		StringBuilder hql = new StringBuilder();
		
		hql.append("SELECT f ").append("FROM ")
			.append(Filme.class.getName()).append(" f ")
			.append("WHERE title = :titulo");
		
		Query query = em.createQuery(hql.toString());
		query.setParameter("titulo", titulo);
		@SuppressWarnings("unchecked")
		List<Filme> filmes = query.getResultList();
		return filmes.size()>0 ? filmes.get(0) : null;
	}
	
	public void inserir(Filme filme) {
		em.persist(filme);
	}
}
