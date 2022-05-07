package com.ejemplo.ejercicioClase1.service;

import com.ejemplo.ejercicioClase1.model.Vivienda;

import java.util.List;

public interface ViviendaService {
    public List<Vivienda> getAll();
    public void save(Vivienda vivienda);
    public void delete(Vivienda vivienda);
    public Vivienda getVivienda(Vivienda vivienda);
}
