package com.carlos.seguros.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.carlos.seguros.models.entity.Propietario;

public interface IPropietarioDao extends CrudRepository<Propietario, Long> {

}
