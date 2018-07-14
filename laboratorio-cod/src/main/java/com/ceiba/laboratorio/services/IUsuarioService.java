package com.ceiba.laboratorio.services;

import java.util.List;

import com.ceiba.laboratorio.entity.Usuario;


public interface IUsuarioService {
	
	public List<Usuario> findAll();
	
	public Usuario findById(Long id);
	
	public Usuario save (Usuario usuario);
	
	public void delete(Long id);

}
 