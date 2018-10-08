package br.edu.iftm.esof.resources;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.esof.domain.Aluno;
import br.edu.iftm.esof.service.AlunoService;

@RestController
@RequestMapping(value="/alunos")
public class AlunoResource {
	
	@Autowired
	private AlunoService service;

	@RequestMapping(value="{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Aluno aluno = service.buscar(id);
		//Aluno a2 = new Aluno(2,"simpós", null, null, null);
		
		return 	ResponseEntity.ok().body(aluno);
	}
	
}
