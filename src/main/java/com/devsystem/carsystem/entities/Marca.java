package com.devsystem.carsystem.entities;

import java.io.Serializable;
import java.util.Objects;

public class Marca implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String marca;
	
	//Associar com os modelos 
	
	public Marca() {
	}

	public Marca(Integer id, String marca) {
		this.id = id;
		this.marca = marca;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marca other = (Marca) obj;
		return Objects.equals(id, other.id);
	}

}
