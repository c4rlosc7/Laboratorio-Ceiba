package com.ceiba.laboratorio.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ceiba.laboratorio.dao.IInmuebleDao;
import com.ceiba.laboratorio.entity.Inmueble;
import com.ceiba.laboratorio.util.Constants;

@Service
public class InmuebleServiceImpl implements IInmuebleService {
	
	@Autowired
	private IInmuebleDao inmuebleDao;

	@Override
	@Transactional(readOnly=true)
	public List<Inmueble> findAll() {
		// TODO Auto-generated method stub
		return (List<Inmueble>) inmuebleDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Inmueble findById(Long id) {
		// TODO Auto-generated method stub
		return inmuebleDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Inmueble save(Inmueble inmueble) {
		inmueble.setValorPrima(calcularPrima(inmueble.getValorInmueble()));
		return inmuebleDao.save(inmueble);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		inmuebleDao.deleteById(id);
	}

	@Override
	public List<Inmueble> findInmuebleByUsuario(Long id) {
		// TODO Auto-generated method stub
		return inmuebleDao.findInmuebleByUsuario(id);
	}

	
	
	public BigDecimal calcularPrima(BigDecimal valorInmueble){
		BigDecimal valor5PorCiento= new BigDecimal(Constants.CONSTANTE_5_PORCIENTO_INMUEBLE);
		BigDecimal valor1PorCiento= new BigDecimal(Constants.COMISION_1_PORCIENTO_INMUEBLE);
		BigDecimal inmueblePor5Porciento= valorInmueble.multiply(valor5PorCiento);
		BigDecimal dividir12=inmueblePor5Porciento.divide(new BigDecimal(12));
		return dividir12.multiply(valor1PorCiento);
	}

	@Override
	public Inmueble validarPrimaExistente(Long idInmueble, Long idUsuario) {
		// TODO Auto-generated method stub
		return inmuebleDao.validarPrimaExistente(idInmueble, idUsuario);
	}
}
