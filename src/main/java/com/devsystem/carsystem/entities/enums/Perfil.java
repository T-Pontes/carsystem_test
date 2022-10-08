package com.devsystem.carsystem.entities.enums;

public enum Perfil {

	ADMIN(1, "ROLE_ADMIN"),
	CLIENTE(2, "ROLE_CLIENTE");

	private int code;
	
	private Perfil(Integer code, String perfil) {
		this.code = code;
	}
	
	public Integer getcode() {
		return code;
	}
	
	public static Perfil toEnum(Integer code) {
		if(code == null) {
			return null;
		} else {
			for(Perfil value: Perfil.values()) {
				if(value.getcode() == code) {
					return value;
				}
			}
		}
		throw new IllegalArgumentException("O código atribuído é inválido!");
	}
}
