package com.carlos.seguros.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.carlos.seguros.models.entity.Inmueble;

public interface IInmuebleDao extends CrudRepository<Inmueble, Long> {

}
