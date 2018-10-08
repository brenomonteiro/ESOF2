package br.edu.iftm.esof;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import br.edu.iftm.esof.domain.Atividade;
import br.edu.iftm.esof.repositories.AtividadeRepository;

@SpringBootApplication
public class AtividadeComplementarStsApplication {

	private AtividadeRepository repo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(AtividadeComplementarStsApplication.class, args);
	}
	
	
	Atividade a2 = new Atividade();
	
	
	
	
	
	
	public void run(String...args)throws Exception{
		
		Atividade a1 = new Atividade(1,"Campinas", null, null, null);
		repo.saveAll(Arrays.asList(a1));
		
	}
}
