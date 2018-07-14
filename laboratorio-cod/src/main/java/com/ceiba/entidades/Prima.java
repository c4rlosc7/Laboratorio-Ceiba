package com.ceiba.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="prima")
public class Prima {

	private Long id;
	
	private Usuario propietario;
	
	private Inmueble inmueble;
	
	private Double valorPrima;
	
	private boolean estado;
	
	private Date fechaCreacion;
	
	private Date fechaModificacion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getPropietario() {
		return propietario;
	}

	public void setPropietario(Usuario propietario) {
		this.propietario = propietario;
	}

	public Inmueble getInmueble() {
		return inmueble;
	}

	public void setInmueble(Inmueble inmueble) {
		this.inmueble = inmueble;
	}

	public Double getValorPrima() {
		return valorPrima;
	}

	public void setValorPrima(Double valorPrima) {
		this.valorPrima = valorPrima;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (estado ? 1231 : 1237);
		result = prime * result
				+ ((fechaCreacion == null) ? 0 : fechaCreacion.hashCode());
		result = prime
				* result
				+ ((fechaModificacion == null) ? 0 : fechaModificacion
						.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((inmueble == null) ? 0 : inmueble.hashCode());
		result = prime * result
				+ ((propietario == null) ? 0 : propietario.hashCode());
		result = prime * result
				+ ((valorPrima == null) ? 0 : valorPrima.hashCode());
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
		Prima other = (Prima) obj;
		if (estado != other.estado)
			return false;
		if (fechaCreacion == null) {
			if (other.fechaCreacion != null)
				return false;
		} else if (!fechaCreacion.equals(other.fechaCreacion))
			return false;
		if (fechaModificacion == null) {
			if (other.fechaModificacion != null)
				return false;
		} else if (!fechaModificacion.equals(other.fechaModificacion))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (inmueble == null) {
			if (other.inmueble != null)
				return false;
		} else if (!inmueble.equals(other.inmueble))
			return false;
		if (propietario == null) {
			if (other.propietario != null)
				return false;
		} else if (!propietario.equals(other.propietario))
			return false;
		if (valorPrima == null) {
			if (other.valorPrima != null)
				return false;
		} else if (!valorPrima.equals(other.valorPrima))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Prima [id=" + id + ", propietario=" + propietario
				+ ", inmueble=" + inmueble + ", valorPrima=" + valorPrima
				+ ", estado=" + estado + ", fechaCreacion=" + fechaCreacion
				+ ", fechaModificacion=" + fechaModificacion + "]";
	}
	
	
	
}
