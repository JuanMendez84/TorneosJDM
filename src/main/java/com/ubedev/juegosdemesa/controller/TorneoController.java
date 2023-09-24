//package es.juegosdemesa.juegos_de_mesa2.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import es.juegosdemesa.torneos.dao.JuegoDAO;
//import es.juegosdemesa.torneos.entity.Juego;
//
//@Controller
//public class TorneoController {
//	
//	@Autowired
//	private JuegoDAO juegodao;
//	
//	@RequestMapping
//	public String inicio() {
//		
//		return "home";
//	}
//	
//	@RequestMapping("juego/listaJuegos")
//	public String muestraListaJuegos(Model juegoModelo) {
//		
//		List<Juego> listadoJuegos=juegodao.getJuegos();
//		
//		juegoModelo.addAttribute(listadoJuegos);
//		
//		System.out.println("prebucle");
//		for (Juego juego : listadoJuegos)
//			System.out.println(juego);
//		
//		return "juego/listaJuegos";
//	}
//	
//	
//}
