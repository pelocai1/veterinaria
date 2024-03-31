
package com.proyectoMio.veterinaria.model;

import java.time.LocalDate;

public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private String direccion;
    private LocalDate fechaNacimiento;
    private String email;
    private String telefono;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String apellido, String direccion, LocalDate fechaNacimiento, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", fechaNacimiento=" + fechaNacimiento + ", email=" + email + ", telefono=" + telefono + '}';
    }
    
    
}
