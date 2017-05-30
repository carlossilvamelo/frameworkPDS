package com.frameworkPDS.models.status;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class StatusServico {
	
	@Id
	@Column(name="id_checkin")
	private Integer id;
	
	private String nome;
	
	
	public StatusServico(String nome) {
		this.nome = nome;
	}
	
	public abstract StatusServico iniciar();
	public abstract StatusServico proximo();
	public abstract StatusServico reiniciar();
	public abstract StatusServico finalizar();
	
	public String getNome(){
		return nome;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void persistirStatus(){
		
	}
}
