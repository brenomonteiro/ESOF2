package br.edu.iftm.esof.resources;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.esof.service.LancamentoService;

@RestController
@RequestMapping(value="/lancamentoAtividades")
public class LancamentoAtividade {
	
	@Autowired
	private LancamentoService service;

	//@RequestMapping(value="{id}",method=RequestMethod.GET)
	//public ResponseEntity<?> find(@PathVariable Integer id) {
		//LancamentoAtividade lancamento = service.buscar(id);
		//LancamentoAtividade a2 = new LancamentoAtividade(2,"simpós", null, null, null);
		
		//return 	ResponseEntity.ok().body(lancamento);
	//}
	
}
