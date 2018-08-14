package com.carlos.seguros.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import javassist.SerialVersionUID;

@Entity
@Table(name = "primas")
public class Prima implements Serializable {
	
	private static final long SerialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name ="id_inmueble")
	private Long idInmueble;
	
	@Column(name = "id_propietario")
	private Long idPropietario;
	
	@Column(name = "valor_inmueble")
	private double valorInmueble;
	
	/* Getters and Setters */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdInmueble() {
		return idInmueble;
	}
	public void setIdInmueble(Long idInmueble) {
		this.idInmueble = idInmueble;
	}
	public Long getIdPropietario() {
		return idPropietario;
	}
	public void setIdPropietario(Long idPropietario) {
		this.idPropietario = idPropietario;
	}
	public double getValorInmueble() {
		return valorInmueble;
	}
	public void setValorInmueble(double valorInmueble) {
		this.valorInmueble = valorInmueble;
	}	
	
	
}
