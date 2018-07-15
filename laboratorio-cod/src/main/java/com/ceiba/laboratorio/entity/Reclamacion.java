package com.ceiba.laboratorio.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Clase que representa la entidad Reclamacion
 * 
 * @author Lenovo
 *
 */
@Entity
@Table(name = "reclamaciones")
public class Reclamacion {

	/*
	 * Atributos de la entidad
	 */
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	private Long id;

	private String reclamacion;

	private Date fechaReclamacion;

	/*
	 * METODOS GET Y SET
	 */
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

	public Date getFechaReclamacion() {
		return fechaReclamacion;
	}

	public void setFechaReclamacion(Date fechaReclamacion) {
		this.fechaReclamacion = fechaReclamacion;
	}

	/*
	 * METODOS HASHCODE, EQUALS, TOSTRING
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((fechaReclamacion == null) ? 0 : fechaReclamacion.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((reclamacion == null) ? 0 : reclamacion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reclamacion other = (Reclamacion) obj;
		if (fechaReclamacion == null) {
			if (other.fechaReclamacion != null)
				return false;
		} else if (!fechaReclamacion.equals(other.fechaReclamacion))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (reclamacion == null) {
			if (other.reclamacion != null)
				return false;
		} else if (!reclamacion.equals(other.reclamacion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reclamacion [id=" + id + ", reclamacion=" + reclamacion
				+ ", fechaReclamacion=" + fechaReclamacion + "]";
	}

}