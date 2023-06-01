package es.juegosdemesa.spring.mvc;

import javax.validation.constraints.*;

public class Jugador {

	private String nombre;
	private String apellidos;
	
	@NotNull
	@Size(min=2, message="Introduce un nick de 2 o más caracteres")
	private String nick;
	
	@Email
	private String email;
	
	@Pattern(regexp="[0-9]{8}[A-Z]", message="El DNI debe tener 8 numeros y 1 letra en mayúscula")
	private String DNI;
	
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	
	
}
