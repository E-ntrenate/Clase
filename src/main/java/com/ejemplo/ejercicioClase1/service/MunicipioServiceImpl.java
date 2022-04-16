package com.ejemplo.ejercicioClase1.service;

import com.ejemplo.ejercicioClase1.model.Municipio;
import com.ejemplo.ejercicioClase1.repository.MunicipioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MunicipioServiceImpl implements MunicipioService{

    @Autowired
    private MunicipioDAO municipioDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Municipio> getAll() {
        return (List<Municipio>) municipioDAO.findAll();
    }

    @Override
    @Transactional
    public void save(Municipio municipio) {
        municipioDAO.save(municipio);
    }

    @Override
    @Transactional
    public void delete(Municipio municipio) {
        municipioDAO.delete(municipio);
    }

    @Override
    @Transactional(readOnly = true)
    public Municipio getMunicipio(Municipio municipio) {
        return municipioDAO.findById(municipio.getId_mun()).orElse(null);
    }
}
