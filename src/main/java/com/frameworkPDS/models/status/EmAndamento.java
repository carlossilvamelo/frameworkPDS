package com.frameworkPDS.models.status;
import javax.persistence.Entity;

@Entity
public class EmAndamento extends StatusServico{

	
	public EmAndamento() {
		super("Em andamento");
	}
	
	@Override
	public StatusServico iniciar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StatusServico proximo() {
		// TODO Auto-generated method stub
		return new Finalizado();
	}

	@Override
	public StatusServico reiniciar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StatusServico finalizar() {
		// TODO Auto-generated method stub
		return null;
	}

}
