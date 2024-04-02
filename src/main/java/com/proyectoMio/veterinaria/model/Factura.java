
package com.proyectoMio.veterinaria.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "facturas")
public class Factura {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFactura;
    private float importe;
    private boolean pagada = false;
    private LocalDate fechaFactura;
    
    @OneToOne
    private Actuacion actuacion;
    @ManyToOne
    private Cliente cliente;

    public Factura() {
    }
  

	public Factura(int idFactura, float importe, boolean pagada, LocalDate fechaFactura, Actuacion actuacion,
			Cliente cliente) {
		super();
		this.idFactura = idFactura;
		this.importe = importe;
		this.pagada = pagada;
		this.fechaFactura = fechaFactura;
		this.actuacion = actuacion;
		this.cliente = cliente;
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
    

    public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}



	public void setFechaFactura(LocalDate fechaFactura) {
		this.fechaFactura = fechaFactura;
	}



	public void setActuacion(Actuacion actuacion) {
		this.actuacion = actuacion;
	}



	@Override
    public String toString() {
        return "Factura{" + "idFactura=" + idFactura + ", importe=" + importe + ", pagada=" + pagada + ", fechaFactura=" + fechaFactura + ", actuacion=" + actuacion + '}';
    }
    
    
}
