package com.carlos.seguros.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.carlos.seguros.models.entity.Prima;

public interface IPrimaDao extends CrudRepository<Prima, Long> {

}
