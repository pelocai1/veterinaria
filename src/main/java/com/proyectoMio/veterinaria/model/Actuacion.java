
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
@Table(name = "actuaciones")
public class Actuacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idActuacion;
    private String diagnostico;
    private String tratamiento;
    private String estado = "Iniciado";
    private LocalDate fechaActuacion;
    
    @ManyToOne
    private Animal animal;
    @OneToOne(mappedBy = "actuacion")
    private Factura factura;

    public Actuacion() {
    }


    public Actuacion(int idActuacion, String diagnostico, String tratamiento, String estado, LocalDate fechaActuacion,
			Animal animal, Factura factura) {
		super();
		this.idActuacion = idActuacion;
		this.diagnostico = diagnostico;
		this.tratamiento = tratamiento;
		this.estado = estado;
		this.fechaActuacion = fechaActuacion;
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
    

    public LocalDate getFechaActuacion() {
		return fechaActuacion;
	}


	public void setFechaActuacion(LocalDate fechaActuacion) {
		this.fechaActuacion = fechaActuacion;
	}


	public void setIdActuacion(int idActuacion) {
		this.idActuacion = idActuacion;
	}


	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}


	public void setAnimal(Animal animal) {
		this.animal = animal;
	}


	public void setFactura(Factura factura) {
		this.factura = factura;
	}


	@Override
    public String toString() {
        return "Actuacion{" + "idActuacion=" + idActuacion + ", diagnostico=" + diagnostico + ", tratamiento=" + tratamiento + ", estado=" + estado + ", animal=" + animal + ", factura=" + factura + '}';
    }
    
    
}
