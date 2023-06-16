package es.juegosdemesa.spring.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexiones {

	private static Connection miConexion;
	
	public static void conecta() {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/juegos_de_mesa?useSSL=false";
		String usuario = "root";
		String pass = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Intentando conectar con la BBDD: " + jdbcUrl);
			miConexion = DriverManager.getConnection(jdbcUrl, usuario, pass);
			System.out.println("Conexión establecida con éxito: " + jdbcUrl);

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void desconecta() {
		try {
			miConexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
