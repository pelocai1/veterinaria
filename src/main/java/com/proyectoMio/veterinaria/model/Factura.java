
package com.proyectoMio.veterinaria.model;

import java.time.LocalDate;

public class Factura {
    private int idFactura;
    private float importe;
    private boolean pagada = false;
    private LocalDate fechaFactura;
    private Actuacion actuacion;

    public Factura() {
    }

    public Factura(int idFactura, float importe, LocalDate fechaFactura, Actuacion actuacion) {
        this.idFactura = idFactura;
        this.importe = importe;
        this.fechaFactura = fechaFactura;
        this.actuacion = actuacion;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public float getImporte() {
        return importe;
    }

    public boolean isPagada() {
        return pagada;
    }

    public LocalDate getFechaFactura() {
        return fechaFactura;
    }

    public Actuacion getActuacion() {
        return actuacion;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    @Override
    public String toString() {
        return "Factura{" + "idFactura=" + idFactura + ", importe=" + importe + ", pagada=" + pagada + ", fechaFactura=" + fechaFactura + ", actuacion=" + actuacion + '}';
    }
    
    
}
