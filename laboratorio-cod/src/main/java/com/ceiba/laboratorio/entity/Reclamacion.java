package com.ceiba.laboratorio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema ="reclamaciones")
public class Reclamacion {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	private String reclamacion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReclamacion() {
		return reclamacion;
	}

	public void setReclamacion(String reclamacion) {
		this.reclamacion = reclamacion;
	}
}