package com.ejemplo.ejercicioClase1.modelo;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int di;
    private String nombre;
    private long telefono;
    private int edad;
    private String sexo;

    @OneToOne(cascade = CascadeType.ALL)
    private Municipio municipio;

    @ManyToMany(targetEntity = Vivienda.class)
    @JoinTable(
            name = "persona_tiene_vivienda",
            joinColumns = @JoinColumn(name = "id_persona", referencedColumnName = "di"),
            inverseJoinColumns = @JoinColumn(name = "id_viv", referencedColumnName = "id_viv"))
    private Set viviendasPropias;

    @ManyToOne
    private Persona cabezaDeFamilia;
    @OneToMany(mappedBy = "cabezaDeFamilia")
    private Set<Persona> familia;
    @ManyToOne
    private  Vivienda vivienda;

    public Persona() {
    }

    public Persona(String nombre, long telefono, int edad, String sexo, Municipio municipio, Set viviendasPropias, Persona cabezaDeFamilia, Set<Persona> familia, Vivienda vivienda) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
        this.sexo = sexo;
        this.municipio = municipio;
        this.viviendasPropias = viviendasPropias;
        this.cabezaDeFamilia = cabezaDeFamilia;
        this.familia = familia;
        this.vivienda= vivienda;


    }

    public int getDi() {
        return di;
    }

    public void setDi(int di) {
        this.di = di;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Set getViviendasPropias() {
        return viviendasPropias;
    }

    public void setViviendasPropias(Set viviendasPropias) {
        this.viviendasPropias = viviendasPropias;
    }

    public Persona getCabezaDeFamilia() {
        return cabezaDeFamilia;
    }

    public void setCabezaDeFamilia(Persona cabezaDeFamilia) {
        this.cabezaDeFamilia = cabezaDeFamilia;
    }

    public Set<Persona> getFamilia() {
        return familia;
    }

    public void setFamilia(Set<Persona> familia) {
        this.familia = familia;
    }

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }
}
