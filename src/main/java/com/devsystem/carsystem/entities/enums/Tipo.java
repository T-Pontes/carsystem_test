package com.devsystem.carsystem.entities.enums;

public enum Tipo {

	NACIONAL(1),
	IMPORTADO(2);

	private int code;
	
	private Tipo(Integer code) {
		this.code = code;
	}
	
	public Integer getcode() {
		return code;
	}
	
	public static Tipo valueOf(Integer code) {
		for(Tipo value: Tipo.values()) {
			if(value.getcode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("O código atribuído é inválido!");
	}
}
