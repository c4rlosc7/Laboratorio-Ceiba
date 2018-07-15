package com.ceiba.laboratorio.dao;

import org.springframework.data.repository.CrudRepository;

import com.ceiba.laboratorio.entity.Reclamacion;

/**
 * Clase que permite definir el objeto de acceso a datos relacionado con la
 * reclamacion
 * 
 * @author Lenovo
 *
 */
public interface IReclamacionDao extends CrudRepository<Reclamacion, Long> {

}
