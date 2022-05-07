package com.ejemplo.ejercicioClase1.repository;

import com.ejemplo.ejercicioClase1.model.Vivienda;
import org.springframework.data.repository.CrudRepository;

public interface ViviendaDAO extends CrudRepository<Vivienda, Integer> {

}
