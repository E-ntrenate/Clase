package com.ejemplo.ejercicioClase1.service;

import com.ejemplo.ejercicioClase1.model.Vivienda;
import com.ejemplo.ejercicioClase1.repository.ViviendaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ViviendaServiceImpl implements ViviendaService{

    @Autowired
    private ViviendaDAO viviendaDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Vivienda> getAll() {
        return (List<Vivienda>) viviendaDAO.findAll();
    }

    @Override
    @Transactional
    public void save(Vivienda vivienda) {
        viviendaDAO.save(vivienda);
    }

    @Override
    @Transactional
    public void delete(Vivienda vivienda) {
        viviendaDAO.delete(vivienda);
    }

    @Override
    @Transactional(readOnly = true)
    public Vivienda getVivienda(Vivienda vivienda) {
        return viviendaDAO.findById(vivienda.getId_viv()).orElse(null);
    }
}
