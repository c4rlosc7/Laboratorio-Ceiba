package com.ceiba.laboratorio.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ceiba.laboratorio.entity.Inmueble;
import com.ceiba.laboratorio.entity.Usuario;

/**
 * Clase que permite definir el objeto de acceso a datos relacionado con el
 * usuario
 * 
 * @author Lenovo
 *
 */
public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

	/**
	 * Query que permite validar la identidad de un usario al logearse en el
	 * aplicativo
	 * 
	 * @param usuario usuario asociado 
	 * @param contrasena contraseña asignada al usuario
	 * @return
	 */
	@Query("select u from Usuario u where u.usuario = :usuario and u.contrasena=:contrasena")
	Usuario validarIdentidad(@Param("usuario") String usuario,
			@Param("contrasena") String contrasena);

}
