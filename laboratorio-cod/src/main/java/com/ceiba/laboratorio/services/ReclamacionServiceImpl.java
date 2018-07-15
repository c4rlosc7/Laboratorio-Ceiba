package com.ceiba.laboratorio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ceiba.laboratorio.dao.IReclamacionDao;
import com.ceiba.laboratorio.entity.Reclamacion;

@Service
public class ReclamacionServiceImpl implements IReclamacionService{

	@Autowired
	private IReclamacionDao reclamacionDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Reclamacion> findAll() {
		// TODO Auto-generated method stub
		return (List<Reclamacion>) reclamacionDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Reclamacion findById(Long id) {
		// TODO Auto-generated method stub
		return reclamacionDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Reclamacion save(Reclamacion reclamacion) {
		// TODO Auto-generated method stub
		return reclamacionDao.save(reclamacion);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		reclamacionDao.deleteById(id);
	}

	
}
