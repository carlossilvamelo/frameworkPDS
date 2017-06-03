package com.frameworkPDS.services.status;


public class  Iniciado extends StatusServico{

	//private static StatusServico instance = new Iniciado();
	
	 public Iniciado() {
		 super("Iniciado");
	}
	
	/* public static StatusServico getInstance(){
				return instance;
	 }*/
	 


	@Override
	public StatusServico proximo() {
		
		return new EmAndamento();
	}
	

}
