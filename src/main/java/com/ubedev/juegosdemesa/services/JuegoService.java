package com.ubedev.juegosdemesa.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ubedev.juegosdemesa.entity.Juego;

@Service
public interface JuegoService {

	public List<Juego> getJuegos();
	
	public void saveJuego(Juego juegoG);
	
	public void eliminarJuego(Integer id);
	
}
