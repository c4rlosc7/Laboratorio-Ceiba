package com.ceiba.laboratorio.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ceiba.laboratorio.entity.Inmueble;

public interface IInmuebleDao extends CrudRepository<Inmueble,Long>{

	@Query("select i from Inmueble i where i.id = :idInmuele")
	List<Inmueble> findInmuebleByUsuario(@Param("idInmuele") Long id);
	
	@Query("select i from Inmueble i left join i.usuario u where i.id = :idInmuele and u.id=:idUsuario")
	Inmueble validarPrimaExistente(@Param("idInmuele") Long idInmueble,@Param("idUsuario") Long idUsuario);

}
