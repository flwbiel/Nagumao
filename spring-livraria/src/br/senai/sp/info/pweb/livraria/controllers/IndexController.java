package br.senai.sp.info.pweb.livraria.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	
	@RequestMapping("/")
	public String abrirIndex() {
		return "index";
	}

}
