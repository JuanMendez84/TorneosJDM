package com.ubedev.juegosdemesa.repository;

import com.ubedev.juegosdemesa.entity.Juego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JuegoRepository extends JpaRepository<Juego, Integer> {

}
