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


@CrossOrigin(origins={"*"})
@RestController
@RequestMapping("/laboratorio")
public class LaboratorioController {

	@Autowired
	private IUsuarioService usuarioService;
	@Autowired
	private InmuebleServiceImpl inmuebleService;
	@Autowired
	private ReclamacionServiceImpl reclamacionService;
	
	
	
	@PostMapping("/usuarios")
	private Usuario crearUsuario(@RequestBody  Usuario usuario){
		 usuario.setFechaCreacion(new Date());
		 usuario.setEstado(true);
		 return usuarioService.save(usuario);
	}
	@PostMapping("/inmuebles")
	private Inmueble crearInmueble(@RequestBody Inmueble inmueble){
		inmueble.setFechaCreacion(new Date());
		inmueble.setEstado(true);
		inmueble.setTipoInmueble(EnumTipoInmueble.CASA);
		 return inmuebleService.save(inmueble);
	}
	
	@GetMapping("/inmuebles")
	private List<Inmueble> mostrarInmuebles(){
		return inmuebleService.findAll();
	}
	
	@GetMapping("/inmublesPorUsuario")
	private List<Inmueble> mostrarInmueblesPorUsuario(@RequestBody Usuario usuario){
		return inmuebleService.findInmuebleByUsuario(usuario.getId());
	}
	
	@GetMapping("/primaRepetida/{idInmueble}/{idUsuario}")
	private Inmueble validarPrimaExistente(@PathVariable Long idInmueble,@PathVariable Long idUsuario){
		return inmuebleService.validarPrimaExistente(idInmueble,idUsuario);
	}
	
	@GetMapping("/loginUsuario/{usuario}/{contrasena}")
	private Usuario loginUsuario(@PathVariable String usuario,@PathVariable String contrasena){
		return usuarioService.validarIdentidad(usuario,contrasena);
	}
	
	
	
	
	
	
}
