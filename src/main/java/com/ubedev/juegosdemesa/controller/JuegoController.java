package com.ubedev.juegosdemesa.controller;

import com.ubedev.juegosdemesa.entity.Juego;
import com.ubedev.juegosdemesa.services.JuegoService;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

        return "juego/FormJuego";
    }
    
    
    @RequestMapping("/edicionJuego")
    public String muestraFormularioEdicionJuego(Model modelo) {
    	Juego juegoNuevo=new Juego();
    	modelo.addAttribute("juegoNuevo", juegoNuevo);
        return "juego/FormEdicionJuego";
    }
    
    @PostMapping("/procEdicionJuego")
    public String procesaFormularioEdicionJuego(@ModelAttribute("juego") Juego juegoNuevo) {
    	
    	js.saveJuego(juegoNuevo);
    	
        return "juego/procEdicionJuego";
    }

}
