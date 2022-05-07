package com.ejemplo.ejercicioClase1.service;

import com.ejemplo.ejercicioClase1.model.Persona;
import java.util.List;

public interface PersonaService {
    public List<Persona> getAll();
    public void save(Persona persona);
    public void delete(Persona persona);
    public Persona getPersona(Persona persona);
}
