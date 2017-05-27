package com.frameworkPDS.services;

import java.util.List;

import com.frameworkPDS.models.Prestadora;


public interface IPrestadoraService {
	public Prestadora buscarPorId(String id);
	public void inserir(Prestadora prestadora);
	public void deletar(Prestadora prestadora);
	public List<Prestadora> buscarTodos();
}
