package com.frameworkPDS.services;

import java.util.List;

import com.frameworkPDS.models.Produto;

public interface IProdutoService {
	
	//acesso ao banco
	public void inserir(Produto produto);
	
	public void deletar(Produto produto);
	public void deletePorId(String idProduto);
	
	public Produto buscarPorId(String id);
	public List<Produto> buscarTodos();

	public void deleteAlertasProduto(Produto produto);
	
	

	
	
	
}
