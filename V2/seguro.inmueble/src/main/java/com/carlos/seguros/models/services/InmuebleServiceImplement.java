package com.carlos.seguros.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carlos.seguros.models.dao.IInmuebleDao;
import com.carlos.seguros.models.entity.Inmueble;

@Service
public class InmuebleServiceImplement implements IInmuebleService {
	
	@Autowired
	private IInmuebleDao inmuebleDao;

	@Override
	@Transactional(readOnly = true)
	public List<Inmueble> findAll() {
		return (List<Inmueble>) inmuebleDao.findAll();
	}

}
