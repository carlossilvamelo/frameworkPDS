package com.frameworkPDS.services.busca;

import java.util.List;

import org.jsoup.HttpStatusException;

import com.frameworkPDS.models.Peca;


public interface Busca {

	
	public List<Peca> buscarPeca(String idValor, String idProduto) throws HttpStatusException;
	public List<Peca> menorPreco(List<Peca> pecas) throws HttpStatusException;
	public List<Peca> maisAvaliado(List<Peca> pecas);
}
