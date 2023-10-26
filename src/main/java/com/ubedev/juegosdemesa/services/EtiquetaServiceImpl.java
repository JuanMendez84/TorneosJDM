package com.ubedev.juegosdemesa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ubedev.juegosdemesa.entity.Etiqueta;
import com.ubedev.juegosdemesa.repository.EtiquetaRepository;

@Service
public class EtiquetaServiceImpl implements EtiquetaService {

	@Autowired
	private EtiquetaRepository er;
	
	@Override
	public List<Etiqueta> getEtiquetas() {
		// TODO Auto-generated method stub
		
		return er.findAll();
	}

	@Override
	public void saveEtiqueta(Etiqueta etiquetaG) {
		// TODO Auto-generated method stub
		er.save(etiquetaG);
	}

	@Override
	public void eliminarEtiqueta(Integer id) {
		// TODO Auto-generated method stub
		er.deleteById(id);
	}

	@Override
	public Etiqueta getEtiquetaById(Integer id) {
		// TODO Auto-generated method stub
		return er.getReferenceById(id);
	}

}
