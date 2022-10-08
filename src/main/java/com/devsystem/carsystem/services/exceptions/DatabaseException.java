package com.devsystem.carsystem.services.exceptions;

public class DatabaseException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DatabaseException (String msg) {
		super("Violação de integridade da base de dados: Não é possível excluir objetos com registros associados. " + msg);
	}
}
