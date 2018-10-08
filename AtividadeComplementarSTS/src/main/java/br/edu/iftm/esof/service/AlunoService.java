package br.edu.iftm.esof.service;

import org.springframework.stereotype.Service;

import br.edu.iftm.esof.domain.Aluno;
import br.edu.iftm.esof.repositories.AlunoRepository;

@Service
public class AlunoService {
	
	
private AlunoRepository repo;

public Aluno buscar(Integer id) {
	
	
	Aluno atividade = repo.getOne(id);
	
	return atividade;
	}


}
