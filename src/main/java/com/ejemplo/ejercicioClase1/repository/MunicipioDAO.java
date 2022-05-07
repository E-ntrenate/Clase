package com.ejemplo.ejercicioClase1.repository;

import com.ejemplo.ejercicioClase1.model.Municipio;
import org.springframework.data.repository.CrudRepository;

public interface MunicipioDAO extends CrudRepository<Municipio, Integer> {

}
