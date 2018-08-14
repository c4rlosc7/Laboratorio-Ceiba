package com.carlos.seguros.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.seguros.models.services.IPropietarioService;
import com.carlos.seguros.models.entity.*;

@RestController
@RequestMapping("/api")
public class PropietarioController {
	
	@Autowired
	private IPropietarioService propietarioService;
	
	@GetMapping("/propietarios")
	public List<Propietario> index(){
		return propietarioService.findAll();
	}
}
