package es.juegosdemesa.spring.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MenuPpalControlador {
	
	@RequestMapping("/muestraFormularioJugador")
	public String muestraFormularioJugador(Model modelo) {
		
		Jugador jugadorAlta = new Jugador();
		
		modelo.addAttribute("jugadorAlta", jugadorAlta);
		
		return "FormJugador";
	}
	
	@InitBinder
	public void miBinder(WebDataBinder wbd) {
		
		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		wbd.registerCustomEditor(String.class, ste);
		
	}
	
	@RequestMapping("/procesarFormularioJugador")
	//public String procesarFormularioJugador(HttpServletRequest request, Model modelo) {
	public String procesarFormularioJugador(@Valid @ModelAttribute("jugadorAlta") Jugador jugador,
			BindingResult resValidacion) {

		if(resValidacion.hasErrors())
			return "FormJugador";
			
		return "RespJugador";

	}
	
//	@RequestMapping("/procesarFormularioJugador")
//	public String procesarFormularioJugador() {
//		
//		return "RespJugador";
//	}
	
}
