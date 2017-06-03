package com.frameworkPDS.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class MarcaModelo {


	public MarcaModelo(){
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer idMarca) {

	public Long getId() {
		return id;
	}

	public void setId(Long idMarca) {

		this.id = idMarca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
