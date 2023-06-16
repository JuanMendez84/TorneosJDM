package es.juegosdemesa.spring.mvc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo")
public class Tipo {
	
	public Tipo() {

	}
	
	public Tipo(String nombre, String desc) {
		this.nombre = nombre;
		this.desc = desc;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="nombre")
	String nombre;
	
	@Column(name="descripcion")
	String desc;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Tipo [id=" + id + ", nombre=" + nombre + ", desc=" + desc + "]";
	}
	
}
