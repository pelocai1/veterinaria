
package com.proyectoMio.veterinaria.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "animales")
public class Animal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
    private String especie;
    private String raza;
    private LocalDate fechaNac;
    private String sexo;
    
    @OneToMany(mappedBy = "animal")
    private List<Actuacion> actuaciones;
    
    @ManyToOne
    private Cliente propietario;
    

    public Animal() {
    }


	public Animal(Integer id, String nombre, String especie, String raza, LocalDate fechaNac, String sexo,
			List<Actuacion> actuaciones, Cliente propietario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.especie = especie;
		this.raza = raza;
		this.fechaNac = fechaNac;
		this.sexo = sexo;
		this.actuaciones = actuaciones;
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


    public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public List<Actuacion> getActuaciones() {
		return actuaciones;
	}


	public void setActuaciones(List<Actuacion> actuaciones) {
		this.actuaciones = actuaciones;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	@Override
	public String toString() {
		return "Animal [id=" + id + ", nombre=" + nombre + ", especie=" + especie + ", raza=" + raza + ", fechaNac="
				+ fechaNac + ", sexo=" + sexo + ", actuaciones=" + actuaciones + ", propietario=" + propietario + "]";
	}


    
    
}
