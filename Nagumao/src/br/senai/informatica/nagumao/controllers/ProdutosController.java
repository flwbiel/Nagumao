package br.senai.informatica.nagumao.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/app/produto")
public class ProdutosController {
	
	@PostMapping("/cadastro")
	public String abreCadastro() {
		return "produto/cadastro-produto";
	}
	
	@GetMapping(value = {"" , "/"})
	public String abreLista() {
		return "produto/lista"; 
	}

}
