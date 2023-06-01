package es.juegosdemesa.spring.mvc;

import javax.validation.constraints.*;

public class Juego {

	private String nombre;
	@Min(value=1, message="Como mínimo un jugador")
	private int minJugadores;
	@Max(value=100, message="Como máximo 100 jugadores")
	private int maxJugadores;
	private String categoria;
	private String esCooperativo;
	private String tematica;
	
	public String getTematica() {
		return tematica;
	}
	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
	public String getEsCooperativo() {
		return esCooperativo;
	}
	public void setEsCooperativo(String esCooperativo) {
		this.esCooperativo = esCooperativo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getMinJugadores() {
		return minJugadores;
	}
	public void setMinJugadores(int minJugadores) {
		this.minJugadores = minJugadores;
	}
	public int getMaxJugadores() {
		return maxJugadores;
	}
	public void setMaxJugadores(int maxJugadores) {
		this.maxJugadores = maxJugadores;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}
