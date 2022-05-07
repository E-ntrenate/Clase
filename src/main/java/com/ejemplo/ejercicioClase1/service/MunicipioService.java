package com.ejemplo.ejercicioClase1.service;

import com.ejemplo.ejercicioClase1.model.Municipio;

import java.util.List;

public interface MunicipioService {
    public List<Municipio> getAll();
    public void save(Municipio municipio);
    public void delete(Municipio municipio);
    public Municipio getMunicipio(Municipio municipio);
}
