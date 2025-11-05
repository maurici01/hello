package com.hello.configuration;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.hello.Repository.CoisaRepository;
import com.hello.model.Coisa;

@Configuration
public class Config implements CommandLineRunner {
	
	//quero uma injeção automatica de dependencia
	@Autowired
	private CoisaRepository coisaRepository;

	@Override
	public void run(String... args) throws Exception {
		Coisa c1 = new Coisa(null, "Marcos", "Dessa");
		Coisa c2 = new Coisa(null, "Fulano", "de Tal");
		//coisaRepository.save(c1); //salvando 1 dado no banco de dados
		//coisaRepository.save(c2);
		//salvando todos os dados de uma vez
		coisaRepository.saveAll(Arrays.asList(c1, c2));
		
	}

	
}
