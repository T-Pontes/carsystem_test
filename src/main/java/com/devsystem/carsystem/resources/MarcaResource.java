package com.devsystem.carsystem.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsystem.carsystem.entities.Marca;
import com.devsystem.carsystem.entities.Modelo;

@RestController
@RequestMapping(value="/modelos")
public class MarcaResource {

	@GetMapping
	public ResponseEntity<Modelo> findAll(){
		Marca mc = new Marca(1, "Volkswagen");
		Modelo md = new Modelo(1, "Voyage 1.6", 2012, 2013, mc);
		return ResponseEntity.ok().body(md);
	}
}
