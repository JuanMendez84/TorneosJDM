package es.juegosdemesa.spring.mvc;

import java.util.ArrayList;

import javax.servlet.ServletContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import antlr.collections.List;

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
			/*INSERCION*/
//			Jugador jprueba = new Jugador("Construcsiones", "Karu", "Tehagocama", "tehago@atau", "11111111A");
//			
//			miSesion.beginTransaction();
//			miSesion.save(jprueba);
//			miSesion.getTransaction().commit();
//			
//			System.out.println("Registro insertado correctamente en BD.");
//			
//			miSesion.beginTransaction();
//			System.out.println("Leyendo el registro con ID: " + jprueba.getId());	
//			
//			Jugador jrecuperado = miSesion.get(Jugador.class, jprueba.getId());
//			System.out.println("Registro: " + jrecuperado);
//			
//			miSesion.getTransaction().commit();
//			System.out.println("Terminado.");
			
			/*CONSULTA*/
//			miSesion.beginTransaction();
//			
//			ArrayList<Jugador> listaJugadores = (ArrayList<Jugador>) miSesion.createQuery("from Jugador").getResultList();
////			
//			for (Jugador jugador:listaJugadores)
//				System.out.println("Jugador recuperado:" + jugador);
//		
//		
//			System.out.println();
//			
//			listaJugadores = (ArrayList<Jugador>) miSesion.createQuery("from Jugador j where j.nick = 'Mekemala'").getResultList();
//			
//			for (Jugador jugador:listaJugadores)
//				System.out.println("Jugador recuperado con nick Mekemala:" + jugador);
//			
//			
//			listaJugadores = (ArrayList<Jugador>) miSesion.createQuery("from Jugador j where j.nombre = 'Juan' or j.apellidos = 'Karu'").getResultList();
//			
//			for (Jugador jugador:listaJugadores)
//				System.out.println("Jugadores recuperados con nombre Juan o apellidos Karu:" + jugador);
//			
//			
//			miSesion.getTransaction().commit();
			
			
			/*UPDATE*/
			
//			int idUpdatear=4;
//			
//			miSesion.beginTransaction();
//			Jugador jugadorActualizar = miSesion.get(Jugador.class, idUpdatear);
//			
//			jugadorActualizar.setNombre("Construcciones");
//			jugadorActualizar.setApellidos("Karud");
//			
//			miSesion.createQuery("update Jugador set email = 'alguno@ninguno' where email like 'nin%'").executeUpdate();			
//			
//			miSesion.getTransaction().commit();
//			
//			System.out.println("Registros actualizados.");
			
			/*DELETE*/
			
			miSesion.beginTransaction();
			miSesion.createQuery("delete from Jugador where nombre like '%rueb%'").executeUpdate();
			
			miSesion.getTransaction().commit();

			System.out.println("Registros eliminados.");
			
		} finally {
			
			sf.close();
			miSesion.close();
		}
		
		
		return "prueba";
	}
}
