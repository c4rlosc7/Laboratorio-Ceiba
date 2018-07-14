package com.ceiba.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ceiba.utilidades.EnumTipoInmueble;


@Entity
@Table(name="inmueble")
public class Inmueble implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Usuario propietario;
	
	private String direccion;
	
	private EnumTipoInmueble tipoInmueble;
	
	private BigDecimal valorInmueble;
	
	private double metrajeInmueble;
	
	private int estratoInmueble;
	
	private Date fechaCreacion;
	
	private Date fechaModificacion;
	
	private boolean estado;

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public EnumTipoInmueble getTipoInmueble() {
		return tipoInmueble;
	}

	public void setTipoInmueble(EnumTipoInmueble tipoInmueble) {
		this.tipoInmueble = tipoInmueble;
	}

	public BigDecimal getValorInmueble() {
		return valorInmueble;
	}

	public void setValorInmueble(BigDecimal valorInmueble) {
		this.valorInmueble = valorInmueble;
	}

	public double getMetrajeInmueble() {
		return metrajeInmueble;
	}

	public void setMetrajeInmueble(double metrajeInmueble) {
		this.metrajeInmueble = metrajeInmueble;
	}

	public int getEstratoInmueble() {
		return estratoInmueble;
	}

	public void setEstratoInmueble(int estratoInmueble) {
		this.estratoInmueble = estratoInmueble;
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

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + (estado ? 1231 : 1237);
		result = prime * result + estratoInmueble;
		result = prime * result
				+ ((fechaCreacion == null) ? 0 : fechaCreacion.hashCode());
		result = prime
				* result
				+ ((fechaModificacion == null) ? 0 : fechaModificacion
						.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		long temp;
		temp = Double.doubleToLongBits(metrajeInmueble);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((propietario == null) ? 0 : propietario.hashCode());
		result = prime * result
				+ ((tipoInmueble == null) ? 0 : tipoInmueble.hashCode());
		result = prime * result
				+ ((valorInmueble == null) ? 0 : valorInmueble.hashCode());
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
		Inmueble other = (Inmueble) obj;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (estado != other.estado)
			return false;
		if (estratoInmueble != other.estratoInmueble)
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
		if (Double.doubleToLongBits(metrajeInmueble) != Double
				.doubleToLongBits(other.metrajeInmueble))
			return false;
		if (propietario == null) {
			if (other.propietario != null)
				return false;
		} else if (!propietario.equals(other.propietario))
			return false;
		if (tipoInmueble != other.tipoInmueble)
			return false;
		if (valorInmueble == null) {
			if (other.valorInmueble != null)
				return false;
		} else if (!valorInmueble.equals(other.valorInmueble))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Inmueble [id=" + id + ", propietario=" + propietario
				+ ", direccion=" + direccion + ", tipoInmueble=" + tipoInmueble
				+ ", valorInmueble=" + valorInmueble + ", metrajeInmueble="
				+ metrajeInmueble + ", estratoInmueble=" + estratoInmueble
				+ ", fechaCreacion=" + fechaCreacion + ", fechaModificacion="
				+ fechaModificacion + ", estado=" + estado + "]";
	}

	

}
