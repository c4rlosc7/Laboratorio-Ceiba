package com.carlos.seguros.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.seguros.models.services.IInmuebleService;
import com.carlos.seguros.models.entity.*;

@RestController
@RequestMapping("/api")
public class InmuebleController {
	
	@Autowired
	private IInmuebleService inmuebleService;
	
	@GetMapping("/inmuebles")
	public List<Inmueble> index(){
		return inmuebleService.findAll();
	}
}
