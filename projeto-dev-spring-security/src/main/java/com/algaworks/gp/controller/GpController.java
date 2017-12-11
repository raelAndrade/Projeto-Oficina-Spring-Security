package com.algaworks.gp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GpController {
	
	@RequestMapping(method = RequestMethod.GET, path = "/")
	public String inicio() {
		return "inicio";
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/entrar")
	public String entrar() {
		return "entrar";
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/projetos")
	public String projetos() {
		return "projetos";
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/relatorios-custos")
	public String relatoriosCustos() {
		return "relatorios-custos";
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/relatorios-equipe")
	public String relatoriosEquipe() {
		return "relatorios-equipe";
	}
}
