
package com.proyectoMio.veterinaria.model;

public class Actuacion {
    private int idActuacion;
    private String diagnostico;
    private String tratamiento;
    private String estado = "Iniciado";
    private Animal animal;
    private Factura factura;

    public Actuacion() {
    }

    public Actuacion(int idActuacion, String diagnostico, String tratamiento, Animal animal, Factura factura) {
        this.idActuacion = idActuacion;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.animal = animal;
        this.factura = factura;
    }

    public int getIdActuacion() {
        return idActuacion;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public String getEstado() {
        return estado;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Actuacion{" + "idActuacion=" + idActuacion + ", diagnostico=" + diagnostico + ", tratamiento=" + tratamiento + ", estado=" + estado + ", animal=" + animal + ", factura=" + factura + '}';
    }
    
    
}
