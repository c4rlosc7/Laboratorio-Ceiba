package com.carlos.seguros.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carlos.seguros.models.dao.IPropietarioDao;
import com.carlos.seguros.models.entity.Propietario;

@Service
public class PropietarioServiceImplement implements IPropietarioService {
	
	@Autowired
	private IPropietarioDao propietarioDao;

	@Override
	@Transactional(readOnly = true)
	public List<Propietario> findAll() {
		return (List<Propietario>) propietarioDao.findAll();
	}

}
