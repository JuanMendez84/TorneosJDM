package es.juegosdemesa.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {

	@RequestMapping
	public String mostrarPagInicial() {
		
		return "paginaInicio";
	}
	
	@RequestMapping("/prueba")
	public String mostrarPrueba() {
		return "prueba";
	}
}
