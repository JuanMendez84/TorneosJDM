package es.juegosdemesa.spring.mvc;

import javax.servlet.ServletContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
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
		
		Conexiones.conecta();
	
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Jugador.class).buildSessionFactory();
		
		Session miSesion = sf.openSession();
		
		try {
			
			Jugador jprueba = new Jugador("Juan", "Mendez", "Pollofito", "ninguno@ninguno", "11111111A");
			
			miSesion.beginTransaction();
			
			miSesion.save(jprueba);
			
			miSesion.getTransaction().commit();
			
			System.out.println("Registro insertado correctamente en BD.");
			
		} finally {
			
			sf.close();
			miSesion.close();
		}
		
		
		return "prueba";
	}
}
