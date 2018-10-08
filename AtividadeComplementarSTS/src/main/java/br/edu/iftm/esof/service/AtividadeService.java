package br.edu.iftm.esof.service;

import org.springframework.stereotype.Service;

import br.edu.iftm.esof.domain.Atividade;
import br.edu.iftm.esof.repositories.AtividadeRepository;

@Service
public class AtividadeService {
	
	
private AtividadeRepository repo;

public Atividade buscar(Integer id) {
	
	
	Atividade atividade = repo.getOne(id);
	
	return atividade;
	}


}
