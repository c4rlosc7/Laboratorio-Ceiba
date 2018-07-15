package com.ceiba.laboratorio.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ceiba.laboratorio.entity.Inmueble;
import com.ceiba.laboratorio.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario,Long> {

	@Query("select i from Usuario u where i.usuario = :usuario and u.contrasena=:contrasena")
	Usuario validarIdentidad(@Param("usuario")String usuario, @Param("contrasena")String contrasena);

}
