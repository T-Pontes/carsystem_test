package com.devsystem.carsystem.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsystem.carsystem.entities.Modelo;
import com.devsystem.carsystem.services.ModeloService;

@RestController
@RequestMapping(value="/modelos")
public class ModeloResource {

	@Autowired
	private ModeloService service;
	@GetMapping
	public ResponseEntity<List<Modelo>> findAll(){
		List<Modelo> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	ResponseEntity<Modelo> findById(@PathVariable Integer id){
		Modelo obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
