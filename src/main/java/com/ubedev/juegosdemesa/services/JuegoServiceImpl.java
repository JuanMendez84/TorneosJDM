package com.ubedev.juegosdemesa.services;

import java.util.List;

import com.ubedev.juegosdemesa.repository.JuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ubedev.juegosdemesa.entity.Juego;

@Service
public class JuegoServiceImpl implements JuegoService {

	@Override
	public List<Juego> getJuegos() {
		// TODO Auto-generated method stub
		List<Juego> listaJuegos=jr.findAll();
		
		return listaJuegos;
	}
	
	@Autowired
    private JuegoRepository jr;

}
