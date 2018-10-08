package br.edu.iftm.esof.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import br.edu.iftm.esof.domain.Atividade;

public interface AtividadeRepository extends JpaRepository<Atividade,Integer>{
	
	public List<Atividade> findByNomeContaining(@Param("nome") String nome);
	

}
