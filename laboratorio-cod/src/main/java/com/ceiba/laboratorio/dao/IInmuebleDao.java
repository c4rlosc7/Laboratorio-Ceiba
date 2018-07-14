package com.ceiba.laboratorio.dao;

import org.springframework.data.repository.CrudRepository;

import com.ceiba.laboratorio.entity.Inmueble;

public interface IInmuebleDao extends CrudRepository<Inmueble,Long>{

}
