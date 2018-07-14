package com.ceiba.servicios;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ceiba.dao.IUsuarioDao;
import com.ceiba.entidades.Usuario;

public class UsuarioServiceImpl implements IUsuarioService {
	
	private IUsuarioDao usuarioDao;

	@Override
	@Transactional(readOnly=true)
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return (List<Usuario>) usuarioDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Usuario findById(Long id) {
		// TODO Auto-generated method stub
		return usuarioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Usuario save(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioDao.save(usuario);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		usuarioDao.deleteById(null);
	}

}
