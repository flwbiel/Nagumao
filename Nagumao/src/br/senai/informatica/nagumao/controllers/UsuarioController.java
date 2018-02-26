package br.senai.informatica.nagumao.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senai.informatica.nagumao.DAO.UsuarioDAO;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@PostMapping("usuario/login")
	public String abreLogin() {
		return "usuario/login";
		
	}
	@PostMapping
	public String abreCadastro() {
		return "usuario/cadastro";
	}
}
