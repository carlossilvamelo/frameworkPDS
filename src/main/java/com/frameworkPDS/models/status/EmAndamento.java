package com.frameworkPDS.models.status;

public class EmAndamento extends State{

	
	public EmAndamento() {
		super("Em andamento");
	}


	@Override
	public State proximo() {
		// TODO Auto-generated method stub
		return new Finalizado();
	}

	

	

}
