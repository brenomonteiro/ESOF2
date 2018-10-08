package br.edu.iftm.esof.service;

import org.springframework.stereotype.Service;

import br.edu.iftm.esof.domain.LancamentoAtividade;
import br.edu.iftm.esof.repositories.LancamentoAtividadeRepository;

@Service
public class LancamentoService {
	
	
private LancamentoAtividadeRepository repo;

public LancamentoAtividade buscar(Integer id) {
	
	
	LancamentoAtividade lancamentoAtividade = repo.getOne(id);
	
	return lancamentoAtividade;
	}


}
