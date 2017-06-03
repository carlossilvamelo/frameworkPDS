package com.frameworkPDS.services.status;

public class EmAndamento extends StatusServico{

	
	public EmAndamento() {
		super("Em andamento");
	}


	@Override
	public StatusServico proximo() {
		// TODO Auto-generated method stub
		return new Finalizado();
	}

	

	

}
