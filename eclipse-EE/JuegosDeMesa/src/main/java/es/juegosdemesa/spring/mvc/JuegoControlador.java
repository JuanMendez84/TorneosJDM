package es.juegosdemesa.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/juego")
public class JuegoControlador {
	
	@RequestMapping("/formJuego")
	public String muestraFormularioJuego(Model modelo) {
		
		Juego juegoNuevo = new Juego();
		
		modelo.addAttribute("juegoNuevo", juegoNuevo);
		
		return "FormJuego";
	}
	
	@RequestMapping("/procesarFormJuego")
	public String procesarFormJuego (@Valid @ModelAttribute("juegoNuevo") Juego juego,
			BindingResult resultadoValidacion) {
		System.out.println(juego.getNombre());
		if (resultadoValidacion.hasErrors())
			return "FormJuego";
		
		return "RespJuego";
	}

}
