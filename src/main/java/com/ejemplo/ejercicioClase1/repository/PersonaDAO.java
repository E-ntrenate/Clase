package com.ejemplo.ejercicioClase1.repository;

import com.ejemplo.ejercicioClase1.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDAO extends CrudRepository<Persona, Integer> {

}
