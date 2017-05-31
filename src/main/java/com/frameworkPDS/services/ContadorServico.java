package com.frameworkPDS.services;

import com.frameworkPDS.models.Orcamento;

public abstract class ContadorServico {
	
	private Double valorAdicional = 0.0;
	private Double desconto = 0.0;
	
	
	public final Double contabilizarServiço(Orcamento orcamento) {
		Double valor= 0.0;
		valor += orcamento.getPrecoMaoObra();
		//pegar valores das peças
		valor -= addDesconto();
		valor += valorAdicional();
		valor = addDescontoPorcentagem(valor);
		return valor;
	}

	
	public Double addDesconto() {
		// TODO Auto-generated method stub
		return 0.0;
	}
	
	public Double addDescontoPorcentagem(Double valor) {
		Integer pocentagem = 0;
		return valor * (1-(pocentagem/100));
	}

	public Double valorAdicional() {
		// TODO Auto-generated method stub
		return 0.0;
	}
	
	public abstract Double contabilizarValorProprio(Orcamento orcamento);

	
	
	

}
