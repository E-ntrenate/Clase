package com.ejemplo.ejercicioClase1.service;

import com.ejemplo.ejercicioClase1.model.Persona;
import com.ejemplo.ejercicioClase1.repository.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    private PersonaDAO personaDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Persona> getAll() {
        return (List<Persona>) personaDAO.findAll();
    }

    @Override
    @Transactional
    public void save(Persona persona) {
        personaDAO.save(persona);
    }

    @Override
    @Transactional
    public void delete(Persona persona) {
        personaDAO.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona getPersona(Persona persona) {
        return personaDAO.findById(persona.getDi()).orElse(null);
    }
}
