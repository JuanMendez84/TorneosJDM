package com.ubedev.juegosdemesa.controller;

import com.ubedev.juegosdemesa.entity.Juego;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JuegoController {

    @RequestMapping("/formJuego")
    public String muestraFormularioJuego(Model modelo) {

        Juego juegoNuevo = new Juego();
        System.out.println("Entro en el controlador de juego");
        modelo.addAttribute("juegoNuevo", juegoNuevo);

        return "juego/FormJuego";
    }
}
