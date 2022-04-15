package com.ejemplo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vivienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_viv;
    private String direccion;
    private int capacidad;
    private int niveles;

    public Vivienda() {

    }

    public Vivienda(String direccion, int capacidad, int niveles) {
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.niveles = niveles;
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
}
