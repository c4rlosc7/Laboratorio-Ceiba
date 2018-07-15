package com.ceiba.laboratorio.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ceiba.laboratorio.entity.Inmueble;

/**
 * Clase que permite definir el objeto de acceso a datos relacionado con el
 * inmueble
 * 
 * @author Lenovo
 *
 */
public interface IInmuebleDao extends CrudRepository<Inmueble, Long> {

	/**
	 * Query que permite consultar los inmuebles asociados a un usuario
	 * 
	 * @param id
	 *            identificacion del usuario a consultar
	 * @return
	 */
	@Query("select i from Inmueble i where i.id = :idInmuele")
	List<Inmueble> findInmuebleByUsuario(@Param("idInmuele") Long id);

	/**
	 * Query que permite consultar las primas existentes por usuario y por
	 * inmuebles
	 * 
	 * @param idInmueble
	 *            identificacion del inmueble
	 * @param idUsuario
	 *            identificacion del usaurio
	 * @return devuelve el inmueble con su correspondiente prima
	 */
	@Query("select i from Inmueble i left join i.usuario u where i.id = :idInmuele and u.id=:idUsuario")
	Inmueble validarPrimaExistente(@Param("idInmuele") Long idInmueble,
			@Param("idUsuario") Long idUsuario);

}
