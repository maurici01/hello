package com.hello.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.Repository.CoisaRepository;
import com.hello.model.Coisa;

//obj: responder/pesquisar todos os dados presentes no banco de dados

@RestController
public class CoisaController {
	
	//injeção de dependencia
	@Autowired
	private CoisaRepository coisaRepository;
	
	@GetMapping("/getAll")
	public ResponseEntity<Object> getAll(){
		ArrayList<Coisa> coisas = coisaRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(coisas);
	}
}
