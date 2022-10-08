package com.devsystem.carsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsystem.carsystem.entities.Marca;
import com.devsystem.carsystem.repositories.MarcaRepository;

@Service
public class MarcaService {

	@Autowired
	private MarcaRepository repository;
	
	public List<Marca> findAll(){
		return repository.findAll();
	}
	
	public Marca findById(Integer id) {
		Optional<Marca> obj = repository.findById(id);
		return obj.get();
	}
	
	public Marca insert(Marca obj) {
		return repository.save(obj);
	}
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}
	
	public Marca update(Integer id, Marca obj) {
		Marca entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(Marca entity, Marca obj) {
		entity.setMarca(obj.getMarca());
	}
}
