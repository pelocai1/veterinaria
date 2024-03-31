
package com.proyectoMio.veterinaria.model;

import java.time.LocalDate;

public class Animal {
    private String especie;
    private String raza;
    private String nombre;
    private LocalDate fechaNac;
    private String sexo;
    private String propietario;

    public Animal() {
    }

    public Animal(String especie, String raza, String nombre, LocalDate fechaNac, String sexo, String propietario) {
        this.especie = especie;
        this.raza = raza;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
        this.propietario = propietario;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return raza;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public String getSexo() {
        return sexo;
    }

    public String getPropietario() {
        return propietario;
    }

    @Override
    public String toString() {
        return "Animal{" + "especie=" + especie + ", raza=" + raza + ", nombre=" + nombre + ", fechaNac=" + fechaNac + ", sexo=" + sexo + ", propietario=" + propietario + '}';
    }
    
    
}
