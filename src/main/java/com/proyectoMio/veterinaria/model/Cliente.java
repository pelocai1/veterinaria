
package com.proyectoMio.veterinaria.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "clientes")

public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private String direccion;
    private LocalDate fechaNacimiento;
    private String email;
    private String telefono;
    
    @OneToMany(mappedBy = "propietario")
    private List<Animal> mascotas;
    
    @OneToMany(mappedBy = "cliente")
    private List<Factura>facturas;
    

    public Cliente() {
    }

   
	public Cliente(int id, String nombre, String apellido, String direccion, LocalDate fechaNacimiento, String email,
			String telefono, List<Animal> mascotas, List<Factura> facturas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
		this.telefono = telefono;
		this.mascotas = mascotas;
		this.facturas = facturas;
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
    

    public List<Animal> getMascotas() {
		return mascotas;
	}

	public void setMascotas(List<Animal> mascotas) {
		this.mascotas = mascotas;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", fechaNacimiento=" + fechaNacimiento + ", email=" + email + ", telefono=" + telefono + '}';
    }
}
