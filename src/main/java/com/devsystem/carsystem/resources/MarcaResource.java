package com.devsystem.carsystem.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsystem.carsystem.entities.Marca;
import com.devsystem.carsystem.services.MarcaService;

@RestController
@RequestMapping(value="/marcas")
public class MarcaResource {

	@Autowired
	private MarcaService service;
	@GetMapping
	public ResponseEntity<List<Marca>> findAll(){
		List<Marca> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	ResponseEntity<Marca> findById(@PathVariable Integer id){
		Marca obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
