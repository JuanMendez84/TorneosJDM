package com.ubedev.juegosdemesa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ubedev.juegosdemesa.entity.Etiqueta;
import com.ubedev.juegosdemesa.services.EtiquetaService;

@Controller
public class EtiquetaController {

	@Autowired
	private EtiquetaService es;
	
	@RequestMapping("/formEtiquetas")
	public String muestraFormEtiq (Model modelo) {
		
		List<Etiqueta> etiquetas = es.getEtiquetas(); 
		modelo.addAttribute("etiquetas", etiquetas);
		
		Etiqueta etiqueta = new Etiqueta();
		modelo.addAttribute("etiqueta", etiqueta);
		
		return "principal/FormEtiquetas";
	}
	
}
