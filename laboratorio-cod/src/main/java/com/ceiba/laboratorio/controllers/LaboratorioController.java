package com.ceiba.laboratorio.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.laboratorio.entity.Inmueble;
import com.ceiba.laboratorio.entity.Usuario;
import com.ceiba.laboratorio.services.IInmuebleService;
import com.ceiba.laboratorio.services.IReclamacionService;
import com.ceiba.laboratorio.services.IUsuarioService;
import com.ceiba.laboratorio.services.InmuebleServiceImpl;
import com.ceiba.laboratorio.services.ReclamacionServiceImpl;
import com.ceiba.laboratorio.services.UsuarioServiceImpl;
import com.ceiba.laboratorio.util.EnumTipoInmueble;

/**
 * Clase que permite controlar los servicios de la aplicacion comunicandolos con
 * la logica en JS
 * 
 * @author Lenovo
 *
 */
@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/laboratorio")
public class LaboratorioController {

	/**
	 * Declaracion del servicio de usuario
	 */
	@Autowired
	private IUsuarioService usuarioService;
	/**
	 * Declaracion del servicio de inmuebles
	 */
	@Autowired
	private InmuebleServiceImpl inmuebleService;
	/**
	 * Declaracion del servicio de reclamaciones
	 */
	@Autowired
	private ReclamacionServiceImpl reclamacionService;

	/**
	 * Metodo que permite crear un usuario
	 * 
	 * @param usuario
	 *            usaurio a crear
	 * @return devuelve el usaurio creado
	 */
	@PostMapping("/usuarios")
	private Usuario crearUsuario(@RequestBody Usuario usuario) {
		usuario.setFechaCreacion(new Date());
		usuario.setEstado(true);
		return usuarioService.save(usuario);
	}

	/**
	 * Metodo que permite crear un inmueble
	 * 
	 * @param inmueble
	 *            inmueble a crear
	 * @return devuelve el inmueble creado
	 */
	@PostMapping("/inmuebles")
	private Inmueble crearInmueble(@RequestBody Inmueble inmueble) {
		inmueble.setFechaCreacion(new Date());
		inmueble.setEstado(true);
		inmueble.setTipoInmueble(EnumTipoInmueble.CASA);
		return inmuebleService.save(inmueble);
	}

	/**
	 * Servicio que permite mostrar los inmuebles registraos
	 * 
	 * @return devuelve una lista de inmuebles creados
	 */
	@GetMapping("/inmuebles")
	private List<Inmueble> mostrarInmuebles() {
		return inmuebleService.findAll();
	}

	/**
	 * Servicio que permite mostrar los inmuebles creados asociados a un usuario
	 * 
	 * @param usuario
	 *            usuario asociado a los inmuebles consultados
	 * @return devuelve los inmuebles asociados al usuario
	 */
	@GetMapping("/inmublesPorUsuario")
	private List<Inmueble> mostrarInmueblesPorUsuario(
			@RequestBody Usuario usuario) {
		return inmuebleService.findInmuebleByUsuario(usuario.getId());
	}

	/**
	 * Servicio encargado de validar si la prima ya fue asignada al inmueble
	 * 
	 * @param idInmueble
	 *            id del mueble a consultar
	 * @param idUsuario
	 *            id del usuario a consultar
	 * @return
	 */
	@GetMapping("/primaRepetida/{idInmueble}/{idUsuario}")
	private Inmueble validarPrimaExistente(@PathVariable Long idInmueble,
			@PathVariable Long idUsuario) {
		return inmuebleService.validarPrimaExistente(idInmueble, idUsuario);
	}

	/**
	 * Servicio encargado de validar el login del usuario
	 * 
	 * @param usuario
	 *            usuario a validar
	 * @param contrasena
	 *            contraseña a validar
	 * @return devuelve el usuario si los datos estan bien defenidos
	 */
	@GetMapping("/loginUsuario/{usuario}/{contrasena}")
	private Usuario loginUsuario(@PathVariable String usuario,
			@PathVariable String contrasena) {
		return usuarioService.validarIdentidad(usuario, contrasena);
	}

}
