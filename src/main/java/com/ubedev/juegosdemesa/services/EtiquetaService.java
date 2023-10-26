package com.ubedev.juegosdemesa.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ubedev.juegosdemesa.entity.Etiqueta;

@Service
public interface EtiquetaService {

	public List<Etiqueta> getEtiquetas();
	
	public void saveEtiqueta(Etiqueta etiquetaG);
	
	public void eliminarEtiqueta(Integer id);
	
	public Etiqueta getEtiquetaById(Integer id);
	
}
