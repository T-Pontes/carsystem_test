package com.devsystem.carsystem.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.devsystem.carsystem.entities.enums.Tipo;

@Entity
public class Modelo implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String modelo;
	private Integer anoFabricacao;
	private Integer anoModelo;
	
	private Integer tipo;
	
	@ManyToOne
	@JoinColumn(name="marca_id")
	private Marca marca;

	public Modelo() {
	}
	
	public Modelo(Integer id, String modelo, Integer anoFabricacao, Integer anoModelo, Tipo tipo, Marca marca) {
		this.id = id;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		setTipo(tipo);
		this.marca = marca;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Integer getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	public Tipo getTipo() {
		return Tipo.toEnum(tipo);
	}

	public void setTipo(Tipo tipo) {
		if(tipo != null) this.tipo = tipo.getcode();
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
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
		Modelo other = (Modelo) obj;
		return Objects.equals(id, other.id);
	}
	
}
