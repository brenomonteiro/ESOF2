package br.edu.iftm.esof.resources;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.esof.domain.Atividade;
import br.edu.iftm.esof.service.AtividadeService;

@RestController
@RequestMapping(value="/atividades")
public class AtividadeResource {
	
	@Autowired
	private AtividadeService service;

	@RequestMapping(value="{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Atividade atividade = service.buscar(id);
		//Atividade a2 = new Atividade(2,"simpós", null, null, null);
		
		return 	ResponseEntity.ok().body(atividade);
	}
	
}
