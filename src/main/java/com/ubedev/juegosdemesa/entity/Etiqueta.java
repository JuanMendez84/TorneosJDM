package com.ubedev.juegosdemesa.entity;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name="etiqueta")
@Data
public class Etiqueta {

	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;

}


