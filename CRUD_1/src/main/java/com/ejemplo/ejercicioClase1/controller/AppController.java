package com.ejemplo.ejercicioClase1.controller;

import com.ejemplo.ejercicioClase1.model.Municipio;
import com.ejemplo.ejercicioClase1.model.Persona;
import com.ejemplo.ejercicioClase1.model.Vivienda;
import com.ejemplo.ejercicioClase1.service.MunicipioServiceImpl;
import com.ejemplo.ejercicioClase1.service.PersonaServiceImpl;
import com.ejemplo.ejercicioClase1.service.ViviendaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {
    @Autowired
    private PersonaServiceImpl personaService;

    @Autowired
    private MunicipioServiceImpl municipioService;

    @Autowired
    private ViviendaServiceImpl viviendaService;


    @GetMapping("/")
    public String getMainPage(Model model){
        return "home-page";
    }

    @GetMapping("/personas")
    public String getPersonasPage(Model model){
        Iterable<Persona> listaPersonas = personaService.getAll();
        model.addAttribute("listaPersonas", listaPersonas);
        return "personas";
    }

    @GetMapping("/municipios")
    public String getMunicipiosPage(Model model){
        Iterable<Municipio> listaMunicipios = municipioService.getAll();
        model.addAttribute("listaMunicipios", listaMunicipios);
        return "municipios";
    }

    @GetMapping("/viviendas")
    public String getViviendasPage(Model model){
        Iterable<Vivienda> listaViviendas = viviendaService.getAll();
        model.addAttribute("listaViviendas", listaViviendas);
        return "viviendas";
    }

    @GetMapping("/agregarPersona")
    public String agregarPersona(Persona persona){
        return "modificarPersona";
    }

    @GetMapping("/agregarMunicipio")
    public String agregarMunicipio(Municipio municipio){
        return "modificarMunicipio";
    }

    @GetMapping("/agregarVivienda")
    public String agregarVivienda(Vivienda vivienda){
        return "modificarVivienda";
    }

    @PostMapping("/guardarPersona")
    public String guardarPersona(Persona persona){
        personaService.save(persona);
        return "redirect:/personas";
    }

    @PostMapping("/guardarMunicipio")
    public String guardarMunicipio(Municipio municipio){
        municipioService.save(municipio);
        return "redirect:/municipios";
    }

    @PostMapping("/guardarVivienda")
    public String guardarVivienda(Vivienda vivienda){
        viviendaService.save(vivienda);
        return "redirect:/viviendas";
    }

    @GetMapping("/editarPersona/{di}")
    public String editarPersona(Persona persona, Model model){
        persona = personaService.getPersona(persona);
        model.addAttribute("persona", persona);
        return "modificarPersona";
    }

    @GetMapping("/editarMunicipio/{id_mun}")
    public String editarMunicipio(Municipio municipio, Model model){
        municipio = municipioService.getMunicipio(municipio);
        model.addAttribute("municipio", municipio);
        return "modificarMunicipio";
    }

    @GetMapping("/editarVivienda/{id_viv}")
    public String editarVivienda(Vivienda vivienda, Model model){
        vivienda = viviendaService.getVivienda(vivienda);
        model.addAttribute("vivienda", vivienda);
        return "modificarVivienda";
    }

    @GetMapping("/eliminarPersona/{di}")
    public String eliminarPersona(Persona persona){
        personaService.delete(persona);
        return "redirect:/personas";
    }

    @GetMapping("/eliminarMunicipio/{id_mun}")
    public String eliminarMunicipio(Municipio municipio){
        municipioService.delete(municipio);
        return "redirect:/municipios";
    }

    @GetMapping("/eliminarVivienda/{id_viv}")
    public String eliminarVivienda(Vivienda vivienda){
        viviendaService.delete(vivienda);
        return "redirect:/viviendas";
    }
}
