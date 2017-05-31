package com.frameworkPDS.models.status;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.frameworkPDS.models.Servico;


public abstract class State{
	
	
	private String nome;
	
	public State(String nome){
		this.nome = nome;
	}
	
	
	public abstract State proximo();
	
	
	public String getNome(){
		return nome;
	}
	
	

	public static State getStatusAtual(String nome){
		State statusAtual=new Iniciado();
		
		
		while(statusAtual != null){
			if(statusAtual.getNome().equals(nome))
				return statusAtual;
			
			statusAtual = statusAtual.proximo();
			
		}
		return null;
	}
	
	
	
	
	
	
	
}
