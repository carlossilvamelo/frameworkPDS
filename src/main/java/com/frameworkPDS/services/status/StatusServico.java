package com.frameworkPDS.services.status;



public abstract class StatusServico{
	
	
	private String nome;
	
	public StatusServico(String nome){
		this.nome = nome;
	}
	
	
	public abstract StatusServico proximo();
	
	
	public String getNome(){
		return nome;
	}
	
	

	public static StatusServico consultarStatusAtual(String nome, StatusServico statusInicial){
		
		
		while(statusInicial != null){
			if(statusInicial.getNome().equals(nome))
				return statusInicial;
			
			statusInicial = statusInicial.proximo();
			
		}
		return null;
	}
	
	
	
	
	
	
	
}
