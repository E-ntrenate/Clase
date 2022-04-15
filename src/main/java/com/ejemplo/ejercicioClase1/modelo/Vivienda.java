package com.ejemplo.ejercicioClase1.modelo;

import javax.persistence.*;

@Entity
public class Vivienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_viv;
    private String direccion;
    private int capacidad;
    private int niveles;

    @ManyToOne
    private Municipio municipio;


    public Vivienda() {

    }

    public Vivienda(String direccion, int capacidad, int niveles, Municipio municipio) {
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.niveles = niveles;
        this.municipio = municipio;
    }

    public int getId_viv() {
        return id_viv;
    }

    public void setId_viv(int id_viv) {
        this.id_viv = id_viv;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNiveles() {
        return niveles;
    }

    public void setNiveles(int niveles) {
        this.niveles = niveles;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }


}
