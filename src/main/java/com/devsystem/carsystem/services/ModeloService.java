package com.devsystem.carsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsystem.carsystem.entities.Modelo;
import com.devsystem.carsystem.repositories.ModeloRepository;

@Service
public class ModeloService {

	@Autowired
	private ModeloRepository repository;
	
	public List<Modelo> findAll(){
		return repository.findAll();
	}
	
	public Modelo findById(Integer id) {
		Optional<Modelo> obj = repository.findById(id);
		return obj.get();
	}
}
