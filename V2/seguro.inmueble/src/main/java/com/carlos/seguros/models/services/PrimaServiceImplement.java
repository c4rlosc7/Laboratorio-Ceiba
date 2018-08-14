package com.carlos.seguros.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carlos.seguros.models.dao.IPrimaDao;
import com.carlos.seguros.models.entity.Prima;

@Service
public class PrimaServiceImplement implements IPrimaService {
	
	@Autowired
	private IPrimaDao primaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Prima> findAll() {
		return (List<Prima>) primaDao.findAll();
	}

}
