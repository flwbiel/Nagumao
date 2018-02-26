package br.senai.sp.info.pweb.livraria.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senai.sp.info.pweb.livraria.models.Usuario;

@Controller
public class UsuarioController {
	
	@RequestMapping("/usuario/novo")
	public String abrirForm() {
		
		//Abre o jsp usuario/form
		return "usuario/form";
	}
	
	@RequestMapping("/usuario/salvar")
	public String salvar(Usuario usuario) {
		
		System.out.println(usuario);
		
		//SÓ POR EXEMPLO
		return "index";
	}

}
