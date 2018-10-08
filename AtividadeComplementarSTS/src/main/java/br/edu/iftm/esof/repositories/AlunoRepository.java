package br.edu.iftm.esof.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import br.edu.iftm.esof.domain.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno,Integer>{
	
	
	

}
