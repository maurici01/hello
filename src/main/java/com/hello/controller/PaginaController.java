package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/pagina/oloco/joinha/legal")  //mapeamento de rota se eu quiser

public class PaginaController {
	
	@GetMapping("/home")
	public String getHome() {
		return "home";
	}
	
}
