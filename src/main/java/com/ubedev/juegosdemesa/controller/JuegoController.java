package com.ubedev.juegosdemesa.controller;

import com.ubedev.juegosdemesa.entity.Juego;
import com.ubedev.juegosdemesa.services.JuegoService;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JuegoController {

	@Autowired
	private JuegoService js;
	
	
    @RequestMapping("/formJuego")
    public String muestraFormularioJuego(Model modelo) {

		/*
		 * Juego juegoNuevo = new Juego(); juegoNuevo.setId(1);
		 * juegoNuevo.setNombre("Parchis Dummy");
		 * 
		 * Juego juegoNuevo2 = new Juego(); juegoNuevo2.setId(2);
		 * juegoNuevo2.setNombre("Oca Dummy");
		 */
        
        
        //List<Juego> juegos = Arrays.asList(juegoNuevo,juegoNuevo2);
        List<Juego> juegos = js.getJuegos();
        
        modelo.addAttribute("juegos", juegos);
        
        Juego juego=new Juego();
    	modelo.addAttribute("juego", juego);

        return "principal/FormJuego";
    }
    
    
    @RequestMapping("/edicionJuego")
    public String muestraFormularioEdicionJuego(Model modelo) {
    	Juego juegoNuevo=new Juego();
    	modelo.addAttribute("juegoNuevo", juegoNuevo);
        return "principal/FormEdicionJuego";
    }
    
    @PostMapping("/procEdicionJuego")
    public String procesaFormularioEdicionJuego(@ModelAttribute("juego") Juego juegoNuevo, Model m) {
    	
    	js.saveJuego(juegoNuevo);
    	
        return muestraFormularioJuego(m);
    }
    

    @GetMapping("/editarJuego")
    public String editarJuego(@RequestParam("juegoID") Integer id, Model modelo) {
    	Juego juego = js.getJuegoById(id);
    	modelo.addAttribute("juego", juego);
    	return "principal/FormJuego";
    }

    
    @PostMapping("/eliminarJuego/{id}")
    public String eliminarJuego(@PathVariable final Integer id, Model modelo) {
    	js.eliminarJuego(id);
    	modelo.addAttribute("resultado", "OK");
    	return muestraFormularioJuego(modelo);
    }
    
    
    

}
