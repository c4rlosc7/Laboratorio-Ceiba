package com.ceiba.dao;

import org.springframework.data.repository.CrudRepository;

import com.ceiba.entidades.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario,Long> {

}
