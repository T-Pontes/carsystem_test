package com.devsystem.carsystem.entities.enums;

public enum Tipo {

	NACIONAL(1, "Nacional"),
	IMPORTADO(2, "Importado");

	private int code;
	
	private Tipo(Integer code, String tipo) {
		this.code = code;
	}
	
	public Integer getcode() {
		return code;
	}
	
	public static Tipo toEnum(Integer code) {
		if(code == null) {
			return null;
		} else {
			for(Tipo value: Tipo.values()) {
				if(value.getcode() == code) {
					return value;
				}
			}
		}
		throw new IllegalArgumentException("O código atribuído é inválido!");
	}
}
