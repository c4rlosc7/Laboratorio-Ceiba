package com.ceiba.laboratorio.util;

public enum EnumTipoInmueble {
	
	APARTAMENTO("Inmueble de tipo apartamento"),CASA("Inmueble de tipo casa")
	,LOCAL("Inmueble de tipo local");
	
	
	private String descripcionTipoInmueble;
	
	EnumTipoInmueble(String descripcion){
		this.descripcionTipoInmueble=descripcion;
	}

	public String getDescripcionTipoInmueble() {
		return descripcionTipoInmueble;
	}

	public void setDescripcionTipoInmueble(String descripcionTipoInmueble) {
		this.descripcionTipoInmueble = descripcionTipoInmueble;
	}

	
	
}
