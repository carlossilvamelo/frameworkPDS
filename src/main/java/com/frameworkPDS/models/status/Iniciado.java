package com.frameworkPDS.models.status;


public class  Iniciado extends State{

	//private static StatusServico instance = new Iniciado();
	
	 public Iniciado() {
		 super("Iniciado");
	}
	
	/* public static StatusServico getInstance(){
				return instance;
	 }*/
	 


	@Override
	public State proximo() {
		
		return new EmAndamento();
	}
	

}
