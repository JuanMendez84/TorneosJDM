package es.juegosdemesa.spring.mvc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexiones {

	public static void conecta() {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/juegos_de_mesa?useSSL=false";
		String usuario = "root";
		String pass = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Intentando conectar con la BBDD: " + jdbcUrl);
			Connection miConexion = DriverManager.getConnection(jdbcUrl, usuario, pass);
			System.out.println("Conexión establecida con éxito: " + jdbcUrl);

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
