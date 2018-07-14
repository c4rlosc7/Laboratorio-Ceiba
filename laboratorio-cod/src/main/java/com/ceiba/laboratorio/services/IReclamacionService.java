package com.ceiba.laboratorio.services;

import java.util.List;

import com.ceiba.laboratorio.entity.Reclamacion;

public interface IReclamacionService {

	public List<Reclamacion> findAll();

	public Reclamacion findById(Long id);

	public Reclamacion save(Reclamacion reclamacion);

	public void delete(Long id);
}
