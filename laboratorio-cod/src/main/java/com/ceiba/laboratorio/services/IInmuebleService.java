package com.ceiba.laboratorio.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ceiba.laboratorio.entity.Inmueble;

public interface IInmuebleService {

	public List<Inmueble> findAll();

	public Inmueble findById(Long id);

	public Inmueble save(Inmueble inmueble);

	public void delete(Long id);
	
	List<Inmueble> findInmuebleByUsuario(Long id);
	
	Inmueble validarPrimaExistente( Long idInmueble, Long idUsuario);
}
