package es.juegosdemesa.spring.mvc;

import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdministracionControlador {

	@RequestMapping("/formTipo")
	public String formularioTipo (Model modelo) {
		
		Tipo tipoNuevo = new Tipo();
		modelo.addAttribute("tipoNuevo", tipoNuevo);
		
		return "FormTipo";
	}
	
	@RequestMapping("/procesarFormTipo")
	public String procesarFormJuego (@Valid @ModelAttribute("tipoNuevo") Tipo tipo,
			BindingResult resultadoValidacion) {
		
		Conexiones.conecta();
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Tipo.class).buildSessionFactory();
		
		Session miSesion = sf.openSession();
		
		try {
			miSesion.beginTransaction();
			miSesion.save(tipo);
			miSesion.getTransaction().commit();
			return "RespTipo";
		} catch (Exception e) {
			System.out.println("Algo no fue bien:\n" + e.getStackTrace());
		} finally {
			miSesion.close();
			sf.close();
			Conexiones.desconecta();
		}
		
		
//		if (resultadoValidacion.hasErrors())
//			return "FormJuego";
		
		return "RespJuego";
	}
	
}
