package es.juegosdemesa.spring.mvc;

import javax.validation.constraints.*;
import javax.persistence.*;


@Entity
@Table(name="jugador")
public class Jugador {
	
	public Jugador() {

	}
		
	public Jugador(String nombre, String apellidos, String nick, String email, String dNI) {

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nick = nick;
		this.email = email;
		DNI = dNI;
	}

	@Override
	public String toString() {
		return "Jugador [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nick=" + nick + ", email="
				+ email + ", DNI=" + DNI + "]";
	}

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellidos")
	private String apellidos;
	
	@NotNull
	@Size(min=2, message="Introduce un nick de 2 o más caracteres")
	@Column(name="nick")
	private String nick;
	
	@Email
	@Column(name="email")
	private String email;
	
	@Pattern(regexp="[0-9]{8}[A-Z]", message="El DNI debe tener 8 numeros y 1 letra en mayúscula")
	private String DNI;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
