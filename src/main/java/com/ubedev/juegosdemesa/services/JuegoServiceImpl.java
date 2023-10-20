package com.ubedev.juegosdemesa.services;

import java.util.List;

import com.ubedev.juegosdemesa.repository.JuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ubedev.juegosdemesa.entity.Juego;

@Service
public class JuegoServiceImpl implements JuegoService {

	@Autowired
    private JuegoRepository jr;
	
	@Override
	public List<Juego> getJuegos() {
		return jr.findAll();
	}
	
	@Override
	public void saveJuego(Juego juegoG) {
		jr.save(juegoG);
	}

	@Override
	public void eliminarJuego(Integer id) {
		jr.deleteById(id);
	}

	@Override
	public Juego getJuegoById(Integer id) {
		return jr.getReferenceById(id);
	}

}
