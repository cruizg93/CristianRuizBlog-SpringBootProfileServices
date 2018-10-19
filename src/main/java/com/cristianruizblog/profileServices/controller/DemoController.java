package com.cristianruizblog.profileServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cristianruizblog.profileServices.services.SistemaOperativoService;

@Controller
public class DemoController {

	@Autowired
	public SistemaOperativoService sistemaOperativoService;
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("so",sistemaOperativoService.getSistemaOperativoName());
		return "index";
	}
}
