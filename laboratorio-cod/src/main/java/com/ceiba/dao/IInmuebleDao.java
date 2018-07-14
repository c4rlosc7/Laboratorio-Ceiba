package com.ceiba.dao;

import org.springframework.data.repository.CrudRepository;

import com.ceiba.entidades.Inmueble;

public interface IInmuebleDao extends CrudRepository<Inmueble,Long>{

}
