package com.ubedev.juegosdemesa.entity;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name="juego")
@Data
public class Juego {

	@Column(name="nombre")
	private String nombre;
	
	@Column(name="minJugadores")
	private int minJugadores;
	
	@Column(name="maxJugadores")
	private int maxJugadores;
	
	@Column(name="coop")
	private boolean cooperativo;
	
	@Column(name="equip")
	private boolean porEquipos;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;

}


