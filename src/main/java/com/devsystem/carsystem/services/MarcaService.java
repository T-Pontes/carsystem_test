package com.devsystem.carsystem.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.devsystem.carsystem.entities.Marca;
import com.devsystem.carsystem.repositories.MarcaRepository;
import com.devsystem.carsystem.services.exceptions.DatabaseException;
import com.devsystem.carsystem.services.exceptions.ResourceNotFoundException;

@Service
public class MarcaService {

	@Autowired
	private MarcaRepository repository;
	
	public List<Marca> findAll(){
		return repository.findAll();
	}
	
	public Marca findById(Integer id) {
		Optional<Marca> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Marca insert(Marca obj) {
		return repository.save(obj);
	}
	
	public void delete(Integer id) {
		try {
			repository.deleteById(id);			
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public Marca update(Integer id, Marca obj) {
		try {
			Marca entity = repository.getReferenceById(id);
			updateData(entity, obj);
			return repository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(Marca entity, Marca obj) {
		entity.setMarca(obj.getMarca());
	}
}
