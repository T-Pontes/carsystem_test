package com.devsystem.carsystem.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsystem.carsystem.entities.Marca;

@RestController
@RequestMapping(value="/marcas")
public class ModeloResource {

	@GetMapping
	public ResponseEntity<Marca> findAll(){
		Marca mc = new Marca(2, "Fiat");
		return ResponseEntity.ok().body(mc);
	}
}
