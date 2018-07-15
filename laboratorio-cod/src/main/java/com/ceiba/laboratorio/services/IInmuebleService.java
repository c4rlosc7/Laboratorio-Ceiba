package com.ceiba.laboratorio.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ceiba.laboratorio.entity.Inmueble;

/**
 * Clase interface de los Servicios correspondientes al inmueble
 * @author Lenovo
 *
 */
public interface IInmuebleService {

	/**
	 * Servicio que permite buscar todos los inmuebles
	 * @return devuelve la lista de los inmuebles
	 */
	public List<Inmueble> findAll();

	/**
	 * Metodo que permite buscar un inmueble por id
	 * @param id identificacion del inmueble a buscar
	 * @return
	 */
	public Inmueble findById(Long id);

	public Inmueble save(Inmueble inmueble);

	public void delete(Long id);
	
	List<Inmueble> findInmuebleByUsuario(Long id);
	
	Inmueble validarPrimaExistente( Long idInmueble, Long idUsuario);
}
