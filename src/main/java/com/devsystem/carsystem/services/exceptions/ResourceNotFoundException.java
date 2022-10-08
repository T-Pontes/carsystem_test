package com.devsystem.carsystem.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException (Object id) {
		super("O Id " + id + " não foi encontrado na base de dados.");
	}
}
