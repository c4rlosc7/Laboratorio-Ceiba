package com.ceiba.laboratorio.dao;

import org.springframework.data.repository.CrudRepository;

import com.ceiba.laboratorio.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario,Long> {

}
